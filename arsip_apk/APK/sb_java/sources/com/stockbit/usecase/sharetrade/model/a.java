package com.stockbit.usecase.sharetrade.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f162912a;

    public a(b r2) {
        p.l(r2, "autoShare");
        this.f162912a = r2;
    }

    public final b a() {
        return this.f162912a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f162912a, ((a) r4).f162912a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f162912a.hashCode();
    }

    public String toString() {
        return "AutoShareTradeSettingStatusUIState(autoShare=" + this.f162912a + ")";
    }
}
