package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes5.dex */
final class zzr extends zzs {
    public zzr(int r1, int r2, Bundle r3) {
        super(r1, r2, r3);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle r4) {
        if (r4.getBoolean("ack", false) == false) goto L6;
        zzd(null);
        return;
    L6:
        zzc(new zzt(4, "Invalid response to one way request", null));
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return true;
    }
}
