package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class zzjt {
    static final zzjt zza = null;
    private static volatile boolean zzb = false;
    private static volatile zzjt zzc;
    private final Map<zza, zzkg.zzd<?, ?>> zzd;

    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object r1, int r2) {
            this.zza = r1;
            this.zzb = r2;
        }

        public final boolean equals(Object r4) {
            if ((r4 instanceof zza) == true) goto L5;
            return false;
        L5:
            zza r42 = (zza) r4;
            if (this.zza == r42.zza) goto L8;
        L11:
            return false;
        L8:
            if (this.zzb != r42.zzb) goto L11;
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    static {
        zza = new zzjt(true);
    }

    public zzjt() {
        this.zzd = new HashMap();
    }

    public static zzjt zza() {
        zzjt r02 = zzc;
        if (r02 == null) goto L6;
        return r02;
    L6:
        monitor-enter(zzjt.class);
        zzjt r1 = zzc;     // Catch: Throwable -> L11
        if (r1 == null) goto L13;
        monitor-exit(zzjt.class);     // Catch: Throwable -> L11
        return r1;
    L13:
        zzjt r12 = zzkf.zza(zzjt.class);     // Catch: Throwable -> L11
        zzc = r12;     // Catch: Throwable -> L11
        monitor-exit(zzjt.class);     // Catch: Throwable -> L11
        return r12;
    L11:
        th = move-exception;
        throw th;
    }

    private zzjt(boolean r1) {
        this.zzd = Collections.EMPTY_MAP;
    }

    public final <ContainingType extends zzlm> zzkg.zzd<ContainingType, ?> zza(ContainingType r3, int r4) {
        return (zzkg.zzd) this.zzd.get(new zza(r3, r4));
    }
}
