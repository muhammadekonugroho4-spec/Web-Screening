package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4164k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28448a = true;

    /* renamed from: androidx.transition.k$a */
    public static class a {
        public static void a(ImageView r02, Matrix r1) {
            r02.animateTransform(r1);
        }
    }

    static {
    }

    public static void a(ImageView r3, Matrix r4) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        a.a(r3, r4);
        return;
    L6:
        if (r4 != null) goto L11;
        Drawable r42 = r3.getDrawable();
        if (r42 == null) goto L13;
        r42.setBounds(0, 0, (r3.getWidth() - r3.getPaddingLeft()) - r3.getPaddingRight(), (r3.getHeight() - r3.getPaddingTop()) - r3.getPaddingBottom());
        r3.invalidate();
        return;
    L13:
        return;
    L11:
        b(r3, r4);
    }

    public static void b(ImageView r1, Matrix r2) {
        if (f28448a == false) goto L10;
        a.a(r1, r2);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f28448a = false;
        return;
    }
}
