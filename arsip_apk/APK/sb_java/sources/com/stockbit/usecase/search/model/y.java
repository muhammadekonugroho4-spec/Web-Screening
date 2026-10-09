package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f160089a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160090b;

    public y(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        this.f160089a = r2;
        this.f160090b = r3;
    }

    public final String a() {
        return this.f160089a;
    }

    public final String b() {
        return this.f160090b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof y) == true) goto L8;
        return false;
    L8:
        y r52 = (y) r5;
        if (kotlin.jvm.internal.p.g(this.f160089a, r52.f160089a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160090b, r52.f160090b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160089a.hashCode() * 31) + this.f160090b.hashCode();
    }

    public String toString() {
        return "SearchInsider(id=" + this.f160089a + ", label=" + this.f160090b + ")";
    }
}
