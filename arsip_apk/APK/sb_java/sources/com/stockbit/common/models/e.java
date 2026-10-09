package com.stockbit.common.models;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f60913a;

    /* renamed from: b, reason: collision with root package name */
    public final ToastType f60914b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60915c;
    public final int d;

    static {
    }

    public e(int r2, ToastType r3, int r4, int r5) {
        p.l(r3, "type");
        this.f60913a = r2;
        this.f60914b = r3;
        this.f60915c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f60915c;
    }

    public final int b() {
        return this.f60913a;
    }

    public final ToastType c() {
        return this.f60914b;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f60913a == r52.f60913a) goto L12;
        return false;
    L12:
        if (this.f60914b == r52.f60914b) goto L15;
        return false;
    L15:
        if (this.f60915c == r52.f60915c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f60913a) * 31) + this.f60914b.hashCode()) * 31) + Integer.hashCode(this.f60915c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ToastParamRes(text=" + this.f60913a + ", type=" + this.f60914b + ", duration=" + this.f60915c + ", yOffset=" + this.d + ')';
    }
}
