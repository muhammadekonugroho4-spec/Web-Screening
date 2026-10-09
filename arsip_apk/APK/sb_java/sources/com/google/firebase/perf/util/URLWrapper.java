package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes6.dex */
public class URLWrapper {
    private final URL url;

    public URLWrapper(URL r1) {
        this.url = r1;
    }

    public URLConnection openConnection() throws IOException {
        return this.url.openConnection();
    }

    public String toString() {
        return this.url.toString();
    }
}
