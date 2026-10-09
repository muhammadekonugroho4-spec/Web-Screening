package com.stockbit.usecase.personalamend.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f159067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159068b;

    public k(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "message");
        this.f159067a = r2;
        this.f159068b = r3;
    }

    public final String a() {
        return this.f159068b;
    }

    public final String b() {
        return this.f159067a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f159067a, r52.f159067a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159068b, r52.f159068b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f159067a.hashCode() * 31) + this.f159068b.hashCode();
    }

    public String toString() {
        return "RestrictionWarningMessageUIState(title=" + this.f159067a + ", message=" + this.f159068b + ")";
    }
}
