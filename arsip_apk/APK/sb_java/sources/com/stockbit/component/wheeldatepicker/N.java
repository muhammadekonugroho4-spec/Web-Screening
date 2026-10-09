package com.stockbit.component.wheeldatepicker;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f77804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77805b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77806c;

    public N(String r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        this.f77804a = r2;
        this.f77805b = r3;
        this.f77806c = r4;
    }

    public final int a() {
        return this.f77806c;
    }

    public final String b() {
        return this.f77804a;
    }

    public final int c() {
        return this.f77805b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof N) == true) goto L8;
        return false;
    L8:
        N r52 = (N) r5;
        if (kotlin.jvm.internal.p.g(this.f77804a, r52.f77804a) == true) goto L12;
        return false;
    L12:
        if (this.f77805b == r52.f77805b) goto L15;
        return false;
    L15:
        if (this.f77806c == r52.f77806c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f77804a.hashCode() * 31) + Integer.hashCode(this.f77805b)) * 31) + Integer.hashCode(this.f77806c);
    }

    public String toString() {
        return "Year(text=" + this.f77804a + ", value=" + this.f77805b + ", index=" + this.f77806c + ')';
    }
}
