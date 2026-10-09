package com.google.android.gms.internal.time;

import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class zzce implements zzcc {
    public zzce() {
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzce) == true) goto L7;
        return false;
    L7:
        return Objects.equals(zza(), ((zzce) r2).zza());
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zzb();
    }

    public abstract Object zza();

    public abstract String zzb();
}
