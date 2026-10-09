package androidx.compose.ui.autofill;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: b, reason: collision with root package name */
    public final int f16783b;

    public /* synthetic */ d(int r1) {
        this.f16783b = r1;
    }

    public static final /* synthetic */ d a(int r1) {
        return new d(r1);
    }

    public static int b(int r02) {
        return r02;
    }

    public static boolean c(int r2, Object r3) {
        if ((r3 instanceof d) == true) goto L6;
        return false;
    L6:
        if (r2 == ((d) r3).f()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(int r02) {
        return Integer.hashCode(r02);
    }

    public static String e(int r2) {
        return "AndroidContentDataType(androidAutofillType=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return c(this.f16783b, r2);
    }

    public final /* synthetic */ int f() {
        return this.f16783b;
    }

    public int hashCode() {
        return d(this.f16783b);
    }

    public String toString() {
        return e(this.f16783b);
    }
}
