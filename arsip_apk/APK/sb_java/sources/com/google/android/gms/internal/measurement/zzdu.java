package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzdu extends zzbx implements zzdr {
    public zzdu() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 2) goto L6;
        a_();
        return true;
    L6:
        return false;
    }
}
