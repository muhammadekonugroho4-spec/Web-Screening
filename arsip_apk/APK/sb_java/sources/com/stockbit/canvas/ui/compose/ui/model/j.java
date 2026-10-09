package com.stockbit.canvas.ui.compose.ui.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f51815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f51816b;

    static {
    }

    public j(long r2, String r4) {
        p.l(r4, "symbol");
        this.f51815a = r2;
        this.f51816b = r4;
    }

    public final long a() {
        return this.f51815a;
    }

    public final String b() {
        return this.f51816b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof j) == true) goto L8;
        return false;
    L8:
        j r82 = (j) r8;
        if (this.f51815a == r82.f51815a) goto L12;
        return false;
    L12:
        if (p.g(this.f51816b, r82.f51816b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.f51815a) * 31) + this.f51816b.hashCode();
    }

    public String toString() {
        return "CanvasRemoveConfirmation(cardId=" + this.f51815a + ", symbol=" + this.f51816b + ')';
    }
}
