package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzx extends com.google.android.gms.internal.common.zza implements ICancelToken {
    public zzx(IBinder r2) {
        super(r2, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
