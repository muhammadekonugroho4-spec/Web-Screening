package com.stockbit.domain.model.company.profile;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f81831a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81832b;

    public i(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f81831a = r2;
        this.f81832b = r3;
    }

    public final String a() {
        return this.f81832b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f81831a, r52.f81831a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81832b, r52.f81832b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81831a.hashCode() * 31) + this.f81832b.hashCode();
    }

    public String toString() {
        return "CompanyProfilePersonEntity(key=" + this.f81831a + ", value=" + this.f81832b + ")";
    }
}
