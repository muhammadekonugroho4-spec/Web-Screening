package com.stockbit.component.dialog.ordertype;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70326a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70328c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70329e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f70330f;

    static {
    }

    public a(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6) {
        this.f70326a = r1;
        this.f70327b = r2;
        this.f70328c = r3;
        this.d = r4;
        this.f70329e = r5;
        this.f70330f = r6;
    }

    public final boolean a() {
        return this.f70330f;
    }

    public final boolean b() {
        return this.f70329e;
    }

    public final boolean c() {
        return this.f70327b;
    }

    public final boolean d() {
        return this.f70326a;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f70326a == r52.f70326a) goto L12;
        return false;
    L12:
        if (this.f70327b == r52.f70327b) goto L15;
        return false;
    L15:
        if (this.f70328c == r52.f70328c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f70329e == r52.f70329e) goto L24;
        return false;
    L24:
        if (this.f70330f == r52.f70330f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f70328c;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f70326a) * 31) + Boolean.hashCode(this.f70327b)) * 31) + Boolean.hashCode(this.f70328c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f70329e)) * 31) + Boolean.hashCode(this.f70330f);
    }

    public String toString() {
        return "OrderSettingConfig(isSplitOrderAvailable=" + this.f70326a + ", isSplitOrderActive=" + this.f70327b + ", isVolumeTriggerAvailable=" + this.f70328c + ", isVolumeTriggerActive=" + this.d + ", isBracketOrderAvailable=" + this.f70329e + ", isBracketOrderActive=" + this.f70330f + ')';
    }

    public /* synthetic */ a(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r8 & 32) == 0) goto L21;
        boolean r82 = false;
    L20:
        boolean r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
