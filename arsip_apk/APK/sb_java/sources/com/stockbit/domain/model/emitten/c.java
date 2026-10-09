package com.stockbit.domain.model.emitten;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f82222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82224c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82225e;

    /* renamed from: f, reason: collision with root package name */
    public final List f82226f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82227g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f82228h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82229i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82230j;

    /* renamed from: k, reason: collision with root package name */
    public final com.stockbit.domain.model.company.c f82231k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f82232l;

    /* renamed from: m, reason: collision with root package name */
    public final String f82233m;

    /* renamed from: n, reason: collision with root package name */
    public final String f82234n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f82235o;

    /* renamed from: p, reason: collision with root package name */
    public final String f82236p;

    public c(String r10, String r11, String r12, String r13, String r14, List r15, boolean r16, boolean r17, String r18, String r19, com.stockbit.domain.model.company.c r20, boolean r21, String r22, String r23, boolean r24, String r25) {
        p.l(r10, "change");
        p.l(r11, "symbol");
        p.l(r12, "percentage");
        p.l(r13, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r14, "lastPrice");
        p.l(r15, "notations");
        p.l(r18, "country");
        p.l(r19, "type");
        p.l(r20, "corpAction");
        p.l(r22, NotificationCompat.CATEGORY_STATUS);
        p.l(r23, "iconUrl");
        p.l(r25, "formattedPrice");
        this.f82222a = r10;
        this.f82223b = r11;
        this.f82224c = r12;
        this.d = r13;
        this.f82225e = r14;
        this.f82226f = r15;
        this.f82227g = r16;
        this.f82228h = r17;
        this.f82229i = r18;
        this.f82230j = r19;
        this.f82231k = r20;
        this.f82232l = r21;
        this.f82233m = r22;
        this.f82234n = r23;
        this.f82235o = r24;
        this.f82236p = r25;
    }

    public final String a() {
        return this.f82222a;
    }

    public final com.stockbit.domain.model.company.c b() {
        return this.f82231k;
    }

    public final String c() {
        return this.f82229i;
    }

    public final String d() {
        return this.f82234n;
    }

    public final String e() {
        return this.f82225e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f82222a, r52.f82222a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82223b, r52.f82223b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82224c, r52.f82224c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82225e, r52.f82225e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82226f, r52.f82226f) == true) goto L27;
        return false;
    L27:
        if (this.f82227g == r52.f82227g) goto L30;
        return false;
    L30:
        if (this.f82228h == r52.f82228h) goto L33;
        return false;
    L33:
        if (p.g(this.f82229i, r52.f82229i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82230j, r52.f82230j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82231k, r52.f82231k) == true) goto L42;
        return false;
    L42:
        if (this.f82232l == r52.f82232l) goto L45;
        return false;
    L45:
        if (p.g(this.f82233m, r52.f82233m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82234n, r52.f82234n) == true) goto L51;
        return false;
    L51:
        if (this.f82235o == r52.f82235o) goto L54;
        return false;
    L54:
        if (p.g(this.f82236p, r52.f82236p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final List g() {
        return this.f82226f;
    }

    public final String h() {
        return this.f82224c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f82222a.hashCode() * 31) + this.f82223b.hashCode()) * 31) + this.f82224c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82225e.hashCode()) * 31) + this.f82226f.hashCode()) * 31) + Boolean.hashCode(this.f82227g)) * 31) + Boolean.hashCode(this.f82228h)) * 31) + this.f82229i.hashCode()) * 31) + this.f82230j.hashCode()) * 31) + this.f82231k.hashCode()) * 31) + Boolean.hashCode(this.f82232l)) * 31) + this.f82233m.hashCode()) * 31) + this.f82234n.hashCode()) * 31) + Boolean.hashCode(this.f82235o)) * 31) + this.f82236p.hashCode();
    }

    public final String i() {
        return this.f82223b;
    }

    public final String j() {
        return this.f82230j;
    }

    public final boolean k() {
        return this.f82227g;
    }

    public String toString() {
        return "EmittenHotListEntity(change=" + this.f82222a + ", symbol=" + this.f82223b + ", percentage=" + this.f82224c + ", name=" + this.d + ", lastPrice=" + this.f82225e + ", notations=" + this.f82226f + ", isUma=" + this.f82227g + ", isTradeAble=" + this.f82228h + ", country=" + this.f82229i + ", type=" + this.f82230j + ", corpAction=" + this.f82231k + ", isExist=" + this.f82232l + ", status=" + this.f82233m + ", iconUrl=" + this.f82234n + ", isFollowing=" + this.f82235o + ", formattedPrice=" + this.f82236p + ")";
    }
}
