package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class P extends M {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f28349e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f28350f = true;

    public static class a {
        public static void a(View r02, Matrix r1) {
            N.a(r02, r1);
        }

        public static void b(View r02, Matrix r1) {
            androidx.compose.ui.platform.U.a(r02, r1);
        }

        public static void c(View r02, Matrix r1) {
            O.a(r02, r1);
        }
    }

    static {
    }

    public P() {
    }

    @Override // androidx.transition.M
    public void d(View r2, Matrix r3) {
        if (d == false) goto L10;
        a.a(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        d = false;
        return;
    }

    @Override // androidx.transition.M
    public void h(View r2, Matrix r3) {
        if (f28349e == false) goto L10;
        a.b(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f28349e = false;
        return;
    }

    @Override // androidx.transition.M
    public void i(View r2, Matrix r3) {
        if (f28350f == false) goto L10;
        a.c(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f28350f = false;
        return;
    }
}
