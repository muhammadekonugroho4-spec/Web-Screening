package e;

import kotlin.jvm.internal.p;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11372a extends AbstractC11377f {

    /* renamed from: a, reason: collision with root package name */
    public final C11378g f174041a;

    public C11372a(C11378g r2) {
        p.l(r2, "shutdownReason");
        this.f174041a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C11372a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f174041a, ((C11372a) r4).f174041a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f174041a.hashCode();
    }

    public final String toString() {
        return "OnConnectionClosed(shutdownReason=" + this.f174041a + ')';
    }
}
