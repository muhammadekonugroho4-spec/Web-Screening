package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes5.dex */
public final class zzcy {
    public static final int zza = 0;

    static {
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r02 = 33554432;
    L6:
        zza = r02;
        return;
    L5:
        r02 = 0;
        goto L6
    }

    public static PendingIntent zza(Context r02, int r1, Intent r2, int r3) {
        return PendingIntent.getBroadcast(r02, 0, r2, r3);
    }
}
