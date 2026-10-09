package e;

import kotlin.jvm.internal.p;

/* renamed from: e.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11373b extends AbstractC11377f {

    /* renamed from: a, reason: collision with root package name */
    public final C11378g f174042a;

    public C11373b(C11378g r2) {
        p.l(r2, "shutdownReason");
        this.f174042a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C11373b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f174042a, ((C11373b) r4).f174042a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f174042a.hashCode();
    }

    public final String toString() {
        return "OnConnectionClosing(shutdownReason=" + this.f174042a + ')';
    }
}
