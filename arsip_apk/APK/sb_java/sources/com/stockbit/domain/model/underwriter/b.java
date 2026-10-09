package com.stockbit.domain.model.underwriter;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f86579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86580b;

    public b(String r2, String r3) {
        p.l(r2, "code");
        p.l(r3, Constants.KEY_COLOR);
        this.f86579a = r2;
        this.f86580b = r3;
    }

    public final String a() {
        return this.f86579a;
    }

    public final String b() {
        return this.f86580b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f86579a, r52.f86579a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86580b, r52.f86580b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86579a.hashCode() * 31) + this.f86580b.hashCode();
    }

    public String toString() {
        return "CompanyIpoUnderwriterEntity(code=" + this.f86579a + ", color=" + this.f86580b + ")";
    }
}
