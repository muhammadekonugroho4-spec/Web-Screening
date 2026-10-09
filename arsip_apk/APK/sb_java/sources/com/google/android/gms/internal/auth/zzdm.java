package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzdm implements Serializable, zzdj {
    final Object zza;

    public zzdm(Object r1) {
        this.zza = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof zzdm) == false) goto L12;
        Object r02 = this.zza;
        Object r32 = ((zzdm) r3).zza;
        if (r02 != r32) goto L7;
        return true;
    L7:
        if (r02.equals(r32) == true) goto L13;
        return false;
    L13:
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        return this.zza;
    }
}
