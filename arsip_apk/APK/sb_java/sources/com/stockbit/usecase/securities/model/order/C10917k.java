package com.stockbit.usecase.securities.model.order;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: com.stockbit.usecase.securities.model.order.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10917k {

    /* renamed from: a, reason: collision with root package name */
    public final String f161368a;

    /* renamed from: b, reason: collision with root package name */
    public final DividendTimelineRowState f161369b;

    public C10917k(String r2, DividendTimelineRowState r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, RemoteConfigConstants.ResponseFieldKey.STATE);
        this.f161368a = r2;
        this.f161369b = r3;
    }

    public final String a() {
        return this.f161368a;
    }

    public final DividendTimelineRowState b() {
        return this.f161369b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10917k) == true) goto L8;
        return false;
    L8:
        C10917k r52 = (C10917k) r5;
        if (kotlin.jvm.internal.p.g(this.f161368a, r52.f161368a) == true) goto L12;
        return false;
    L12:
        if (this.f161369b == r52.f161369b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f161368a.hashCode() * 31) + this.f161369b.hashCode();
    }

    public String toString() {
        return "DividendTimelineRowUIState(date=" + this.f161368a + ", state=" + this.f161369b + ")";
    }
}
