package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f83567a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f83568b;

    /* renamed from: c, reason: collision with root package name */
    public String f83569c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83570e;

    /* renamed from: f, reason: collision with root package name */
    public String f83571f;

    /* renamed from: g, reason: collision with root package name */
    public String f83572g;

    /* renamed from: h, reason: collision with root package name */
    public String f83573h;

    public v(boolean r1, boolean r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.f83567a = r1;
        this.f83568b = r2;
        this.f83569c = r3;
        this.d = r4;
        this.f83570e = r5;
        this.f83571f = r6;
        this.f83572g = r7;
        this.f83573h = r8;
    }

    public final String a() {
        return this.f83569c;
    }

    public final String b() {
        return this.f83570e;
    }

    public final String c() {
        return this.f83573h;
    }

    public final String d() {
        return this.f83571f;
    }

    public final String e() {
        return this.f83572g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (this.f83567a == r52.f83567a) goto L12;
        return false;
    L12:
        if (this.f83568b == r52.f83568b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83569c, r52.f83569c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83570e, r52.f83570e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83571f, r52.f83571f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83572g, r52.f83572g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83573h, r52.f83573h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f83567a;
    }

    public final boolean h() {
        return this.f83568b;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.f83567a) * 31) + Boolean.hashCode(this.f83568b)) * 31;
        String r1 = this.f83569c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f83570e;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f83571f;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f83572g;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.f83573h;
        if (r111 == null) goto L27;
        r2 = r111.hashCode();
    L27:
        return r07 + r2;
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
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
        return "TradingExerciseableStock(isExerciseable=" + this.f83567a + ", isTradeable=" + this.f83568b + ", endDateExercise=" + this.f83569c + ", timeServer=" + this.d + ", notExerciseableReason=" + this.f83570e + ", notTradeableReason=" + this.f83571f + ", notTradeableType=" + this.f83572g + ", notExerciseableType=" + this.f83573h + ')';
    }
}
