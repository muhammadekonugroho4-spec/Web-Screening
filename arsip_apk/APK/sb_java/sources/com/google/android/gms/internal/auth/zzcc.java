package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes5.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb;

    static {
        zzb = !zzb();
    }

    private zzcc() {
    }

    public static boolean zza(Context r8) {
        if (zzb() == true) goto L5;
    L41:
        return false;
    L5:
        if (zzb == true) goto L41;
        monitor-enter(zzcc.class);
    L13:
        th = move-exception;
        throw th;
    L10:
        if (zzb == false) goto L15;
        monitor-exit(zzcc.class);     // Catch: Throwable -> L13
        goto L41
    L15:
        int r3 = 1;
    L17:
        if (r3 > 2) goto L29;
        if (zza != null) goto L21;
        zza = (UserManager) r8.getSystemService(UserManager.class);     // Catch: Throwable -> L13
    L21:
        UserManager r4 = zza;     // Catch: Throwable -> L13
        if (r4 == null) goto L23;
    L30:
        e = move-exception;
        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);     // Catch: Throwable -> L13
        zza = null;     // Catch: Throwable -> L13
        r3 = r3 + 1;     // Catch: Throwable -> L13
        goto L17
    L25:
        if (r4.isUserUnlocked() == true) goto L28;
    L27:
        if (r4.isUserRunning(Process.myUserHandle()) == true) goto L29;
    L28:
        boolean r82 = true;
    L32:
        if (r82 == false) goto L34;
        zza = null;     // Catch: Throwable -> L13
    L34:
        if (r82 == false) goto L36;
        zzb = true;     // Catch: Throwable -> L13
    L36:
        monitor-exit(zzcc.class);     // Catch: Throwable -> L13
        if (r82 == true) goto L41;
        return true;
    L23:
        r82 = true;
    L29:
        r82 = false;
        goto L32
    }

    public static boolean zzb() {
        return true;
    }
}
