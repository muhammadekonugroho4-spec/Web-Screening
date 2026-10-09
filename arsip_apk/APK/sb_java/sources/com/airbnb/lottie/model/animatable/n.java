package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final List f31259a;

    public n(List r1) {
        this.f31259a = r1;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean h() {
        if (this.f31259a.isEmpty() == false) goto L5;
    L10:
        return true;
    L5:
        if (this.f31259a.size() == 1) goto L7;
    L9:
        return false;
    L7:
        if (((com.airbnb.lottie.value.a) this.f31259a.get(0)).h() == false) goto L9;
        goto L9
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List j() {
        return this.f31259a;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        if (this.f31259a.isEmpty() == true) goto L6;
        r02.append("values=");
        r02.append(Arrays.toString(this.f31259a.toArray()));
    L6:
        return r02.toString();
    }
}
