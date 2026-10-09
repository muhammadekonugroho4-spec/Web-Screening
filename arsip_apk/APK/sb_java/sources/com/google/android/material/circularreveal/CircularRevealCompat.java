package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* loaded from: classes5.dex */
public final class CircularRevealCompat {
    private CircularRevealCompat() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator createCircularReveal(CircularRevealWidget r3, float r4, float r5, float r6) {
        ObjectAnimator r02 = ObjectAnimator.ofObject(r3, CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(r4, r5, r6)});
        CircularRevealWidget.RevealInfo r1 = r3.getRevealInfo();
        if (r1 == null) goto L7;
        Animator r32 = ViewAnimationUtils.createCircularReveal((View) r3, (int) r4, (int) r5, r1.radius, r6);
        AnimatorSet r42 = new AnimatorSet();
        r42.playTogether(new Animator[]{r02, r32});
        return r42;
    L7:
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener createCircularRevealListener(final CircularRevealWidget r1) {
        return new AnonymousClass1(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator createCircularReveal(CircularRevealWidget r4, float r5, float r6, float r7, float r8) {
        ObjectAnimator r02 = ObjectAnimator.ofObject(r4, CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(r5, r6, r7), new CircularRevealWidget.RevealInfo(r5, r6, r8)});
        Animator r42 = ViewAnimationUtils.createCircularReveal((View) r4, (int) r5, (int) r6, r7, r8);
        AnimatorSet r52 = new AnimatorSet();
        r52.playTogether(new Animator[]{r02, r42});
        return r52;
    }
}
