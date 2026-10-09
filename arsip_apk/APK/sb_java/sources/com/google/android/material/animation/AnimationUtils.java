package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.a;
import androidx.interpolator.view.animation.b;
import androidx.interpolator.view.animation.c;

/* loaded from: classes5.dex */
public class AnimationUtils {
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = null;
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = null;
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = null;
    public static final TimeInterpolator LINEAR_INTERPOLATOR = null;
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = null;

    static {
        LINEAR_INTERPOLATOR = new LinearInterpolator();
        FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
        FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
        LINEAR_OUT_SLOW_IN_INTERPOLATOR = new c();
        DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    }

    public AnimationUtils() {
    }

    public static float lerp(float r02, float r1, float r2) {
        return r02 + (r2 * (r1 - r02));
    }

    public static int lerp(int r02, int r1, float r2) {
        return r02 + Math.round(r2 * (r1 - r02));
    }

    public static float lerp(float r1, float r2, float r3, float r4, float r5) {
        if (r5 > r3) goto L6;
        return r1;
    L6:
        if (r5 < r4) goto L9;
        return r2;
    L9:
        return lerp(r1, r2, (r5 - r3) / (r4 - r3));
    }
}
