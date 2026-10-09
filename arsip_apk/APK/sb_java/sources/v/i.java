package v;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f184360a;

    public i(String r1) {
        this.f184360a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f184360a, ((i) r4).f184360a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        String r02 = this.f184360a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f184360a + ')';
    }
}
