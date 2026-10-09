package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f164337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164338b;

    /* renamed from: c, reason: collision with root package name */
    public final String f164339c;
    public final String d;

    public m(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "identityErrorMessage");
        kotlin.jvm.internal.p.l(r3, "birthDateErrorMessage");
        kotlin.jvm.internal.p.l(r4, "bankAccountErrorMessage");
        kotlin.jvm.internal.p.l(r5, "motherNameErrorMessage");
        this.f164337a = r2;
        this.f164338b = r3;
        this.f164339c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f164339c;
    }

    public final String b() {
        return this.f164338b;
    }

    public final String c() {
        return this.f164337a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f164337a, r52.f164337a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f164338b, r52.f164338b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f164339c, r52.f164339c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f164337a.hashCode() * 31) + this.f164338b.hashCode()) * 31) + this.f164339c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "FieldError(identityErrorMessage=" + this.f164337a + ", birthDateErrorMessage=" + this.f164338b + ", bankAccountErrorMessage=" + this.f164339c + ", motherNameErrorMessage=" + this.d + ')';
    }
}
