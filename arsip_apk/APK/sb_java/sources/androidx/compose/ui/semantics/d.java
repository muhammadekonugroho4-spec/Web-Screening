package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f19539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19540b;

    static {
    }

    public d(int r1, int r2) {
        this.f19539a = r1;
        this.f19540b = r2;
    }

    public final int a() {
        return this.f19540b;
    }

    public final int b() {
        return this.f19539a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f19539a == r52.f19539a) goto L12;
        return false;
    L12:
        if (this.f19540b == r52.f19540b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f19539a) * 31) + Integer.hashCode(this.f19540b);
    }

    public String toString() {
        return "CollectionInfo(rowCount=" + this.f19539a + ", columnCount=" + this.f19540b + ')';
    }
}
