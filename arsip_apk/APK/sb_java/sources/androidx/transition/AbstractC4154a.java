package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4154a {

    /* renamed from: a, reason: collision with root package name */
    public static Method f28411a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f28412b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28413c;

    /* renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    public static class C0260a {
        public static void a(Canvas r02) {
            r02.disableZ();
        }

        public static void b(Canvas r02) {
            r02.enableZ();
        }
    }

    public static void a(Canvas r4, boolean r5) {
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 29) goto L10;
        if (r5 == false) goto L7;
        C0260a.b(r4);
        return;
    L7:
        C0260a.a(r4);
        return;
    L10:
        if (r1 == 28) goto L30;
        if (f28413c == false) goto L33;
    L16:
        if (r5 == true) goto L35;
    L20:
        if (r5 == true) goto L28;
        Method r52 = f28412b;     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L32
        if (r52 == null) goto L37;
        r52.invoke(r4, null);     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L32
    L25:
        e = move-exception;
        throw new RuntimeException(e.getCause());
    L39:
        return;
    L38:
        return;
    L37:
        return;
    L28:
        return;
    L35:
        Method r02 = f28411a;     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L32
        if (r02 == null) goto L20;
        r02.invoke(r4, null);     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L32
        goto L20
    L33:
        Method r3 = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);     // Catch: NoSuchMethodException -> L31
        f28411a = r3;     // Catch: NoSuchMethodException -> L31
        r3.setAccessible(true);     // Catch: NoSuchMethodException -> L31
        Method r03 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);     // Catch: NoSuchMethodException -> L31
        f28412b = r03;     // Catch: NoSuchMethodException -> L31
        r03.setAccessible(true);     // Catch: NoSuchMethodException -> L31
    L15:
        f28413c = true;
        goto L16
    L30:
        throw new IllegalStateException("This method doesn't work on Pie!");
    }
}
