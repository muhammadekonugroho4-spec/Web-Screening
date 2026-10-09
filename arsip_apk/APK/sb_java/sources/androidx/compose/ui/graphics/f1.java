package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class f1 {
    public static final Rect a(androidx.compose.ui.geometry.g r4) {
        return new Rect((int) r4.k(), (int) r4.n(), (int) r4.l(), (int) r4.e());
    }

    public static final Rect b(androidx.compose.ui.unit.q r4) {
        return new Rect(r4.f(), r4.i(), r4.g(), r4.d());
    }

    public static final RectF c(androidx.compose.ui.geometry.g r4) {
        return new RectF(r4.k(), r4.n(), r4.l(), r4.e());
    }

    public static final androidx.compose.ui.unit.q d(Rect r4) {
        return new androidx.compose.ui.unit.q(r4.left, r4.top, r4.right, r4.bottom);
    }

    public static final androidx.compose.ui.geometry.g e(Rect r4) {
        return new androidx.compose.ui.geometry.g(r4.left, r4.top, r4.right, r4.bottom);
    }

    public static final androidx.compose.ui.geometry.g f(RectF r4) {
        return new androidx.compose.ui.geometry.g(r4.left, r4.top, r4.right, r4.bottom);
    }
}
