/* WEB-SCREENING Service Worker v2
   - Static assets: cache-first (cepat, offline-ready)
   - API & HTML: network-first (data selalu segar), fallback cache saat offline */
const CACHE = "ws-screener-v2";
const STATIC = [
    "/static/theme.css", "/static/core.js", "/static/manifest.json",
    "/static/icon-192.png", "/static/icon-512.png", "/static/style.css", "/static/app.js"
];

self.addEventListener("install", (e) => {
    e.waitUntil(caches.open(CACHE).then((c) => c.addAll(STATIC)).then(() => self.skipWaiting()));
});

self.addEventListener("activate", (e) => {
    e.waitUntil(
        caches.keys().then((keys) =>
            Promise.all(keys.filter((k) => k !== CACHE).map((k) => caches.delete(k)))
        ).then(() => self.clients.claim())
    );
});

self.addEventListener("fetch", (e) => {
    const url = new URL(e.request.url);
    if (e.request.method !== "GET" || url.origin !== location.origin) return;

    // Static asset → cache-first
    if (url.pathname.startsWith("/static/")) {
        e.respondWith(
            caches.match(e.request).then((hit) =>
                hit || fetch(e.request).then((res) => {
                    const copy = res.clone();
                    caches.open(CACHE).then((c) => c.put(e.request, copy));
                    return res;
                })
            )
        );
        return;
    }

    // API & halaman → network-first, fallback cache (offline)
    e.respondWith(
        fetch(e.request)
            .then((res) => {
                if (res.ok && (url.pathname.startsWith("/api/") || e.request.mode === "navigate")) {
                    const copy = res.clone();
                    caches.open(CACHE).then((c) => c.put(e.request, copy));
                }
                return res;
            })
            .catch(() =>
                caches.match(e.request).then((hit) =>
                    hit || (e.request.mode === "navigate"
                        ? caches.match("/") || new Response("Offline", { status: 503 })
                        : new Response("Offline", { status: 503 }))
                )
            )
    );
});
