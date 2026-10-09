package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public abstract class b {
    Animatable2.AnimationCallback mPlatformCallback;

    public class a extends Animatable2.AnimationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f28484a;

        public a(b r1) {
            this.f28484a = r1;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable r2) {
            this.f28484a.onAnimationEnd(r2);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable r2) {
            this.f28484a.onAnimationStart(r2);
        }
    }

    public b() {
    }

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback != null) goto L6;
        this.mPlatformCallback = new a(this);
    L6:
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable r1) {
    }

    public void onAnimationStart(Drawable r1) {
    }
}
