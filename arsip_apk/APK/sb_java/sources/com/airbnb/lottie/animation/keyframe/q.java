package com.airbnb.lottie.animation.keyframe;

import java.util.Collections;

/* loaded from: classes4.dex */
public class q extends a {

    /* renamed from: i, reason: collision with root package name */
    public final Object f31052i;

    public q(com.airbnb.lottie.value.c r2) {
        this(r2, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public Object h() {
        com.airbnb.lottie.value.c r02 = this.f31003e;
        Object r3 = this.f31052i;
        return r02.b(0.0f, 0.0f, r3, r3, f(), f(), f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public Object i(com.airbnb.lottie.value.a r1, float r2) {
        return h();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void k() {
        if (this.f31003e == null) goto L6;
        super.k();
        return;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float r1) {
        this.d = r1;
    }

    public q(com.airbnb.lottie.value.c r2, Object r3) {
        super(Collections.EMPTY_LIST);
        n(r2);
        this.f31052i = r3;
    }
}
