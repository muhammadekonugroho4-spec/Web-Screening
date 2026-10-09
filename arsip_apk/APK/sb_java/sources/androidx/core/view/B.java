package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;

/* loaded from: classes4.dex */
public abstract class B {

    public static class a {
        public static MenuItem a(MenuItem r02, char r1, int r2) {
            return r02.setAlphabeticShortcut(r1, r2);
        }

        public static MenuItem b(MenuItem r02, CharSequence r1) {
            return r02.setContentDescription(r1);
        }

        public static MenuItem c(MenuItem r02, ColorStateList r1) {
            return r02.setIconTintList(r1);
        }

        public static MenuItem d(MenuItem r02, PorterDuff.Mode r1) {
            return r02.setIconTintMode(r1);
        }

        public static MenuItem e(MenuItem r02, char r1, int r2) {
            return r02.setNumericShortcut(r1, r2);
        }

        public static MenuItem f(MenuItem r02, CharSequence r1) {
            return r02.setTooltipText(r1);
        }
    }

    public static MenuItem a(MenuItem r1, AbstractC3862b r2) {
        if ((r1 instanceof androidx.core.internal.view.b) == true) goto L5;
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return r1;
    L5:
        return ((androidx.core.internal.view.b) r1).b(r2);
    }

    public static void b(MenuItem r1, char r2, int r3) {
        if ((r1 instanceof androidx.core.internal.view.b) == false) goto L6;
        ((androidx.core.internal.view.b) r1).setAlphabeticShortcut(r2, r3);
        return;
    L6:
        a.a(r1, r2, r3);
    }

    public static void c(MenuItem r1, CharSequence r2) {
        if ((r1 instanceof androidx.core.internal.view.b) == false) goto L6;
        ((androidx.core.internal.view.b) r1).setContentDescription(r2);
        return;
    L6:
        a.b(r1, r2);
    }

    public static void d(MenuItem r1, ColorStateList r2) {
        if ((r1 instanceof androidx.core.internal.view.b) == false) goto L6;
        ((androidx.core.internal.view.b) r1).setIconTintList(r2);
        return;
    L6:
        a.c(r1, r2);
    }

    public static void e(MenuItem r1, PorterDuff.Mode r2) {
        if ((r1 instanceof androidx.core.internal.view.b) == false) goto L6;
        ((androidx.core.internal.view.b) r1).setIconTintMode(r2);
        return;
    L6:
        a.d(r1, r2);
    }

    public static void f(MenuItem r1, char r2, int r3) {
        if ((r1 instanceof androidx.core.internal.view.b) == false) goto L6;
        ((androidx.core.internal.view.b) r1).setNumericShortcut(r2, r3);
        return;
    L6:
        a.e(r1, r2, r3);
    }

    public static void g(MenuItem r1, CharSequence r2) {
        if ((r1 instanceof androidx.core.internal.view.b) == false) goto L6;
        ((androidx.core.internal.view.b) r1).setTooltipText(r2);
        return;
    L6:
        a.f(r1, r2);
    }
}
