package com.stockbit.usecase.trusteddevice.resource.change;

/* loaded from: classes2.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f164298a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164299b;

    /* renamed from: c, reason: collision with root package name */
    public final String f164300c;
    public final String d;

    public v(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "identityErrorMessage");
        kotlin.jvm.internal.p.l(r3, "birthDateErrorMessage");
        kotlin.jvm.internal.p.l(r4, "bankAccountErrorMessage");
        kotlin.jvm.internal.p.l(r5, "motherNameErrorMessage");
        this.f164298a = r2;
        this.f164299b = r3;
        this.f164300c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f164300c;
    }

    public final String b() {
        return this.f164299b;
    }

    public final String c() {
        return this.f164298a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f164298a, r52.f164298a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f164299b, r52.f164299b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f164300c, r52.f164300c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f164298a.hashCode() * 31) + this.f164299b.hashCode()) * 31) + this.f164300c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "FieldError(identityErrorMessage=" + this.f164298a + ", birthDateErrorMessage=" + this.f164299b + ", bankAccountErrorMessage=" + this.f164300c + ", motherNameErrorMessage=" + this.d + ')';
    }
}
