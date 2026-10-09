package com.stockbit.common.utils.security;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;
import kotlin.w;

/* loaded from: classes7.dex */
public interface d {
    static /* synthetic */ Object a(d r02, l r1, kotlin.coroutines.e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = new c();
    L7:
        return r02.e(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirebaseInstallationId");
    }

    static /* synthetic */ w b(String r02) {
        return g(r02);
    }

    static w c(String r1) {
        p.l(r1, "it");
        return w.f180450a;
    }

    static /* synthetic */ w f(String r02) {
        return c(r02);
    }

    static w g(String r1) {
        p.l(r1, "it");
        return w.f180450a;
    }

    static /* synthetic */ Object h(d r02, l r1, kotlin.coroutines.e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = new b();
    L7:
        return r02.d(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeviceId");
    }

    Object d(l r1, kotlin.coroutines.e r2);

    Object e(l r1, kotlin.coroutines.e r2);
}
