package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class zzbw extends zzbr implements Serializable {
    final zzbr zza;

    public zzbw(zzbr r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.fido.zzbr, java.util.Comparator
    public final int compare(Object r2, Object r3) {
        return this.zza.compare(r3, r2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof zzbw) == true) goto L8;
        return false;
    L8:
        return this.zza.equals(((zzbw) r2).zza);
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.fido.zzbr
    public final zzbr zza() {
        return this.zza;
    }
}
