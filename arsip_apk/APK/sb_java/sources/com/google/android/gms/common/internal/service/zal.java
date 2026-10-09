package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zal extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zal(IBinder r2) {
        super(r2, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak r2) throws RemoteException {
        Parcel r02 = zaa();
        com.google.android.gms.internal.base.zac.zad(r02, r2);
        zad(1, r02);
    }
}
