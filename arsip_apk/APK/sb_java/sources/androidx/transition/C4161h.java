package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4161h implements InterfaceC4159f {

    /* renamed from: b, reason: collision with root package name */
    public static Class f28436b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28437c;
    public static Method d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f28438e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f28439f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f28440g;

    /* renamed from: a, reason: collision with root package name */
    public final View f28441a;

    public C4161h(View r1) {
        this.f28441a = r1;
    }

    public static InterfaceC4159f b(View r3, ViewGroup r4, Matrix r5) {
        c();
        Method r02 = d;
        if (r02 != null) goto L11;
    L9:
        return null;
    L11:
        return new C4161h((View) r02.invoke(null, new Object[]{r3, r4, r5}));
    L6:
        e = move-exception;
        throw new RuntimeException(e.getCause());
    }

    public static void c() {
        if (f28438e == false) goto L11;
        return;
    L11:
        d();     // Catch: NoSuchMethodException -> L7
        Method r1 = f28436b.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});     // Catch: NoSuchMethodException -> L7
        d = r1;     // Catch: NoSuchMethodException -> L7
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L7
    L9:
        f28438e = true;
        return;
    L7:
        e = move-exception;
        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
        goto L9
    }

    public static void d() {
        if (f28437c == true) goto L12;
        f28436b = Class.forName("android.view.GhostView");     // Catch: ClassNotFoundException -> L6
    L8:
        f28437c = true;
        return;
    L6:
        e = move-exception;
        Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
        goto L8
    }

    public static void e() {
        if (f28440g == false) goto L11;
        return;
    L11:
        d();     // Catch: NoSuchMethodException -> L7
        Method r1 = f28436b.getDeclaredMethod("removeGhost", new Class[]{View.class});     // Catch: NoSuchMethodException -> L7
        f28439f = r1;     // Catch: NoSuchMethodException -> L7
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L7
    L9:
        f28440g = true;
        return;
    L7:
        e = move-exception;
        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
        goto L9
    }

    public static void f(View r2) {
        e();
        Method r02 = f28439f;
        if (r02 != null) goto L11;
        return;
    L11:
        r02.invoke(null, new Object[]{r2});     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L10
        return;
    L6:
        e = move-exception;
        throw new RuntimeException(e.getCause());
    }

    @Override // androidx.transition.InterfaceC4159f
    public void a(ViewGroup r1, View r2) {
    }

    @Override // androidx.transition.InterfaceC4159f
    public void setVisibility(int r2) {
        this.f28441a.setVisibility(r2);
    }
}
