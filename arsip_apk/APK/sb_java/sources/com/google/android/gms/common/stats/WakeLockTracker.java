package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public class WakeLockTracker {
    private static final WakeLockTracker zza = null;

    static {
        zza = new WakeLockTracker();
    }

    public WakeLockTracker() {
    }

    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(Context r1, Intent r2, String r3, String r4, String r5, int r6, String r7) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(Context r1, String r2, String r3, String r4, int r5, List<String> r6, boolean r7, long r8) {
    }

    @KeepForSdk
    public void registerEvent(Context r1, String r2, int r3, String r4, String r5, String r6, int r7, List<String> r8) {
    }

    @KeepForSdk
    public void registerReleaseEvent(Context r1, Intent r2) {
    }

    @KeepForSdk
    public void registerEvent(Context r1, String r2, int r3, String r4, String r5, String r6, int r7, List<String> r8, long r9) {
    }
}
