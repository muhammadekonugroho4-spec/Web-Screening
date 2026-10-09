package com.stockbit.usecase.chat.model.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f155670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155671b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155672c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155673e;

    /* renamed from: f, reason: collision with root package name */
    public final String f155674f;

    /* renamed from: g, reason: collision with root package name */
    public final String f155675g;

    /* renamed from: h, reason: collision with root package name */
    public final String f155676h;

    public b(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.f155670a = r1;
        this.f155671b = r2;
        this.f155672c = r3;
        this.d = r4;
        this.f155673e = r5;
        this.f155674f = r6;
        this.f155675g = r7;
        this.f155676h = r8;
    }

    public final String a() {
        return this.f155672c;
    }

    public final String b() {
        return this.f155671b;
    }

    public final String c() {
        return this.f155670a;
    }

    public final String d() {
        return this.f155676h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f155670a, r52.f155670a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155671b, r52.f155671b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155672c, r52.f155672c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f155673e, r52.f155673e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f155674f, r52.f155674f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f155675g, r52.f155675g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f155676h, r52.f155676h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        String r02 = this.f155670a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f155671b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f155672c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f155673e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f155674f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f155675g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f155676h;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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

    public String toString() {
        return "HtmlMetaDataAttributeUIState(href=" + this.f155670a + ", dataCompany=" + this.f155671b + ", className=" + this.f155672c + ", method=" + this.d + ", trigger=" + this.f155673e + ", postSubmitCallback=" + this.f155674f + ", preSubmitCallback=" + this.f155675g + ", target=" + this.f155676h + ")";
    }
}
