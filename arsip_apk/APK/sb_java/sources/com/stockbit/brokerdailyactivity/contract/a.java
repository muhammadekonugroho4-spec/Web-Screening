package com.stockbit.brokerdailyactivity.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes7.dex */
public interface a {
    static /* synthetic */ ModularNavParam b(a r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, int r12, Object r13) {
        if (r13 != null) goto L33;
        if ((r12 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r12 & 4) == 0) goto L10;
        r4 = null;
    L10:
        if ((r12 & 8) == 0) goto L13;
        r5 = null;
    L13:
        if ((r12 & 16) == 0) goto L16;
        r6 = null;
    L16:
        if ((r12 & 32) == 0) goto L19;
        r7 = null;
    L19:
        if ((r12 & 64) == 0) goto L22;
        r8 = null;
    L22:
        if ((r12 & 128) == 0) goto L25;
        r9 = null;
    L25:
        if ((r12 & 256) == 0) goto L28;
        r10 = null;
    L28:
        if ((r12 & 512) == 0) goto L31;
        r11 = null;
    L31:
        return r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    L33:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBrokerDailyActivityNavParam");
    }

    ModularNavParam a(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10);
}
