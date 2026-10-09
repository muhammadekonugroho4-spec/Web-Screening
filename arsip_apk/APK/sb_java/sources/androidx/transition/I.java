package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28340a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Method f28341b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28342c;

    public static class a {
        public static int a(ViewGroup r02, int r1) {
            return r02.getChildDrawingOrder(r1);
        }

        public static void b(ViewGroup r02, boolean r1) {
            r02.suppressLayout(r1);
        }
    }

    static {
    }

    public static int a(ViewGroup r4, int r5) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return a.a(r4, r5);
    L7:
        if (f28342c == false) goto L20;
    L11:
        Method r02 = f28341b;
        if (r02 != null) goto L18;
    L15:
        return r5;
    L18:
        return ((Integer) r02.invoke(r4, new Object[]{Integer.valueOf(r4.getChildCount()), Integer.valueOf(r5)})).intValue();
    L20:
        Class r3 = Integer.TYPE;     // Catch: NoSuchMethodException -> L16
        Method r1 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", new Class[]{r3, r3});     // Catch: NoSuchMethodException -> L16
        f28341b = r1;     // Catch: NoSuchMethodException -> L16
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L16
    L10:
        f28342c = true;
        goto L11
    }

    public static void b(ViewGroup r1, boolean r2) {
        if (f28340a == false) goto L10;
        a.b(r1, r2);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f28340a = false;
        return;
    }

    public static void c(ViewGroup r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        a.b(r2, r3);
        return;
    L6:
        b(r2, r3);
    }
}
