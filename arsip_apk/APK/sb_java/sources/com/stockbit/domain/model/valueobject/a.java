package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86750b;

    public a(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "changeToken");
        kotlin.jvm.internal.p.l(r3, "email");
        this.f86749a = r2;
        this.f86750b = r3;
    }

    public final String a() {
        return this.f86749a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f86749a, r52.f86749a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86750b, r52.f86750b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86749a.hashCode() * 31) + this.f86750b.hashCode();
    }

    public String toString() {
        return "ChangeRequest(changeToken=" + this.f86749a + ", email=" + this.f86750b + ')';
    }
}
