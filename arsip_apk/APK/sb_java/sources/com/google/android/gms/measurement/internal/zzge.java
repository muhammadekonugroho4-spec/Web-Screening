package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzge extends com.google.android.gms.internal.measurement.zzbx implements zzgf {
    public zzge() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 2) goto L6;
        zzor r12 = (zzor) com.google.android.gms.internal.measurement.zzbw.zza(r2, zzor.CREATOR);
        com.google.android.gms.internal.measurement.zzbw.zzb(r2);
        zza(r12);
        return true;
    L6:
        return false;
    }
}
