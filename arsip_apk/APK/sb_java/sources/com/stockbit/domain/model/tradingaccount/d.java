package com.stockbit.domain.model.tradingaccount;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f85944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85946c;

    public d(int r2, String r3, String r4) {
        p.l(r3, Constants.KEY_TITLE);
        p.l(r4, "description");
        this.f85944a = r2;
        this.f85945b = r3;
        this.f85946c = r4;
    }

    public final int a() {
        return this.f85944a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f85944a == r52.f85944a) goto L12;
        return false;
    L12:
        if (p.g(this.f85945b, r52.f85945b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85946c, r52.f85946c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f85944a) * 31) + this.f85945b.hashCode()) * 31) + this.f85946c.hashCode();
    }

    public String toString() {
        return "TradingAccountStatusEntity(statusEnum=" + this.f85944a + ", title=" + this.f85945b + ", description=" + this.f85946c + ")";
    }
}
