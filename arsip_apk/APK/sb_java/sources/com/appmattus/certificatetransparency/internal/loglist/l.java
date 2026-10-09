package com.appmattus.certificatetransparency.internal.loglist;

import com.appmattus.certificatetransparency.internal.verifier.CertificateTransparencyProvider;
import java.security.Provider;
import java.security.Security;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class l {
    public static final X509TrustManager a() {
        TrustManagerFactory r02 = b();
        r02.init(null);
        TrustManager[] r03 = r02.getTrustManagers();
        p.k(r03, "getTrustManagers(...)");
        int r1 = r03.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        TrustManager r3 = r03[r2];
        if ((r3 instanceof X509TrustManager) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        p.j(r3, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (X509TrustManager) r3;
    L10:
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final TrustManagerFactory b() {
        String r02 = TrustManagerFactory.getDefaultAlgorithm();
        Provider[] r1 = Security.getProviders("TrustManagerFactory." + r02);
        p.k(r1, "getProviders(...)");
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        Provider r4 = r1[r3];
        if (p.g(r4.getClass(), CertificateTransparencyProvider.class) == false) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        TrustManagerFactory r03 = TrustManagerFactory.getInstance(r02, r4.getName());
        p.k(r03, "getInstance(...)");
        return r03;
    L10:
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
