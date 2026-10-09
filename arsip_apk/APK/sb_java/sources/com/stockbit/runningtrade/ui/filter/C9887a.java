package com.stockbit.runningtrade.ui.filter;

import com.stockbit.runningtrade.params.BrokerFilterParam;

/* renamed from: com.stockbit.runningtrade.ui.filter.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C9887a {

    /* renamed from: a, reason: collision with root package name */
    public final BrokerFilterParam f131504a;

    /* renamed from: b, reason: collision with root package name */
    public final BrokerFilterParam f131505b;

    static {
    }

    public C9887a(BrokerFilterParam r1, BrokerFilterParam r2) {
        this.f131504a = r1;
        this.f131505b = r2;
    }

    public final BrokerFilterParam a() {
        return this.f131504a;
    }

    public final BrokerFilterParam b() {
        return this.f131505b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C9887a) == true) goto L8;
        return false;
    L8:
        C9887a r52 = (C9887a) r5;
        if (kotlin.jvm.internal.p.g(this.f131504a, r52.f131504a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f131505b, r52.f131505b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        BrokerFilterParam r02 = this.f131504a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        BrokerFilterParam r2 = this.f131505b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AdvanceFilterBrokerUIParam(buyer=" + this.f131504a + ", seller=" + this.f131505b + ')';
    }
}
