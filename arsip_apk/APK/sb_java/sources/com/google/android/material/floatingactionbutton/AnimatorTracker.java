package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* loaded from: classes5.dex */
class AnimatorTracker {
    private Animator currentAnimator;

    public AnimatorTracker() {
    }

    public void cancelCurrent() {
        Animator r02 = this.currentAnimator;
        if (r02 == null) goto L6;
        r02.cancel();
        return;
    }

    public void clear() {
        this.currentAnimator = null;
    }

    public void onNextAnimationStart(Animator r1) {
        cancelCurrent();
        this.currentAnimator = r1;
    }
}
