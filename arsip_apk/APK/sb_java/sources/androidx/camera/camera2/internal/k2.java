package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C2254d;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes.dex */
public class k2 implements androidx.camera.core.H0 {

    /* renamed from: a, reason: collision with root package name */
    public float f4548a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4549b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4550c;
    public float d;

    public k2(float r1, float r2) {
        this.f4549b = r1;
        this.f4550c = r2;
    }

    @Override // androidx.camera.core.H0
    public float a() {
        return this.f4549b;
    }

    @Override // androidx.camera.core.H0
    public float b() {
        return this.d;
    }

    @Override // androidx.camera.core.H0
    public float c() {
        return this.f4550c;
    }

    @Override // androidx.camera.core.H0
    public float d() {
        return this.f4548a;
    }

    public void e(float r4) {
        float r02 = this.f4549b;
        if (r4 > r02) goto L9;
        float r1 = this.f4550c;
        if (r4 < r1) goto L9;
        this.f4548a = r4;
        this.d = C2254d.u(r4, r1, r02);
        return;
    L9:
        throw new IllegalArgumentException("Requested zoomRatio " + r4 + " is not within valid range [" + this.f4550c + " , " + this.f4549b + Constants.AES_SUFFIX);
    }
}
