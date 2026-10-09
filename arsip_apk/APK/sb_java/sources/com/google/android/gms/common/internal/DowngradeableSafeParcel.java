package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
/* loaded from: classes5.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = null;
    private boolean zzb;

    static {
        zza = new Object();
    }

    public DowngradeableSafeParcel() {
        this.zzb = false;
    }

    @KeepForSdk
    public static boolean canUnparcelSafely(String r1) {
        Object r12 = zza;
        monitor-enter(r12);
        monitor-exit(r12);     // Catch: Throwable -> L7
        return true;
    L7:
        th = move-exception;
        throw th;
    }

    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        Object r02 = zza;
        monitor-enter(r02);
        monitor-exit(r02);     // Catch: Throwable -> L7
        return null;
    L7:
        th = move-exception;
        throw th;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int r1);

    @KeepForSdk
    public void setShouldDowngrade(boolean r1) {
        this.zzb = r1;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
