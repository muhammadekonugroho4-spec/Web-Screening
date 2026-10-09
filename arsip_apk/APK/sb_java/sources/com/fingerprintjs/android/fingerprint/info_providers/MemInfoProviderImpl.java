package com.fingerprintjs.android.fingerprint.info_providers;

import android.app.ActivityManager;
import android.os.StatFs;

/* loaded from: classes4.dex */
public final class MemInfoProviderImpl implements o {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f37297a;

    /* renamed from: b, reason: collision with root package name */
    public final StatFs f37298b;

    /* renamed from: c, reason: collision with root package name */
    public final StatFs f37299c;

    public MemInfoProviderImpl(ActivityManager r2, StatFs r3, StatFs r4) {
        kotlin.jvm.internal.p.l(r2, "activityManager");
        kotlin.jvm.internal.p.l(r3, "internalStorageStats");
        this.f37297a = r2;
        this.f37298b = r3;
        this.f37299c = r4;
    }

    public static final /* synthetic */ ActivityManager c(MemInfoProviderImpl r02) {
        return r02.f37297a;
    }

    public static final /* synthetic */ StatFs d(MemInfoProviderImpl r02) {
        return r02.f37298b;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.o
    public long a() {
        return ((Number) com.fingerprintjs.android.fingerprint.tools.a.a(new MemInfoProviderImpl$totalRAM$1(this), 0L)).longValue();
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.o
    public long b() {
        return ((Number) com.fingerprintjs.android.fingerprint.tools.a.a(new MemInfoProviderImpl$totalInternalStorageSpace$1(this), 0L)).longValue();
    }
}
