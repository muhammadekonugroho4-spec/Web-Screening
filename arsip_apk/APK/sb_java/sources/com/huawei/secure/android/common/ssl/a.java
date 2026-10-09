package com.huawei.secure.android.common.ssl;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f39572a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39573b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f39574c = null;

    static {
        f39572a = new String[]{"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};
        f39573b = new String[]{"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};
        f39574c = new String[]{"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};
    }

    public static boolean a(SSLSocket r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return b(r1, f39574c);
    }

    public static boolean b(SSLSocket r11, String[] r12) {
        if (r11 != null) goto L5;
        return false;
    L5:
        String[] r1 = r11.getEnabledCipherSuites();
        ArrayList r2 = new ArrayList();
        int r3 = r1.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L16;
        String r5 = r1[r4];
        String r6 = r5.toUpperCase(Locale.ENGLISH);
        int r7 = r12.length;
        int r8 = 0;
    L8:
        if (r8 >= r7) goto L13;
        if (r6.contains(r12[r8].toUpperCase(Locale.ENGLISH)) == true) goto L14;
        r8 = r8 + 1;
    L14:
        r4 = r4 + 1;
        goto L6
    L13:
        r2.add(r5);
        goto L14
    L16:
        if (r2.isEmpty() == true) goto L19;
        r11.setEnabledCipherSuites((String[]) r2.toArray(new String[r2.size()]));
        return true;
    L19:
        return false;
    }

    public static void c(SSLSocket r1) {
        if (r1 != null) goto L5;
        return;
    L5:
        if (g(r1) == true) goto L8;
        a(r1);
        return;
    }

    public static void d(SSLSocket r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 29) goto L7;
        r4.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
    L7:
        if (r02 >= 29) goto L10;
        r4.setEnabledProtocols(new String[]{"TLSv1.2"});
        return;
    }

    public static boolean e(SSLSocket r2, String[] r3) {
        if (r2 == null) goto L11;
        if (r3 == null) goto L11;
        r2.setEnabledProtocols(r3);     // Catch: Exception -> L9
        return true;
    L9:
        e = move-exception;
        com.huawei.secure.android.common.ssl.util.f.d("SSLUtil", "setEnabledProtocols: exception : " + e.getMessage());
    L11:
        return false;
    }

    public static SSLContext f() {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return SSLContext.getInstance("TLSv1.3");
    L7:
        return SSLContext.getInstance("TLSv1.2");
    }

    public static boolean g(SSLSocket r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return h(r1, f39573b);
    }

    public static boolean h(SSLSocket r7, String[] r8) {
        if (r7 != null) goto L5;
        return false;
    L5:
        String[] r1 = r7.getEnabledCipherSuites();
        ArrayList r2 = new ArrayList();
        List r82 = Arrays.asList(r8);
        int r3 = r1.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L12;
        String r5 = r1[r4];
        if (r82.contains(r5.toUpperCase(Locale.ENGLISH)) == false) goto L10;
        r2.add(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L12:
        if (r2.isEmpty() == true) goto L15;
        r7.setEnabledCipherSuites((String[]) r2.toArray(new String[r2.size()]));
        return true;
    L15:
        return false;
    }
}
