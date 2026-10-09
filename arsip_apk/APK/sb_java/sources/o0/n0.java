package o0;

/* loaded from: classes3.dex */
public final class n0 extends AbstractC12025l {

    /* renamed from: a, reason: collision with root package name */
    public final String f181150a;

    public n0(String r2) {
        kotlin.jvm.internal.p.l(r2, "imagePath");
        this.f181150a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n0) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f181150a, ((n0) r4).f181150a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return (this.f181150a.hashCode() * 31) + 1;
    }

    public final String toString() {
        return "LoadVerificationUI(imagePath=" + this.f181150a + ", isActivityRestored=true)";
    }
}
