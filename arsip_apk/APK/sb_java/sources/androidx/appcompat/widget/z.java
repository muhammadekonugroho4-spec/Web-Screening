package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3685a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3686b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f3687c = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f3688a = false;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f3689b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f3690c = null;
        public static final Field d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final Field f3691e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final Field f3692f = null;

        static {
            Class<?> r3 = Class.forName("android.graphics.Insets");     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
            Method r4 = Drawable.class.getMethod("getOpticalInsets", null);     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
        L37:
            Field r5 = r3.getField("left");     // Catch: NoSuchFieldException -> L14 ClassNotFoundException -> L16 NoSuchMethodException -> L18
            Field r6 = r3.getField("top");     // Catch: NoSuchFieldException -> L10 ClassNotFoundException -> L12 NoSuchMethodException -> L13
            Field r7 = r3.getField("right");     // Catch: Throwable -> L9
            Field r32 = r3.getField("bottom");     // Catch: Throwable -> L28
            boolean r8 = true;
        L24:
            if (r8 == false) goto L26;
            f3689b = r4;
            f3690c = r5;
            d = r6;
            f3691e = r7;
            f3692f = r32;
            f3688a = true;
            return;
        L26:
            f3689b = null;
            f3690c = null;
            d = null;
            f3691e = null;
            f3692f = null;
            f3688a = false;
            return;
        L23:
            r32 = null;
            r8 = false;
        L9:
            r7 = null;
            goto L23
        L12:
            r6 = null;
        L11:
            r7 = r6;
        L10:
            r6 = null;
        L13:
            r6 = null;
            goto L11
        L16:
            r5 = null;
        L17:
            r6 = r5;
        L14:
            r5 = null;
        L15:
            r6 = r5;
        L18:
            r5 = null;
        L19:
            r6 = r5;
        L21:
            r4 = null;
            r5 = null;
        L20:
            r4 = null;
            r5 = null;
        L22:
            r4 = null;
            r5 = null;
            goto L19
        }

        public static Rect a(Drawable r5) {
            if (Build.VERSION.SDK_INT >= 29) goto L11;
            if (f3688a == false) goto L11;
            Object r52 = f3689b.invoke(r5, null);     // Catch: Throwable -> L12
            if (r52 == null) goto L11;
            return new Rect(f3690c.getInt(r52), d.getInt(r52), f3691e.getInt(r52), f3692f.getInt(r52));
        L11:
            return z.f3687c;
        }
    }

    public static class b {
        public static Insets a(Drawable r02) {
            return r02.getOpticalInsets();
        }
    }

    static {
        f3685a = new int[]{R.attr.state_checked};
        f3686b = new int[0];
        f3687c = new Rect();
    }

    public static boolean a(Drawable r02) {
        return true;
    }

    public static void b(Drawable r3) {
        String r02 = r3.getClass().getName();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L5;
        return;
    L5:
        if (r1 < 31) goto L7;
        return;
    L7:
        if ("android.graphics.drawable.ColorStateListDrawable".equals(r02) == false) goto L12;
        c(r3);
        return;
    }

    public static void c(Drawable r2) {
        int[] r02 = r2.getState();
        if (r02 != null) goto L5;
    L8:
        r2.setState(f3685a);
    L9:
        r2.setState(r02);
        return;
    L5:
        if (r02.length == 0) goto L8;
        r2.setState(f3686b);
        goto L9
    }

    public static Rect d(Drawable r4) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        Insets r42 = b.a(r4);
        return new Rect(v.a(r42), w.a(r42), x.a(r42), y.a(r42));
    L7:
        return a.a(androidx.core.graphics.drawable.a.q(r4));
    }

    public static PorterDuff.Mode e(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }
}
