package com.stockbit.cashsweep.ui.screen.common.bottomsheet;

import java.util.List;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f52829a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52830b;

    /* renamed from: c, reason: collision with root package name */
    public final List f52831c;

    public s(int r2, int r3, List r4) {
        kotlin.jvm.internal.p.l(r4, "answerResList");
        this.f52829a = r2;
        this.f52830b = r3;
        this.f52831c = r4;
    }

    public final List a() {
        return this.f52831c;
    }

    public final int b() {
        return this.f52829a;
    }

    public final int c() {
        return this.f52830b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (this.f52829a == r52.f52829a) goto L12;
        return false;
    L12:
        if (this.f52830b == r52.f52830b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f52831c, r52.f52831c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f52829a) * 31) + Integer.hashCode(this.f52830b)) * 31) + this.f52831c.hashCode();
    }

    public String toString() {
        return "FaqEntry(numberRes=" + this.f52829a + ", questionRes=" + this.f52830b + ", answerResList=" + this.f52831c + ')';
    }
}
