package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzq extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzq(IBinder r2) {
        super(r2, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper r2, String r3, int r4, IObjectWrapper r5) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4);
        com.google.android.gms.internal.common.zzc.zze(r02, r5);
        Parcel r22 = zzB(2, r02);
        IObjectWrapper r32 = IObjectWrapper.Stub.asInterface(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }

    public final IObjectWrapper zzf(IObjectWrapper r2, String r3, int r4, IObjectWrapper r5) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4);
        com.google.android.gms.internal.common.zzc.zze(r02, r5);
        Parcel r22 = zzB(3, r02);
        IObjectWrapper r32 = IObjectWrapper.Stub.asInterface(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }
}
