package com.stockbit.notif.utils.notificationmenu;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes10.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public LottieAnimationView f122955a;

    public b(View r2) {
        if (r2 == null) goto L5;
        LottieAnimationView r22 = (LottieAnimationView) r2.findViewById(com.stockbit.notif.e.f122776i);
    L6:
        this.f122955a = r22;
        return;
    L5:
        r22 = null;
        goto L6
    }

    @Override // com.stockbit.notif.utils.notificationmenu.c
    public View a() {
        return this.f122955a;
    }
}
