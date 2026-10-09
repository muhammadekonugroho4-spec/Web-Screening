package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28346a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f28347b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28348c;

    public static class a {
        public static float a(View r02) {
            return L.a(r02);
        }

        public static void b(View r02, float r1) {
            K.a(r02, r1);
        }
    }

    static {
    }

    public M() {
    }

    public void a(View r1) {
    }

    public float b(View r2) {
        if (f28346a == false) goto L8;
        return a.a(r2);
    L6:
        f28346a = false;
    L8:
        return r2.getAlpha();
    }

    public void c(View r1) {
    }

    public abstract void d(View r1, Matrix r2);

    public abstract void e(View r1, int r2, int r3, int r4, int r5);

    public void f(View r2, float r3) {
        if (f28346a == true) goto L9;
    L7:
        r2.setAlpha(r3);
        return;
    L9:
        a.b(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f28346a = false;
        goto L7
    }

    public void g(View r4, int r5) {
        if (f28348c == false) goto L16;
    L9:
        Field r02 = f28347b;
        if (r02 == null) goto L18;
        int r03 = r02.getInt(r4);     // Catch: IllegalAccessException -> L13
        f28347b.setInt(r4, r5 | (r03 & (-13)));     // Catch: IllegalAccessException -> L13
        return;
    L19:
        return;
    L18:
        return;
    L16:
        Field r1 = View.class.getDeclaredField("mViewFlags");     // Catch: NoSuchFieldException -> L7
        f28347b = r1;     // Catch: NoSuchFieldException -> L7
        r1.setAccessible(true);     // Catch: NoSuchFieldException -> L7
    L8:
        f28348c = true;
    L7:
        Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
        goto L8
    }

    public abstract void h(View r1, Matrix r2);

    public abstract void i(View r1, Matrix r2);
}
