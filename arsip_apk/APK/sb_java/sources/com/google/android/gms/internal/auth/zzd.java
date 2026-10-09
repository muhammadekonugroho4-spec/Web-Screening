package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* loaded from: classes5.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder r2) {
        super(r2, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String r2, Bundle r3) throws RemoteException {
        Parcel r02 = zza();
        r02.writeString(r2);
        zzc.zzd(r02, r3);
        Parcel r22 = zzb(2, r02);
        Bundle r32 = (Bundle) zzc.zza(r22, Bundle.CREATOR);
        r22.recycle();
        return r32;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account r2, String r3, Bundle r4) throws RemoteException {
        Parcel r02 = zza();
        zzc.zzd(r02, r2);
        r02.writeString(r3);
        zzc.zzd(r02, r4);
        Parcel r22 = zzb(5, r02);
        Bundle r32 = (Bundle) zzc.zza(r22, Bundle.CREATOR);
        r22.recycle();
        return r32;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account r2) throws RemoteException {
        Parcel r02 = zza();
        zzc.zzd(r02, r2);
        Parcel r22 = zzb(7, r02);
        Bundle r03 = (Bundle) zzc.zza(r22, Bundle.CREATOR);
        r22.recycle();
        return r03;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String r2) throws RemoteException {
        Parcel r02 = zza();
        r02.writeString(r2);
        Parcel r22 = zzb(8, r02);
        Bundle r03 = (Bundle) zzc.zza(r22, Bundle.CREATOR);
        r22.recycle();
        return r03;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest r2) throws RemoteException {
        Parcel r02 = zza();
        zzc.zzd(r02, r2);
        Parcel r22 = zzb(3, r02);
        AccountChangeEventsResponse r03 = (AccountChangeEventsResponse) zzc.zza(r22, AccountChangeEventsResponse.CREATOR);
        r22.recycle();
        return r03;
    }
}
