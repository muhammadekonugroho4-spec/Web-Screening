package com.airbnb.lottie.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes4.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f31465a;

    public a(HttpURLConnection r1) {
        this.f31465a = r1;
    }

    @Override // com.airbnb.lottie.network.c
    public String S0() {
        return this.f31465a.getContentType();
    }

    @Override // com.airbnb.lottie.network.c
    public InputStream W0() {
        return this.f31465a.getInputStream();
    }

    @Override // com.airbnb.lottie.network.c
    public boolean a1() {
        if ((this.f31465a.getResponseCode() / 100) != 2) goto L11;
        return true;
    L11:
        return false;
    L12:
        return false;
    }

    public final String c(HttpURLConnection r3) {
        BufferedReader r02 = new BufferedReader(new InputStreamReader(r3.getErrorStream()));
        StringBuilder r32 = new StringBuilder();
    L18:
        String r1 = r02.readLine();     // Catch: Throwable -> L7
        if (r1 == null) goto L20;
        r32.append(r1);     // Catch: Throwable -> L7
        r32.append('\n');     // Catch: Throwable -> L7
        goto L18
    L20:
        r02.close();     // Catch: Exception -> L14
    L11:
        return r32.toString();
    L7:
        th = move-exception;
        r02.close();     // Catch: Exception -> L15
    L13:
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31465a.disconnect();
    }

    @Override // com.airbnb.lottie.network.c
    public String i0() {
    L8:
        e = move-exception;
        com.airbnb.lottie.utils.d.d("get error failed ", e);
        return e.getMessage();
    L3:
        if (a1() == false) goto L6;
        return null;
    L6:
        return "Unable to fetch " + this.f31465a.getURL() + ". Failed with " + this.f31465a.getResponseCode() + "\n" + c(this.f31465a);
    }
}
