package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int r2) {
        this.slideDistance = -1;
        this.slideEdge = r2;
    }

    private static Animator createTranslationAppearAnimator(View r3, View r4, int r5, int r6) {
        float r02 = r4.getTranslationX();
        float r1 = r4.getTranslationY();
        if (r5 == 3) goto L35;
        if (r5 == 5) goto L33;
        if (r5 == 48) goto L31;
        if (r5 == 80) goto L29;
        if (r5 == 8388611) goto L23;
        if (r5 != 8388613) goto L21;
        if (isRtl(r3) == false) goto L17;
        float r32 = r02 - r6;
    L19:
        return createTranslationXAnimator(r4, r32, r02, r02);
    L17:
        r32 = r6 + r02;
        goto L19
    L21:
        throw new IllegalArgumentException("Invalid slide direction: " + r5);
    L23:
        if (isRtl(r3) == false) goto L25;
        float r33 = r6 + r02;
    L27:
        return createTranslationXAnimator(r4, r33, r02, r02);
    L25:
        r33 = r02 - r6;
        goto L27
    L29:
        return createTranslationYAnimator(r4, r6 + r1, r1, r1);
    L31:
        return createTranslationYAnimator(r4, r1 - r6, r1, r1);
    L33:
        return createTranslationXAnimator(r4, r02 - r6, r02, r02);
    L35:
        return createTranslationXAnimator(r4, r6 + r02, r02, r02);
    }

    private static Animator createTranslationDisappearAnimator(View r3, View r4, int r5, int r6) {
        float r02 = r4.getTranslationX();
        float r1 = r4.getTranslationY();
        if (r5 == 3) goto L35;
        if (r5 == 5) goto L33;
        if (r5 == 48) goto L31;
        if (r5 == 80) goto L29;
        if (r5 == 8388611) goto L23;
        if (r5 != 8388613) goto L21;
        if (isRtl(r3) == false) goto L17;
        float r32 = r6 + r02;
    L19:
        return createTranslationXAnimator(r4, r02, r32, r02);
    L17:
        r32 = r02 - r6;
        goto L19
    L21:
        throw new IllegalArgumentException("Invalid slide direction: " + r5);
    L23:
        if (isRtl(r3) == false) goto L25;
        float r33 = r02 - r6;
    L27:
        return createTranslationXAnimator(r4, r02, r33, r02);
    L25:
        r33 = r6 + r02;
        goto L27
    L29:
        return createTranslationYAnimator(r4, r1, r1 - r6, r1);
    L31:
        return createTranslationYAnimator(r4, r1, r6 + r1, r1);
    L33:
        return createTranslationXAnimator(r4, r02, r6 + r02, r02);
    L35:
        return createTranslationXAnimator(r4, r02, r02 - r6, r02);
    }

    private static Animator createTranslationXAnimator(final View r3, float r4, float r5, final float r6) {
        ObjectAnimator r42 = ObjectAnimator.ofPropertyValuesHolder(r3, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{r4, r5})});
        r42.addListener(new AnonymousClass1(r3, r6));
        return r42;
    }

    private static Animator createTranslationYAnimator(final View r3, float r4, float r5, final float r6) {
        ObjectAnimator r42 = ObjectAnimator.ofPropertyValuesHolder(r3, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{r4, r5})});
        r42.addListener(new AnonymousClass2(r3, r6));
        return r42;
    }

    private int getSlideDistanceOrDefault(Context r3) {
        int r02 = this.slideDistance;
        if (r02 == (-1)) goto L6;
        return r02;
    L6:
        return r3.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View r1) {
        if (r1.getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup r3, View r4) {
        return createTranslationAppearAnimator(r3, r4, this.slideEdge, getSlideDistanceOrDefault(r4.getContext()));
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup r3, View r4) {
        return createTranslationDisappearAnimator(r3, r4, this.slideEdge, getSlideDistanceOrDefault(r4.getContext()));
    }

    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(int r2) {
        if (r2 < 0) goto L6;
        this.slideDistance = r2;
        return;
    L6:
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int r1) {
        this.slideEdge = r1;
    }
}
