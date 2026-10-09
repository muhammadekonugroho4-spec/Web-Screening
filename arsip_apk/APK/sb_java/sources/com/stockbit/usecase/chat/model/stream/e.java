package com.stockbit.usecase.chat.model.stream;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f155683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155685c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155686e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f155687f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f155688g;

    /* renamed from: h, reason: collision with root package name */
    public final List f155689h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f155690i;

    /* renamed from: j, reason: collision with root package name */
    public final String f155691j;

    public e(long r2, String r4, String r5, String r6, int r7, boolean r8, Integer r9, List r10, boolean r11, String r12) {
        p.l(r4, "startDate");
        p.l(r5, "endDate");
        p.l(r6, "question");
        p.l(r10, "options");
        p.l(r12, "messageExpired");
        this.f155683a = r2;
        this.f155684b = r4;
        this.f155685c = r5;
        this.d = r6;
        this.f155686e = r7;
        this.f155687f = r8;
        this.f155688g = r9;
        this.f155689h = r10;
        this.f155690i = r11;
        this.f155691j = r12;
    }

    public final String a() {
        return this.f155685c;
    }

    public final boolean b() {
        return this.f155687f;
    }

    public final long c() {
        return this.f155683a;
    }

    public final String d() {
        return this.f155691j;
    }

    public final List e() {
        return this.f155689h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (this.f155683a == r82.f155683a) goto L12;
        return false;
    L12:
        if (p.g(this.f155684b, r82.f155684b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155685c, r82.f155685c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f155686e == r82.f155686e) goto L24;
        return false;
    L24:
        if (this.f155687f == r82.f155687f) goto L27;
        return false;
    L27:
        if (p.g(this.f155688g, r82.f155688g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f155689h, r82.f155689h) == true) goto L33;
        return false;
    L33:
        if (this.f155690i == r82.f155690i) goto L36;
        return false;
    L36:
        if (p.g(this.f155691j, r82.f155691j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final Integer g() {
        return this.f155688g;
    }

    public final String h() {
        return this.f155684b;
    }

    public int hashCode() {
        int r02 = ((((((((((Long.hashCode(this.f155683a) * 31) + this.f155684b.hashCode()) * 31) + this.f155685c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f155686e)) * 31) + Boolean.hashCode(this.f155687f)) * 31;
        Integer r1 = this.f155688g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((r02 + r12) * 31) + this.f155689h.hashCode()) * 31) + Boolean.hashCode(this.f155690i)) * 31) + this.f155691j.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final int i() {
        return this.f155686e;
    }

    public final boolean j() {
        return this.f155690i;
    }

    public String toString() {
        return "PollingUIState(id=" + this.f155683a + ", startDate=" + this.f155684b + ", endDate=" + this.f155685c + ", question=" + this.d + ", totalVoters=" + this.f155686e + ", expired=" + this.f155687f + ", selectedOptionId=" + this.f155688g + ", options=" + this.f155689h + ", isPinned=" + this.f155690i + ", messageExpired=" + this.f155691j + ")";
    }
}
