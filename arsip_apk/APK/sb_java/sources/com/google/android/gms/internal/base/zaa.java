package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class zaa implements IInterface {
    private final IBinder zaa;
    private final String zab;

    public zaa(IBinder r1, String r2) {
        this.zaa = r1;
        this.zab = r2;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zaa;
    }

    public final Parcel zaa() {
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.zab);
        return r02;
    }

    public final Parcel zab(int r4, Parcel r5) throws RemoteException {
        Parcel r42 = Parcel.obtain();
        this.zaa.transact(2, r5, r42, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r42.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r5.recycle();
        return r42;
    L6:
        th = move-exception;
        r5.recycle();
        throw th;
    L8:
        e = move-exception;
        r42.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }

    public final void zac(int r4, Parcel r5) throws RemoteException {
        Parcel r02 = Parcel.obtain();
        this.zaa.transact(r4, r5, r02, 0);     // Catch: Throwable -> L6
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

    public final void zad(int r3, Parcel r4) throws RemoteException {
        this.zaa.transact(1, r4, null, 1);     // Catch: Throwable -> L5
        r4.recycle();
        return;
    L5:
        th = move-exception;
        r4.recycle();
        throw th;
    }
}
