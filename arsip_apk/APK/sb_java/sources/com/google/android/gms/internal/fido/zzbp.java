package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class zzbp extends zzbr implements Serializable {
    static final zzbp zza = null;

    static {
        zza = new zzbp();
    }

    private zzbp() {
    }

    @Override // com.google.android.gms.internal.fido.zzbr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
        Comparable r12 = (Comparable) r1;
        Comparable r22 = (Comparable) r2;
        r12.getClass();
        r22.getClass();
        return r12.compareTo(r22);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.fido.zzbr
    public final zzbr zza() {
        return zzbv.zza;
    }
}
