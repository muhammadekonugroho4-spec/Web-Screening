package androidx.glance.appwidget;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutType f24818a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24819b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24820c;

    static {
    }

    public K(LayoutType r1, boolean r2, boolean r3) {
        this.f24818a = r1;
        this.f24819b = r2;
        this.f24820c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof K) == true) goto L8;
        return false;
    L8:
        K r52 = (K) r5;
        if (this.f24818a == r52.f24818a) goto L12;
        return false;
    L12:
        if (this.f24819b == r52.f24819b) goto L15;
        return false;
    L15:
        if (this.f24820c == r52.f24820c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f24818a.hashCode() * 31) + Boolean.hashCode(this.f24819b)) * 31) + Boolean.hashCode(this.f24820c);
    }

    public String toString() {
        return "RowColumnChildSelector(type=" + this.f24818a + ", expandWidth=" + this.f24819b + ", expandHeight=" + this.f24820c + ')';
    }
}
