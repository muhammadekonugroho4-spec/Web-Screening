package n0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.widget.l;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class c {
    public static final int a(float r2) {
        return (int) TypedValue.applyDimension(1, r2, Resources.getSystem().getDisplayMetrics());
    }

    public static final int b(int r2) {
        return (int) TypedValue.applyDimension(1, r2, Resources.getSystem().getDisplayMetrics());
    }

    public static final int c(Context r2, int r3) {
        p.l(r2, "<this>");
        TypedValue r02 = new TypedValue();
        r2.getTheme().resolveAttribute(r3, r02, true);
        return r02.data;
    }

    public static void d(TextView r1, int r2) {
        p.l(r1, "<this>");
        p.l(r1, "<this>");
        l.m(r1, r2);
    }

    public static final float e(Context r3, int r4) {
        p.l(r3, "<this>");
        TypedValue r02 = new TypedValue();
        r3.getTheme().resolveAttribute(r4, r02, true);
        return r02.getDimension(r3.getResources().getDisplayMetrics());
    }

    public static final float f(Context r3, int r4) {
        p.l(r3, "<this>");
        TypedValue r02 = new TypedValue();
        Resources.Theme r1 = r3.getTheme();
        p.k(r1, "this.theme");
        r1.resolveAttribute(r4, r02, true);
        return r02.getDimension(r3.getResources().getDisplayMetrics());
    }
}
