package androidx.glance.appwidget;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutSize f24846a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutSize f24847b;

    static {
    }

    public M(LayoutSize r1, LayoutSize r2) {
        this.f24846a = r1;
        this.f24847b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof M) == true) goto L8;
        return false;
    L8:
        M r52 = (M) r5;
        if (this.f24846a == r52.f24846a) goto L12;
        return false;
    L12:
        if (this.f24847b == r52.f24847b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f24846a.hashCode() * 31) + this.f24847b.hashCode();
    }

    public String toString() {
        return "SizeSelector(width=" + this.f24846a + ", height=" + this.f24847b + ')';
    }
}
