package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
    public zzw(IBinder r2) {
        super(r2, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() throws RemoteException {
        Parcel r02 = zzB(2, zza());
        Account r1 = (Account) com.google.android.gms.internal.common.zzc.zza(r02, Account.CREATOR);
        r02.recycle();
        return r1;
    }
}
