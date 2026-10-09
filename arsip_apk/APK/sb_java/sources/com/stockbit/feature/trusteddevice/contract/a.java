package com.stockbit.feature.trusteddevice.contract;

import android.content.Context;
import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes9.dex */
public interface a {
    static /* synthetic */ ModularNavParam a(a r7, String r8, PromptType r9, String r10, String r11, String r12, String r13, int r14, Object r15) {
        if (r15 != null) goto L26;
        if ((r14 & 2) == 0) goto L6;
        r9 = PromptType.NEW_LOGIN;
    L6:
        PromptType r2 = r9;
        if ((r14 & 4) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r14 & 8) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r14 & 16) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r14 & 32) == 0) goto L22;
        String r6 = null;
    L24:
        return r7.getTrustedDevicePromptNavParam(r8, r2, r3, r4, r5, r6);
    L22:
        r6 = r13;
        goto L24
    L17:
        r5 = r12;
        goto L19
    L13:
        r4 = r11;
        goto L15
    L9:
        r3 = r10;
        goto L11
    L26:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrustedDevicePromptNavParam");
    }

    ModularNavParam getConfirmationChangeTrustedDeviceNavParam();

    ModularNavParam getLoginWaitingApprovalNavParam(String r1, String r2, String r3);

    ModularNavParam getOnboardingSetupTrustedDeviceNavParam();

    ModularNavParam getTrustedDevicePromptNavParam(String r1, PromptType r2, String r3, String r4, String r5, String r6);

    ModularNavParam getTrustedDeviceRemoveCompletionNavParam(String r1);

    ModularNavParam getTrustedDeviceSetupAlreadyUsedNavParam();

    ModularNavParam getTrustedDeviceSetupErrorNoSecuritiesAccountNavParam();

    ModularNavParam getTrustedDeviceSetupErrorPendingKycNavParam();

    ModularNavParam getTrustedDeviceSetupNextNavParam(String r1);

    void openTrustedDevicePromptDeeplink(Context r1, String r2);
}
