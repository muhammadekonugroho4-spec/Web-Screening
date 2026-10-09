package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lokhttp3/Dns;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/util/List;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Dns {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f181376a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Dns f181377b = null;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/Dns$Companion;", "", "<init>", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f181378a = null;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "<init>", "()V", "", "hostname", "", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DnsSystem implements Dns {
            public DnsSystem() {
            }

            @Override // okhttp3.Dns
            public List a(String r5) {
                p.l(r5, "hostname");
                InetAddress[] r02 = InetAddress.getAllByName(r5);     // Catch: NullPointerException -> L5
                p.k(r02, "getAllByName(...)");     // Catch: NullPointerException -> L5
                return r.K1(r02);
            L5:
                e = move-exception;
                UnknownHostException r1 = new UnknownHostException("Broken system behaviour for dns lookup of " + r5);
                r1.initCause(e);
                throw r1;
            }
        }

        static {
            f181378a = new Companion();
        }

        private Companion() {
        }
    }

    static {
        f181376a = Companion.f181378a;
        f181377b = new Companion.DnsSystem();
    }

    List a(String r1);
}
