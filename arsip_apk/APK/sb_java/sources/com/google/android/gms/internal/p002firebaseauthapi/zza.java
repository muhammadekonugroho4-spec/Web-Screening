package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
public abstract class zza {
    private static zza zza;

    static {
        zza = new zzc(null);
    }

    public zza() {
    }

    public static synchronized zza zza() {
        monitor-enter(zza.class);
        zza r1 = zza;     // Catch: Throwable -> L7
        monitor-exit(zza.class);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public abstract URLConnection zza(URL r1, String r2) throws IOException;
}
