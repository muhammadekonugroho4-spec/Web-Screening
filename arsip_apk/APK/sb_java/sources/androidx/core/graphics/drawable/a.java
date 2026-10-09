package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    public static class C0163a {
        public static void a(Drawable r02, Resources.Theme r1) {
            r02.applyTheme(r1);
        }

        public static boolean b(Drawable r02) {
            return r02.canApplyTheme();
        }

        public static ColorFilter c(Drawable r02) {
            return r02.getColorFilter();
        }

        public static void d(Drawable r02, Resources r1, XmlPullParser r2, AttributeSet r3, Resources.Theme r4) {
            r02.inflate(r1, r2, r3, r4);
        }

        public static void e(Drawable r02, float r1, float r2) {
            r02.setHotspot(r1, r2);
        }

        public static void f(Drawable r02, int r1, int r2, int r3, int r4) {
            r02.setHotspotBounds(r1, r2, r3, r4);
        }

        public static void g(Drawable r02, int r1) {
            r02.setTint(r1);
        }

        public static void h(Drawable r02, ColorStateList r1) {
            r02.setTintList(r1);
        }

        public static void i(Drawable r02, PorterDuff.Mode r1) {
            r02.setTintMode(r1);
        }
    }

    public static class b {
        public static int a(Drawable r02) {
            return r02.getLayoutDirection();
        }

        public static boolean b(Drawable r02, int r1) {
            return r02.setLayoutDirection(r1);
        }
    }

    public static void a(Drawable r02, Resources.Theme r1) {
        C0163a.a(r02, r1);
    }

    public static boolean b(Drawable r02) {
        return C0163a.b(r02);
    }

    public static void c(Drawable r02) {
        r02.clearColorFilter();
    }

    public static int d(Drawable r02) {
        return r02.getAlpha();
    }

    public static ColorFilter e(Drawable r02) {
        return C0163a.c(r02);
    }

    public static int f(Drawable r02) {
        return b.a(r02);
    }

    public static void g(Drawable r02, Resources r1, XmlPullParser r2, AttributeSet r3, Resources.Theme r4) {
        C0163a.d(r02, r1, r2, r3, r4);
    }

    public static boolean h(Drawable r02) {
        return r02.isAutoMirrored();
    }

    public static void i(Drawable r02) {
        r02.jumpToCurrentState();
    }

    public static void j(Drawable r02, boolean r1) {
        r02.setAutoMirrored(r1);
    }

    public static void k(Drawable r02, float r1, float r2) {
        C0163a.e(r02, r1, r2);
    }

    public static void l(Drawable r02, int r1, int r2, int r3, int r4) {
        C0163a.f(r02, r1, r2, r3, r4);
    }

    public static boolean m(Drawable r02, int r1) {
        return b.b(r02, r1);
    }

    public static void n(Drawable r02, int r1) {
        C0163a.g(r02, r1);
    }

    public static void o(Drawable r02, ColorStateList r1) {
        C0163a.h(r02, r1);
    }

    public static void p(Drawable r02, PorterDuff.Mode r1) {
        C0163a.i(r02, r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable q(Drawable r1) {
        if ((r1 instanceof c) == true) goto L5;
        return r1;
    L5:
        return ((c) r1).b();
    }

    public static Drawable r(Drawable r02) {
        return r02;
    }
}
