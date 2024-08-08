const mapLib = {
    /**
    * 지도 로드
    *
    * @param mapId : 지도를 출력할 요소 id 이름
    * @param width : 지도 너비
    * @param height: 지도 높이
    * @param options - 옵션
    *               - center: { lat: 위도, lng: 경도} - 필수
    *               - zoom : 확대 정도(1~10) / 숫자가 작을 수록 확대
                    - markerImage: 공통 마커 이미지 주소, 개별 마커 이미지가 있는 경우는 그걸로 대체,
    *               - marker : [{ lat: 위도, lng: 경도,
                                info: { content: html 데이터(인포윈도우), clickable: true|false - true(마커 클릭시 노출) }, image: 이미지 주소 - 마커이미지}]
    */
    load(mapId, width = 300, height = 300, options) {
        const mapEl = document.getElementById(mapId);
        if (!mapEl || !options?.center) return;


        mapEl.style.width = `${width}px`;
        mapEl.style.height = `${height}px`;

        let { center, marker, markerImage } = options;

        // 지도 가운데 좌표 처리
        const zoom = options?.zoom ?? 3; // 기본값 3
        const position = new kakao.maps.LatLng(center.lat, center.lng);
        const map = new kakao.maps.Map(mapEl, {
            center: position,
            level: zoom,
        });
        // 지도 가운데 좌표 처리 E

        // 마커 출력 처리 S
        if (marker) {
            if (!Array.isArray(marker)) marker = [marker];
            const markers = marker.map(m => {
                const { lat, lng, image, info } = m;
                const opt = { position: new kakao.maps.LatLng(lat, lng)};


                // 마커 이미지 처리
                const mi = markerImage ? markerImage : image;
                if (mi) {
                    const mImage = new kakao.maps.MarkerImage(mi, new kakao.maps.Size(64, 69), {offset: new kakao.maps.Point(27, 69)});
                    opt.image = mImage;
                }

                const _marker = new kakao.maps.Marker(opt);

                // 인포 윈도우 처리
                if (info?.content) {
                    const { content, clickable, removable } = info;

                    const infoWindow = new kakao.maps.InfoWindow({
                        content,
                        removable: Boolean(removable),
                    });

                    if (clickable) { // 마커 클릭시 노출
                        kakao.maps.event.addListener(_marker, "click", function() {
                            if (_marker.isInfoWindowOpen) {
                                infoWindow.close();
                                _marker.isInfoWindowOpen = false;
                            } else {
                                infoWindow.open(map, _marker);
                                _marker.isInfoWindowOpen = true;
                            }
                        });
                    } else { // 바로 노출
                        infoWindow.open(map, _marker);
                    }
                }



                _marker.setMap(map);

                return _marker;
            });

        } // endif
        // 마커 출력 처리 E
    },
    /**
    * 현재 위치 기반으로 중심위치를 잡고 지도 출력
    *
    */
    loadCurrentLocation(mapId, width = 300, height = 300, options) {
        navigator.geolocation.getCurrentPosition(pos => {
            const { latitude, longitude } = pos.coords;
            options = options ?? {};
            options.center = { lat: latitude, lng: longitude };

            mapLib.load(mapId, width, height, options);
        });
    }
};