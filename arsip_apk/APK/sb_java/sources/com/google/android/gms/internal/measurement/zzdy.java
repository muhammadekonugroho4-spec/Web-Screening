package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzdy extends zzbu implements zzdw {
    public zzdy(IBinder r2) {
        super(r2, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzdw
    public final int zza() throws RemoteException {
        Parcel r02 = zza(2, b_());
        int r1 = r02.readInt();
        r02.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.measurement.zzdw
    public final void zza(String r2, String r3, Bundle r4, long r5) throws RemoteException {
        Parcel r02 = b_();
        r02.writeString(r2);
        r02.writeString(r3);
        zzbw.zza(r02, r4);
        r02.writeLong(r5);
        zzb(1, r02);
    }
}
