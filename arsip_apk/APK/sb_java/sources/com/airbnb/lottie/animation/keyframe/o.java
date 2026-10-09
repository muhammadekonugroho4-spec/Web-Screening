package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* loaded from: classes4.dex */
public class o extends g {
    public o(List r1) {
        super(r1);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public /* bridge */ /* synthetic */ Object i(com.airbnb.lottie.value.a r1, float r2) {
        return p(r1, r2);
    }

    public DocumentData p(com.airbnb.lottie.value.a r2, float r3) {
        if (r3 != 1.0f) goto L10;
        Object r32 = r2.f31633c;
        if (r32 == null) goto L10;
        return (DocumentData) r32;
    L10:
        return (DocumentData) r2.f31632b;
    }
}
