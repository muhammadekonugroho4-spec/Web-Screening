package com.stockbit.model.params.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f122140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122142c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122143e;

    /* renamed from: f, reason: collision with root package name */
    public final String f122144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f122145g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f122146h;

    /* renamed from: i, reason: collision with root package name */
    public String f122147i;

    public c(String r1, String r2, String r3, boolean r4, String r5, String r6, int r7, boolean r8, String r9) {
        this.f122140a = r1;
        this.f122141b = r2;
        this.f122142c = r3;
        this.d = r4;
        this.f122143e = r5;
        this.f122144f = r6;
        this.f122145g = r7;
        this.f122146h = r8;
        this.f122147i = r9;
    }

    public final String a() {
        return this.f122147i;
    }

    public final String b() {
        return this.f122143e;
    }

    public final String c() {
        return this.f122142c;
    }

    public final boolean d() {
        return this.f122146h;
    }

    public final String e() {
        return this.f122140a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f122140a, r52.f122140a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122141b, r52.f122141b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122142c, r52.f122142c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f122143e, r52.f122143e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f122144f, r52.f122144f) == true) goto L27;
        return false;
    L27:
        if (this.f122145g == r52.f122145g) goto L30;
        return false;
    L30:
        if (this.f122146h == r52.f122146h) goto L33;
        return false;
    L33:
        if (p.g(this.f122147i, r52.f122147i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        String r02 = this.f122140a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f122141b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f122142c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (((r05 + r24) * 31) + Boolean.hashCode(this.d)) * 31;
        String r25 = this.f122143e;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f122144f;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (((((r07 + r28) * 31) + Integer.hashCode(this.f122145g)) * 31) + Boolean.hashCode(this.f122146h)) * 31;
        String r29 = this.f122147i;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "DeletePostRequest(userId=" + this.f122140a + ", period=" + this.f122141b + ", reason=" + this.f122142c + ", sendEmail=" + this.d + ", postId=" + this.f122143e + ", duration=" + this.f122144f + ", position=" + this.f122145g + ", sendReport=" + this.f122146h + ", parsedDuration=" + this.f122147i + ')';
    }
}
