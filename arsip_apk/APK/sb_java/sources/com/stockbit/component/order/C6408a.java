package com.stockbit.component.order;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* renamed from: com.stockbit.component.order.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6408a {

    /* renamed from: a, reason: collision with root package name */
    public final String f72392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72393b;

    /* renamed from: c, reason: collision with root package name */
    public final List f72394c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72395e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72396f;

    /* renamed from: g, reason: collision with root package name */
    public final B f72397g;

    /* renamed from: h, reason: collision with root package name */
    public final String f72398h;

    static {
    }

    public C6408a(String r2, String r3, List r4, String r5, String r6, String r7, B r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "actionText");
        kotlin.jvm.internal.p.l(r4, "secondaryIcons");
        kotlin.jvm.internal.p.l(r5, "lotText");
        kotlin.jvm.internal.p.l(r6, "amount");
        kotlin.jvm.internal.p.l(r7, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r8, "statusBadge");
        kotlin.jvm.internal.p.l(r9, "expiryText");
        this.f72392a = r2;
        this.f72393b = r3;
        this.f72394c = r4;
        this.d = r5;
        this.f72395e = r6;
        this.f72396f = r7;
        this.f72397g = r8;
        this.f72398h = r9;
    }

    public final String a() {
        return this.f72393b;
    }

    public final String b() {
        return this.f72395e;
    }

    public final String c() {
        return this.f72398h;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f72392a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6408a) == true) goto L8;
        return false;
    L8:
        C6408a r52 = (C6408a) r5;
        if (kotlin.jvm.internal.p.g(this.f72392a, r52.f72392a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f72393b, r52.f72393b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f72394c, r52.f72394c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f72395e, r52.f72395e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f72396f, r52.f72396f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f72397g, r52.f72397g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f72398h, r52.f72398h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f72396f;
    }

    public final List g() {
        return this.f72394c;
    }

    public final B h() {
        return this.f72397g;
    }

    public int hashCode() {
        return (((((((((((((this.f72392a.hashCode() * 31) + this.f72393b.hashCode()) * 31) + this.f72394c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f72395e.hashCode()) * 31) + this.f72396f.hashCode()) * 31) + this.f72397g.hashCode()) * 31) + this.f72398h.hashCode();
    }

    public String toString() {
        return "BracketChildUiState(orderId=" + this.f72392a + ", actionText=" + this.f72393b + ", secondaryIcons=" + this.f72394c + ", lotText=" + this.d + ", amount=" + this.f72395e + ", price=" + this.f72396f + ", statusBadge=" + this.f72397g + ", expiryText=" + this.f72398h + ')';
    }
}
