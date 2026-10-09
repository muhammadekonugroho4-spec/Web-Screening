package com.stockbit.userauthcontract;

import android.content.Context;
import android.content.Intent;
import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes2.dex */
public interface c {
    static /* synthetic */ ModularNavParam c(c r02, boolean r1, String r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = true;
    L7:
        if ((r3 & 2) == 0) goto L10;
        r2 = "RC_PIN_LOGIN";
    L10:
        return r02.a(r1, r2);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSecuritiesPinLoginNavParam");
    }

    static /* synthetic */ ModularNavParam f(c r2, String r3, String r4, int r5, String r6, String r7, int r8, boolean r9, boolean r10, int r11, Object r12) {
        if (r12 != null) goto L27;
        if ((r11 & 2) == 0) goto L7;
        r4 = null;
    L7:
        if ((r11 & 4) == 0) goto L10;
        r5 = 0;
    L10:
        if ((r11 & 8) == 0) goto L13;
        r6 = null;
    L13:
        if ((r11 & 16) == 0) goto L16;
        r7 = null;
    L16:
        if ((r11 & 32) == 0) goto L19;
        r8 = 0;
    L19:
        if ((r11 & 64) == 0) goto L22;
        r9 = false;
    L22:
        if ((r11 & 128) == 0) goto L25;
        r10 = false;
    L25:
        return r2.e(r3, r4, r5, r6, r7, r8, r9, r10);
    L27:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSecuritiesPinValidationNavParam");
    }

    static /* synthetic */ Intent g(c r02, Context r1, boolean r2, String r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = true;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = "RC_PIN_LOGIN";
    L10:
        return r02.d(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSecuritiesPinLoginIntent");
    }

    ModularNavParam a(boolean r1, String r2);

    ModularNavParam b(String r1, String r2, String r3, String r4);

    Intent d(Context r1, boolean r2, String r3);

    ModularNavParam e(String r1, String r2, int r3, String r4, String r5, int r6, boolean r7, boolean r8);
}
