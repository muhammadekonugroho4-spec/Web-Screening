package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzca extends zzbu implements zzbz {
    public zzca(IBinder r2) {
        super(r2, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final Bundle zza(Bundle r2) throws RemoteException {
        Parcel r02 = b_();
        zzbw.zza(r02, r2);
        Parcel r22 = zza(1, r02);
        Bundle r03 = (Bundle) zzbw.zza(r22, Bundle.CREATOR);
        r22.recycle();
        return r03;
    }
}
