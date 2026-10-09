package com.stockbit.withdrawaldeposit.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes2.dex */
public interface b {
    static /* synthetic */ ModularNavParam a(b r02, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = false;
    L7:
        return r02.openSettingDepositHistoryFragment(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSettingDepositHistoryFragment");
    }

    static /* synthetic */ ModularNavParam b(b r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, double r25, String r27, boolean r28, String r29, String r30, int r31, Object r32) {
        if (r32 != null) goto L48;
        if ((r31 & 1) == 0) goto L7;
        String r4 = "";
    L9:
        if ((r31 & 2) == 0) goto L11;
        String r5 = "";
    L13:
        if ((r31 & 4) == 0) goto L15;
        String r6 = "";
    L17:
        if ((r31 & 8) == 0) goto L19;
        String r7 = "";
    L21:
        if ((r31 & 16) == 0) goto L23;
        String r8 = "";
    L25:
        if ((r31 & 64) == 0) goto L27;
        String r10 = "";
    L29:
        if ((r31 & 128) == 0) goto L31;
        double r11 = 0.0d;
    L33:
        if ((r31 & 256) == 0) goto L35;
        String r13 = "";
    L37:
        if ((r31 & 512) == 0) goto L39;
        boolean r14 = false;
    L41:
        if ((r31 & 1024) == 0) goto L44;
        String r15 = "";
    L46:
        return r17.getWithdrawalDetailNavParam(r4, r5, r6, r7, r8, r23, r10, r11, r13, r14, r15, r30);
    L44:
        r15 = r29;
        goto L46
    L39:
        r14 = r28;
        goto L41
    L35:
        r13 = r27;
        goto L37
    L31:
        r11 = r25;
        goto L33
    L27:
        r10 = r24;
        goto L29
    L23:
        r8 = r22;
        goto L25
    L19:
        r7 = r21;
        goto L21
    L15:
        r6 = r20;
        goto L17
    L11:
        r5 = r19;
        goto L13
    L7:
        r4 = r18;
        goto L9
    L48:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithdrawalDetailNavParam");
    }

    ModularNavParam getWithdrawalDetailNavParam(String r1, String r2, String r3, String r4, String r5, String r6, String r7, double r8, String r10, boolean r11, String r12, String r13);

    ModularNavParam openSettingDepositFragment();

    ModularNavParam openSettingDepositHistoryFragment(boolean r1);

    ModularNavParam openWithdrawalFragment();
}
