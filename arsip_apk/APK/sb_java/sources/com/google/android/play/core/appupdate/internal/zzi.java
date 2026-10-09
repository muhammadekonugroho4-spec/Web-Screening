package com.google.android.play.core.appupdate.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzi {
    private static final Set zza = null;
    private static final Set zzb = null;
    private static final Map zzc = null;
    private static final zzm zzd = null;

    static {
        zza = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        zzb = new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        zzc = new HashMap();
        zzd = new zzm("PlayCoreVersion");
    }

    public static synchronized Map zza(String r5) {
        monitor-enter(zzi.class);
        Map r02 = zzc;     // Catch: Throwable -> L7
        if (r02.containsKey("app_update") == true) goto L9;
        HashMap r2 = new HashMap();     // Catch: Throwable -> L7
        r2.put("java", 11004);     // Catch: Throwable -> L7
        r02.put("app_update", r2);     // Catch: Throwable -> L7
    L9:
        Map r03 = (Map) r02.get("app_update");     // Catch: Throwable -> L7
        monitor-exit(zzi.class);
        return r03;
    L7:
        th = move-exception;
        throw th;
    }
}
