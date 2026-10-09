package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class zba implements IInterface {
    private final IBinder zba;
    private final String zbb;

    public zba(IBinder r1, String r2) {
        this.zba = r1;
        this.zbb = r2;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zba;
    }

    public final Parcel zba() {
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.zbb);
        return r02;
    }

    public final void zbb(int r4, Parcel r5) throws RemoteException {
        Parcel r02 = Parcel.obtain();
        this.zba.transact(r4, r5, r02, 0);     // Catch: Throwable -> L6
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
