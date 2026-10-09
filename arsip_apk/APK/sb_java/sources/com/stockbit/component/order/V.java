package com.stockbit.component.order;

/* loaded from: classes7.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final String f72387a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72389c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final B f72390e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72391f;

    static {
    }

    public V(String r2, boolean r3, String r4, String r5, B r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "actionText");
        kotlin.jvm.internal.p.l(r4, "amount");
        kotlin.jvm.internal.p.l(r5, "priceText");
        kotlin.jvm.internal.p.l(r6, "statusBadge");
        kotlin.jvm.internal.p.l(r7, "expiryText");
        this.f72387a = r2;
        this.f72388b = r3;
        this.f72389c = r4;
        this.d = r5;
        this.f72390e = r6;
        this.f72391f = r7;
    }

    public final String a() {
        return this.f72387a;
    }

    public final String b() {
        return this.f72389c;
    }

    public final String c() {
        return this.f72391f;
    }

    public final String d() {
        return this.d;
    }

    public final B e() {
        return this.f72390e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof V) == true) goto L8;
        return false;
    L8:
        V r52 = (V) r5;
        if (kotlin.jvm.internal.p.g(this.f72387a, r52.f72387a) == true) goto L12;
        return false;
    L12:
        if (this.f72388b == r52.f72388b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f72389c, r52.f72389c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f72390e, r52.f72390e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f72391f, r52.f72391f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f72388b;
    }

    public int hashCode() {
        return (((((((((this.f72387a.hashCode() * 31) + Boolean.hashCode(this.f72388b)) * 31) + this.f72389c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f72390e.hashCode()) * 31) + this.f72391f.hashCode();
    }

    public String toString() {
        return "SmartOrderParentUiState(actionText=" + this.f72387a + ", isSell=" + this.f72388b + ", amount=" + this.f72389c + ", priceText=" + this.d + ", statusBadge=" + this.f72390e + ", expiryText=" + this.f72391f + ')';
    }
}
