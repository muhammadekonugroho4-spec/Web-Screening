package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: androidx.compose.ui.graphics.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3558q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3558q0 f17581a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Method f17582b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f17583c;
    public static boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17584e = 0;

    static {
        f17581a = new C3558q0();
        f17584e = 8;
    }

    public C3558q0() {
    }

    public final void a(Canvas r11, boolean r12) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 29) goto L7;
        C3563t0.f17618a.a(r11, r12);
        return;
    L7:
        if (d == false) goto L32;
    L19:
        if (r12 == true) goto L30;
    L23:
        if (r12 == true) goto L34;
        Method r122 = f17583c;     // Catch: Throwable -> L29
        if (r122 == null) goto L35;
        kotlin.jvm.internal.p.i(r122);     // Catch: Throwable -> L29
        r122.invoke(r11, null);     // Catch: Throwable -> L29
        return;
    L36:
        return;
    L35:
        return;
    L34:
        return;
    L30:
        Method r03 = f17582b;     // Catch: Throwable -> L29
        if (r03 == null) goto L23;
        kotlin.jvm.internal.p.i(r03);     // Catch: Throwable -> L29
        r03.invoke(r11, null);     // Catch: Throwable -> L29
        goto L23
    L32:
        if (r02 != 28) goto L11;
        Method r04 = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});     // Catch: Throwable -> L28
        f17582b = (Method) r04.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});     // Catch: Throwable -> L28
        f17583c = (Method) r04.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});     // Catch: Throwable -> L28
    L12:
        Method r05 = f17582b;     // Catch: Throwable -> L28
        if (r05 == null) goto L15;
        r05.setAccessible(true);     // Catch: Throwable -> L28
    L15:
        Method r06 = f17583c;     // Catch: Throwable -> L28
        if (r06 == null) goto L18;
        r06.setAccessible(true);     // Catch: Throwable -> L28
        goto L18
    L11:
        f17582b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);     // Catch: Throwable -> L28
        f17583c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);     // Catch: Throwable -> L28
    L18:
        d = true;
        goto L19
    }
}
