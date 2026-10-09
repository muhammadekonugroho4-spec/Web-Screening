package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22586a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f22587b = null;

    static {
        f22586a = new ThreadLocal();
        f22587b = new ThreadLocal();
    }

    public static void a(ViewGroup r3, View r4, Rect r5) {
        r5.set(0, 0, r4.getWidth(), r4.getHeight());
        c(r3, r4, r5);
    }

    public static void b(ViewParent r2, View r3, Matrix r4) {
        Object r02 = r3.getParent();
        if ((r02 instanceof View) == false) goto L6;
        if (r02 == r2) goto L6;
        b(r2, (View) r02, r4);
        r4.preTranslate(-r0.getScrollX(), -r0.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }

    public static void c(ViewGroup r3, View r4, Rect r5) {
        ThreadLocal r02 = f22586a;
        Matrix r1 = (Matrix) r02.get();
        if (r1 != null) goto L5;
        r1 = new Matrix();
        r02.set(r1);
    L6:
        b(r3, r4, r1);
        ThreadLocal r32 = f22587b;
        RectF r42 = (RectF) r32.get();
        if (r42 != null) goto L9;
        r42 = new RectF();
        r32.set(r42);
    L9:
        r42.set(r5);
        r1.mapRect(r42);
        r5.set((int) (r42.left + 0.5f), (int) (r42.top + 0.5f), (int) (r42.right + 0.5f), (int) (r42.bottom + 0.5f));
        return;
    L5:
        r1.reset();
        goto L6
    }
}
