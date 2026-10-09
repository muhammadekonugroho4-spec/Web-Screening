package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzp(IBinder r2) {
        super(r2, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel r02 = zzB(6, zza());
        int r1 = r02.readInt();
        r02.recycle();
        return r1;
    }

    public final int zzf(IObjectWrapper r2, String r3, boolean r4) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4 ? 1 : 0);
        Parcel r22 = zzB(3, r02);
        int r32 = r22.readInt();
        r22.recycle();
        return r32;
    }

    public final int zzg(IObjectWrapper r2, String r3, boolean r4) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4 ? 1 : 0);
        Parcel r22 = zzB(5, r02);
        int r32 = r22.readInt();
        r22.recycle();
        return r32;
    }

    public final IObjectWrapper zzh(IObjectWrapper r2, String r3, int r4) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4);
        Parcel r22 = zzB(2, r02);
        IObjectWrapper r32 = IObjectWrapper.Stub.asInterface(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }

    public final IObjectWrapper zzi(IObjectWrapper r2, String r3, int r4, IObjectWrapper r5) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4);
        com.google.android.gms.internal.common.zzc.zze(r02, r5);
        Parcel r22 = zzB(8, r02);
        IObjectWrapper r32 = IObjectWrapper.Stub.asInterface(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }

    public final IObjectWrapper zzj(IObjectWrapper r2, String r3, int r4) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4);
        Parcel r22 = zzB(4, r02);
        IObjectWrapper r32 = IObjectWrapper.Stub.asInterface(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }

    public final IObjectWrapper zzk(IObjectWrapper r2, String r3, boolean r4, long r5) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.common.zzc.zze(r02, r2);
        r02.writeString(r3);
        r02.writeInt(r4 ? 1 : 0);
        r02.writeLong(r5);
        Parcel r22 = zzB(7, r02);
        IObjectWrapper r32 = IObjectWrapper.Stub.asInterface(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }
}
