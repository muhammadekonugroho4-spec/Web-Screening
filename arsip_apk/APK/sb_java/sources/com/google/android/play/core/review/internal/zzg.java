package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 2) goto L6;
        Bundle r12 = (Bundle) zzc.zza(r2, Bundle.CREATOR);
        zzc.zzb(r2);
        zzb(r12);
        return true;
    L6:
        return false;
    }
}
