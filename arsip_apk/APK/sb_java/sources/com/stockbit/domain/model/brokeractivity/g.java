package com.stockbit.domain.model.brokeractivity;

import com.google.firebase.messaging.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f80891a;

    /* renamed from: b, reason: collision with root package name */
    public final List f80892b;

    public g(String r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "groupType");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80891a = r2;
        this.f80892b = r3;
    }

    public final List a() {
        return this.f80892b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f80891a, r52.f80891a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80892b, r52.f80892b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80891a.hashCode() * 31) + this.f80892b.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyGroupSummaryEntity(groupType=" + this.f80891a + ", data=" + this.f80892b + ")";
    }
}
