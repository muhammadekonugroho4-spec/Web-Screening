package v;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f184358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f184359b;

    public h(String r2, Throwable r3) {
        p.l(r3, "exception");
        this.f184358a = r3;
        this.f184359b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f184358a, r52.f184358a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f184359b, r52.f184359b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f184358a.hashCode() * 31;
        String r1 = this.f184359b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "Failure(exception=" + this.f184358a + ", value=" + this.f184359b + ')';
    }
}
