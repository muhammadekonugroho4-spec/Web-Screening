package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzbd zzb(IBinder r2) {
        IInterface r02 = r2.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if ((r02 instanceof zzbd) == false) goto L7;
        return (zzbd) r02;
    L7:
        return new zzbb(r2);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L6;
        zzd((Location) com.google.android.gms.internal.location.zzc.zzb(r2, Location.CREATOR));
        return true;
    L6:
        return false;
    }
}
