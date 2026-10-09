package com.stockbit.userauthcontract.pin.login;

import kotlin.coroutines.e;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;

/* loaded from: classes2.dex */
public interface d {
    static /* synthetic */ void c2(d r02, boolean r1, p r2, String r3, l r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 4) == 0) goto L7;
        r3 = "RC_PIN_LOGIN";
    L7:
        if ((r5 & 8) == 0) goto L9;
        r4 = null;
    L9:
        r02.D0(r1, r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSecuritiesPinLogin");
    }

    static /* synthetic */ Object s1(d r1, boolean r2, p r3, kotlin.jvm.functions.a r4, String r5, l r6, e r7, int r8, Object r9) {
        if (r9 != null) goto L18;
        if ((r8 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r8 & 4) == 0) goto L10;
        r4 = null;
    L10:
        if ((r8 & 8) == 0) goto L13;
        r5 = "RC_PIN_LOGIN";
    L13:
        if ((r8 & 16) == 0) goto L16;
        r6 = null;
    L16:
        return r1.i1(r2, r3, r4, r5, r6, r7);
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requireSecuritiesLogin");
    }

    void D0(boolean r1, p r2, String r3, l r4);

    Object F1(e r1);

    Object O2(e r1);

    Object Y1(boolean r1, e r2);

    void Z1();

    Object i1(boolean r1, p r2, kotlin.jvm.functions.a r3, String r4, l r5, e r6);
}
