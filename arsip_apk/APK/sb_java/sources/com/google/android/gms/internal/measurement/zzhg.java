package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes5.dex */
public class zzhg {
    private static UserManager zza;
    private static volatile boolean zzb;

    static {
        zzb = !zza();
    }

    private zzhg() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context r1) {
        if (zza() == true) goto L5;
        return true;
    L5:
        if (zzc(r1) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @TargetApi(24)
    private static boolean zzc(Context r3) {
        if (zzb == false) goto L6;
        return true;
    L6:
        monitor-enter(zzhg.class);
    L11:
        th = move-exception;
        throw th;
    L8:
        if (zzb == false) goto L13;
        monitor-exit(zzhg.class);     // Catch: Throwable -> L11
        return true;
    L13:
        boolean r32 = zzd(r3);     // Catch: Throwable -> L11
        if (r32 == false) goto L16;
        zzb = r32;     // Catch: Throwable -> L11
    L16:
        monitor-exit(zzhg.class);     // Catch: Throwable -> L11
        return r32;
    }

    @TargetApi(24)
    private static boolean zzd(Context r6) {
        boolean r02 = true;
        int r1 = 1;
    L3:
        boolean r4 = false;
        if (r1 > 2) goto L21;
        if (zza != null) goto L8;
        zza = (UserManager) r6.getSystemService(UserManager.class);
    L8:
        UserManager r2 = zza;
        if (r2 == null) goto L10;
    L17:
        e = move-exception;
        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
        zza = null;
        r1 = r1 + 1;
        goto L3
    L12:
        if (r2.isUserUnlocked() == true) goto L19;
        if (r2.isUserRunning(Process.myUserHandle()) == false) goto L19;
        r02 = false;
    L19:
        r4 = r02;
        goto L21
    L10:
        return true;
    L21:
        if (r4 == false) goto L23;
        zza = null;
    L23:
        return r4;
    }

    public static boolean zza(Context r1) {
        if (zza() == true) goto L5;
        return false;
    L5:
        if (zzc(r1) == true) goto L10;
        return true;
    L10:
        return false;
    }
}
