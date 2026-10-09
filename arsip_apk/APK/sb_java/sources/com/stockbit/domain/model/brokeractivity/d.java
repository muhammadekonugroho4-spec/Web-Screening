package com.stockbit.domain.model.brokeractivity;

import com.google.firebase.messaging.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80879b;

    /* renamed from: c, reason: collision with root package name */
    public final List f80880c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80881e;

    /* renamed from: f, reason: collision with root package name */
    public final List f80882f;

    /* renamed from: g, reason: collision with root package name */
    public final g f80883g;

    /* renamed from: h, reason: collision with root package name */
    public final j f80884h;

    public d(String r2, String r3, List r4, List r5, String r6, List r7, g r8, j r9) {
        kotlin.jvm.internal.p.l(r2, Constants.MessagePayloadKeys.FROM);
        kotlin.jvm.internal.p.l(r3, "to");
        kotlin.jvm.internal.p.l(r4, "symbols");
        kotlin.jvm.internal.p.l(r5, "brokerCodes");
        kotlin.jvm.internal.p.l(r6, "brokerName");
        kotlin.jvm.internal.p.l(r7, "records");
        kotlin.jvm.internal.p.l(r8, "summary");
        kotlin.jvm.internal.p.l(r9, "pagination");
        this.f80878a = r2;
        this.f80879b = r3;
        this.f80880c = r4;
        this.d = r5;
        this.f80881e = r6;
        this.f80882f = r7;
        this.f80883g = r8;
        this.f80884h = r9;
    }

    public final String a() {
        return this.f80878a;
    }

    public final j b() {
        return this.f80884h;
    }

    public final List c() {
        return this.f80882f;
    }

    public final g d() {
        return this.f80883g;
    }

    public final String e() {
        return this.f80879b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f80878a, r52.f80878a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80879b, r52.f80879b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80880c, r52.f80880c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80881e, r52.f80881e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f80882f, r52.f80882f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f80883g, r52.f80883g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f80884h, r52.f80884h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f80878a.hashCode() * 31) + this.f80879b.hashCode()) * 31) + this.f80880c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80881e.hashCode()) * 31) + this.f80882f.hashCode()) * 31) + this.f80883g.hashCode()) * 31) + this.f80884h.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyEntity(from=" + this.f80878a + ", to=" + this.f80879b + ", symbols=" + this.f80880c + ", brokerCodes=" + this.d + ", brokerName=" + this.f80881e + ", records=" + this.f80882f + ", summary=" + this.f80883g + ", pagination=" + this.f80884h + ")";
    }
}
