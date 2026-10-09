package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f19701a = null;

    static {
        f19701a = new C();
    }

    public C() {
    }

    public final void a(Canvas r1, int[] r2, int r3, float[] r4, int r5, int r6, Font r7, Paint r8) {
        A.a(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public final void b(Canvas r1, NinePatch r2, Rect r3, Paint r4) {
        AbstractC3730z.a(r1, r2, r3, r4);
    }

    public final void c(Canvas r1, NinePatch r2, RectF r3, Paint r4) {
        B.a(r1, r2, r3, r4);
    }
}
