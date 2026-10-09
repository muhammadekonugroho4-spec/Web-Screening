package com.stockbit.usecase.company.model.brokerdistribution;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;
import kotlin.text.B;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f156185a;

    /* renamed from: b, reason: collision with root package name */
    public final BrokerGroupType f156186b;

    public b(String r2, BrokerGroupType r3) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "group");
        this.f156185a = r2;
        this.f156186b = r3;
        if (B.x0(r2) == true) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Broker ID cannot be blank");
    }

    public final BrokerGroupType a() {
        return this.f156186b;
    }

    public final String b() {
        return this.f156185a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f156185a, r52.f156185a) == true) goto L12;
        return false;
    L12:
        if (this.f156186b == r52.f156186b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156185a.hashCode() * 31) + this.f156186b.hashCode();
    }

    public String toString() {
        return "BrokerInfoUIState(id=" + this.f156185a + ", group=" + this.f156186b + ")";
    }
}
