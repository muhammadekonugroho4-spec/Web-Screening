package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public class StatsUtils {
    public StatsUtils() {
    }

    @KeepForSdk
    public static String getEventKey(PowerManager.WakeLock r4, String r5) {
        String r42 = String.valueOf((Process.myPid() << 32) | System.identityHashCode(r4));
        if (true != TextUtils.isEmpty(r5)) goto L6;
        r5 = "";
    L6:
        return String.valueOf(r42).concat(String.valueOf(r5));
    }
}
