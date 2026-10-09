package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CertificateChainCleaner {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f182197a = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/tls/CertificateChainCleaner;", "a", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final CertificateChainCleaner a(X509TrustManager r2) {
            p.l(r2, "trustManager");
            return Platform.f182148a.e().d(r2);
        }

        private Companion() {
        }
    }

    static {
        f182197a = new Companion(null);
    }

    public CertificateChainCleaner() {
    }

    public abstract List a(List r1, String r2);
}
