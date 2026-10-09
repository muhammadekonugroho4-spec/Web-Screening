package r0;

/* loaded from: classes3.dex */
public final class q extends G {

    /* renamed from: a, reason: collision with root package name */
    public final String f183409a;

    public q(String r2) {
        kotlin.jvm.internal.p.l(r2, "challengeId");
        this.f183409a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f183409a, ((q) r4).f183409a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f183409a.hashCode();
    }

    public final String toString() {
        return "LaunchChallengeFlow(challengeId=" + this.f183409a + ")";
    }
}
