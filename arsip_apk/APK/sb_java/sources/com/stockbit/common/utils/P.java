package com.stockbit.common.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes7.dex */
public final class P extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final View f61906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61908c;

    static {
    }

    public P(View r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "view");
        this.f61906a = r2;
        this.f61907b = r3;
        this.f61908c = r4;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float r4, Transformation r5) {
        kotlin.jvm.internal.p.l(r5, Constants.KEY_T);
        if (this.f61907b != 0) goto L5;
    L8:
        this.f61906a.getLayoutParams().height = (int) (this.f61907b + ((this.f61908c - r0) * r4));
    L9:
        this.f61906a.requestLayout();
        return;
    L5:
        if (this.f61908c == 0) goto L8;
        this.f61906a.getLayoutParams().height = (int) (this.f61907b + (this.f61908c * r4));
        goto L9
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
