package com.stockbit.android.extension.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* loaded from: classes6.dex */
public final class a extends ImageSpan {
    static {
    }

    public a(Drawable r2) {
        kotlin.jvm.internal.p.l(r2, "drawable");
        super(r2);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas r1, CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, Paint r9) {
        kotlin.jvm.internal.p.l(r1, "canvas");
        kotlin.jvm.internal.p.l(r9, "paint");
        Drawable r22 = getDrawable();
        r1.save();
        Paint.FontMetrics r32 = r9.getFontMetrics();
        r1.translate(r5, (r7 + ((r32.descent + r32.ascent) / 2.0f)) - (r22.getBounds().height() / 2.0f));
        r22.draw(r1);
        r1.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint r1, CharSequence r2, int r3, int r4, Paint.FontMetricsInt r5) {
        kotlin.jvm.internal.p.l(r1, "paint");
        Rect r12 = getDrawable().getBounds();
        kotlin.jvm.internal.p.k(r12, "getBounds(...)");
        if (r5 == null) goto L8;
        int r22 = r5.descent - r5.ascent;
        int r32 = r12.height();
        if (r32 <= r22) goto L8;
        int r33 = r32 - r22;
        int r34 = r33 / 2;
        int r23 = r5.ascent - r34;
        r5.ascent = r23;
        int r42 = r5.descent + r34;
        r5.descent = r42;
        r5.top = r23;
        r5.bottom = r42;
    L8:
        return r12.right;
    }

    public a(Context r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "context");
        super(r2, r3);
    }
}
