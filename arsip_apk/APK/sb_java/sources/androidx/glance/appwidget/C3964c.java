package androidx.glance.appwidget;

/* renamed from: androidx.glance.appwidget.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3964c implements androidx.glance.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f24908a;

    static {
    }

    public C3964c(int r1) {
        this.f24908a = r1;
    }

    public final int a() {
        return this.f24908a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3964c) == true) goto L9;
        return false;
    L9:
        if (this.f24908a == ((C3964c) r4).f24908a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f24908a);
    }

    public String toString() {
        return "AppWidgetId(appWidgetId=" + this.f24908a + ')';
    }
}
