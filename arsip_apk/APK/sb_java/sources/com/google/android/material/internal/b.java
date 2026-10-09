package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements MultiViewUpdateListener.Listener {
    public /* synthetic */ b() {
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator r1, View r2) {
        MultiViewUpdateListener.d(r1, r2);
    }
}
