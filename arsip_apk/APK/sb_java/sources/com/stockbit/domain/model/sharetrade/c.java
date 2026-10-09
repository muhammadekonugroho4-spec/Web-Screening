package com.stockbit.domain.model.sharetrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f85796a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85798c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85799e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85800f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f85801g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f85802h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f85803i;

    public c(Integer r1, String r2, String r3, String r4, String r5, String r6, Boolean r7, Boolean r8, Boolean r9) {
        this.f85796a = r1;
        this.f85797b = r2;
        this.f85798c = r3;
        this.d = r4;
        this.f85799e = r5;
        this.f85800f = r6;
        this.f85801g = r7;
        this.f85802h = r8;
        this.f85803i = r9;
    }

    public final String a() {
        return this.f85800f;
    }

    public final String b() {
        return this.f85799e;
    }

    public final Integer c() {
        return this.f85796a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f85798c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85796a, r52.f85796a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85797b, r52.f85797b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85798c, r52.f85798c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85799e, r52.f85799e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85800f, r52.f85800f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85801g, r52.f85801g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85802h, r52.f85802h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f85803i, r52.f85803i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f85797b;
    }

    public final Boolean g() {
        return this.f85802h;
    }

    public final Boolean h() {
        return this.f85803i;
    }

    public int hashCode() {
        Integer r02 = this.f85796a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f85797b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f85798c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f85799e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f85800f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Boolean r211 = this.f85801g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Boolean r213 = this.f85802h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Boolean r215 = this.f85803i;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
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

    public final Boolean i() {
        return this.f85801g;
    }

    public String toString() {
        return "ShareTradeTargetEntity(id=" + this.f85796a + ", type=" + this.f85797b + ", shortenedName=" + this.f85798c + ", name=" + this.d + ", description=" + this.f85799e + ", avatarUrl=" + this.f85800f + ", isVerified=" + this.f85801g + ", isAutoshareActive=" + this.f85802h + ", isShareValue=" + this.f85803i + ")";
    }
}
