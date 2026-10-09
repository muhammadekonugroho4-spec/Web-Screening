package com.stockbit.domain.model.alert;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final AlertConditionOperatorType f80617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80618b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80619c;

    public l(AlertConditionOperatorType r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "operator");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r4, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        this.f80617a = r2;
        this.f80618b = r3;
        this.f80619c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (this.f80617a == r52.f80617a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80618b, r52.f80618b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80619c, r52.f80619c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80617a.hashCode() * 31) + this.f80618b.hashCode()) * 31) + this.f80619c.hashCode();
    }

    public String toString() {
        return "AlertInitializationOptionEntity(operator=" + this.f80617a + ", label=" + this.f80618b + ", direction=" + this.f80619c + ")";
    }
}
