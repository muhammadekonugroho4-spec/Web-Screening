package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class f {
    public static int a(float r1) {
        int r02 = (int) (0.5f + r1);
        if (r02 == 0) goto L6;
        return r02;
    L6:
        if (r1 != 0.0f) goto L9;
        return 0;
    L9:
        if (r1 <= 0.0f) goto L12;
        return 1;
    L12:
        return -1;
    }

    public static void b(View r02, Drawable r1) {
        r02.setBackground(r1);
    }

    public static void c(View r02, View.OnClickListener r1, boolean r2) {
        r02.setOnClickListener(r1);
        r02.setClickable(r2);
    }

    public static void d(View r02, float r1) {
        int r12 = a(r1);
        r02.setPadding(r12, r12, r12, r12);
    }

    public static void e(View r3, float r4) {
        int r42 = a(r4);
        r3.setPaddingRelative(r3.getPaddingStart(), r3.getPaddingTop(), r42, r3.getPaddingBottom());
    }

    public static void f(View r3, float r4) {
        r3.setPaddingRelative(a(r4), r3.getPaddingTop(), r3.getPaddingEnd(), r3.getPaddingBottom());
    }
}
