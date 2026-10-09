package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class e {
    public static Animator a(Context r02, int r1) {
        return AnimatorInflater.loadAnimator(r02, r1);
    }
}
