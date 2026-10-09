package com.stockbit.userauth.ui.biometric;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f165197a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f165198b;

    static {
    }

    public w(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f165197a = r2;
        this.f165198b = r3;
    }

    public final String a() {
        return this.f165197a;
    }

    public final boolean b() {
        return this.f165198b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (kotlin.jvm.internal.p.g(this.f165197a, r52.f165197a) == true) goto L12;
        return false;
    L12:
        if (this.f165198b == r52.f165198b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f165197a.hashCode() * 31) + Boolean.hashCode(this.f165198b);
    }

    public String toString() {
        return "BiometricSetupFailure(message=" + this.f165197a + ", isServerRejection=" + this.f165198b + ')';
    }
}
