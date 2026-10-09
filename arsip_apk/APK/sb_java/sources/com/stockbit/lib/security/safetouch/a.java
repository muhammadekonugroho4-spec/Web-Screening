package com.stockbit.lib.security.safetouch;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f120437a;

    /* renamed from: b, reason: collision with root package name */
    public final float f120438b;

    /* renamed from: c, reason: collision with root package name */
    public final float f120439c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120440e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120441f;

    /* renamed from: g, reason: collision with root package name */
    public final float f120442g;

    /* renamed from: h, reason: collision with root package name */
    public final float f120443h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f120444i;

    /* renamed from: j, reason: collision with root package name */
    public final com.stockbit.lib.security.safetouch.accessibility.b f120445j;

    static {
    }

    public a(boolean r2, float r3, float r4, int r5, String r6, String r7, float r8, float r9, boolean r10, com.stockbit.lib.security.safetouch.accessibility.b r11) {
        p.l(r6, "readableToolType");
        p.l(r7, "source");
        p.l(r11, "accessibilityServiceVerdict");
        this.f120437a = r2;
        this.f120438b = r3;
        this.f120439c = r4;
        this.d = r5;
        this.f120440e = r6;
        this.f120441f = r7;
        this.f120442g = r8;
        this.f120443h = r9;
        this.f120444i = r10;
        this.f120445j = r11;
    }

    public final com.stockbit.lib.security.safetouch.accessibility.b a() {
        return this.f120445j;
    }

    public final float b() {
        return this.f120438b;
    }

    public final float c() {
        return this.f120442g;
    }

    public final float d() {
        return this.f120443h;
    }

    public final String e() {
        return this.f120440e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f120437a == r52.f120437a) goto L12;
        return false;
    L12:
        if (Float.compare(this.f120438b, r52.f120438b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f120439c, r52.f120439c) == 0) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f120440e, r52.f120440e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f120441f, r52.f120441f) == true) goto L27;
        return false;
    L27:
        if (Float.compare(this.f120442g, r52.f120442g) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.f120443h, r52.f120443h) == 0) goto L33;
        return false;
    L33:
        if (this.f120444i == r52.f120444i) goto L36;
        return false;
    L36:
        if (p.g(this.f120445j, r52.f120445j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final float f() {
        return this.f120439c;
    }

    public final String g() {
        return this.f120441f;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.f120437a) * 31) + Float.hashCode(this.f120438b)) * 31) + Float.hashCode(this.f120439c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f120440e.hashCode()) * 31) + this.f120441f.hashCode()) * 31) + Float.hashCode(this.f120442g)) * 31) + Float.hashCode(this.f120443h)) * 31) + Boolean.hashCode(this.f120444i)) * 31) + this.f120445j.hashCode();
    }

    public String toString() {
        return "InteractionDetails(isBypassed=" + this.f120437a + ", pressure=" + this.f120438b + ", size=" + this.f120439c + ", toolType=" + this.d + ", readableToolType=" + this.f120440e + ", source=" + this.f120441f + ", rawX=" + this.f120442g + ", rawY=" + this.f120443h + ", accessibilityEnabled=" + this.f120444i + ", accessibilityServiceVerdict=" + this.f120445j + ")";
    }
}
