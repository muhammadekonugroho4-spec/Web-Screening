package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;

/* loaded from: classes5.dex */
public final class zai extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zai(IBinder r2) {
        super(r2, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(TelemetryData r2) throws RemoteException {
        Parcel r02 = zaa();
        com.google.android.gms.internal.base.zac.zac(r02, r2);
        zad(1, r02);
    }
}
