package com.google.android.play.core.review;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzj {
    private static final Set zza = null;
    private static final Map zzb = null;
    private static final com.google.android.play.core.review.internal.zzi zzc = null;

    static {
        zza = new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        zzb = new HashMap();
        zzc = new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");
    }

    public static Bundle zza() {
        Bundle r02 = new Bundle();
        Map r1 = zzb();
        r02.putInt("playcore_version_code", ((Integer) r1.get("java")).intValue());
        if (r1.containsKey("native") == false) goto L6;
        r02.putInt("playcore_native_version", ((Integer) r1.get("native")).intValue());
    L6:
        if (r1.containsKey("unity") == false) goto L8;
        r02.putInt("playcore_unity_version", ((Integer) r1.get("unity")).intValue());
    L8:
        return r02;
    }

    public static synchronized Map zzb() {
        monitor-enter(zzj.class);
        Map r1 = zzb;     // Catch: Throwable -> L7
        r1.put("java", 11004);     // Catch: Throwable -> L7
        monitor-exit(zzj.class);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
