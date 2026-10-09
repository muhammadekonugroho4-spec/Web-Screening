package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes4.dex */
public abstract class d {
    public static Interpolator a(Context r02, int r1) {
        return AnimationUtils.loadInterpolator(r02, r1);
    }
}
