package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class zzaw extends com.google.android.gms.internal.location.zzb implements zzax {
    public static zzax zzb(IBinder r2) {
        IInterface r02 = r2.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if ((r02 instanceof zzax) == false) goto L7;
        return (zzax) r02;
    L7:
        return new zzav(r2);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        throw null;
    }
}
