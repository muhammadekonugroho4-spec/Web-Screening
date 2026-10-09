package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzgc extends com.google.android.gms.internal.measurement.zzbu implements zzga {
    public zzgc(IBinder r2) {
        super(r2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zza(List<zzog> r2) throws RemoteException {
        Parcel r02 = b_();
        r02.writeTypedList(r2);
        zzc(2, r02);
    }
}
