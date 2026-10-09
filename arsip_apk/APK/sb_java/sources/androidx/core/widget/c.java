package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes4.dex */
public abstract class c {

    public static class a {
        public static ColorStateList a(CompoundButton r02) {
            return r02.getButtonTintList();
        }

        public static PorterDuff.Mode b(CompoundButton r02) {
            return r02.getButtonTintMode();
        }

        public static void c(CompoundButton r02, ColorStateList r1) {
            r02.setButtonTintList(r1);
        }

        public static void d(CompoundButton r02, PorterDuff.Mode r1) {
            r02.setButtonTintMode(r1);
        }
    }

    public static class b {
        public static Drawable a(CompoundButton r02) {
            return r02.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton r02) {
        return b.a(r02);
    }

    public static ColorStateList b(CompoundButton r02) {
        return a.a(r02);
    }

    public static PorterDuff.Mode c(CompoundButton r02) {
        return a.b(r02);
    }

    public static void d(CompoundButton r02, ColorStateList r1) {
        a.c(r02, r1);
    }

    public static void e(CompoundButton r02, PorterDuff.Mode r1) {
        a.d(r02, r1);
    }
}
