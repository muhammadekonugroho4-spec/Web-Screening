package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f82762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82763b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82764c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f82765e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82766f;

    public i(String r2, String r3, String r4, String r5, Integer r6, String r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "heading");
        kotlin.jvm.internal.p.l(r4, "body");
        kotlin.jvm.internal.p.l(r5, Constants.KEY_ICON);
        kotlin.jvm.internal.p.l(r7, "viewType");
        this.f82762a = r2;
        this.f82763b = r3;
        this.f82764c = r4;
        this.d = r5;
        this.f82765e = r6;
        this.f82766f = r7;
    }

    public final String a() {
        return this.f82764c;
    }

    public final String b() {
        return this.f82763b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f82762a;
    }

    public final Integer e() {
        return this.f82765e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f82762a, r52.f82762a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82763b, r52.f82763b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82764c, r52.f82764c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82765e, r52.f82765e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82766f, r52.f82766f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f82766f;
    }

    public int hashCode() {
        int r02 = ((((((this.f82762a.hashCode() * 31) + this.f82763b.hashCode()) * 31) + this.f82764c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Integer r1 = this.f82765e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f82766f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "InAppNotifBanner(id=" + this.f82762a + ", heading=" + this.f82763b + ", body=" + this.f82764c + ", icon=" + this.d + ", localIconRes=" + this.f82765e + ", viewType=" + this.f82766f + ')';
    }

    public /* synthetic */ i(String r8, String r9, String r10, String r11, Integer r12, String r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 16) == 0) goto L5;
        r12 = null;
    L5:
        Integer r5 = r12;
        if ((r14 & 32) == 0) goto L8;
        r13 = "";
    L8:
        this(r8, r9, r10, r11, r5, r13);
    }
}
