package com.stockbit.usecase.foreignflow.contract.entity;

import com.clevertap.android.sdk.Constants;
import java.time.LocalDate;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f157886a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157887b;

    /* renamed from: c, reason: collision with root package name */
    public final e f157888c;
    public final e d;

    /* renamed from: e, reason: collision with root package name */
    public final e f157889e;

    /* renamed from: f, reason: collision with root package name */
    public final e f157890f;

    public d(LocalDate r2, String r3, e r4, e r5, e r6, e r7) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "dateLabel");
        p.l(r4, "open");
        p.l(r5, Constants.PRIORITY_HIGH);
        p.l(r6, "low");
        p.l(r7, Constants.KEY_HIDE_CLOSE);
        this.f157886a = r2;
        this.f157887b = r3;
        this.f157888c = r4;
        this.d = r5;
        this.f157889e = r6;
        this.f157890f = r7;
    }

    public final e a() {
        return this.f157890f;
    }

    public final LocalDate b() {
        return this.f157886a;
    }

    public final String c() {
        return this.f157887b;
    }

    public final e d() {
        return this.d;
    }

    public final e e() {
        return this.f157889e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157886a, r52.f157886a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157887b, r52.f157887b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157888c, r52.f157888c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157889e, r52.f157889e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157890f, r52.f157890f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final e f() {
        return this.f157888c;
    }

    public int hashCode() {
        return (((((((((this.f157886a.hashCode() * 31) + this.f157887b.hashCode()) * 31) + this.f157888c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157889e.hashCode()) * 31) + this.f157890f.hashCode();
    }

    public String toString() {
        return "ForeignFlowHistoricalPriceEntity(date=" + this.f157886a + ", dateLabel=" + this.f157887b + ", open=" + this.f157888c + ", high=" + this.d + ", low=" + this.f157889e + ", close=" + this.f157890f + ")";
    }

    public /* synthetic */ d(LocalDate r9, String r10, e r11, e r12, e r13, e r14, int r15, i r16) {
        if ((r15 & 1) == 0) goto L6;
        r9 = LocalDate.MIN;
        p.k(r9, "MIN");
    L6:
        if ((r15 & 2) == 0) goto L9;
        r10 = "";
    L9:
        if ((r15 & 4) == 0) goto L12;
        r11 = new e(0.0d, null, 3, null);
    L12:
        if ((r15 & 8) == 0) goto L15;
        r12 = new e(0.0d, null, 3, null);
    L15:
        if ((r15 & 16) == 0) goto L17;
        e r1 = new e(0.0d, null, 3, null);
    L19:
        if ((r15 & 32) == 0) goto L22;
        e r162 = new e(0.0d, null, 3, null);
        e r132 = r11;
        e r142 = r12;
        e r152 = r1;
        LocalDate r112 = r9;
    L23:
        this(r112, r10, r132, r142, r152, r162);
        return;
    L22:
        r162 = r14;
        r132 = r11;
        r152 = r1;
        r112 = r9;
        r142 = r12;
        goto L23
    L17:
        r1 = r13;
        goto L19
    }
}
