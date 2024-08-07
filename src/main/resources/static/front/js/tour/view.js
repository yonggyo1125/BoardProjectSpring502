const items = [
    [126.94062742683245, 37.557756188912954],
    [126.94120499658828, 37.557287959390024],
    [126.94069261563956, 37.561184514897825]
];

window.addEventListener("DOMContentLoaded", function() {
    const mapEl = document.getElementById("map");
    mapEl.style.width = "1000px";
    mapEl.style.height = "600px";

    let map;

    navigator.geolocation.getCurrentPosition((pos) => {
        const { latitude, longitude } = pos.coords;

        const mapOption = {
            center: new kakao.maps.LatLng(latitude, longitude),
            level: 3,
        };

        map = new kakao.maps.Map(mapEl, mapOption);

        const markerPos = new kakao.maps.LatLng(latitude, longitude);
        const marker = new kakao.maps.Marker({
           position: markerPos
        });

        marker.setMap(map);
        mapProcess(map);
    });

    // 지도 클릭시 좌표 정보
    /*
    if (map) {
        kakao.maps.event.addListener(map, 'click', function(e) {
            console.log(e);
        });

    } // endif
    */
    function mapProcess(map) {
        // 지도 클릭시 좌표 정보
        kakao.maps.event.addListener(map, 'click', function(e) {
            const latLng = e.latLng;
            const marker = new kakao.maps.Marker({
                position: latLng
            });

            marker.setMap(map);
        });
    }


});
