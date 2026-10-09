package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzpe {
    private final Class<?> zza;
    private final Class<?> zzb;

    public /* synthetic */ zzpe(Class r1, Class r2, zzph r3) {
        this(r1, r2);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzpe) == true) goto L5;
        return false;
    L5:
        zzpe r42 = (zzpe) r4;
        if (r42.zza.equals(this.zza) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.zzb.equals(this.zzb) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with primitive type: " + this.zzb.getSimpleName();
    }

    private zzpe(Class<?> r1, Class<?> r2) {
        this.zza = r1;
        this.zzb = r2;
    }
}
