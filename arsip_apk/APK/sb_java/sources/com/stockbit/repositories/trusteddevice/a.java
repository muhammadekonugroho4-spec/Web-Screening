package com.stockbit.repositories.trusteddevice;

import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    Object a(String r1, String r2, e r3);

    Object b(String r1, String r2, e r3);

    Object c(String r1, String r2, e r3);

    Object cancelSetup(String r1, e r2);

    Object d(String r1, String r2, e r3);

    Object e(String r1, String r2, e r3);

    Object f(String r1, String r2, e r3);

    Object g(String r1, String r2, String r3, e r4);

    Object getPromptDetailPending(e r1);

    Object getPromptResult(String r1, e r2);

    Object getTrustedDeviceStatus(e r1);

    Object h(String r1, String r2, String r3, boolean r4, e r5);

    Object i(String r1, String r2, e r3);

    Object initRemoveTrustedDevice(e r1);

    Object j(String r1, String r2, e r3);

    Object k(String r1, String r2, String r3, e r4);

    Object l(String r1, e r2);

    Object m(com.stockbit.domain.param.trusteddevice.a r1, e r2);

    Object requestChangeTrustedDevice(e r1);

    Object setTrustedDeviceOnboardingClosed(e r1);

    Object setupTrustedDevice(e r1);
}
