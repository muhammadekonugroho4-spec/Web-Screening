package com.stockbit.domain.model.param.stream;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f84601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84602b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84603c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84604e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84605f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84606g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84607h;

    /* renamed from: i, reason: collision with root package name */
    public String f84608i;

    public d(String r2, String r3, String r4, boolean r5, String r6, String r7, int r8, boolean r9, String r10) {
        p.l(r2, "userId");
        p.l(r3, "period");
        p.l(r4, "reason");
        p.l(r6, "postId");
        p.l(r7, "duration");
        p.l(r10, "parsedDuration");
        this.f84601a = r2;
        this.f84602b = r3;
        this.f84603c = r4;
        this.d = r5;
        this.f84604e = r6;
        this.f84605f = r7;
        this.f84606g = r8;
        this.f84607h = r9;
        this.f84608i = r10;
    }

    public final String a() {
        return this.f84605f;
    }

    public final int b() {
        return this.f84606g;
    }

    public final com.stockbit.model.params.stream.c c() {
        return new com.stockbit.model.params.stream.c(this.f84601a, this.f84602b, this.f84603c, this.d, this.f84604e, this.f84605f, this.f84606g, this.f84607h, this.f84608i);
    }

    public final void d(String r2) {
        p.l(r2, "<set-?>");
        this.f84608i = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f84601a, r52.f84601a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84602b, r52.f84602b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84603c, r52.f84603c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f84604e, r52.f84604e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84605f, r52.f84605f) == true) goto L27;
        return false;
    L27:
        if (this.f84606g == r52.f84606g) goto L30;
        return false;
    L30:
        if (this.f84607h == r52.f84607h) goto L33;
        return false;
    L33:
        if (p.g(this.f84608i, r52.f84608i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.f84601a.hashCode() * 31) + this.f84602b.hashCode()) * 31) + this.f84603c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.f84604e.hashCode()) * 31) + this.f84605f.hashCode()) * 31) + Integer.hashCode(this.f84606g)) * 31) + Boolean.hashCode(this.f84607h)) * 31) + this.f84608i.hashCode();
    }

    public String toString() {
        return "DeletePostParam(userId=" + this.f84601a + ", period=" + this.f84602b + ", reason=" + this.f84603c + ", sendEmail=" + this.d + ", postId=" + this.f84604e + ", duration=" + this.f84605f + ", position=" + this.f84606g + ", sendReport=" + this.f84607h + ", parsedDuration=" + this.f84608i + ')';
    }

    public /* synthetic */ d(String r3, String r4, String r5, boolean r6, String r7, String r8, int r9, boolean r10, String r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = true;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = false;
    L27:
        if ((r12 & 256) == 0) goto L30;
        String r122 = "";
    L29:
        boolean r112 = r10;
        int r102 = r9;
        String r92 = r8;
        String r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
        return;
    L30:
        r122 = r11;
        goto L29
    }
}
