package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import com.clevertap.android.sdk.Constants;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljavax/net/ssl/X509TrustManager;", "c", "Landroid/net/http/X509TrustManagerExtensions;", Constants.INAPP_DATA_TAG, "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion d = null;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f182153b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f182154c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "a", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final AndroidCertificateChainCleaner a(X509TrustManager r3) {
            p.l(r3, "trustManager");
            X509TrustManagerExtensions r1 = new X509TrustManagerExtensions(r3);     // Catch: IllegalArgumentException -> L5
        L6:
            if (r1 != null) goto L8;
            return null;
        L8:
            return new AndroidCertificateChainCleaner(r3, r1);
        L5:
            r1 = null;
            goto L6
        }

        private Companion() {
        }
    }

    static {
        d = new Companion(null);
    }

    public AndroidCertificateChainCleaner(X509TrustManager r2, X509TrustManagerExtensions r3) {
        p.l(r2, "trustManager");
        p.l(r3, "x509TrustManagerExtensions");
        this.f182153b = r2;
        this.f182154c = r3;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public List a(List r3, String r4) {
        p.l(r3, "chain");
        p.l(r4, "hostname");
        X509Certificate[] r32 = (X509Certificate[]) r3.toArray(new X509Certificate[0]);
        List<X509Certificate> r33 = this.f182154c.checkServerTrusted(r32, "RSA", r4);     // Catch: CertificateException -> L5
        p.k(r33, "checkServerTrusted(...)");     // Catch: CertificateException -> L5
        return r33;
    L5:
        e = move-exception;
        SSLPeerUnverifiedException r42 = new SSLPeerUnverifiedException(e.getMessage());
        r42.initCause(e);
        throw r42;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof AndroidCertificateChainCleaner) == true) goto L5;
        return false;
    L5:
        if (((AndroidCertificateChainCleaner) r2).f182153b != this.f182153b) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f182153b);
    }
}
