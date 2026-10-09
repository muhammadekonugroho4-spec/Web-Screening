package F;

/* loaded from: classes.dex */
public final class K0 extends S0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f606a;

    public K0(boolean r1) {
        this.f606a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof K0) == true) goto L9;
        return false;
    L9:
        if (this.f606a == ((K0) r4).f606a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        boolean r02 = this.f606a;
        if (r02 == false) goto L6;
        return 1;
    L6:
        return r02 ? 1 : 0;
    }

    public final String toString() {
        return "FRVerificationSuccess(isFromPoll=" + this.f606a + ")";
    }
}
