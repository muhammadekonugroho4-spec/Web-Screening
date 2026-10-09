package com.stockbit.usecase.securities.model.formula;

import com.clevertap.android.sdk.Constants;
import com.stockbit.company.CompanyEntryPoint;
import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f160581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160582b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160583c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160584e;

    /* renamed from: f, reason: collision with root package name */
    public final double f160585f;

    /* renamed from: g, reason: collision with root package name */
    public final double f160586g;

    /* renamed from: h, reason: collision with root package name */
    public final double f160587h;

    /* renamed from: i, reason: collision with root package name */
    public final double f160588i;

    public b(String r2, String r3, String r4, List r5, String r6, double r7, double r9, double r11, double r13) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, CompanyEntryPoint.EXTRA_DESC);
        p.l(r4, "subtitle");
        p.l(r5, "compositions");
        p.l(r6, "exchangeFeeTotalTitle");
        this.f160581a = r2;
        this.f160582b = r3;
        this.f160583c = r4;
        this.d = r5;
        this.f160584e = r6;
        this.f160585f = r7;
        this.f160586g = r9;
        this.f160587h = r11;
        this.f160588i = r13;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f160582b;
    }

    public final double c() {
        return this.f160585f;
    }

    public final double d() {
        return this.f160587h;
    }

    public final double e() {
        return this.f160588i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f160581a, r82.f160581a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160582b, r82.f160582b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160583c, r82.f160583c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f160584e, r82.f160584e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f160585f, r82.f160585f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f160586g, r82.f160586g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f160587h, r82.f160587h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f160588i, r82.f160588i) == 0) goto L35;
        return false;
    L35:
        return true;
    }

    public final double f() {
        return this.f160586g;
    }

    public final String g() {
        return this.f160584e;
    }

    public final String h() {
        return this.f160583c;
    }

    public int hashCode() {
        return (((((((((((((((this.f160581a.hashCode() * 31) + this.f160582b.hashCode()) * 31) + this.f160583c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160584e.hashCode()) * 31) + Double.hashCode(this.f160585f)) * 31) + Double.hashCode(this.f160586g)) * 31) + Double.hashCode(this.f160587h)) * 31) + Double.hashCode(this.f160588i);
    }

    public final String i() {
        return this.f160581a;
    }

    public String toString() {
        return "ExchangeUIState(title=" + this.f160581a + ", desc=" + this.f160582b + ", subtitle=" + this.f160583c + ", compositions=" + this.d + ", exchangeFeeTotalTitle=" + this.f160584e + ", exchangeFeeTotalBuy=" + this.f160585f + ", exchangeFeeTotalSell=" + this.f160586g + ", exchangeFeeTotalCaBuy=" + this.f160587h + ", exchangeFeeTotalCaSell=" + this.f160588i + ")";
    }

    public /* synthetic */ b(String r16, String r17, String r18, List r19, String r20, double r21, double r23, double r25, double r27, int r29, i r30) {
        String r2 = "";
        if ((r29 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r29 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r29 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r29 & 8) == 0) goto L17;
        List r5 = AbstractC11777v.o();
    L19:
        if ((r29 & 16) != 0) goto L23;
        r2 = r20;
    L23:
        if ((r29 & 32) == 0) goto L25;
        double r9 = 0.0d;
    L27:
        if ((r29 & 64) == 0) goto L29;
        double r11 = 0.0d;
    L31:
        if ((r29 & 128) == 0) goto L33;
        double r13 = 0.0d;
    L35:
        if ((r29 & 256) == 0) goto L38;
        double r28 = 0.0d;
    L39:
        this(r1, r3, r4, r5, r2, r9, r11, r13, r28);
        return;
    L38:
        r28 = r27;
        goto L39
    L33:
        r13 = r25;
        goto L35
    L29:
        r11 = r23;
        goto L31
    L25:
        r9 = r21;
        goto L27
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
