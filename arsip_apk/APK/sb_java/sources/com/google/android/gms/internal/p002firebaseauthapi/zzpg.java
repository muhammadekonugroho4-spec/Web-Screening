package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzpg<P> {
    private final Map<zzzn, List<zzpi<P>>> zza;
    private final zzpi<P> zzb;
    private final Class<P> zzc;
    private final zznr zzd;

    public /* synthetic */ zzpg(Map r1, List r2, zzpi r3, zznr r4, Class r5, zzpl r6) {
        this(r1, r2, r3, r4, r5);
    }

    public final zznr zza() {
        return this.zzd;
    }

    public final zzpi<P> zzb() {
        return this.zzb;
    }

    public final Class<P> zzc() {
        return this.zzc;
    }

    public final Collection<List<zzpi<P>>> zzd() {
        return this.zza.values();
    }

    public final List<zzpi<P>> zze() {
        return zza(zzbi.zza);
    }

    public final boolean zzf() {
        if (this.zzd.zza().isEmpty() == true) goto L6;
        return true;
    L6:
        return false;
    }

    private zzpg(Map<zzzn, List<zzpi<P>>> r1, List<zzpi<P>> r2, zzpi<P> r3, zznr r4, Class<P> r5) {
        this.zza = r1;
        this.zzb = r3;
        this.zzc = r5;
        this.zzd = r4;
    }

    public static <P> zzpj<P> zza(Class<P> r2) {
        return new zzpj(r2, null);
    }

    public final List<zzpi<P>> zza(byte[] r2) {
        List<zzpi<P>> r22 = this.zza.get(zzzn.zza(r2));
        if (r22 == null) goto L6;
        return r22;
    L6:
        return Collections.EMPTY_LIST;
    }
}
