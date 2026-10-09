package com.google.android.gms.internal.auth;

import android.content.Context;

/* loaded from: classes5.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public zzcd(Context r1, zzdj r2) {
        if (r1 == null) goto L7;
        this.zza = r1;
        this.zzb = r2;
        return;
    L7:
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzda) == false) goto L18;
        zzda r52 = (zzda) r5;
        if (this.zza.equals(r52.zza()) == false) goto L18;
        zzdj r1 = this.zzb;
        if (r1 != null) goto L15;
        if (r52.zzb() != null) goto L18;
    L17:
        return true;
    L15:
        if (r1.equals(r52.zzb()) == true) goto L17;
    L18:
        return false;
    }

    public final int hashCode() {
        int r02 = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj r1 = this.zzb;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final zzdj zzb() {
        return this.zzb;
    }
}
