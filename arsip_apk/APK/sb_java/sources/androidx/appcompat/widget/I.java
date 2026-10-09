package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3380a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3381b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3382c = null;
    public static final int[] d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3383e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3384f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3385g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f3386h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f3387i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f3388j = null;

    static {
        f3380a = new ThreadLocal();
        f3381b = new int[]{-16842910};
        f3382c = new int[]{R.attr.state_focused};
        d = new int[]{R.attr.state_activated};
        f3383e = new int[]{R.attr.state_pressed};
        f3384f = new int[]{R.attr.state_checked};
        f3385g = new int[]{R.attr.state_selected};
        f3386h = new int[]{-16842919, -16842908};
        f3387i = new int[0];
        f3388j = new int[1];
    }

    public static void a(View r3, Context r4) {
        TypedArray r42 = r4.obtainStyledAttributes(androidx.appcompat.j.f2777A0);
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    L4:
        if (r42.hasValue(androidx.appcompat.j.f2787F0) == true) goto L9;
        Log.e("ThemeUtils", "View " + r3.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");     // Catch: Throwable -> L7
    L9:
        r42.recycle();
    }

    public static int b(Context r4, int r5) {
        ColorStateList r02 = e(r4, r5);
        if (r02 != null) goto L5;
    L8:
        TypedValue r03 = f();
        r4.getTheme().resolveAttribute(R.attr.disabledAlpha, r03, true);
        return d(r4, r5, r03.getFloat());
    L5:
        if (r02.isStateful() == false) goto L8;
        return r02.getColorForState(f3381b, r02.getDefaultColor());
    }

    public static int c(Context r2, int r3) {
        int[] r02 = f3388j;
        r02[0] = r3;
        M r22 = M.u(r2, null, r02);
        int r32 = r22.b(0, 0);     // Catch: Throwable -> L6
        r22.x();
        return r32;
    L6:
        th = move-exception;
        r22.x();
        throw th;
    }

    public static int d(Context r02, int r1, float r2) {
        return androidx.core.graphics.d.p(c(r02, r1), Math.round(Color.alpha(r0) * r2));
    }

    public static ColorStateList e(Context r2, int r3) {
        int[] r02 = f3388j;
        r02[0] = r3;
        M r22 = M.u(r2, null, r02);
        ColorStateList r32 = r22.c(0);     // Catch: Throwable -> L6
        r22.x();
        return r32;
    L6:
        th = move-exception;
        r22.x();
        throw th;
    }

    public static TypedValue f() {
        ThreadLocal r02 = f3380a;
        TypedValue r1 = (TypedValue) r02.get();
        if (r1 != null) goto L6;
        TypedValue r12 = new TypedValue();
        r02.set(r12);
        return r12;
    L6:
        return r1;
    }
}
