package com.huawei.secure.android.common.ssl;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public class d extends SSLSocketFactory {

    /* renamed from: h, reason: collision with root package name */
    public static final String f39586h = "d";

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f39587a;

    /* renamed from: b, reason: collision with root package name */
    public SSLSocket f39588b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f39589c;
    public X509TrustManager d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f39590e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f39591f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f39592g;

    static {
    }

    public d(X509TrustManager r5) {
        this.f39587a = null;
        this.f39588b = null;
        this.f39587a = a.f();
        b(r5);
        this.f39587a.init(null, new X509TrustManager[]{r5}, null);
    }

    public final void a(Socket r5) {
        boolean r1 = true;
        if (com.huawei.secure.android.common.ssl.util.b.a(this.f39592g) == true) goto L5;
        com.huawei.secure.android.common.ssl.util.f.e(f39586h, "set protocols");
        a.e((SSLSocket) r5, this.f39592g);
        boolean r02 = true;
    L7:
        if (com.huawei.secure.android.common.ssl.util.b.a(this.f39591f) == true) goto L9;
    L12:
        com.huawei.secure.android.common.ssl.util.f.e(f39586h, "set white cipher or black cipher");
        SSLSocket r2 = (SSLSocket) r5;
        a.d(r2);
        if (com.huawei.secure.android.common.ssl.util.b.a(this.f39591f) == true) goto L15;
        a.h(r2, this.f39591f);
    L16:
        if (r02 == true) goto L18;
        com.huawei.secure.android.common.ssl.util.f.e(f39586h, "set default protocols");
        a.d((SSLSocket) r5);
    L18:
        if (r1 == true) goto L21;
        com.huawei.secure.android.common.ssl.util.f.e(f39586h, "set default cipher suites");
        a.c((SSLSocket) r5);
        return;
    L21:
        return;
    L15:
        a.b(r2, this.f39590e);
        goto L16
    L9:
        if (com.huawei.secure.android.common.ssl.util.b.a(this.f39590e) == false) goto L12;
        r1 = false;
        goto L16
    L5:
        r02 = false;
        goto L7
    }

    public void b(X509TrustManager r1) {
        this.d = r1;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String r3, int r4) {
        com.huawei.secure.android.common.ssl.util.f.e(f39586h, "createSocket: host , port");
        Socket r32 = this.f39587a.getSocketFactory().createSocket(r3, r4);
        if ((r32 instanceof SSLSocket) == false) goto L5;
        a(r32);
        SSLSocket r42 = (SSLSocket) r32;
        this.f39588b = r42;
        this.f39589c = (String[]) r42.getEnabledCipherSuites().clone();
    L5:
        return r32;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] r02 = this.f39589c;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress r1, int r2) {
        return createSocket(r1.getHostAddress(), r2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String r1, int r2, InetAddress r3, int r4) {
        return createSocket(r1, r2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress r1, int r2, InetAddress r3, int r4) {
        return createSocket(r1.getHostAddress(), r2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket r3, String r4, int r5, boolean r6) {
        com.huawei.secure.android.common.ssl.util.f.e(f39586h, "createSocket s host port autoClose");
        Socket r32 = this.f39587a.getSocketFactory().createSocket(r3, r4, r5, r6);
        if ((r32 instanceof SSLSocket) == false) goto L5;
        a(r32);
        SSLSocket r42 = (SSLSocket) r32;
        this.f39588b = r42;
        this.f39589c = (String[]) r42.getEnabledCipherSuites().clone();
    L5:
        return r32;
    }
}
