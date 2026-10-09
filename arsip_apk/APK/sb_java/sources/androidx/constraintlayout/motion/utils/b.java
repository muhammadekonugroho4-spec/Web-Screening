package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.k;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.motion.widget.n;

/* loaded from: classes.dex */
public class b extends n {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.n f21671a;

    /* renamed from: b, reason: collision with root package name */
    public k f21672b;

    /* renamed from: c, reason: collision with root package name */
    public m f21673c;

    public b() {
        androidx.constraintlayout.core.motion.utils.n r02 = new androidx.constraintlayout.core.motion.utils.n();
        this.f21671a = r02;
        this.f21673c = r02;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public float a() {
        return this.f21673c.a();
    }

    public void b(float r8, float r9, float r10, float r11, float r12, float r13) {
        androidx.constraintlayout.core.motion.utils.n r02 = this.f21671a;
        this.f21673c = r02;
        r02.d(r8, r9, r10, r11, r12, r13);
    }

    public boolean c() {
        return this.f21673c.b();
    }

    public void d(float r11, float r12, float r13, float r14, float r15, float r16, float r17, int r18) {
        if (this.f21672b != null) goto L5;
        this.f21672b = new k();
    L5:
        k r1 = this.f21672b;
        this.f21673c = r1;
        r1.d(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r2) {
        return this.f21673c.getInterpolation(r2);
    }
}
