package com.stockbit.compose.utils;

/* loaded from: classes8.dex */
public final class h {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f78471a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f78472b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78473c;

    static {
    }

    public h(String r2, Integer r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "textValue");
        this.f78471a = r2;
        this.f78472b = r3;
        this.f78473c = r4;
    }

    public final Integer a() {
        return this.f78472b;
    }

    public final boolean b() {
        return this.f78473c;
    }

    public final String c() {
        return this.f78471a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f78471a, r52.f78471a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f78472b, r52.f78472b) == true) goto L15;
        return false;
    L15:
        if (this.f78473c == r52.f78473c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f78471a.hashCode() * 31;
        Integer r1 = this.f78472b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f78473c);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OrderSwitcherItem(textValue=" + this.f78471a + ", automationId=" + this.f78472b + ", showTrailingIcon=" + this.f78473c + ')';
    }

    public /* synthetic */ h(String r1, Integer r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = false;
    L8:
        this(r1, r2, r3);
    }
}
