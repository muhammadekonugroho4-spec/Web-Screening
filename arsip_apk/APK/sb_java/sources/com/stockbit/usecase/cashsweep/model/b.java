package com.stockbit.usecase.cashsweep.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155015a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155016b;

    public b(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_TEXT);
        this.f155015a = r2;
        this.f155016b = r3;
    }

    public final String a() {
        return this.f155016b;
    }

    public final boolean b() {
        return this.f155015a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f155015a == r52.f155015a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155016b, r52.f155016b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f155015a) * 31) + this.f155016b.hashCode();
    }

    public String toString() {
        return "BannerUIState(isShowed=" + this.f155015a + ", text=" + this.f155016b + ")";
    }

    public /* synthetic */ b(boolean r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
