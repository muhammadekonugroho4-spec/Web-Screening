package com.stockbit.domain.model.shareholding;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f85763g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final d f85764h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final f f85765i = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f85766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85767b;

    /* renamed from: c, reason: collision with root package name */
    public final d f85768c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final d f85769e;

    /* renamed from: f, reason: collision with root package name */
    public final d f85770f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a() {
            return f.a();
        }

        public a() {
        }
    }

    static {
        f85763g = new a(null);
        d r6 = new d("", "");
        f85764h = r6;
        f85765i = new f(0, "", r6, r6, r6, r6);
    }

    public f(long r2, String r4, d r5, d r6, d r7, d r8) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "investorClassification");
        p.l(r6, FirebaseAnalytics.Param.LOCATION);
        p.l(r7, "nationality");
        p.l(r8, "domicile");
        this.f85766a = r2;
        this.f85767b = r4;
        this.f85768c = r5;
        this.d = r6;
        this.f85769e = r7;
        this.f85770f = r8;
    }

    public static final /* synthetic */ f a() {
        return f85765i;
    }

    public final long b() {
        return this.f85766a;
    }

    public final d c() {
        return this.f85768c;
    }

    public final d d() {
        return this.d;
    }

    public final String e() {
        return this.f85767b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (this.f85766a == r82.f85766a) goto L12;
        return false;
    L12:
        if (p.g(this.f85767b, r82.f85767b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85768c, r82.f85768c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85769e, r82.f85769e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85770f, r82.f85770f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f85766a) * 31) + this.f85767b.hashCode()) * 31) + this.f85768c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85769e.hashCode()) * 31) + this.f85770f.hashCode();
    }

    public String toString() {
        return "ShareholdingInvestorDetailEntity(id=" + this.f85766a + ", name=" + this.f85767b + ", investorClassification=" + this.f85768c + ", location=" + this.d + ", nationality=" + this.f85769e + ", domicile=" + this.f85770f + ")";
    }
}
