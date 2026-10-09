package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzajv {
    static final zzajv zza = null;
    private static volatile boolean zzb = false;
    private final Map<zzaju, zzakg.zzf<?, ?>> zzc;

    static {
        zza = new zzajv(true);
    }

    public zzajv() {
        this.zzc = new HashMap();
    }

    public static zzajv zza() {
        return zza;
    }

    public final <ContainingType extends zzaln> zzakg.zzf<ContainingType, ?> zza(ContainingType r3, int r4) {
        return (zzakg.zzf) this.zzc.get(new zzaju(r3, r4));
    }

    private zzajv(boolean r1) {
        this.zzc = Collections.EMPTY_MAP;
    }
}
