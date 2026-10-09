package com.fingerprintjs.android.fingerprint.info_providers;

import android.app.ActivityManager;

/* loaded from: classes4.dex */
public final class GpuInfoProviderImpl implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f37295a;

    public GpuInfoProviderImpl(ActivityManager r2) {
        kotlin.jvm.internal.p.l(r2, "activityManager");
        this.f37295a = r2;
    }

    public static final /* synthetic */ ActivityManager b(GpuInfoProviderImpl r02) {
        return r02.f37295a;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.k
    public String a() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new GpuInfoProviderImpl$glesVersion$1(this), "");
    }
}
