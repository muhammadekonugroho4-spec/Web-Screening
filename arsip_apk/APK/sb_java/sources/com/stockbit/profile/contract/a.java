package com.stockbit.profile.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ ModularNavParam a(a r1, String r2, String r3, String r4, String r5, boolean r6, int r7, Object r8) {
        if (r8 != null) goto L18;
        if ((r7 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r7 & 4) == 0) goto L10;
        r4 = null;
    L10:
        if ((r7 & 8) == 0) goto L13;
        r5 = null;
    L13:
        if ((r7 & 16) == 0) goto L16;
        r6 = false;
    L16:
        return r1.getProfileNavParam(r2, r3, r4, r5, r6);
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfileNavParam");
    }

    ModularNavParam getEditProfileNavParam();

    ModularNavParam getProfileNavParam(String r1, String r2, String r3, String r4, boolean r5);
}
