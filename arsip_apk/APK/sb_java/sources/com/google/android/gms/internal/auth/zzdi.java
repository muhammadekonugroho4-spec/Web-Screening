package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzdi extends zzdh {
    private final Object zza;

    public zzdi(Object r1) {
        this.zza = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzdi) == true) goto L5;
        return false;
    L5:
        return this.zza.equals(((zzdi) r2).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }
}
