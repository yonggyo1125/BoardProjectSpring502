const commonLib = {
    /**
    * ajax 요청 공통 기능
    *
    */
    ajaxLoad(url, method = "GET", data, headers) {
        if (!url) {
            return;
        }

        const csrfToken = document.querySelector("meta[name='csrf_token']")?.content?.trim();
        const csrfHeader = document.querySelector("meta[name='csrf_header']")?.content?.trim();
        let rootUrl = document.querySelector("meta[name='rootUrl']")?.content?.trim() ?? '';
        rootUrl = rootUrl === '/' ? '' : rootUrl;

        url = location.protocol + "//" + location.host + rootUrl + url;
        console.log(url);
        method = method.toUpperCase();
        if (method === 'GET') {
            data = null;
        }

        if (data && !(data instanceof FormData) && typeof data !== 'string' && data instanceof Object) {
            data = JSON.stringify(data);
        }

        if (csrfHeader && csrfToken) {
            headers = headers ?? {};
            headers[csrfHeader] = csrfToken;
        }

        const options = {
            method
        };

        if (data) options.body = data;
        if (headers) options.headers = headers;

        fetch(url, options)
            .then(res => res.json())
            .then(json => console.log(json))
            .catch(err => console.error(err));
    }
};