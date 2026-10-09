package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f18072a;

    public /* synthetic */ I(int r1) {
        this.f18072a = r1;
    }

    public static final /* synthetic */ I a(int r1) {
        return new I(r1);
    }

    public static int b(int r02) {
        return r02;
    }

    public static boolean c(int r2, Object r3) {
        if ((r3 instanceof I) == true) goto L6;
        return false;
    L6:
        if (r2 == ((I) r3).f()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(int r02) {
        return Integer.hashCode(r02);
    }

    public static String e(int r2) {
        return "PointerKeyboardModifiers(packedValue=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return c(this.f18072a, r2);
    }

    public final /* synthetic */ int f() {
        return this.f18072a;
    }

    public int hashCode() {
        return d(this.f18072a);
    }

    public String toString() {
        return e(this.f18072a);
    }
}
