package com.huawei.secure.android.common.ssl.hostname;

import com.huawei.secure.android.common.ssl.util.f;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes6.dex */
public class a implements HostnameVerifier {
    public a() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String r5, SSLSession r6) {
        X509Certificate r62 = (X509Certificate) r6.getPeerCertificates()[0];     // Catch: SSLException -> L5
        f.b("", "verify: certificate is : " + r62.getSubjectDN().getName());     // Catch: SSLException -> L5
        c.a(r5, r62, true);     // Catch: SSLException -> L5
        return true;
    L5:
        e = move-exception;
        f.d("", "SSLException : " + e.getMessage());
        return false;
    }
}
