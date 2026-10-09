package com.stockbit.usecase.verification.resource;

/* loaded from: classes2.dex */
public final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f164502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f164504c;
    public final String d;

    public l(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "identityErrorMessage");
        kotlin.jvm.internal.p.l(r3, "birthDateErrorMessage");
        kotlin.jvm.internal.p.l(r4, "bankAccountErrorMessage");
        kotlin.jvm.internal.p.l(r5, "motherNameErrorMessage");
        this.f164502a = r2;
        this.f164503b = r3;
        this.f164504c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f164504c;
    }

    public final String b() {
        return this.f164503b;
    }

    public final String c() {
        return this.f164502a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f164502a, r52.f164502a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f164503b, r52.f164503b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f164504c, r52.f164504c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f164502a.hashCode() * 31) + this.f164503b.hashCode()) * 31) + this.f164504c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "FieldError(identityErrorMessage=" + this.f164502a + ", birthDateErrorMessage=" + this.f164503b + ", bankAccountErrorMessage=" + this.f164504c + ", motherNameErrorMessage=" + this.d + ')';
    }
}
