package androidx.core.view.animation;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: androidx.core.view.animation.a$a, reason: collision with other inner class name */
    public static class C0172a {
        public static Interpolator a(float r1, float r2, float r3, float r4) {
            return new PathInterpolator(r1, r2, r3, r4);
        }
    }

    public static Interpolator a(float r02, float r1, float r2, float r3) {
        return C0172a.a(r02, r1, r2, r3);
    }
}
