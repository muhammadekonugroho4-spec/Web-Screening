package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f82778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82779b;

    public j(String r1, String r2) {
        this.f82778a = r1;
        this.f82779b = r2;
    }

    public final String a() {
        return this.f82779b;
    }

    public final String b() {
        return this.f82778a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f82778a, r52.f82778a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82779b, r52.f82779b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f82778a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82779b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "LivenessLicense(key=" + this.f82778a + ", expiredAt=" + this.f82779b + ')';
    }
}
