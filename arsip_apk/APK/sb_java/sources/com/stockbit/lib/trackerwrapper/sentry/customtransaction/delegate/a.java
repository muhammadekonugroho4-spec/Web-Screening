package com.stockbit.lib.trackerwrapper.sentry.customtransaction.delegate;

import com.stockbit.lib.trackerwrapper.sentry.customtransaction.c;
import io.sentry.AbstractC11588f2;
import java.util.Map;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ c J0(a r8, String r9, String r10, String r11, Map r12, boolean r13, boolean r14, AbstractC11588f2 r15, int r16, Object r17) {
        if (r17 != null) goto L23;
        if ((r16 & 4) == 0) goto L6;
        r11 = "ui.load";
    L6:
        String r3 = r11;
        if ((r16 & 8) == 0) goto L9;
        Map r4 = null;
    L11:
        if ((r16 & 16) == 0) goto L13;
        r13 = true;
    L13:
        boolean r5 = r13;
        if ((r16 & 32) == 0) goto L16;
        r14 = false;
    L16:
        boolean r6 = r14;
        if ((r16 & 64) == 0) goto L19;
        AbstractC11588f2 r7 = null;
        String r1 = r9;
        String r2 = r10;
        a r02 = r8;
    L21:
        return r02.N(r1, r2, r3, r4, r5, r6, r7);
    L19:
        r7 = r15;
        r02 = r8;
        r1 = r9;
        r2 = r10;
        goto L21
    L9:
        r4 = r12;
        goto L11
    L23:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSentryTransaction");
    }

    c N(String r1, String r2, String r3, Map r4, boolean r5, boolean r6, AbstractC11588f2 r7);
}
