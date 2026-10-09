package e;

import kotlin.jvm.internal.p;

/* renamed from: e.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11378g {

    /* renamed from: a, reason: collision with root package name */
    public final String f174046a;

    static {
        new C11378g("Normal closure");
    }

    public C11378g(String r2) {
        p.l(r2, "reason");
        this.f174046a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C11378g) == true) goto L8;
        return false;
    L8:
        C11378g r42 = (C11378g) r4;
        r42.getClass();
        if (p.g(this.f174046a, r42.f174046a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        int r02 = Integer.hashCode(1000) * 31;
        return this.f174046a.hashCode() + r02;
    }

    public final String toString() {
        return "CSShutdownReason(code=1000, reason=" + this.f174046a + ')';
    }
}
