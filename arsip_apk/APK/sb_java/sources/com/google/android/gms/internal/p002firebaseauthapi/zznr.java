package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* loaded from: classes5.dex */
public final class zznr {
    public static final zznr zza = null;
    private final Map<String, String> zzb;

    static {
        zza = new zznq().zza();
    }

    public /* synthetic */ zznr(Map r1, zznt r2) {
        this(r1);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zznr) == true) goto L7;
        return false;
    L7:
        return this.zzb.equals(((zznr) r2).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }

    private zznr(Map<String, String> r1) {
        this.zzb = r1;
    }
}
