package com.stockbit.usecase.securities.model.history.v2;

import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.securities.model.history.RealizedGainType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f160868a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160869b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160870c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final RealizedGainType f160871e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160872f;

    /* renamed from: g, reason: collision with root package name */
    public final String f160873g;

    /* renamed from: h, reason: collision with root package name */
    public final String f160874h;

    public b(long r2, String r4, String r5, String r6, RealizedGainType r7, String r8, String r9, String r10) {
        p.l(r4, Constants.KEY_TITLE);
        p.l(r5, "amount");
        p.l(r6, Constants.KEY_DATE);
        p.l(r7, "gainType");
        p.l(r8, "displayAs");
        p.l(r9, "symbol");
        p.l(r10, "transactionType");
        this.f160868a = r2;
        this.f160869b = r4;
        this.f160870c = r5;
        this.d = r6;
        this.f160871e = r7;
        this.f160872f = r8;
        this.f160873g = r9;
        this.f160874h = r10;
    }

    public final String a() {
        return this.f160870c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f160872f;
    }

    public final RealizedGainType d() {
        return this.f160871e;
    }

    public final long e() {
        return this.f160868a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f160868a == r82.f160868a) goto L12;
        return false;
    L12:
        if (p.g(this.f160869b, r82.f160869b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160870c, r82.f160870c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f160871e == r82.f160871e) goto L24;
        return false;
    L24:
        if (p.g(this.f160872f, r82.f160872f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f160873g, r82.f160873g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f160874h, r82.f160874h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f160873g;
    }

    public final String g() {
        return this.f160869b;
    }

    public final String h() {
        return this.f160874h;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f160868a) * 31) + this.f160869b.hashCode()) * 31) + this.f160870c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160871e.hashCode()) * 31) + this.f160872f.hashCode()) * 31) + this.f160873g.hashCode()) * 31) + this.f160874h.hashCode();
    }

    public String toString() {
        return "HistoryRealizedItemUIState(id=" + this.f160868a + ", title=" + this.f160869b + ", amount=" + this.f160870c + ", date=" + this.d + ", gainType=" + this.f160871e + ", displayAs=" + this.f160872f + ", symbol=" + this.f160873g + ", transactionType=" + this.f160874h + ")";
    }

    public /* synthetic */ b(long r11, String r13, String r14, String r15, RealizedGainType r16, String r17, String r18, String r19, int r20, i r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = 0;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r20 & 4) == 0) goto L12;
        String r4 = "";
    L14:
        if ((r20 & 8) == 0) goto L16;
        String r5 = "";
    L18:
        if ((r20 & 16) == 0) goto L20;
        RealizedGainType r6 = RealizedGainType.NEUTRAL;
    L22:
        if ((r20 & 32) == 0) goto L24;
        String r7 = "";
    L26:
        if ((r20 & 64) == 0) goto L28;
        String r8 = "";
    L30:
        if ((r20 & 128) == 0) goto L33;
        String r9 = "";
    L34:
        this(r1, r3, r4, r5, r6, r7, r8, r9);
        return;
    L33:
        r9 = r19;
        goto L34
    L28:
        r8 = r18;
        goto L30
    L24:
        r7 = r17;
        goto L26
    L20:
        r6 = r16;
        goto L22
    L16:
        r5 = r15;
        goto L18
    L12:
        r4 = r14;
        goto L14
    L8:
        r3 = r13;
        goto L10
    }
}
