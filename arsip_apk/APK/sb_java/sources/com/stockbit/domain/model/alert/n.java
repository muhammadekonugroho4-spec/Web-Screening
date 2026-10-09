package com.stockbit.domain.model.alert;

import com.google.firebase.messaging.Constants;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final AlertConditionItemType f80623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80624b;

    public n(AlertConditionItemType r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        this.f80623a = r2;
        this.f80624b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (this.f80623a == r52.f80623a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80624b, r52.f80624b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80623a.hashCode() * 31) + this.f80624b.hashCode();
    }

    public String toString() {
        return "AlertMALengthDetail(type=" + this.f80623a + ", label=" + this.f80624b + ")";
    }
}
