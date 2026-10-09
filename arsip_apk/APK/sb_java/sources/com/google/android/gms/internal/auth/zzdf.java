package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzdf extends zzdh {
    static final zzdf zza = null;

    static {
        zza = new zzdf();
    }

    private zzdf() {
    }

    public final boolean equals(Object r1) {
        if (r1 != this) goto L5;
        return true;
    L5:
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return false;
    }
}
