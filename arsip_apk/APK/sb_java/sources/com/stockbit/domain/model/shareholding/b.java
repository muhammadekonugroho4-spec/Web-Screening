package com.stockbit.domain.model.shareholding;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f85749e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final b f85750f = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f85751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85752b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85753c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a() {
            return b.a();
        }

        public a() {
        }
    }

    static {
        f85749e = new a(null);
        f85750f = new b(0, "", "", "");
    }

    public b(long r2, String r4, String r5, String r6) {
        p.l(r4, "symbol");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r6, "iconUrl");
        this.f85751a = r2;
        this.f85752b = r4;
        this.f85753c = r5;
        this.d = r6;
    }

    public static final /* synthetic */ b a() {
        return f85750f;
    }

    public final String b() {
        return this.d;
    }

    public final long c() {
        return this.f85751a;
    }

    public final String d() {
        return this.f85753c;
    }

    public final String e() {
        return this.f85752b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f85751a == r82.f85751a) goto L12;
        return false;
    L12:
        if (p.g(this.f85752b, r82.f85752b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85753c, r82.f85753c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f85751a) * 31) + this.f85752b.hashCode()) * 31) + this.f85753c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ShareholdingCompanyEntity(id=" + this.f85751a + ", symbol=" + this.f85752b + ", name=" + this.f85753c + ", iconUrl=" + this.d + ")";
    }
}
