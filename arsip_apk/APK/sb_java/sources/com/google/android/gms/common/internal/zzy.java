package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements zzaa {
    public zzy(IBinder r2) {
        super(r2, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel r02 = zzB(2, zza());
        int r1 = r02.readInt();
        r02.recycle();
        return r1;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() throws RemoteException {
        Parcel r02 = zzB(1, zza());
        IObjectWrapper r1 = IObjectWrapper.Stub.asInterface(r02.readStrongBinder());
        r02.recycle();
        return r1;
    }
}
