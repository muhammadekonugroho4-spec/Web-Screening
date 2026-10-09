package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public class FadeThroughDrawable extends Drawable {
    private final float[] alphas;
    private final Drawable fadeInDrawable;
    private final Drawable fadeOutDrawable;
    private float progress;

    /* renamed from: com.google.android.material.internal.FadeThroughDrawable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class EmptyDrawable extends Drawable {
        private EmptyDrawable() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas r1) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r1) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter r1) {
        }

        public /* synthetic */ EmptyDrawable(AnonymousClass1 r1) {
            this();
        }
    }

    public FadeThroughDrawable(Drawable r4, Drawable r5) {
        AnonymousClass1 r02 = null;
        if (r4 == null) goto L5;
        Drawable r1 = r4.getConstantState().newDrawable().mutate();
    L6:
        this.fadeOutDrawable = r1;
        if (r5 == null) goto L9;
        Drawable r03 = r5.getConstantState().newDrawable().mutate();
    L10:
        this.fadeInDrawable = r03;
        int r2 = 3;
        if (r4 == null) goto L13;
        int r42 = androidx.core.graphics.drawable.a.f(r4);
    L14:
        if (r5 == null) goto L16;
        r2 = androidx.core.graphics.drawable.a.f(r5);
    L16:
        androidx.core.graphics.drawable.a.m(r1, r42);
        androidx.core.graphics.drawable.a.m(r03, r2);
        r03.setAlpha(0);
        this.alphas = new float[2];
        return;
    L13:
        r42 = 3;
        goto L14
    L9:
        r03 = new EmptyDrawable(r02);
        goto L10
    L5:
        r1 = new EmptyDrawable(r02);
        goto L6
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r2) {
        this.fadeOutDrawable.draw(r2);
        this.fadeInDrawable.draw(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.fadeOutDrawable.getIntrinsicHeight(), this.fadeInDrawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.fadeOutDrawable.getMinimumWidth(), this.fadeInDrawable.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.fadeOutDrawable.isStateful() == false) goto L5;
        return true;
    L5:
        if (this.fadeInDrawable.isStateful() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
        if (this.progress > 0.5f) goto L5;
        this.fadeOutDrawable.setAlpha(r3);
        this.fadeInDrawable.setAlpha(0);
    L6:
        invalidateSelf();
        return;
    L5:
        this.fadeOutDrawable.setAlpha(0);
        this.fadeInDrawable.setAlpha(r3);
        goto L6
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int r2, int r3, int r4, int r5) {
        super.setBounds(r2, r3, r4, r5);
        this.fadeOutDrawable.setBounds(r2, r3, r4, r5);
        this.fadeInDrawable.setBounds(r2, r3, r4, r5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r2) {
        this.fadeOutDrawable.setColorFilter(r2);
        this.fadeInDrawable.setColorFilter(r2);
        invalidateSelf();
    }

    public void setProgress(float r4) {
        if (this.progress == r4) goto L6;
        this.progress = r4;
        FadeThroughUtils.calculateFadeOutAndInAlphas(r4, this.alphas);
        this.fadeOutDrawable.setAlpha((int) (this.alphas[0] * 255.0f));
        this.fadeInDrawable.setAlpha((int) (this.alphas[1] * 255.0f));
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r3) {
        boolean r02 = this.fadeOutDrawable.setState(r3);
        boolean r32 = this.fadeInDrawable.setState(r3);
        if (r02 == true) goto L8;
        if (r32 == true) goto L10;
        return false;
    L10:
        return true;
    L8:
        return true;
    }
}
