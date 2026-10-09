package com.stockbit.domain.model.entity.search;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f82954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82955b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82956c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82957e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82958f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82959g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82960h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82961i;

    /* renamed from: j, reason: collision with root package name */
    public final int f82962j;

    public e(String r2, String r3, boolean r4, boolean r5, String r6, String r7, String r8, String r9, String r10, int r11) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "img");
        p.l(r6, "username");
        p.l(r7, "fullname");
        p.l(r8, "url");
        p.l(r9, "type");
        p.l(r10, "other");
        this.f82954a = r2;
        this.f82955b = r3;
        this.f82956c = r4;
        this.d = r5;
        this.f82957e = r6;
        this.f82958f = r7;
        this.f82959g = r8;
        this.f82960h = r9;
        this.f82961i = r10;
        this.f82962j = r11;
    }

    public final String a() {
        return this.f82958f;
    }

    public final String b() {
        return this.f82955b;
    }

    public final String c() {
        return this.f82957e;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f82954a, r52.f82954a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82955b, r52.f82955b) == true) goto L15;
        return false;
    L15:
        if (this.f82956c == r52.f82956c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f82957e, r52.f82957e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82958f, r52.f82958f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82959g, r52.f82959g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82960h, r52.f82960h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82961i, r52.f82961i) == true) goto L36;
        return false;
    L36:
        if (this.f82962j == r52.f82962j) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.f82954a.hashCode() * 31) + this.f82955b.hashCode()) * 31) + Boolean.hashCode(this.f82956c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f82957e.hashCode()) * 31) + this.f82958f.hashCode()) * 31) + this.f82959g.hashCode()) * 31) + this.f82960h.hashCode()) * 31) + this.f82961i.hashCode()) * 31) + Integer.hashCode(this.f82962j);
    }

    public String toString() {
        return this.f82957e;
    }

    public /* synthetic */ e(String r3, String r4, boolean r5, boolean r6, String r7, String r8, String r9, String r10, String r11, int r12, int r13, kotlin.jvm.internal.i r14) {
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
