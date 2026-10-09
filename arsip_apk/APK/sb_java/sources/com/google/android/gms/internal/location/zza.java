package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zza(IBinder r1, String r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.zzb);
        return r02;
    }

    public final Parcel zzw(int r4, Parcel r5) throws RemoteException {
        Parcel r02 = Parcel.obtain();
        this.zza.transact(r4, r5, r02, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r02.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r5.recycle();
        return r02;
    L6:
        th = move-exception;
        r5.recycle();
        throw th;
    L8:
        e = move-exception;
        r02.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }

    public final void zzx(int r4, Parcel r5) throws RemoteException {
        Parcel r02 = Parcel.obtain();
        this.zza.transact(r4, r5, r02, 0);     // Catch: Throwable -> L6
        r02.readException();     // Catch: Throwable -> L6
        r5.recycle();
        r02.recycle();
        return;
    L6:
        th = move-exception;
        r5.recycle();
        r02.recycle();
        throw th;
    }
}
