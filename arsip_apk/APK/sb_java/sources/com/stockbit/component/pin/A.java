package com.stockbit.component.pin;

/* loaded from: classes7.dex */
public final class A {

    /* renamed from: j, reason: collision with root package name */
    public static final int f73994j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f73995a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.a f73996b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.a f73997c;
    public final kotlin.jvm.functions.a d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.a f73998e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.jvm.functions.a f73999f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.jvm.functions.l f74000g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.jvm.functions.a f74001h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.functions.l f74002i;

    static {
    }

    public A(kotlin.jvm.functions.l r2, kotlin.jvm.functions.a r3, kotlin.jvm.functions.a r4, kotlin.jvm.functions.a r5, kotlin.jvm.functions.a r6, kotlin.jvm.functions.a r7, kotlin.jvm.functions.l r8, kotlin.jvm.functions.a r9, kotlin.jvm.functions.l r10) {
        kotlin.jvm.internal.p.l(r2, "onPinSubmitted");
        kotlin.jvm.internal.p.l(r3, "onClickNavigationIcon");
        kotlin.jvm.internal.p.l(r4, "onClickLiveSupport");
        kotlin.jvm.internal.p.l(r8, "onUpdatePin");
        kotlin.jvm.internal.p.l(r10, "onCursorChange");
        this.f73995a = r2;
        this.f73996b = r3;
        this.f73997c = r4;
        this.d = r5;
        this.f73998e = r6;
        this.f73999f = r7;
        this.f74000g = r8;
        this.f74001h = r9;
        this.f74002i = r10;
    }

    public final kotlin.jvm.functions.a a() {
        return this.f73998e;
    }

    public final kotlin.jvm.functions.a b() {
        return this.d;
    }

    public final kotlin.jvm.functions.a c() {
        return this.f73997c;
    }

    public final kotlin.jvm.functions.a d() {
        return this.f73996b;
    }

    public final kotlin.jvm.functions.l e() {
        return this.f74002i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (kotlin.jvm.internal.p.g(this.f73995a, r52.f73995a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f73996b, r52.f73996b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f73997c, r52.f73997c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f73998e, r52.f73998e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f73999f, r52.f73999f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f74000g, r52.f74000g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f74001h, r52.f74001h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f74002i, r52.f74002i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final kotlin.jvm.functions.l f() {
        return this.f73995a;
    }

    public final kotlin.jvm.functions.l g() {
        return this.f74000g;
    }

    public int hashCode() {
        int r02 = ((((this.f73995a.hashCode() * 31) + this.f73996b.hashCode()) * 31) + this.f73997c.hashCode()) * 31;
        kotlin.jvm.functions.a r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        kotlin.jvm.functions.a r13 = this.f73998e;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        kotlin.jvm.functions.a r15 = this.f73999f;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (((r04 + r16) * 31) + this.f74000g.hashCode()) * 31;
        kotlin.jvm.functions.a r17 = this.f74001h;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return ((r05 + r2) * 31) + this.f74002i.hashCode();
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "PinScreenAction(onPinSubmitted=" + this.f73995a + ", onClickNavigationIcon=" + this.f73996b + ", onClickLiveSupport=" + this.f73997c + ", onClickForgotPin=" + this.d + ", onBiometricClick=" + this.f73998e + ", onVirtualTooltipDismiss=" + this.f73999f + ", onUpdatePin=" + this.f74000g + ", onRevealPin=" + this.f74001h + ", onCursorChange=" + this.f74002i + ')';
    }

    public /* synthetic */ A(kotlin.jvm.functions.l r2, kotlin.jvm.functions.a r3, kotlin.jvm.functions.a r4, kotlin.jvm.functions.a r5, kotlin.jvm.functions.a r6, kotlin.jvm.functions.a r7, kotlin.jvm.functions.l r8, kotlin.jvm.functions.a r9, kotlin.jvm.functions.l r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r11 & 16) == 0) goto L9;
        r6 = null;
    L9:
        if ((r11 & 32) == 0) goto L12;
        r7 = null;
    L12:
        if ((r11 & 128) == 0) goto L15;
        kotlin.jvm.functions.l r112 = r10;
        kotlin.jvm.functions.a r102 = null;
    L14:
        kotlin.jvm.functions.a r82 = r7;
        this(r2, r3, r4, r5, r6, r82, r8, r102, r112);
        return;
    L15:
        r112 = r10;
        r102 = r9;
        goto L14
    }
}
