package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzgh extends com.google.android.gms.internal.measurement.zzbu implements zzgf {
    public zzgh(IBinder r2) {
        super(r2, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final void zza(zzor r2) throws RemoteException {
        Parcel r02 = b_();
        com.google.android.gms.internal.measurement.zzbw.zza(r02, r2);
        zzc(2, r02);
    }
}
