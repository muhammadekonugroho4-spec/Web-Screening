package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class zzbx extends Binder implements IInterface {
    public zzbx(String r1) {
        attachInterface(this, r1);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int r2, Parcel r3, Parcel r4, int r5) throws RemoteException {
        if (r2 <= 16777215) goto L5;
        boolean r02 = super.onTransact(r2, r3, r4, r5);
    L6:
        if (r02 == false) goto L10;
        return true;
    L10:
        return zza(r2, r3, r4, r5);
    L5:
        r3.enforceInterface(getInterfaceDescriptor());
        r02 = false;
        goto L6
    }

    public boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        return false;
    }
}
