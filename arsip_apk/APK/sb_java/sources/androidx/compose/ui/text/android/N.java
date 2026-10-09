package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public abstract class N {
    public static final void a(Rect r2, Rect r3) {
        r2.right += r3.width();
        r2.top = Math.min(r2.top, r3.top);
        r2.bottom = Math.max(r2.bottom, r3.bottom);
    }

    public static final void b(Paint r2, CharSequence r3, int r4, int r5, Rect r6) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        M.a(r2, r3, r4, r5, r6);
        return;
    L6:
        r2.getTextBounds(r3.toString(), r4, r5, r6);
    }

    public static final Rect c(TextPaint r12, CharSequence r13, int r14, int r15) {
        if ((r13 instanceof Spanned) == false) goto L18;
        Spanned r02 = (Spanned) r13;
        if (O.b(r02, MetricAffectingSpan.class, r14, r15) == false) goto L18;
        Rect r2 = new Rect();
        Rect r3 = new Rect();
        TextPaint r4 = new TextPaint();
    L8:
        if (r14 >= r15) goto L16;
        int r5 = r02.nextSpanTransition(r14, r15, MetricAffectingSpan.class);
        MetricAffectingSpan[] r6 = (MetricAffectingSpan[]) r02.getSpans(r14, r5, MetricAffectingSpan.class);
        r4.set(r12);
        int r7 = r6.length;
        int r8 = 0;
    L10:
        if (r8 >= r7) goto L15;
        MetricAffectingSpan r9 = r6[r8];
        if (r02.getSpanStart(r9) == r02.getSpanEnd(r9)) goto L14;
        r9.updateMeasureState(r4);
    L14:
        r8 = r8 + 1;
        goto L10
    L15:
        b(r4, r13, r14, r5, r3);
        a(r2, r3);
        r14 = r5;
        goto L8
    L16:
        return r2;
    L18:
        return d(r12, r13, r14, r15);
    }

    public static final Rect d(Paint r1, CharSequence r2, int r3, int r4) {
        Rect r02 = new Rect();
        b(r1, r2, r3, r4, r02);
        return r02;
    }
}
