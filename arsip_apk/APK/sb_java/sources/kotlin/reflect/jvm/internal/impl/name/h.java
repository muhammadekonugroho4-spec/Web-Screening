package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f179278a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final f f179279b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final f f179280c = null;
    public static final f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final f f179281e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final f f179282f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final f f179283g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final f f179284h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final f f179285i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final f f179286j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final f f179287k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final f f179288l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final f f179289m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final f f179290n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final f f179291o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final f f179292p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final f f179293q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final f f179294r = null;

    static {
        f179278a = new h();
        f r02 = f.j("<no name provided>");
        p.k(r02, "special(\"<no name provided>\")");
        f179279b = r02;
        f r03 = f.j("<root package>");
        p.k(r03, "special(\"<root package>\")");
        f179280c = r03;
        f r04 = f.g("Companion");
        p.k(r04, "identifier(\"Companion\")");
        d = r04;
        f r05 = f.g("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        p.k(r05, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f179281e = r05;
        f r06 = f.j("<anonymous>");
        p.k(r06, "special(ANONYMOUS_STRING)");
        f179282f = r06;
        f r07 = f.j("<unary>");
        p.k(r07, "special(\"<unary>\")");
        f179283g = r07;
        f r08 = f.j("<unary-result>");
        p.k(r08, "special(\"<unary-result>\")");
        f179284h = r08;
        f r09 = f.j("<this>");
        p.k(r09, "special(\"<this>\")");
        f179285i = r09;
        f r010 = f.j("<init>");
        p.k(r010, "special(\"<init>\")");
        f179286j = r010;
        f r011 = f.j("<iterator>");
        p.k(r011, "special(\"<iterator>\")");
        f179287k = r011;
        f r012 = f.j("<destruct>");
        p.k(r012, "special(\"<destruct>\")");
        f179288l = r012;
        f r013 = f.j("<local>");
        p.k(r013, "special(\"<local>\")");
        f179289m = r013;
        f r014 = f.j("<unused var>");
        p.k(r014, "special(\"<unused var>\")");
        f179290n = r014;
        f r015 = f.j("<set-?>");
        p.k(r015, "special(\"<set-?>\")");
        f179291o = r015;
        f r016 = f.j("<array>");
        p.k(r016, "special(\"<array>\")");
        f179292p = r016;
        f r017 = f.j("<receiver>");
        p.k(r017, "special(\"<receiver>\")");
        f179293q = r017;
        f r018 = f.j("<get-entries>");
        p.k(r018, "special(\"<get-entries>\")");
        f179294r = r018;
    }

    public h() {
    }

    public static final f b(f r1) {
        if (r1 == null) goto L7;
        if (r1.h() == true) goto L7;
        return r1;
    L7:
        return f179281e;
    }

    public final boolean a(f r3) {
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String r02 = r3.b();
        p.k(r02, "name.asString()");
        if (r02.length() > 0) goto L5;
        return false;
    L5:
        if (r3.h() == true) goto L10;
        return true;
    L10:
        return false;
    }
}
