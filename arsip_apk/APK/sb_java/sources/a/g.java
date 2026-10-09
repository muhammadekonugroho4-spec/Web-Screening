package a;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f1463a;

    public g(String r2) {
        p.l(r2, "sessionID");
        this.f1463a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f1463a, ((g) r4).f1463a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1463a.hashCode();
    }

    public final String toString() {
        return "CSSessionInfo(sessionID=" + this.f1463a + ')';
    }
}
