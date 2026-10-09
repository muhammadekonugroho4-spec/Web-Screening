package com.airbnb.lottie.model;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f31365a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31366b;

    public h() {
    }

    public static boolean a(Object r02, Object r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    public void b(Object r1, Object r2) {
        this.f31365a = r1;
        this.f31366b = r2;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof androidx.core.util.d) == true) goto L5;
        return false;
    L5:
        androidx.core.util.d r42 = (androidx.core.util.d) r4;
        if (a(r42.f23078a, this.f31365a) == true) goto L8;
    L11:
        return false;
    L8:
        if (a(r42.f23079b, this.f31366b) == false) goto L11;
        return true;
    }

    public int hashCode() {
        Object r02 = this.f31365a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        Object r2 = this.f31366b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r03 ^ r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "Pair{" + this.f31365a + " " + this.f31366b + "}";
    }
}
