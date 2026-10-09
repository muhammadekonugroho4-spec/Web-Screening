package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class zzbv extends zzbr implements Serializable {
    static final zzbv zza = null;

    static {
        zza = new zzbv();
    }

    private zzbv() {
    }

    @Override // com.google.android.gms.internal.fido.zzbr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
        Comparable r12 = (Comparable) r1;
        Comparable r22 = (Comparable) r2;
        r12.getClass();
        if (r12 != r22) goto L7;
        return 0;
    L7:
        return r22.compareTo(r12);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.fido.zzbr
    public final zzbr zza() {
        return zzbp.zza;
    }
}
