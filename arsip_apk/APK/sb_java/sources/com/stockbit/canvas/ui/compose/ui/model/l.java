package com.stockbit.canvas.ui.compose.ui.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f51819a;

    /* renamed from: b, reason: collision with root package name */
    public final DoneLotColor f51820b;

    static {
    }

    public l(String r2, DoneLotColor r3) {
        p.l(r2, "lot");
        p.l(r3, Constants.KEY_COLOR);
        this.f51819a = r2;
        this.f51820b = r3;
    }

    public final DoneLotColor a() {
        return this.f51820b;
    }

    public final String b() {
        return this.f51819a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f51819a, r52.f51819a) == true) goto L12;
        return false;
    L12:
        if (this.f51820b == r52.f51820b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f51819a.hashCode() * 31) + this.f51820b.hashCode();
    }

    public String toString() {
        return "DoneLotCellUiState(lot=" + this.f51819a + ", color=" + this.f51820b + ')';
    }
}
