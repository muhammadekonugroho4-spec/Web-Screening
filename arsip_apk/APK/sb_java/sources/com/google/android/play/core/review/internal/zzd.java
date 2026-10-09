package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder r2) {
        super(r2, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // com.google.android.play.core.review.internal.zzf
    public final void zzc(String r2, Bundle r3, zzh r4) throws RemoteException {
        Parcel r02 = zza();
        r02.writeString(r2);
        zzc.zzc(r02, r3);
        zzc.zzd(r02, r4);
        zzb(2, r02);
    }
}
