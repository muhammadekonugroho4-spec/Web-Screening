package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.github.mikephil.charting.animation.Easing;

/* loaded from: classes4.dex */
public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseX;
    protected float mPhaseY;

    public ChartAnimator() {
        this.mPhaseY = 1.0f;
        this.mPhaseX = 1.0f;
    }

    private ObjectAnimator xAnimator(int r3, Easing.EasingFunction r4) {
        ObjectAnimator r02 = ObjectAnimator.ofFloat(this, "phaseX", new float[]{0.0f, 1.0f});
        r02.setInterpolator(r4);
        r02.setDuration(r3);
        return r02;
    }

    private ObjectAnimator yAnimator(int r3, Easing.EasingFunction r4) {
        ObjectAnimator r02 = ObjectAnimator.ofFloat(this, "phaseY", new float[]{0.0f, 1.0f});
        r02.setInterpolator(r4);
        r02.setDuration(r3);
        return r02;
    }

    public void animateX(int r2) {
        animateX(r2, Easing.Linear);
    }

    public void animateXY(int r2, int r3) {
        Easing.EasingFunction r02 = Easing.Linear;
        animateXY(r2, r3, r02, r02);
    }

    public void animateY(int r2) {
        animateY(r2, Easing.Linear);
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float r3) {
        float r02 = 1.0f;
        if (r3 <= 1.0f) goto L5;
    L4:
        r3 = r02;
    L8:
        this.mPhaseX = r3;
        return;
    L5:
        r02 = 0.0f;
        if (r3 >= 0.0f) goto L8;
        goto L8
    }

    public void setPhaseY(float r3) {
        float r02 = 1.0f;
        if (r3 <= 1.0f) goto L5;
    L4:
        r3 = r02;
    L8:
        this.mPhaseY = r3;
        return;
    L5:
        r02 = 0.0f;
        if (r3 >= 0.0f) goto L8;
        goto L8
    }

    public void animateX(int r1, Easing.EasingFunction r2) {
        ObjectAnimator r12 = xAnimator(r1, r2);
        r12.addUpdateListener(this.mListener);
        r12.start();
    }

    public void animateXY(int r2, int r3, Easing.EasingFunction r4) {
        ObjectAnimator r02 = xAnimator(r2, r4);
        ObjectAnimator r42 = yAnimator(r3, r4);
        if (r2 <= r3) goto L5;
        r02.addUpdateListener(this.mListener);
    L6:
        r02.start();
        r42.start();
        return;
    L5:
        r42.addUpdateListener(this.mListener);
        goto L6
    }

    public void animateY(int r1, Easing.EasingFunction r2) {
        ObjectAnimator r12 = yAnimator(r1, r2);
        r12.addUpdateListener(this.mListener);
        r12.start();
    }

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener r2) {
        this.mPhaseY = 1.0f;
        this.mPhaseX = 1.0f;
        this.mListener = r2;
    }

    public void animateXY(int r1, int r2, Easing.EasingFunction r3, Easing.EasingFunction r4) {
        ObjectAnimator r32 = xAnimator(r1, r3);
        ObjectAnimator r42 = yAnimator(r2, r4);
        if (r1 <= r2) goto L5;
        r32.addUpdateListener(this.mListener);
    L6:
        r32.start();
        r42.start();
        return;
    L5:
        r42.addUpdateListener(this.mListener);
        goto L6
    }
}
