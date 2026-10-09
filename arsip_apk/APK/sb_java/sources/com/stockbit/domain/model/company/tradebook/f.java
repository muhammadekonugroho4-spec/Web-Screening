package com.stockbit.domain.model.company.tradebook;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f82026a;

    /* renamed from: b, reason: collision with root package name */
    public final List f82027b;

    /* renamed from: c, reason: collision with root package name */
    public final j f82028c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82029e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82030f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82031g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82032h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82033i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82034j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82035k;

    public f(List r2, List r3, j r4, i r5, boolean r6, boolean r7, String r8, String r9, String r10, String r11, String r12) {
        p.l(r2, "marketHours");
        p.l(r3, "book");
        p.l(r5, "paginate");
        p.l(r8, Constants.MessagePayloadKeys.FROM);
        p.l(r9, "to");
        p.l(r10, com.clevertap.android.sdk.Constants.KEY_DATE);
        p.l(r11, "minDate");
        p.l(r12, "previousPrice");
        this.f82026a = r2;
        this.f82027b = r3;
        this.f82028c = r4;
        this.d = r5;
        this.f82029e = r6;
        this.f82030f = r7;
        this.f82031g = r8;
        this.f82032h = r9;
        this.f82033i = r10;
        this.f82034j = r11;
        this.f82035k = r12;
    }

    public final List a() {
        return this.f82027b;
    }

    public final String b() {
        return this.f82033i;
    }

    public final String c() {
        return this.f82031g;
    }

    public final String d() {
        return this.f82034j;
    }

    public final String e() {
        return this.f82035k;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f82026a, r52.f82026a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82027b, r52.f82027b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82028c, r52.f82028c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f82029e == r52.f82029e) goto L24;
        return false;
    L24:
        if (this.f82030f == r52.f82030f) goto L27;
        return false;
    L27:
        if (p.g(this.f82031g, r52.f82031g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82032h, r52.f82032h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82033i, r52.f82033i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82034j, r52.f82034j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82035k, r52.f82035k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f82032h;
    }

    public final j g() {
        return this.f82028c;
    }

    public final boolean h() {
        return this.f82030f;
    }

    public int hashCode() {
        int r02 = ((this.f82026a.hashCode() * 31) + this.f82027b.hashCode()) * 31;
        j r1 = this.f82028c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((((((((((r02 + r12) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f82029e)) * 31) + Boolean.hashCode(this.f82030f)) * 31) + this.f82031g.hashCode()) * 31) + this.f82032h.hashCode()) * 31) + this.f82033i.hashCode()) * 31) + this.f82034j.hashCode()) * 31) + this.f82035k.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final boolean i() {
        return this.f82029e;
    }

    public String toString() {
        return "TradeBookEntity(marketHours=" + this.f82026a + ", book=" + this.f82027b + ", total=" + this.f82028c + ", paginate=" + this.d + ", isShowPrePost=" + this.f82029e + ", isFcaStock=" + this.f82030f + ", from=" + this.f82031g + ", to=" + this.f82032h + ", date=" + this.f82033i + ", minDate=" + this.f82034j + ", previousPrice=" + this.f82035k + ")";
    }
}
