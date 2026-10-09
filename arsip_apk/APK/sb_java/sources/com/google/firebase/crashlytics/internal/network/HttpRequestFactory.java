package com.google.firebase.crashlytics.internal.network;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public class HttpRequestFactory {
    public HttpRequestFactory() {
    }

    public HttpGetRequest buildHttpGetRequest(String r2) {
        return buildHttpGetRequest(r2, Collections.EMPTY_MAP);
    }

    public HttpGetRequest buildHttpGetRequest(String r2, Map<String, String> r3) {
        return new HttpGetRequest(r2, r3);
    }
}
