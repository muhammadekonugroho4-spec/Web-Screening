package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes5.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    private AnimatorSet currentAnimation;

    public ExpandableTransformationBehavior() {
    }

    public static /* synthetic */ AnimatorSet access$002(ExpandableTransformationBehavior r02, AnimatorSet r1) {
        r02.currentAnimation = r1;
        return r1;
    }

    public abstract AnimatorSet onCreateExpandedStateChangeAnimation(View r1, View r2, boolean r3, boolean r4);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean onExpandedStateChange(View r4, View r5, boolean r6, boolean r7) {
        AnimatorSet r02 = this.currentAnimation;
        if (r02 == null) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        r02.cancel();
    L8:
        AnimatorSet r42 = onCreateExpandedStateChangeAnimation(r4, r5, r6, r2);
        this.currentAnimation = r42;
        r42.addListener(new AnonymousClass1(this));
        this.currentAnimation.start();
        if (r7 == true) goto L11;
        this.currentAnimation.end();
    L11:
        return true;
    L5:
        r2 = false;
        goto L6
    }

    public ExpandableTransformationBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
