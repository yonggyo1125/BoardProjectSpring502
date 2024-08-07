window.addEventListener("DOMContentLoaded", function() {
    const mapEl = document.getElementById("map");
    mapEl.style.width = "1000px";
    mapEl.style.height = "600px";


    navigator.geolocation.getCurrentPosition((pos) => {
        const { latitude, longitude } = pos.coords;

        const mapOption = {
            center: new kakao.maps.LatLng(latitude, longitude),
            level: 3,
        };

        const map = new kakao.maps.Map(mapEl, mapOption);

    });

});
