package com.stockbit.feature.order.ui.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f101358a;

    /* renamed from: b, reason: collision with root package name */
    public final float f101359b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f101360c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f101361e;

    static {
    }

    public a(Context r10) {
        p.l(r10, "context");
        Paint r02 = new Paint(1);
        r02.setStyle(Paint.Style.FILL);
        r02.setColor(com.stockbit.uikit.utils.a.b(r10, com.stockbit.uikit.b.f151237S, null, false, 6, null));
        this.f101360c = r02;
        Paint r102 = new Paint(1);
        r102.setStyle(Paint.Style.STROKE);
        r102.setColor(com.stockbit.uikit.utils.a.b(r10, com.stockbit.uikit.b.f151226H, null, false, 6, null));
        this.d = r102;
        this.f101361e = new Path();
        float r03 = r10.getResources().getDisplayMetrics().density;
        float r1 = 1.0f * r03;
        this.f101358a = r1;
        this.f101359b = r03 * 4.0f;
        r102.setStrokeWidth(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r8) {
        p.l(r8, "canvas");
        float r02 = getBounds().width();
        float r1 = getBounds().height();
        float r2 = this.f101359b;
        float r3 = this.f101358a / 2.0f;
        r8.drawRect(getBounds(), this.f101360c);
        this.f101361e.reset();
        this.f101361e.moveTo(r3, 0.0f);
        this.f101361e.lineTo(r3, r1 - r2);
        float r6 = 2 * r2;
        float r12 = r1 - r3;
        this.f101361e.arcTo(new RectF(r3, (r1 - r6) + r3, r6 - r3, r12), 180.0f, -90.0f, false);
        this.f101361e.lineTo(r02, r12);
        r8.drawPath(this.f101361e, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.f101360c.setAlpha(r2);
        this.d.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r2) {
        this.f101360c.setColorFilter(r2);
        this.d.setColorFilter(r2);
    }
}
