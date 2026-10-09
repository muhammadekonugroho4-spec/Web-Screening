package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.content.res.e;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class i extends m {

    /* renamed from: b, reason: collision with root package name */
    public static Class f22889b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f22890c = null;
    public static Method d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f22891e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22892f = false;

    static {
    }

    public i() {
    }

    public static boolean h(Object r1, String r2, int r3, boolean r4) {
        j();
        return ((Boolean) d.invoke(r1, new Object[]{r2, Integer.valueOf(r3), Boolean.valueOf(r4)})).booleanValue();
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private static Typeface i(Object r2) {
        j();
        Object r02 = Array.newInstance(f22889b, 1);     // Catch: Throwable -> L5
        Array.set(r02, 0, r2);     // Catch: Throwable -> L5
        return (Typeface) f22891e.invoke(null, new Object[]{r02});
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static void j() {
        if (f22892f == false) goto L5;
        return;
    L5:
        f22892f = true;
        Constructor<?> r1 = null;
        Class<?> r2 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Constructor<?> r3 = r2.getConstructor(null);     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Method r4 = r2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Method r02 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r2, 1).getClass()});     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        r1 = r3;
    L12:
        f22890c = r1;
        f22889b = r2;
        d = r4;
        f22891e = r02;
        return;
    L8:
        e = move-exception;
        Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
        r02 = null;
        r2 = null;
        r4 = null;
        goto L12
    }

    private static Object k() {
        j();
        return f22890c.newInstance(null);
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // androidx.core.graphics.m
    public Typeface a(Context r8, e.c r9, Resources r10, int r11) {
        Object r112 = k();
        e.d[] r92 = r9.a();
        int r02 = r92.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L22;
        e.d r2 = r92[r1];
        File r3 = n.d(r8);
        if (r3 == null) goto L6;
        if (n.b(r3, r10, r2.b()) == false) goto L9;
        if (h(r112, r3.getPath(), r2.e(), r2.f()) == false) goto L13;
        r3.delete();
        r1 = r1 + 1;
        goto L3
    L13:
        r3.delete();
        return null;
    L9:
        r3.delete();
        return null;
    L19:
        r3.delete();
        return null;
    L16:
        th = move-exception;
        r3.delete();
        throw th;
    L6:
        return null;
    L22:
        return i(r112);
    }
}
