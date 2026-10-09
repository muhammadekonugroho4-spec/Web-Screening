package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public abstract class g {

    public static class a {
        public static ColorStateList a(ImageView r02) {
            return r02.getImageTintList();
        }

        public static PorterDuff.Mode b(ImageView r02) {
            return r02.getImageTintMode();
        }

        public static void c(ImageView r02, ColorStateList r1) {
            r02.setImageTintList(r1);
        }

        public static void d(ImageView r02, PorterDuff.Mode r1) {
            r02.setImageTintMode(r1);
        }
    }

    public static ColorStateList a(ImageView r02) {
        return a.a(r02);
    }

    public static PorterDuff.Mode b(ImageView r02) {
        return a.b(r02);
    }

    public static void c(ImageView r02, ColorStateList r1) {
        a.c(r02, r1);
    }

    public static void d(ImageView r02, PorterDuff.Mode r1) {
        a.d(r02, r1);
    }
}
