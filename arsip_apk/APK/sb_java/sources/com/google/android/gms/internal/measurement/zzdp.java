package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzdp extends zzbx implements zzdq {
    public zzdp() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L6;
        Bundle r12 = (Bundle) zzbw.zza(r2, Bundle.CREATOR);
        zzbw.zzb(r2);
        zza(r12);
        r3.writeNoException();
        return true;
    L6:
        return false;
    }
}
