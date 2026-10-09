package okhttp3;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.text.C11850c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R%\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00048G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, d2 = {"Lokhttp3/Challenge;", "", "", "scheme", "", "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "realm", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "charset", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Challenge {

    /* renamed from: a, reason: collision with root package name */
    public final String f181243a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f181244b;

    public Challenge(String r5, Map r6) {
        p.l(r5, "scheme");
        p.l(r6, "authParams");
        this.f181243a = r5;
        LinkedHashMap r52 = new LinkedHashMap();
        Iterator r62 = r6.entrySet().iterator();
    L4:
        if (r62.hasNext() == false) goto L10;
        Map.Entry r02 = (Map.Entry) r62.next();
        String r1 = (String) r02.getKey();
        String r03 = (String) r02.getValue();
        if (r1 == null) goto L8;
        Locale r2 = Locale.US;
        p.k(r2, "US");
        String r12 = r1.toLowerCase(r2);
        p.k(r12, "toLowerCase(...)");
    L9:
        r52.put(r12, r03);
        goto L4
    L8:
        r12 = null;
        goto L9
    L10:
        Map r53 = Collections.unmodifiableMap(r52);
        p.k(r53, "unmodifiableMap(...)");
        this.f181244b = r53;
    }

    public final Charset a() {
        String r02 = (String) this.f181244b.get("charset");
        if (r02 == null) goto L7;
        Charset r03 = Charset.forName(r02);     // Catch: Exception -> L8
        p.k(r03, "forName(...)");     // Catch: Exception -> L8
        return r03;
    L7:
        return C11850c.f180366g;
    }

    public final String b() {
        return (String) this.f181244b.get("realm");
    }

    public final String c() {
        return this.f181243a;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof Challenge) == false) goto L10;
        Challenge r32 = (Challenge) r3;
        if (p.g(r32.f181243a, this.f181243a) == true) goto L7;
        return false;
    L7:
        if (p.g(r32.f181244b, this.f181244b) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public int hashCode() {
        return ((899 + this.f181243a.hashCode()) * 31) + this.f181244b.hashCode();
    }

    public String toString() {
        return this.f181243a + " authParams=" + this.f181244b;
    }
}
