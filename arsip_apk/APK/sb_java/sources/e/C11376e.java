package e;

import kotlin.jvm.internal.p;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11376e extends AbstractC11377f {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f174045a;

    public C11376e(Throwable r2) {
        p.l(r2, "throwable");
        this.f174045a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C11376e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f174045a, ((C11376e) r4).f174045a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f174045a.hashCode();
    }

    public final String toString() {
        return "OnConnectionFailed(throwable=" + this.f174045a + ')';
    }
}
