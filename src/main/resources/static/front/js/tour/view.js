window.addEventListener("DOMContentLoaded", function() {
    const html = "<h1>윈포윈도우 테스트</h1>";
    const options = {
        center: {
            lat: 37.557756188912954,
            lng: 126.94062742683245,
        },
        marker: [
            {lat: 37.557756188912954, lng: 126.94062742683245, info: { content: html, clickable: false, removable: true }},
            {lat: 37.557287959390024, lng: 126.94120499658828, info: { content: html, clickable: true, removable: false }},
            {lat: 37.561184514897825, lng: 126.94069261563956},
        ],
        markerImage: "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_red.png",
    };
    mapLib.loadCurrentLocation("map1", 1000, 600, options);
    //mapLib.load("map1", 1000, 600, options);
    /*
    mapLib.load("map1", 300, 300, options);
    mapLib.load("map2", 400, 400, options);
    mapLib.load("map3", 500, 500, options);
    */
});