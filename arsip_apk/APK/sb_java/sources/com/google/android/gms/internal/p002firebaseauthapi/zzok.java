package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzok {
    private static final zzok zza = null;
    private final Map<String, zzcg> zzb;

    static {
        zza = new zzok();
    }

    public zzok() {
        this.zzb = new HashMap();
    }

    public static zzok zza() {
        return zza;
    }

    private final synchronized void zza(String r5, zzcg r6) throws GeneralSecurityException {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.zzb.containsKey(r5) == true) goto L6;
        this.zzb.put(r5, r6);     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L6:
        if (this.zzb.get(r5).equals(r6) == false) goto L10;
        monitor-exit(this);
        return;
    L10:
        throw new GeneralSecurityException("Parameters object with name " + r5 + " already exists (" + String.valueOf(this.zzb.get(r5)) + "), cannot insert " + String.valueOf(r6));     // Catch: Throwable -> L11
    }

    public final synchronized void zza(Map<String, zzcg> r3) throws GeneralSecurityException {
        monitor-enter(this);
        Iterator<Map.Entry<String, zzcg>> r32 = r3.entrySet().iterator();     // Catch: Throwable -> L8
    L4:
        if (r32.hasNext() == false) goto L10;
        Map.Entry<String, zzcg> r02 = r32.next();     // Catch: Throwable -> L8
        zza(r02.getKey(), r02.getValue());     // Catch: Throwable -> L8
        goto L4
    L10:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
