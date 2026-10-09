package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f22989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22990b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22991c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22992e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22993f;

    public e(String r2, String r3, String r4, List r5) {
        this.f22989a = (String) androidx.core.util.h.g(r2);
        this.f22990b = (String) androidx.core.util.h.g(r3);
        this.f22991c = (String) androidx.core.util.h.g(r4);
        this.d = (List) androidx.core.util.h.g(r5);
        this.f22992e = 0;
        this.f22993f = a(r2, r3, r4);
    }

    public final String a(String r2, String r3, String r4) {
        return r2 + "-" + r3 + "-" + r4;
    }

    public List b() {
        return this.d;
    }

    public int c() {
        return this.f22992e;
    }

    public String d() {
        return this.f22993f;
    }

    public String e() {
        return this.f22989a;
    }

    public String f() {
        return this.f22990b;
    }

    public String g() {
        return this.f22991c;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("FontRequest {mProviderAuthority: " + this.f22989a + ", mProviderPackage: " + this.f22990b + ", mQuery: " + this.f22991c + ", mCertificates:");
        int r2 = 0;
    L4:
        if (r2 >= this.d.size()) goto L10;
        r02.append(" [");
        List r3 = (List) this.d.get(r2);
        int r4 = 0;
    L7:
        if (r4 >= r3.size()) goto L9;
        r02.append(" \"");
        r02.append(Base64.encodeToString((byte[]) r3.get(r4), 0));
        r02.append("\"");
        r4 = r4 + 1;
        goto L7
    L9:
        r02.append(" ]");
        r2 = r2 + 1;
        goto L4
    L10:
        r02.append("}");
        r02.append("mCertificatesArray: " + this.f22992e);
        return r02.toString();
    }
}
