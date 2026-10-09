package com.stockbit.tipping.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes11.dex */
public interface b {
    static /* synthetic */ ModularNavParam a(b r1, String r2, String r3, String r4, TippingType r5, String r6, String r7, int r8, int r9, Object r10) {
        if (r10 != null) goto L15;
        if ((r9 & 16) == 0) goto L7;
        r6 = null;
    L7:
        if ((r9 & 32) == 0) goto L10;
        r7 = null;
    L10:
        if ((r9 & 64) == 0) goto L13;
        r8 = 0;
    L13:
        return r1.getTippingNavParam(r2, r3, r4, r5, r6, r7, r8);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTippingNavParam");
    }

    ModularNavParam getMyTipJarNavParam();

    ModularNavParam getTippingNavParam(String r1, String r2, String r3, TippingType r4, String r5, String r6, int r7);

    ModularNavParam getTippingNotificationClaimNavParam(long r1);

    ModularNavParam getTippingNotificationReceiveNavParam(boolean r1, long r2);
}
