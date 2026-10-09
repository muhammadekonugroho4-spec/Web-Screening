package com.stockbit.feature.transaction.ui.composecomponent.component;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes9.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112091a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f112092b;

    static {
    }

    public C0(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        this.f112091a = r2;
        this.f112092b = r3;
    }

    public final String a() {
        return this.f112091a;
    }

    public final boolean b() {
        return this.f112092b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0) == true) goto L8;
        return false;
    L8:
        C0 r52 = (C0) r5;
        if (kotlin.jvm.internal.p.g(this.f112091a, r52.f112091a) == true) goto L12;
        return false;
    L12:
        if (this.f112092b == r52.f112092b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f112091a.hashCode() * 31) + Boolean.hashCode(this.f112092b);
    }

    public String toString() {
        return "LotSliderLabel(text=" + this.f112091a + ", isError=" + this.f112092b + ')';
    }
}
