package com.stockbit.verification.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes2.dex */
public interface a {
    static /* synthetic */ ModularNavParam b(a r02, String r1, com.stockbit.usecase.verification.model.a r2, VerificationEntryMode r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = VerificationEntryMode.FROM_CHALLENGE;
    L7:
        return r02.a(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextChallengeNavParam");
    }

    ModularNavParam a(String r1, com.stockbit.usecase.verification.model.a r2, VerificationEntryMode r3);
}
