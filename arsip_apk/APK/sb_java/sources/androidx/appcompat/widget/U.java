package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3576a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3577b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f3578c = false;

    public static class a {
        public static void a(View r2, Rect r3, Rect r4) {
            Insets r22 = r2.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(r3)).build(), r4).getSystemWindowInsets();
            r3.set(r22.left, r22.top, r22.right, r22.bottom);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 27) goto L5;
        boolean r02 = true;
    L6:
        f3578c = r02;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public static void a(View r5, Rect r6, Rect r7) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        a.a(r5, r6, r7);
        return;
    L7:
        if (f3576a == true) goto L14;
        f3576a = true;
        Method r02 = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});     // Catch: NoSuchMethodException -> L13
        f3577b = r02;     // Catch: NoSuchMethodException -> L13
        if (r02.isAccessible() == true) goto L14;
        f3577b.setAccessible(true);     // Catch: NoSuchMethodException -> L13
    L13:
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
    L14:
        Method r03 = f3577b;
        if (r03 == null) goto L25;
        r03.invoke(r5, new Object[]{r6, r7});     // Catch: Exception -> L18
        return;
    L18:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
        return;
    }

    public static boolean b(View r1) {
        if (r1.getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public static void c(View r5) {
        Method r2 = r5.getClass().getMethod("makeOptionalFitsSystemWindows", null);     // Catch: IllegalAccessException -> L6 InvocationTargetException -> L8 NoSuchMethodException -> L14
        if (r2.isAccessible() == true) goto L10;
        r2.setAccessible(true);     // Catch: IllegalAccessException -> L6 InvocationTargetException -> L8 NoSuchMethodException -> L14
    L10:
        r2.invoke(r5, null);     // Catch: IllegalAccessException -> L6 InvocationTargetException -> L8 NoSuchMethodException -> L14
        return;
    L6:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        return;
    L14:
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        return;
    L8:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
    }
}
