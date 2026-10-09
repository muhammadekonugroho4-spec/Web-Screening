package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder r2) {
        super(r2, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() throws RemoteException {
        Parcel r02 = zzb(1, zza());
        String r1 = r02.readString();
        r02.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws RemoteException {
        Parcel r02 = zzb(6, zza());
        boolean r1 = zzc.zzb(r02);
        r02.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean r2) throws RemoteException {
        Parcel r22 = zza();
        zzc.zza(r22, true);
        Parcel r23 = zzb(2, r22);
        boolean r02 = zzc.zzb(r23);
        r23.recycle();
        return r02;
    }
}
