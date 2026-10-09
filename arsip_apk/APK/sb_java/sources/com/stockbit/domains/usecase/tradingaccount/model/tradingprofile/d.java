package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88541b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f88542c;

    public d(boolean r2, String r3, Object r4) {
        p.l(r3, Constants.KEY_ID);
        this.f88540a = r2;
        this.f88541b = r3;
        this.f88542c = r4;
    }

    public final String a() {
        return this.f88541b;
    }

    public final Object b() {
        return this.f88542c;
    }

    public final boolean c() {
        return this.f88540a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f88540a == r52.f88540a) goto L12;
        return false;
    L12:
        if (p.g(this.f88541b, r52.f88541b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88542c, r52.f88542c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.f88540a) * 31) + this.f88541b.hashCode()) * 31;
        Object r1 = this.f88542c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "TradingProfileFieldUIState(isShow=" + this.f88540a + ", id=" + this.f88541b + ", value=" + this.f88542c + ")";
    }
}
