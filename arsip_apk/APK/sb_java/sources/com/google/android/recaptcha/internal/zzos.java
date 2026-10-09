package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;
    private static final zzos zzb = null;
    private final zzox zzc;
    private final ConcurrentMap zzd;

    static {
        zzb = new zzos();
    }

    private zzos() {
        this.zzd = new ConcurrentHashMap();
        this.zzc = new zzoa();
    }

    public static zzos zza() {
        return zzb;
    }

    public final zzow zzb(Class r3) {
        zznl.zzc(r3, "messageType");
        zzow r1 = (zzow) this.zzd.get(r3);
        if (r1 != null) goto L8;
        zzow r12 = this.zzc.zza(r3);
        zznl.zzc(r3, "messageType");
        zzow r32 = (zzow) this.zzd.putIfAbsent(r3, r12);
        if (r32 != null) goto L7;
        return r12;
    L7:
        return r32;
    L8:
        return r1;
    }
}
