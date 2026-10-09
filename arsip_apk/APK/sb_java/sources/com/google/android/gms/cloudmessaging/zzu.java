package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes5.dex */
final class zzu extends zzs {
    public zzu(int r1, int r2, Bundle r3) {
        super(r1, r2, r3);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle r2) {
        Bundle r22 = r2.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (r22 != null) goto L5;
        r22 = Bundle.EMPTY;
    L5:
        zzd(r22);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return false;
    }
}
