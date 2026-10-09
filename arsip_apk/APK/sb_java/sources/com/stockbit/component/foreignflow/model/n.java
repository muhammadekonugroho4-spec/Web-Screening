package com.stockbit.component.foreignflow.model;

import com.clevertap.android.sdk.Constants;
import java.time.LocalDate;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f71984a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71985b;

    /* renamed from: c, reason: collision with root package name */
    public final p f71986c;
    public final p d;

    /* renamed from: e, reason: collision with root package name */
    public final p f71987e;

    /* renamed from: f, reason: collision with root package name */
    public final p f71988f;

    /* renamed from: g, reason: collision with root package name */
    public final p f71989g;

    /* renamed from: h, reason: collision with root package name */
    public final p f71990h;

    /* renamed from: i, reason: collision with root package name */
    public final String f71991i;

    /* renamed from: j, reason: collision with root package name */
    public final String f71992j;

    /* renamed from: k, reason: collision with root package name */
    public final String f71993k;

    static {
    }

    public n(LocalDate r2, String r3, p r4, p r5, p r6, p r7, p r8, p r9, String r10, String r11, String r12) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "dateLabel");
        kotlin.jvm.internal.p.l(r4, "netForeign");
        kotlin.jvm.internal.p.l(r5, "foreignBuy");
        kotlin.jvm.internal.p.l(r6, "foreignSell");
        kotlin.jvm.internal.p.l(r7, "foreignFlow");
        kotlin.jvm.internal.p.l(r8, "netLot");
        kotlin.jvm.internal.p.l(r9, "netFrequency");
        kotlin.jvm.internal.p.l(r10, "averagePrice");
        kotlin.jvm.internal.p.l(r11, "foreignPercentage");
        kotlin.jvm.internal.p.l(r12, "domesticPercentage");
        this.f71984a = r2;
        this.f71985b = r3;
        this.f71986c = r4;
        this.d = r5;
        this.f71987e = r6;
        this.f71988f = r7;
        this.f71989g = r8;
        this.f71990h = r9;
        this.f71991i = r10;
        this.f71992j = r11;
        this.f71993k = r12;
    }

    public final String a() {
        return this.f71991i;
    }

    public final String b() {
        return this.f71985b;
    }

    public final String c() {
        return this.f71993k;
    }

    public final p d() {
        return this.d;
    }

    public final p e() {
        return this.f71988f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f71984a, r52.f71984a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f71985b, r52.f71985b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f71986c, r52.f71986c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f71987e, r52.f71987e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f71988f, r52.f71988f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f71989g, r52.f71989g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f71990h, r52.f71990h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f71991i, r52.f71991i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f71992j, r52.f71992j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f71993k, r52.f71993k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f71992j;
    }

    public final p g() {
        return this.f71987e;
    }

    public final p h() {
        return this.f71986c;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f71984a.hashCode() * 31) + this.f71985b.hashCode()) * 31) + this.f71986c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f71987e.hashCode()) * 31) + this.f71988f.hashCode()) * 31) + this.f71989g.hashCode()) * 31) + this.f71990h.hashCode()) * 31) + this.f71991i.hashCode()) * 31) + this.f71992j.hashCode()) * 31) + this.f71993k.hashCode();
    }

    public final p i() {
        return this.f71990h;
    }

    public final p j() {
        return this.f71989g;
    }

    public final long k() {
        return this.f71984a.toEpochDay();
    }

    public String toString() {
        return "ForeignFlowTableRowUIState(date=" + this.f71984a + ", dateLabel=" + this.f71985b + ", netForeign=" + this.f71986c + ", foreignBuy=" + this.d + ", foreignSell=" + this.f71987e + ", foreignFlow=" + this.f71988f + ", netLot=" + this.f71989g + ", netFrequency=" + this.f71990h + ", averagePrice=" + this.f71991i + ", foreignPercentage=" + this.f71992j + ", domesticPercentage=" + this.f71993k + ')';
    }
}
