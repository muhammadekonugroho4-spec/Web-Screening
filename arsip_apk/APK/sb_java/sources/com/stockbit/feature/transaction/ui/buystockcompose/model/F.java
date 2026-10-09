package com.stockbit.feature.transaction.ui.buystockcompose.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.transaction.model.SplitMethodType;

/* loaded from: classes9.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111479a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111480b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111481c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f111482e;

    /* renamed from: f, reason: collision with root package name */
    public final int f111483f;

    /* renamed from: g, reason: collision with root package name */
    public final SplitMethodType f111484g;

    static {
    }

    public F(boolean r2, boolean r3, boolean r4, int r5, int r6, int r7, SplitMethodType r8) {
        kotlin.jvm.internal.p.l(r8, FirebaseAnalytics.Param.METHOD);
        this.f111479a = r2;
        this.f111480b = r3;
        this.f111481c = r4;
        this.d = r5;
        this.f111482e = r6;
        this.f111483f = r7;
        this.f111484g = r8;
    }

    public static /* synthetic */ F b(F r02, boolean r1, boolean r2, boolean r3, int r4, int r5, int r6, SplitMethodType r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f111479a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f111480b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f111481c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f111482e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f111483f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f111484g;
    L23:
        int r82 = r6;
        SplitMethodType r92 = r7;
        int r62 = r4;
        int r72 = r5;
        boolean r52 = r3;
        boolean r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final F a(boolean r10, boolean r11, boolean r12, int r13, int r14, int r15, SplitMethodType r16) {
        kotlin.jvm.internal.p.l(r16, FirebaseAnalytics.Param.METHOD);
        return new F(r10, r11, r12, r13, r14, r15, r16);
    }

    public final int c() {
        return this.f111483f;
    }

    public final SplitMethodType d() {
        return this.f111484g;
    }

    public final int e() {
        return this.f111482e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F) == true) goto L8;
        return false;
    L8:
        F r52 = (F) r5;
        if (this.f111479a == r52.f111479a) goto L12;
        return false;
    L12:
        if (this.f111480b == r52.f111480b) goto L15;
        return false;
    L15:
        if (this.f111481c == r52.f111481c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f111482e == r52.f111482e) goto L24;
        return false;
    L24:
        if (this.f111483f == r52.f111483f) goto L27;
        return false;
    L27:
        if (this.f111484g == r52.f111484g) goto L29;
        return false;
    L29:
        return true;
    }

    public final int f() {
        return this.d;
    }

    public final boolean g() {
        return this.f111481c;
    }

    public final boolean h() {
        return this.f111480b;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f111479a) * 31) + Boolean.hashCode(this.f111480b)) * 31) + Boolean.hashCode(this.f111481c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f111482e)) * 31) + Integer.hashCode(this.f111483f)) * 31) + this.f111484g.hashCode();
    }

    public String toString() {
        return "SplitOrderUIState(isSplitOrderActive=" + this.f111479a + ", isValid=" + this.f111480b + ", isChecked=" + this.f111481c + ", qty=" + this.d + ", min=" + this.f111482e + ", max=" + this.f111483f + ", method=" + this.f111484g + ')';
    }

    public /* synthetic */ F(boolean r2, boolean r3, boolean r4, int r5, int r6, int r7, SplitMethodType r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = SplitMethodType.RANDOM;
    L23:
        SplitMethodType r92 = r8;
        int r82 = r7;
        int r72 = r6;
        int r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
    }
}
