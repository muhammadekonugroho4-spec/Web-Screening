package okhttp3.dnsoverhttps;

import com.clevertap.android.sdk.Constants;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import okhttp3.Dns;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/dnsoverhttps/BootstrapDns;", "Lokhttp3/Dns;", "", "dnsHostname", "", "Ljava/net/InetAddress;", "dnsServers", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "hostname", "a", "(Ljava/lang/String;)Ljava/util/List;", "c", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BootstrapDns implements Dns {

    /* renamed from: c, reason: collision with root package name */
    public final String f181598c;
    public final List d;

    public BootstrapDns(String r2, List r3) {
        p.l(r2, "dnsHostname");
        p.l(r3, "dnsServers");
        this.f181598c = r2;
        this.d = r3;
    }

    @Override // okhttp3.Dns
    public List a(String r4) {
        p.l(r4, "hostname");
        if (p.g(this.f181598c, r4) == false) goto L7;
        return this.d;
    L7:
        throw new UnknownHostException("BootstrapDns called for " + r4 + " instead of " + this.f181598c);
    }
}
