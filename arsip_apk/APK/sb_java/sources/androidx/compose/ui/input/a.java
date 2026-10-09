package androidx.compose.ui.input;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0125a f17903b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17904c = 0;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f17905a;

    /* renamed from: androidx.compose.ui.input.a$a, reason: collision with other inner class name */
    public static final class C0125a {
        public /* synthetic */ C0125a(i r1) {
            this();
        }

        public final int a() {
            return a.a();
        }

        public final int b() {
            return a.b();
        }

        public C0125a() {
        }
    }

    static {
        f17903b = new C0125a(null);
        f17904c = d(1);
        d = d(2);
    }

    public /* synthetic */ a(int r1) {
        this.f17905a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f17904c;
    }

    public static final /* synthetic */ a c(int r1) {
        return new a(r1);
    }

    public static int d(int r02) {
        return r02;
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof a) == true) goto L6;
        return false;
    L6:
        if (r2 == ((a) r3).i()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int g(int r02) {
        return Integer.hashCode(r02);
    }

    public static String h(int r1) {
        if (f(r1, f17904c) == false) goto L7;
        return "Touch";
    L7:
        if (f(r1, d) == false) goto L10;
        return "Keyboard";
    L10:
        return "Error";
    }

    public boolean equals(Object r2) {
        return e(this.f17905a, r2);
    }

    public int hashCode() {
        return g(this.f17905a);
    }

    public final /* synthetic */ int i() {
        return this.f17905a;
    }

    public String toString() {
        return h(this.f17905a);
    }
}
