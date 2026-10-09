package com.google.android.gms.internal.time;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzgs {
    private static final Comparator zza = null;
    private static final zzgs zzb = null;
    private final zzgq zzc;

    static {
        zza = new zzgl();
        zzb = new zzgs(new zzgq(Collections.EMPTY_LIST));
    }

    private zzgs(zzgq r1) {
        this.zzc = r1;
    }

    public static zzgs zza() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ Comparator zzc() {
        return zza;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzgs) == true) goto L5;
        return false;
    L5:
        if (((zzgs) r2).zzc.equals(this.zzc) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzgs zzb(zzgs r4) {
        if (r4.zzc.isEmpty() == false) goto L5;
        return this;
    L5:
        if (this.zzc.isEmpty() == false) goto L8;
        return r4;
    L8:
        return new zzgs(new zzgq(this.zzc, r4.zzc));
    }

    public final Map zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzc.isEmpty();
    }
}
