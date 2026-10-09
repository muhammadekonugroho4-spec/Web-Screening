package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/io/IOException;", "Lokio/IOException;", "e", "", "a", "(Ljava/io/IOException;)Z", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RetryTlsHandshakeKt {
    public static final boolean a(IOException r2) {
        p.l(r2, "e");
        if ((r2 instanceof ProtocolException) == false) goto L6;
        return false;
    L6:
        if ((r2 instanceof InterruptedIOException) == false) goto L9;
        return false;
    L9:
        if ((r2 instanceof SSLHandshakeException) == false) goto L14;
        if ((r2.getCause() instanceof CertificateException) == false) goto L14;
        return false;
    L14:
        if ((r2 instanceof SSLPeerUnverifiedException) == false) goto L17;
        return false;
    L17:
        if ((r2 instanceof SSLException) == false) goto L20;
        return true;
    L20:
        return false;
    }
}
