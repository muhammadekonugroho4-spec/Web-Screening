package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes6.dex */
public class HttpGetRequest {
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private static final String METHOD_GET = "GET";
    private static final int READ_BUFFER_SIZE = 8192;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String url;

    public HttpGetRequest(String r1, Map<String, String> r2) {
        this.url = r1;
        this.queryParams = r2;
        this.headers = new HashMap();
    }

    private String createParamsString(Map<String, String> r7) throws UnsupportedEncodingException {
        StringBuilder r02 = new StringBuilder();
        Iterator<Map.Entry<String, String>> r72 = r7.entrySet().iterator();
        Map.Entry<String, String> r1 = r72.next();
        r02.append(r1.getKey());
        r02.append(ContainerUtils.KEY_VALUE_DELIMITER);
        if (r1.getValue() == null) goto L5;
        String r12 = URLEncoder.encode(r1.getValue(), "UTF-8");
    L6:
        r02.append(r12);
    L8:
        if (r72.hasNext() == false) goto L15;
        Map.Entry<String, String> r13 = r72.next();
        r02.append(ContainerUtils.FIELD_DELIMITER);
        r02.append(r13.getKey());
        r02.append(ContainerUtils.KEY_VALUE_DELIMITER);
        if (r13.getValue() == null) goto L12;
        String r14 = URLEncoder.encode(r13.getValue(), "UTF-8");
    L13:
        r02.append(r14);
        goto L8
    L12:
        r14 = "";
        goto L13
    L15:
        return r02.toString();
    L5:
        r12 = "";
        goto L6
    }

    private String createUrlWithParams(String r3, Map<String, String> r4) throws UnsupportedEncodingException {
        String r42 = createParamsString(r4);
        if (r42.isEmpty() == false) goto L6;
        return r3;
    L6:
        if (r3.contains("?") == false) goto L13;
        if (r3.endsWith(ContainerUtils.FIELD_DELIMITER) == true) goto L11;
        r42 = ContainerUtils.FIELD_DELIMITER + r42;
    L11:
        return r3 + r42;
    L13:
        return r3 + "?" + r42;
    }

    private String readStream(InputStream r5) throws IOException {
        BufferedReader r02 = new BufferedReader(new InputStreamReader(r5, "UTF-8"));
        char[] r52 = new char[8192];
        StringBuilder r1 = new StringBuilder();
    L3:
        int r2 = r02.read(r52);
        if (r2 == (-1)) goto L7;
        r1.append(r52, 0, r2);
        goto L3
    L7:
        return r1.toString();
    }

    public HttpResponse execute() throws IOException {
        CrashlyticsWorkers.checkBlockingThread();
        InputStream r02 = null;
        String r03 = null;
        r02 = null;
        String r1 = createUrlWithParams(this.url, this.queryParams);     // Catch: Throwable -> L21
        Logger.getLogger().v("GET Request URL: " + r1);     // Catch: Throwable -> L21
        HttpsURLConnection r12 = (HttpsURLConnection) new URL(r1).openConnection();     // Catch: Throwable -> L21
        r12.setReadTimeout(10000);     // Catch: Throwable -> L9
        r12.setConnectTimeout(10000);     // Catch: Throwable -> L9
        r12.setRequestMethod("GET");     // Catch: Throwable -> L9
        Iterator<Map.Entry<String, String>> r2 = this.headers.entrySet().iterator();     // Catch: Throwable -> L9
    L7:
        if (r2.hasNext() == false) goto L11;
        Map.Entry<String, String> r3 = r2.next();     // Catch: Throwable -> L9
        r12.addRequestProperty(r3.getKey(), r3.getValue());     // Catch: Throwable -> L9
        goto L7
    L11:
        r12.connect();     // Catch: Throwable -> L9
        int r22 = r12.getResponseCode();     // Catch: Throwable -> L9
        InputStream r32 = r12.getInputStream();     // Catch: Throwable -> L9
        if (r32 != null) goto L30;
    L17:
        if (r32 == null) goto L19;
        r32.close();
    L19:
        r12.disconnect();
        return new HttpResponse(r22, r03);
    L30:
        r03 = readStream(r32);     // Catch: Throwable -> L15
    L15:
        th = th;
        r02 = r32;
    L23:
        if (r02 == null) goto L25;
        r02.close();
    L25:
        if (r12 == null) goto L27;
        r12.disconnect();
    L27:
        throw th;
    L9:
        th = th;
    L21:
        th = th;
        r12 = null;
        goto L23
    }

    public HttpGetRequest header(String r2, String r3) {
        this.headers.put(r2, r3);
        return this;
    }

    public HttpGetRequest header(Map.Entry<String, String> r2) {
        return header(r2.getKey(), r2.getValue());
    }
}
