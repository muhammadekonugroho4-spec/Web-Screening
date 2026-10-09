package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* loaded from: classes4.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f25513a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25514b;

    public d(float[] r2) {
        this.f25513a = r2;
        this.f25514b = 1.0f / (r2.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r4) {
        if (r4 < 1.0f) goto L6;
        return 1.0f;
    L6:
        if (r4 > 0.0f) goto L8;
        return 0.0f;
    L8:
        float[] r02 = this.f25513a;
        int r03 = Math.min((int) ((r02.length - 1) * r4), r02.length - 2);
        float r2 = this.f25514b;
        float r42 = (r4 - (r03 * r2)) / r2;
        float[] r1 = this.f25513a;
        float r22 = r1[r03];
        return r22 + (r42 * (r1[r03 + 1] - r22));
    }
}
