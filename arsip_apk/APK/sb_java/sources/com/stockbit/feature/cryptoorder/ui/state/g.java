package com.stockbit.feature.cryptoorder.ui.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f94612a;

    static {
    }

    public g(List r2) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f94612a = r2;
    }

    public final List a() {
        return this.f94612a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f94612a, ((g) r4).f94612a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f94612a.hashCode();
    }

    public String toString() {
        return "CryptoOrderListUIData(items=" + this.f94612a + ')';
    }
}
