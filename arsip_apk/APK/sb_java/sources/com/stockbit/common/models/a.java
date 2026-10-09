package com.stockbit.common.models;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f60893a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60894b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60895c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.a f60896e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.jvm.functions.a f60897f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.jvm.functions.a f60898g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.jvm.functions.a f60899h;

    static {
    }

    public a(int r2, int r3, int r4, int r5, kotlin.jvm.functions.a r6, kotlin.jvm.functions.a r7, kotlin.jvm.functions.a r8, kotlin.jvm.functions.a r9) {
        p.l(r6, "primaryButtonAction");
        this.f60893a = r2;
        this.f60894b = r3;
        this.f60895c = r4;
        this.d = r5;
        this.f60896e = r6;
        this.f60897f = r7;
        this.f60898g = r8;
        this.f60899h = r9;
    }

    public final kotlin.jvm.functions.a a() {
        return this.f60899h;
    }

    public final kotlin.jvm.functions.a b() {
        return this.f60898g;
    }

    public final int c() {
        return this.f60894b;
    }

    public final kotlin.jvm.functions.a d() {
        return this.f60896e;
    }

    public final int e() {
        return this.f60895c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f60893a == r52.f60893a) goto L12;
        return false;
    L12:
        if (this.f60894b == r52.f60894b) goto L15;
        return false;
    L15:
        if (this.f60895c == r52.f60895c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f60896e, r52.f60896e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f60897f, r52.f60897f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f60898g, r52.f60898g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f60899h, r52.f60899h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final kotlin.jvm.functions.a f() {
        return this.f60897f;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.f60893a;
    }

    public int hashCode() {
        int r02 = ((((((((Integer.hashCode(this.f60893a) * 31) + Integer.hashCode(this.f60894b)) * 31) + Integer.hashCode(this.f60895c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f60896e.hashCode()) * 31;
        kotlin.jvm.functions.a r1 = this.f60897f;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        kotlin.jvm.functions.a r13 = this.f60898g;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        kotlin.jvm.functions.a r15 = this.f60899h;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "BottomSheetErrorParamRes(title=" + this.f60893a + ", desc=" + this.f60894b + ", primaryButtonText=" + this.f60895c + ", secondaryButtonText=" + this.d + ", primaryButtonAction=" + this.f60896e + ", secondaryButtonAction=" + this.f60897f + ", bottomSheetDismissedAction=" + this.f60898g + ", bottomSheetCancelledAction=" + this.f60899h + ')';
    }
}
