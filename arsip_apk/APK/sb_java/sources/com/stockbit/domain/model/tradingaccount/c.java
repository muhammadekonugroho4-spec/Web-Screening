package com.stockbit.domain.model.tradingaccount;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85943b;

    public c(String r2, String r3) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "value");
        this.f85942a = r2;
        this.f85943b = r3;
    }

    public final String a() {
        return this.f85942a;
    }

    public final String b() {
        return this.f85943b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85942a, r52.f85942a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85943b, r52.f85943b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85942a.hashCode() * 31) + this.f85943b.hashCode();
    }

    public String toString() {
        return "TradingAccountFieldEntity(id=" + this.f85942a + ", value=" + this.f85943b + ")";
    }
}
