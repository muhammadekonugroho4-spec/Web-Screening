package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    public GCoreWakefulBroadcastReceiver() {
    }

    @KeepForSdk
    public static boolean completeWakefulIntent(Context r02, Intent r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return WakefulBroadcastReceiver.completeWakefulIntent(r1);
    }
}
