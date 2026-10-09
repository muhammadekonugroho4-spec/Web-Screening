package com.stockbit.profile.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f128051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128052b;

    static {
    }

    public b(Drawable r1, int r2, int r3) {
        p.i(r1);
        super(r1);
        this.f128051a = r2;
        this.f128052b = r3;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas r1, CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, Paint r9) {
        p.l(r1, "canvas");
        p.l(r2, Constants.KEY_TEXT);
        p.l(r9, "paint");
        Drawable r22 = getDrawable();
        Paint.FontMetricsInt r32 = r9.getFontMetricsInt();
        int r42 = ((((r32.descent + r7) + r7) + r32.ascent) / 2) - (r22.getBounds().bottom / 2);
        r1.save();
        r1.translate(r5 + this.f128051a, r42);
        r22.draw(r1);
        r1.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint r2, CharSequence r3, int r4, int r5, Paint.FontMetricsInt r6) {
        p.l(r2, "paint");
        p.l(r3, Constants.KEY_TEXT);
        return (this.f128051a + super.getSize(r2, r3, r4, r5, r6)) + this.f128052b;
    }
}
