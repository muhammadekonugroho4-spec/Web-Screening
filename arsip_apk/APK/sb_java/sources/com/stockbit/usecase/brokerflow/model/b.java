package com.stockbit.usecase.brokerflow.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f154972a;

    /* renamed from: b, reason: collision with root package name */
    public final a f154973b;

    /* renamed from: c, reason: collision with root package name */
    public final a f154974c;
    public final a d;

    public b(a r2, a r3, a r4, a r5) {
        p.l(r2, "open");
        p.l(r3, Constants.PRIORITY_HIGH);
        p.l(r4, "low");
        p.l(r5, Constants.KEY_HIDE_CLOSE);
        this.f154972a = r2;
        this.f154973b = r3;
        this.f154974c = r4;
        this.d = r5;
    }

    public final a a() {
        return this.d;
    }

    public final a b() {
        return this.f154973b;
    }

    public final a c() {
        return this.f154974c;
    }

    public final a d() {
        return this.f154972a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f154972a, r52.f154972a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154973b, r52.f154973b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154974c, r52.f154974c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154972a.hashCode() * 31) + this.f154973b.hashCode()) * 31) + this.f154974c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerFlowOhlcUIState(open=" + this.f154972a + ", high=" + this.f154973b + ", low=" + this.f154974c + ", close=" + this.d + ")";
    }
}
