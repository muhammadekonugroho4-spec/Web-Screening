package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes5.dex */
final class zzat extends zzbr implements Serializable {
    final Comparator zza;

    public zzat(Comparator r1) {
        r1.getClass();
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.fido.zzbr, java.util.Comparator
    public final int compare(Object r2, Object r3) {
        return this.zza.compare(r2, r3);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof zzat) == true) goto L8;
        return false;
    L8:
        return this.zza.equals(((zzat) r2).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
