package com.stockbit.usecase.securities.model.account;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f160372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160373b;

    public c(String r2, String r3) {
        p.l(r2, "type");
        p.l(r3, Constants.KEY_TITLE);
        this.f160372a = r2;
        this.f160373b = r3;
    }

    public final String a() {
        return this.f160373b;
    }

    public final String b() {
        return this.f160372a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f160372a, r52.f160372a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160373b, r52.f160373b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160372a.hashCode() * 31) + this.f160373b.hashCode();
    }

    public String toString() {
        return "PortfolioPurposeUIState(type=" + this.f160372a + ", title=" + this.f160373b + ")";
    }

    public /* synthetic */ c(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
