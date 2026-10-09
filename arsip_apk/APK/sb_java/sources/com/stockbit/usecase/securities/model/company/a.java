package com.stockbit.usecase.securities.model.company;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f160461a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160463c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160464e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f160465f;

    /* renamed from: g, reason: collision with root package name */
    public final d f160466g;

    /* renamed from: h, reason: collision with root package name */
    public final c f160467h;

    public a(String r2, boolean r3, String r4, String r5, String r6, CharSequence r7, d r8, c r9) {
        p.l(r2, CompanyEntryPoint.EXTRA_DESC);
        p.l(r4, "symbol2");
        p.l(r5, "exchange");
        p.l(r6, "previousPrice");
        p.l(r7, "formattedLastChange");
        p.l(r8, "sentiment");
        p.l(r9, "marketHour");
        this.f160461a = r2;
        this.f160462b = r3;
        this.f160463c = r4;
        this.d = r5;
        this.f160464e = r6;
        this.f160465f = r7;
        this.f160466g = r8;
        this.f160467h = r9;
    }

    public final String a() {
        return this.f160461a;
    }

    public final String b() {
        return this.d;
    }

    public final CharSequence c() {
        return this.f160465f;
    }

    public final String d() {
        return this.f160464e;
    }

    public final d e() {
        return this.f160466g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f160461a, r52.f160461a) == true) goto L12;
        return false;
    L12:
        if (this.f160462b == r52.f160462b) goto L15;
        return false;
    L15:
        if (p.g(this.f160463c, r52.f160463c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f160464e, r52.f160464e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f160465f, r52.f160465f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f160466g, r52.f160466g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f160467h, r52.f160467h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f160463c;
    }

    public final boolean g() {
        return this.f160462b;
    }

    public int hashCode() {
        return (((((((((((((this.f160461a.hashCode() * 31) + Boolean.hashCode(this.f160462b)) * 31) + this.f160463c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160464e.hashCode()) * 31) + this.f160465f.hashCode()) * 31) + this.f160466g.hashCode()) * 31) + this.f160467h.hashCode();
    }

    public String toString() {
        return "CompanyLegacyUIState(desc=" + this.f160461a + ", isExists=" + this.f160462b + ", symbol2=" + this.f160463c + ", exchange=" + this.d + ", previousPrice=" + this.f160464e + ", formattedLastChange=" + this.f160465f + ", sentiment=" + this.f160466g + ", marketHour=" + this.f160467h + ")";
    }

    public /* synthetic */ a(String r19, boolean r20, String r21, String r22, String r23, CharSequence r24, d r25, c r26, int r27, i r28) {
        String r2 = "";
        if ((r27 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r27 & 2) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r27 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r27 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r27 & 16) != 0) goto L23;
        r2 = r23;
    L23:
        if ((r27 & 32) == 0) goto L25;
        CharSequence r6 = "0.00 (0.00%)";
    L27:
        if ((r27 & 64) == 0) goto L29;
        d r8 = new d(0.0d, 0.0d, 0.0d, null, 15, null);
    L31:
        if ((r27 & 128) == 0) goto L34;
        c r272 = new c(null, null, null, null, 15, null);
    L35:
        this(r1, r3, r4, r5, r2, r6, r8, r272);
        return;
    L34:
        r272 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r6 = r24;
        goto L27
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
