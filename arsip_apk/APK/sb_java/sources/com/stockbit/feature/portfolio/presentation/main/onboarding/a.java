package com.stockbit.feature.portfolio.presentation.main.onboarding;

/* loaded from: classes9.dex */
public interface a {
    static /* synthetic */ void U2(a r02, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r02.m1(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeNextOnBoardingQueue");
    }

    void m1(boolean r1);
}
