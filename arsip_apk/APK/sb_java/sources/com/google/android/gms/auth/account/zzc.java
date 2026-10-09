package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
    public zzc(IBinder r2) {
        super(r2, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzd(zzb r2, String r3) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.auth.zzc.zze(r02, r2);
        r02.writeString(r3);
        zzc(2, r02);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zze(zzb r2, Account r3) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.auth.zzc.zze(r02, r2);
        com.google.android.gms.internal.auth.zzc.zzd(r02, r3);
        zzc(3, r02);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf(boolean r2) throws RemoteException {
        Parcel r02 = zza();
        com.google.android.gms.internal.auth.zzc.zzc(r02, r2);
        zzc(1, r02);
    }
}
