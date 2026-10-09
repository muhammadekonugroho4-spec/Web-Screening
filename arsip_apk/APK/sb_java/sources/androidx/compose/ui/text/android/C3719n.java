package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: androidx.compose.ui.text.android.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3719n {

    /* renamed from: a, reason: collision with root package name */
    public static final C3719n f19785a = null;

    static {
        f19785a = new C3719n();
    }

    public C3719n() {
    }

    public final boolean a(Canvas r1, Path r2) {
        return r1.clipOutPath(r2);
    }

    public final boolean b(Canvas r1, float r2, float r3, float r4, float r5) {
        return r1.clipOutRect(r2, r3, r4, r5);
    }

    public final boolean c(Canvas r1, int r2, int r3, int r4, int r5) {
        return r1.clipOutRect(r2, r3, r4, r5);
    }

    public final boolean d(Canvas r1, Rect r2) {
        return r1.clipOutRect(r2);
    }

    public final boolean e(Canvas r1, RectF r2) {
        return r1.clipOutRect(r2);
    }
}
