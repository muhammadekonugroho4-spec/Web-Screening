package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f160091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160092b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160093c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160094e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160095f;

    /* renamed from: g, reason: collision with root package name */
    public final String f160096g;

    /* renamed from: h, reason: collision with root package name */
    public final String f160097h;

    /* renamed from: i, reason: collision with root package name */
    public final String f160098i;

    /* renamed from: j, reason: collision with root package name */
    public final int f160099j;

    public z(String r2, String r3, boolean r4, boolean r5, String r6, String r7, String r8, String r9, String r10, int r11) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "img");
        kotlin.jvm.internal.p.l(r6, "username");
        kotlin.jvm.internal.p.l(r7, "fullname");
        kotlin.jvm.internal.p.l(r8, "url");
        kotlin.jvm.internal.p.l(r9, "type");
        kotlin.jvm.internal.p.l(r10, "other");
        this.f160091a = r2;
        this.f160092b = r3;
        this.f160093c = r4;
        this.d = r5;
        this.f160094e = r6;
        this.f160095f = r7;
        this.f160096g = r8;
        this.f160097h = r9;
        this.f160098i = r10;
        this.f160099j = r11;
    }

    public final String a() {
        return this.f160095f;
    }

    public final String b() {
        return this.f160091a;
    }

    public final String c() {
        return this.f160092b;
    }

    public final String d() {
        return this.f160094e;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (kotlin.jvm.internal.p.g(this.f160091a, r52.f160091a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160092b, r52.f160092b) == true) goto L15;
        return false;
    L15:
        if (this.f160093c == r52.f160093c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f160094e, r52.f160094e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f160095f, r52.f160095f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f160096g, r52.f160096g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f160097h, r52.f160097h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f160098i, r52.f160098i) == true) goto L36;
        return false;
    L36:
        if (this.f160099j == r52.f160099j) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.f160091a.hashCode() * 31) + this.f160092b.hashCode()) * 31) + Boolean.hashCode(this.f160093c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f160094e.hashCode()) * 31) + this.f160095f.hashCode()) * 31) + this.f160096g.hashCode()) * 31) + this.f160097h.hashCode()) * 31) + this.f160098i.hashCode()) * 31) + Integer.hashCode(this.f160099j);
    }

    public String toString() {
        return this.f160094e;
    }

    public /* synthetic */ z(String r3, String r4, boolean r5, boolean r6, String r7, String r8, String r9, String r10, String r11, int r12, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r13 & 512) == 0) goto L33;
        int r132 = 0;
    L32:
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L33:
        r132 = r12;
        goto L32
    }
}
