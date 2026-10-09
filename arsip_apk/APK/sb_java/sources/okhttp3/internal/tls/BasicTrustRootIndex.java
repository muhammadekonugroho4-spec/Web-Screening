package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "", "Ljava/security/cert/X509Certificate;", "caCerts", "<init>", "([Ljava/security/cert/X509Certificate;)V", "cert", "a", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ljavax/security/auth/x500/X500Principal;", "", "Ljava/util/Map;", "subjectToCaCerts", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {

    /* renamed from: a, reason: collision with root package name */
    public final Map f182196a;

    public BasicTrustRootIndex(X509Certificate... r7) {
        p.l(r7, "caCerts");
        LinkedHashMap r02 = new LinkedHashMap();
        int r1 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        X509Certificate r3 = r7[r2];
        X500Principal r4 = r3.getSubjectX500Principal();
        Object r5 = r02.get(r4);
        if (r5 != null) goto L7;
        r5 = new LinkedHashSet();
        r02.put(r4, r5);
    L7:
        ((Set) r5).add(r3);
        r2 = r2 + 1;
        goto L3
    L8:
        this.f182196a = r02;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate a(X509Certificate r5) {
        p.l(r5, "cert");
        X500Principal r02 = r5.getIssuerX500Principal();
        Set r03 = (Set) this.f182196a.get(r02);
        Object r1 = null;
        if (r03 != null) goto L5;
        return null;
    L5:
        Iterator r04 = r03.iterator();
    L7:
        if (r04.hasNext() == false) goto L12;
        Object r2 = r04.next();
        r5.verify(((X509Certificate) r2).getPublicKey());     // Catch: Exception -> L13
        r1 = r2;
    L12:
        return (X509Certificate) r1;
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if ((r2 instanceof BasicTrustRootIndex) == true) goto L6;
        return false;
    L6:
        if (p.g(((BasicTrustRootIndex) r2).f182196a, this.f182196a) == true) goto L13;
        return false;
    L13:
        return true;
    }

    public int hashCode() {
        return this.f182196a.hashCode();
    }
}
