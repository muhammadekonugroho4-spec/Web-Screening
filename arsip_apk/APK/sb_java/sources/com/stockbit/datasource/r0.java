package com.stockbit.datasource;

import com.stockbit.datasource.param.trusteddevice.RecoveryValidateIdentityDataParam;

/* loaded from: classes8.dex */
public interface r0 {
    Object a(String r1, String r2, kotlin.coroutines.e r3);

    Object b(String r1, String r2, kotlin.coroutines.e r3);

    Object c(String r1, String r2, kotlin.coroutines.e r3);

    Object cancelSetup(String r1, kotlin.coroutines.e r2);

    Object d(String r1, String r2, kotlin.coroutines.e r3);

    Object e(String r1, String r2, kotlin.coroutines.e r3);

    Object f(String r1, String r2, kotlin.coroutines.e r3);

    Object g(String r1, String r2, String r3, kotlin.coroutines.e r4);

    Object getPromptDetailPending(kotlin.coroutines.e r1);

    Object getPromptResult(String r1, kotlin.coroutines.e r2);

    Object getTrustedDeviceStatus(kotlin.coroutines.e r1);

    Object h(String r1, String r2, String r3, boolean r4, kotlin.coroutines.e r5);

    Object i(String r1, String r2, kotlin.coroutines.e r3);

    Object initRemoveTrustedDevice(kotlin.coroutines.e r1);

    Object j(String r1, String r2, kotlin.coroutines.e r3);

    Object k(String r1, String r2, String r3, kotlin.coroutines.e r4);

    Object l(String r1, kotlin.coroutines.e r2);

    Object requestChangeTrustedDevice(kotlin.coroutines.e r1);

    Object setTrustedDeviceOnboardingClosed(kotlin.coroutines.e r1);

    Object setupTrustedDevice(kotlin.coroutines.e r1);

    Object validateRecoveryChangeIdentity(RecoveryValidateIdentityDataParam r1, kotlin.coroutines.e r2);
}
