package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zznu {
    private final zznr zza;
    private final List<zznw> zzb;
    private final Integer zzc;

    public /* synthetic */ zznu(zznr r1, List r2, Integer r3, zznz r4) {
        this(r1, r2, r3);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zznu) == true) goto L5;
        return false;
    L5:
        zznu r42 = (zznu) r4;
        if (this.zza.equals(r42.zza) == true) goto L8;
    L13:
        return false;
    L8:
        if (this.zzb.equals(r42.zzb) == false) goto L13;
        if (Objects.equals(this.zzc, r42.zzc) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }

    private zznu(zznr r1, List<zznw> r2, Integer r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }
}
