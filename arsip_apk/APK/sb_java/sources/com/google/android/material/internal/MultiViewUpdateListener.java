package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collection;

/* loaded from: classes5.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final Listener listener;
    private final View[] views;

    public interface Listener {
        void onAnimationUpdate(ValueAnimator r1, View r2);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(Listener r1, View... r2) {
        this.listener = r1;
        this.views = r2;
    }

    public static /* synthetic */ void a(ValueAnimator r02, View r1) {
        setScale(r02, r1);
    }

    public static MultiViewUpdateListener alphaListener(View... r2) {
        return new MultiViewUpdateListener(new e(), r2);
    }

    public static /* synthetic */ void b(ValueAnimator r02, View r1) {
        setTranslationY(r02, r1);
    }

    public static /* synthetic */ void c(ValueAnimator r02, View r1) {
        setAlpha(r02, r1);
    }

    public static /* synthetic */ void d(ValueAnimator r02, View r1) {
        setTranslationX(r02, r1);
    }

    public static MultiViewUpdateListener scaleListener(View... r2) {
        return new MultiViewUpdateListener(new c(), r2);
    }

    private static void setAlpha(ValueAnimator r02, View r1) {
        r1.setAlpha(((Float) r02.getAnimatedValue()).floatValue());
    }

    private static void setScale(ValueAnimator r1, View r2) {
        Float r12 = (Float) r1.getAnimatedValue();
        r2.setScaleX(r12.floatValue());
        r2.setScaleY(r12.floatValue());
    }

    private static void setTranslationX(ValueAnimator r02, View r1) {
        r1.setTranslationX(((Float) r02.getAnimatedValue()).floatValue());
    }

    private static void setTranslationY(ValueAnimator r02, View r1) {
        r1.setTranslationY(((Float) r02.getAnimatedValue()).floatValue());
    }

    public static MultiViewUpdateListener translationXListener(View... r2) {
        return new MultiViewUpdateListener(new b(), r2);
    }

    public static MultiViewUpdateListener translationYListener(View... r2) {
        return new MultiViewUpdateListener(new d(), r2);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator r6) {
        View[] r02 = this.views;
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        View r3 = r02[r2];
        this.listener.onAnimationUpdate(r6, r3);
        r2 = r2 + 1;
        goto L3
    }

    public static MultiViewUpdateListener alphaListener(Collection<View> r2) {
        return new MultiViewUpdateListener(new e(), r2);
    }

    public static MultiViewUpdateListener scaleListener(Collection<View> r2) {
        return new MultiViewUpdateListener(new c(), r2);
    }

    public static MultiViewUpdateListener translationXListener(Collection<View> r2) {
        return new MultiViewUpdateListener(new b(), r2);
    }

    public static MultiViewUpdateListener translationYListener(Collection<View> r2) {
        return new MultiViewUpdateListener(new d(), r2);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(Listener r1, Collection<View> r2) {
        this.listener = r1;
        this.views = (View[]) r2.toArray(new View[0]);
    }
}
