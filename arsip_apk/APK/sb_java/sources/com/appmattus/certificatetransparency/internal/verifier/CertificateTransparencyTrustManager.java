package com.appmattus.certificatetransparency.internal.verifier;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/verifier/CertificateTransparencyTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "", "host", "", "Ljava/security/cert/Certificate;", "certificates", "Lcom/appmattus/certificatetransparency/n;", "verifyCertificateTransparency", "(Ljava/lang/String;Ljava/util/List;)Lcom/appmattus/certificatetransparency/n;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CertificateTransparencyTrustManager extends X509TrustManager {
    com.appmattus.certificatetransparency.n verifyCertificateTransparency(String r1, List<? extends Certificate> r2);
}
