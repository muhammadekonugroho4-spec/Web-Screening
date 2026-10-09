package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes5.dex */
final class zzoh {
    private final Clock zza;
    private long zzb;

    public zzoh(Clock r1) {
        Preconditions.checkNotNull(r1);
        this.zza = r1;
    }

    public final void zza() {
        this.zzb = 0;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zza(long r5) {
        if (this.zzb != 0) goto L6;
        return true;
    L6:
        if ((this.zza.elapsedRealtime() - this.zzb) < 3600000) goto L8;
        return true;
    L8:
        return false;
    }
}
