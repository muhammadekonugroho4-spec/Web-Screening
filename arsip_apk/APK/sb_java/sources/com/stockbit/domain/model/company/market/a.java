package com.stockbit.domain.model.company.market;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81691a;

    /* renamed from: b, reason: collision with root package name */
    public final c f81692b;

    /* renamed from: c, reason: collision with root package name */
    public final c f81693c;
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final c f81694e;

    /* renamed from: f, reason: collision with root package name */
    public final c f81695f;

    /* renamed from: g, reason: collision with root package name */
    public final c f81696g;

    /* renamed from: h, reason: collision with root package name */
    public final c f81697h;

    /* renamed from: i, reason: collision with root package name */
    public final c f81698i;

    /* renamed from: j, reason: collision with root package name */
    public final c f81699j;

    /* renamed from: k, reason: collision with root package name */
    public final c f81700k;

    public a(String r2, c r3, c r4, c r5, c r6, c r7, c r8, c r9, c r10, c r11, c r12) {
        p.l(r2, "board");
        p.l(r3, "previous");
        p.l(r4, "lastPrice");
        p.l(r5, "change");
        p.l(r6, "percentageChange");
        p.l(r7, Constants.KEY_FREQUENCY);
        p.l(r8, "volume");
        p.l(r9, "value");
        p.l(r10, "open");
        p.l(r11, Constants.PRIORITY_HIGH);
        p.l(r12, "low");
        this.f81691a = r2;
        this.f81692b = r3;
        this.f81693c = r4;
        this.d = r5;
        this.f81694e = r6;
        this.f81695f = r7;
        this.f81696g = r8;
        this.f81697h = r9;
        this.f81698i = r10;
        this.f81699j = r11;
        this.f81700k = r12;
    }

    public final String a() {
        return this.f81691a;
    }

    public final c b() {
        return this.d;
    }

    public final c c() {
        return this.f81695f;
    }

    public final c d() {
        return this.f81699j;
    }

    public final c e() {
        return this.f81693c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81691a, r52.f81691a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81692b, r52.f81692b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81693c, r52.f81693c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81694e, r52.f81694e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81695f, r52.f81695f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81696g, r52.f81696g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81697h, r52.f81697h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81698i, r52.f81698i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81699j, r52.f81699j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81700k, r52.f81700k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final c f() {
        return this.f81700k;
    }

    public final c g() {
        return this.f81698i;
    }

    public final c h() {
        return this.f81694e;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f81691a.hashCode() * 31) + this.f81692b.hashCode()) * 31) + this.f81693c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81694e.hashCode()) * 31) + this.f81695f.hashCode()) * 31) + this.f81696g.hashCode()) * 31) + this.f81697h.hashCode()) * 31) + this.f81698i.hashCode()) * 31) + this.f81699j.hashCode()) * 31) + this.f81700k.hashCode();
    }

    public final c i() {
        return this.f81692b;
    }

    public final c j() {
        return this.f81697h;
    }

    public final c k() {
        return this.f81696g;
    }

    public String toString() {
        return "CompanyMarketBoardEntity(board=" + this.f81691a + ", previous=" + this.f81692b + ", lastPrice=" + this.f81693c + ", change=" + this.d + ", percentageChange=" + this.f81694e + ", frequency=" + this.f81695f + ", volume=" + this.f81696g + ", value=" + this.f81697h + ", open=" + this.f81698i + ", high=" + this.f81699j + ", low=" + this.f81700k + ")";
    }

    public /* synthetic */ a(String r17, c r18, c r19, c r20, c r21, c r22, c r23, c r24, c r25, c r26, c r27, int r28, i r29) {
        if ((r28 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r28 & 2) == 0) goto L9;
        c r3 = new c(0.0d, null, 3, null);
    L11:
        if ((r28 & 4) == 0) goto L13;
        c r4 = new c(0.0d, null, 3, null);
    L15:
        if ((r28 & 8) == 0) goto L17;
        c r5 = new c(0.0d, null, 3, null);
    L19:
        if ((r28 & 16) == 0) goto L21;
        c r6 = new c(0.0d, null, 3, null);
    L23:
        if ((r28 & 32) == 0) goto L25;
        c r2 = new c(0.0d, null, 3, null);
    L27:
        if ((r28 & 64) == 0) goto L29;
        c r7 = new c(0.0d, null, 3, null);
    L31:
        if ((r28 & 128) == 0) goto L33;
        c r8 = new c(0.0d, null, 3, null);
    L35:
        if ((r28 & 256) == 0) goto L37;
        c r9 = new c(0.0d, null, 3, null);
    L39:
        if ((r28 & 512) == 0) goto L41;
        c r10 = new c(0.0d, null, 3, null);
    L43:
        if ((r28 & 1024) == 0) goto L46;
        c r282 = new c(0.0d, null, 3, null);
    L47:
        this(r1, r3, r4, r5, r6, r2, r7, r8, r9, r10, r282);
        return;
    L46:
        r282 = r27;
        goto L47
    L41:
        r10 = r26;
        goto L43
    L37:
        r9 = r25;
        goto L39
    L33:
        r8 = r24;
        goto L35
    L29:
        r7 = r23;
        goto L31
    L25:
        r2 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
