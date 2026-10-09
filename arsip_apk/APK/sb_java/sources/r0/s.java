package r0;

/* loaded from: classes3.dex */
public final class s extends G {

    /* renamed from: a, reason: collision with root package name */
    public final String f183411a;

    public s(String r2) {
        kotlin.jvm.internal.p.l(r2, "consentId");
        this.f183411a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof s) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f183411a, ((s) r4).f183411a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f183411a.hashCode();
    }

    public final String toString() {
        return "LaunchConsentFlow(consentId=" + this.f183411a + ")";
    }
}
