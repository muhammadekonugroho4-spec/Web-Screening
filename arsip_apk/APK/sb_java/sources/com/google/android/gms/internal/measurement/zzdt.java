package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzdt extends zzbu implements zzdr {
    public zzdt(IBinder r2) {
        super(r2, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzdr
    public final void a_() throws RemoteException {
        zzc(2, b_());
    }
}
