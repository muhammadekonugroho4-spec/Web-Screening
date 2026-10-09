package com.google.android.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public boolean a(int r1, Parcel r2, Parcel r3) throws RemoteException {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r2, Parcel r3, Parcel r4, int r5) throws RemoteException {
        if (r2 > 16777215) goto L5;
        r3.enforceInterface(getInterfaceDescriptor());
    L10:
        return a(r2, r3, r4);
    L5:
        if (super.onTransact(r2, r3, r4, r5) == false) goto L10;
        return true;
    }
}
