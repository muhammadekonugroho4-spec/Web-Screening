package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f171020a;

    /* renamed from: b, reason: collision with root package name */
    public final String f171021b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f171022c;

    static {
    }

    public u(String r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "content");
        this.f171020a = r2;
        this.f171021b = r3;
        this.f171022c = r4;
    }

    public final String a() {
        return this.f171021b;
    }

    public final String b() {
        return this.f171020a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f171020a, r52.f171020a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f171021b, r52.f171021b) == true) goto L15;
        return false;
    L15:
        if (this.f171022c == r52.f171022c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f171020a.hashCode() * 31) + this.f171021b.hashCode()) * 31) + Boolean.hashCode(this.f171022c);
    }

    public String toString() {
        return "WatchlistMainUpdateDataUIState(title=" + this.f171020a + ", content=" + this.f171021b + ", isCancelable=" + this.f171022c + ')';
    }
}
