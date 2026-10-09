package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final class zzej {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(String r1, long r2, int r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof zzej) == false) goto L12;
        zzej r52 = (zzej) r5;
        if (p.g(r52.zza, this.zza) == true) goto L7;
        return false;
    L7:
        if (r52.zzb == this.zzb) goto L9;
        return false;
    L9:
        if (r52.zzc != this.zzc) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
