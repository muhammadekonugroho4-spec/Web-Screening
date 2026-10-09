package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes4.dex */
public class e extends g {

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.d f31019i;

    public e(List r3) {
        super(r3);
        int r02 = 0;
        com.airbnb.lottie.model.content.d r32 = (com.airbnb.lottie.model.content.d) ((com.airbnb.lottie.value.a) r3.get(0)).f31632b;
        if (r32 == null) goto L6;
        r02 = r32.c();
    L6:
        this.f31019i = new com.airbnb.lottie.model.content.d(new float[r02], new int[r02]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public /* bridge */ /* synthetic */ Object i(com.airbnb.lottie.value.a r1, float r2) {
        return p(r1, r2);
    }

    public com.airbnb.lottie.model.content.d p(com.airbnb.lottie.value.a r3, float r4) {
        this.f31019i.d((com.airbnb.lottie.model.content.d) r3.f31632b, (com.airbnb.lottie.model.content.d) r3.f31633c, r4);
        return this.f31019i;
    }
}
