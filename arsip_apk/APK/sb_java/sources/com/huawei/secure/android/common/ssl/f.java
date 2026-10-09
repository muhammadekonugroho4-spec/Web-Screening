package com.huawei.secure.android.common.ssl;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public class f implements X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    public static final String f39595c = "f";

    /* renamed from: a, reason: collision with root package name */
    public List f39596a;

    /* renamed from: b, reason: collision with root package name */
    public X509Certificate[] f39597b;

    static {
    }

    public f(InputStream r2, String r3) {
        this.f39596a = new ArrayList();
        a(r2, r3);
    }

    public final void a(InputStream r6, String r7) {
        if (r6 == null) goto L33;
        if (r7 == null) goto L33;
        long r02 = System.currentTimeMillis();
        TrustManagerFactory r2 = TrustManagerFactory.getInstance("X509");     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
        KeyStore r3 = KeyStore.getInstance("bks");     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
        r3.load(r6, r7.toCharArray());     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
        r2.init(r3);     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
        TrustManager[] r72 = r2.getTrustManagers();     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
        int r22 = 0;
    L6:
        if (r22 >= r72.length) goto L25;
        TrustManager r32 = r72[r22];     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
        if ((r32 instanceof X509TrustManager) == false) goto L24;
        this.f39596a.add((X509TrustManager) r32);     // Catch: Throwable -> L12 Throwable -> L14 IOException -> L16 CertificateException -> L18 KeyStoreException -> L20 NegativeArraySizeException -> L22
    L24:
        r22 = r22 + 1;
        goto L6
    L25:
        com.huawei.secure.android.common.ssl.util.e.b(r6);
    L28:
        com.huawei.secure.android.common.ssl.util.f.b(f39595c, "loadInputStream: cost : " + (System.currentTimeMillis() - r02) + " ms");
        return;
    L12:
        th = move-exception;
        com.huawei.secure.android.common.ssl.util.e.b(r6);
        throw th;
    L14:
        e = move-exception;
        com.huawei.secure.android.common.ssl.util.f.d(f39595c, "loadInputStream: exception : " + e.getMessage());     // Catch: Throwable -> L12
        com.huawei.secure.android.common.ssl.util.e.b(r6);
    L33:
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    public void b(X509Certificate[] r1) {
        this.f39597b = r1;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] r6, String r7) {
        com.huawei.secure.android.common.ssl.util.f.e(f39595c, "checkClientTrusted: ");
        Iterator r02 = this.f39596a.iterator();
    L4:
        if (r02.hasNext() == false) goto L11;
        ((X509TrustManager) r02.next()).checkServerTrusted(r6, r7);     // Catch: CertificateException -> L8
        return;
    L8:
        e = move-exception;
        com.huawei.secure.android.common.ssl.util.f.d(f39595c, "checkServerTrusted CertificateException" + e.getMessage());
        goto L4
    L11:
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] r12, String r13) {
        b(r12);
        com.huawei.secure.android.common.ssl.util.f.e(f39595c, "checkServerTrusted begin ,server ca chain size is : " + r12.length + " ,auth type is : " + r13);
        long r02 = System.currentTimeMillis();
        int r2 = r12.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        X509Certificate r5 = r12[r4];
        String r6 = f39595c;
        com.huawei.secure.android.common.ssl.util.f.b(r6, "server ca chain: getSubjectDN is :" + r5.getSubjectDN());
        com.huawei.secure.android.common.ssl.util.f.b(r6, "IssuerDN :" + r5.getIssuerDN());
        com.huawei.secure.android.common.ssl.util.f.b(r6, "SerialNumber : " + r5.getSerialNumber());
        r4 = r4 + 1;
        goto L3
    L5:
        int r22 = this.f39596a.size();
        int r42 = 0;
    L6:
        if (r42 >= r22) goto L24;
        String r52 = f39595c;     // Catch: CertificateException -> L13
        com.huawei.secure.android.common.ssl.util.f.e(r52, "check server i : " + r42);     // Catch: CertificateException -> L13
        X509TrustManager r62 = (X509TrustManager) this.f39596a.get(r42);     // Catch: CertificateException -> L13
        X509Certificate[] r7 = r62.getAcceptedIssuers();     // Catch: CertificateException -> L13
        if (r7 == null) goto L15;
        com.huawei.secure.android.common.ssl.util.f.e(r52, "client root ca size is : " + r7.length);     // Catch: CertificateException -> L13
        int r53 = 0;
    L11:
        if (r53 >= r7.length) goto L15;
        com.huawei.secure.android.common.ssl.util.f.b(f39595c, "client root ca getIssuerDN :" + r7[r53].getIssuerDN());     // Catch: CertificateException -> L13
        r53 = r53 + 1;     // Catch: CertificateException -> L13
    L15:
        r62.checkServerTrusted(r12, r13);     // Catch: CertificateException -> L13
        com.huawei.secure.android.common.ssl.util.f.e(f39595c, "checkServerTrusted succeed ,root ca issuer is : " + r12[r12.length - 1].getIssuerDN());     // Catch: CertificateException -> L13
        return;
    L13:
        e = move-exception;
        String r63 = f39595c;
        com.huawei.secure.android.common.ssl.util.f.d(r63, "checkServerTrusted error :" + e.getMessage() + " , time : " + r42);
        if (r42 == (r22 - 1)) goto L20;
        r42 = r42 + 1;
        goto L6
    L20:
        if (r12.length <= 0) goto L22;
        com.huawei.secure.android.common.ssl.util.f.d(r63, "root ca issuer : " + r12[r12.length - 1].getIssuerDN());
    L22:
        throw e;
    L24:
        com.huawei.secure.android.common.ssl.util.f.b(f39595c, "checkServerTrusted: cost : " + (System.currentTimeMillis() - r02) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        ArrayList r02 = new ArrayList();     // Catch: Exception -> L6
        Iterator r1 = this.f39596a.iterator();     // Catch: Exception -> L6
    L4:
        if (r1.hasNext() == false) goto L8;
        r02.addAll(Arrays.asList(((X509TrustManager) r1.next()).getAcceptedIssuers()));     // Catch: Exception -> L6
        goto L4
    L8:
        return (X509Certificate[]) r02.toArray(new X509Certificate[r02.size()]);
    L6:
        e = move-exception;
        com.huawei.secure.android.common.ssl.util.f.d(f39595c, "getAcceptedIssuers exception : " + e.getMessage());
        return new X509Certificate[0];
    }
}
