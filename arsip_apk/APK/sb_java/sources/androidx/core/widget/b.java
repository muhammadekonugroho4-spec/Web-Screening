package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes4.dex */
public abstract class b {

    public static class a {
        public static void a(CheckedTextView r02, ColorStateList r1) {
            r02.setCheckMarkTintList(r1);
        }

        public static void b(CheckedTextView r02, PorterDuff.Mode r1) {
            r02.setCheckMarkTintMode(r1);
        }
    }

    public static Drawable a(CheckedTextView r02) {
        return r02.getCheckMarkDrawable();
    }

    public static void b(CheckedTextView r02, ColorStateList r1) {
        a.a(r02, r1);
    }

    public static void c(CheckedTextView r02, PorterDuff.Mode r1) {
        a.b(r02, r1);
    }
}
