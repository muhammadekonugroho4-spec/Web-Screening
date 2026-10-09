package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzaju {
    private final Object zza;
    private final int zzb;

    public zzaju(Object r1, int r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzaju) == true) goto L5;
        return false;
    L5:
        zzaju r42 = (zzaju) r4;
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
