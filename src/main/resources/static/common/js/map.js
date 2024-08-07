const mapLib = {
    /**
    * 지도 로드
    *
    * @param mapId : 지도를 출력할 요소 id 이름
    * @param width : 지도 너비
    * @param height: 지도 높이
    * @param options - 옵션
    *               - center: { lat: 위도, lng: 경도, ... } - 필수
    *               - zoom : 확대 정도(1~10) / 숫자가 작을 수록 확대
    */
    load(mapId, width = 300, height = 300, options) {
        const mapEl = document.getElementById(mapId);
        if (!mapEl || !options?.center) return;


        mapEl.style.width = `${width}px`;
        mapEl.style.height = `${height}px`;

        // 지도 가운데 좌표 처리 S
        const { center } = options;
        const zoom = options?.zoom ?? 3; // 기본값 3
        const position = new kakao.maps.LatLng(center.lat, center.lng);
        const map = new kakao.maps.Map(mapEl, {
            center: position,
            level: zoom,
        });
        // 지도 가운데 좌표 처리 E

    }
};