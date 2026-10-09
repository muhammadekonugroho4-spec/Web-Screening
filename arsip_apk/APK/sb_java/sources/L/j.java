package L;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public final int f933a;

    public j(int r1) {
        this.f933a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (this.f933a == ((j) r4).f933a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f933a);
    }

    public final String toString() {
        return "Downloading(progress=" + this.f933a + ")";
    }
}
