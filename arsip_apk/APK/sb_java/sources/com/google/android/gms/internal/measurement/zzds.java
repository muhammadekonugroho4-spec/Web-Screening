package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzds extends zzbu implements zzdq {
    public zzds(IBinder r2) {
        super(r2, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzdq
    public final void zza(Bundle r2) throws RemoteException {
        Parcel r02 = b_();
        zzbw.zza(r02, r2);
        zzb(1, r02);
    }
}
