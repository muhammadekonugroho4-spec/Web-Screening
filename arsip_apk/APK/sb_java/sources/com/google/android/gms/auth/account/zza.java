package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L5;
        Account r12 = (Account) com.google.android.gms.internal.auth.zzc.zza(r2, Account.CREATOR);
        com.google.android.gms.internal.auth.zzc.zzb(r2);
        zzb(r12);
    L10:
        return true;
    L5:
        if (r1 == 2) goto L8;
        return false;
    L8:
        boolean r13 = com.google.android.gms.internal.auth.zzc.zzf(r2);
        com.google.android.gms.internal.auth.zzc.zzb(r2);
        zzc(r13);
        goto L10
    }
}
