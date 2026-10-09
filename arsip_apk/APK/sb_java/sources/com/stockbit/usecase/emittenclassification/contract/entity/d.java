package com.stockbit.usecase.emittenclassification.contract.entity;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f157564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157565b;

    public d(String r2, String r3) {
        p.l(r2, "type");
        p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        this.f157564a = r2;
        this.f157565b = r3;
    }

    public final boolean a() {
        if (p.g(this.f157564a, com.clevertap.android.sdk.Constants.KEY_DATE) == true) goto L5;
        return false;
    L5:
        if (p.g(this.f157565b, "Today") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157564a, r52.f157564a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157565b, r52.f157565b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157564a.hashCode() * 31) + this.f157565b.hashCode();
    }

    public String toString() {
        return "EmittenClassificationGroupingEntity(type=" + this.f157564a + ", label=" + this.f157565b + ")";
    }
}
