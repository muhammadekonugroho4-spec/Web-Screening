package androidx.glance.appwidget;

/* renamed from: androidx.glance.appwidget.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3968g {

    /* renamed from: a, reason: collision with root package name */
    public final int f24914a;

    static {
    }

    public C3968g(int r1) {
        this.f24914a = r1;
    }

    public final int a() {
        return this.f24914a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3968g) == true) goto L9;
        return false;
    L9:
        if (this.f24914a == ((C3968g) r4).f24914a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f24914a);
    }

    public String toString() {
        return "ContainerInfo(layoutId=" + this.f24914a + ')';
    }
}
