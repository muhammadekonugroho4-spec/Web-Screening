package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes5.dex */
public final class CrashUtils {
    private static final String[] zza = null;

    static {
        zza = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
    }

    public CrashUtils() {
    }

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(Context r1, Throwable r2) {
        Preconditions.checkNotNull(r1);     // Catch: Exception -> L4
        Preconditions.checkNotNull(r2);     // Catch: Exception -> L4
        return false;
    L4:
        e = move-exception;
        Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        return false;
    }
}
