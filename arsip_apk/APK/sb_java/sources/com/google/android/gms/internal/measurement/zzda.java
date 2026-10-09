package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
public abstract class zzda {
    private static zzda zza;

    static {
        zza = new zzcz(null);
    }

    public zzda() {
    }

    public static synchronized zzda zza() {
        monitor-enter(zzda.class);
        zzda r1 = zza;     // Catch: Throwable -> L7
        monitor-exit(zzda.class);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public abstract URLConnection zza(URL r1, String r2) throws IOException;
}
