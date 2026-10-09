package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f83887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83888b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83889c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83890e;

    public w(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "tippableType");
        kotlin.jvm.internal.p.l(r3, "tippableId");
        kotlin.jvm.internal.p.l(r4, "amount");
        kotlin.jvm.internal.p.l(r5, "message");
        kotlin.jvm.internal.p.l(r6, "callbackUrl");
        this.f83887a = r2;
        this.f83888b = r3;
        this.f83889c = r4;
        this.d = r5;
        this.f83890e = r6;
    }

    public final String a() {
        return this.f83889c;
    }

    public final String b() {
        return this.f83890e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f83888b;
    }

    public final String e() {
        return this.f83887a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (kotlin.jvm.internal.p.g(this.f83887a, r52.f83887a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83888b, r52.f83888b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83889c, r52.f83889c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83890e, r52.f83890e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f83887a.hashCode() * 31) + this.f83888b.hashCode()) * 31) + this.f83889c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83890e.hashCode();
    }

    public String toString() {
        return "TippingParams(tippableType=" + this.f83887a + ", tippableId=" + this.f83888b + ", amount=" + this.f83889c + ", message=" + this.d + ", callbackUrl=" + this.f83890e + ')';
    }
}
