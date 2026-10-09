package androidx.glance.appwidget;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f25137a;

    static {
    }

    public w(int r1) {
        this.f25137a = r1;
    }

    public final int a() {
        return this.f25137a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof w) == true) goto L9;
        return false;
    L9:
        if (this.f25137a == ((w) r4).f25137a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f25137a);
    }

    public String toString() {
        return "LayoutInfo(layoutId=" + this.f25137a + ')';
    }
}
