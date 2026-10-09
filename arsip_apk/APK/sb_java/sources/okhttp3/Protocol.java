package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lokhttp3/Protocol;", "", "protocol", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "HTTP_3", "toString", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum Protocol extends Enum<Protocol> {
    public static final Companion Companion = null;
    public static final Protocol H2_PRIOR_KNOWLEDGE = null;
    public static final Protocol HTTP_1_0 = null;
    public static final Protocol HTTP_1_1 = null;
    public static final Protocol HTTP_2 = null;
    public static final Protocol HTTP_3 = null;
    public static final Protocol QUIC = null;

    @kotlin.e
    public static final Protocol SPDY_3 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Protocol[] f181517a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181518b = null;
    private final String protocol;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "<init>", "()V", "", "protocol", "Lokhttp3/Protocol;", "a", "(Ljava/lang/String;)Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final Protocol a(String r6) {
            p.l(r6, "protocol");
            Protocol r02 = Protocol.HTTP_1_0;
            if (p.g(r6, Protocol.access$getProtocol$p(r02)) == false) goto L5;
            return r02;
        L5:
            Protocol r03 = Protocol.HTTP_1_1;
            if (p.g(r6, Protocol.access$getProtocol$p(r03)) == false) goto L8;
            return r03;
        L8:
            Protocol r04 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (p.g(r6, Protocol.access$getProtocol$p(r04)) == false) goto L11;
            return r04;
        L11:
            Protocol r05 = Protocol.HTTP_2;
            if (p.g(r6, Protocol.access$getProtocol$p(r05)) == false) goto L14;
            return r05;
        L14:
            Protocol r06 = Protocol.SPDY_3;
            if (p.g(r6, Protocol.access$getProtocol$p(r06)) == false) goto L17;
            return r06;
        L17:
            Protocol r07 = Protocol.QUIC;
            if (p.g(r6, Protocol.access$getProtocol$p(r07)) == false) goto L20;
            return r07;
        L20:
            Protocol r08 = Protocol.HTTP_3;
            if (y.a0(r6, Protocol.access$getProtocol$p(r08), false, 2, null) == false) goto L24;
            return r08;
        L24:
            throw new IOException("Unexpected protocol: " + r6);
        }

        private Companion() {
        }
    }

    static {
        HTTP_1_0 = new Protocol("HTTP_1_0", 0, "http/1.0");
        HTTP_1_1 = new Protocol("HTTP_1_1", 1, "http/1.1");
        SPDY_3 = new Protocol("SPDY_3", 2, "spdy/3.1");
        HTTP_2 = new Protocol("HTTP_2", 3, "h2");
        H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        QUIC = new Protocol("QUIC", 5, "quic");
        HTTP_3 = new Protocol("HTTP_3", 6, "h3");
        Protocol[] r02 = a();
        f181517a = r02;
        f181518b = kotlin.enums.b.a(r02);
        Companion = new Companion(null);
    }

    Protocol(String r1, int r2, String r3) {
        this.protocol = r3;
    }

    public static final /* synthetic */ Protocol[] a() {
        return new Protocol[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    public static final /* synthetic */ String access$getProtocol$p(Protocol r02) {
        return r02.protocol;
    }

    public static final Protocol get(String r1) throws IOException {
        return Companion.a(r1);
    }

    public static kotlin.enums.a getEntries() {
        return f181518b;
    }

    public static Protocol valueOf(String r1) {
        return (Protocol) Enum.valueOf(Protocol.class, r1);
    }

    public static Protocol[] values() {
        return (Protocol[]) f181517a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
