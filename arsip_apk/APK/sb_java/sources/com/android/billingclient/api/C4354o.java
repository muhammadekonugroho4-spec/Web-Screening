package com.android.billingclient.api;

import java.util.List;

/* renamed from: com.android.billingclient.api.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4354o {

    /* renamed from: a, reason: collision with root package name */
    public final C4349j f31915a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31916b;

    public C4354o(C4349j r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "billingResult");
        this.f31915a = r2;
        this.f31916b = r3;
    }

    public final List a() {
        return this.f31916b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4354o) == true) goto L8;
        return false;
    L8:
        C4354o r52 = (C4354o) r5;
        if (kotlin.jvm.internal.p.g(this.f31915a, r52.f31915a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f31916b, r52.f31916b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f31915a.hashCode() * 31;
        List r1 = this.f31916b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ProductDetailsResult(billingResult=" + this.f31915a + ", productDetailsList=" + this.f31916b + ")";
    }
}
