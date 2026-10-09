package r0;

/* loaded from: classes3.dex */
public final class u extends G {

    /* renamed from: a, reason: collision with root package name */
    public final String f183413a;

    public u(String r2) {
        kotlin.jvm.internal.p.l(r2, "flow");
        this.f183413a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof u) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f183413a, ((u) r4).f183413a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f183413a.hashCode();
    }

    public final String toString() {
        return "LaunchSlikFormFlow(flow=" + this.f183413a + ")";
    }
}
