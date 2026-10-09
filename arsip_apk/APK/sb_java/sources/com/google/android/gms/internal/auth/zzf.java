package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* loaded from: classes5.dex */
public interface zzf extends IInterface {
    Bundle zzd(String r1, Bundle r2) throws RemoteException;

    Bundle zze(Account r1, String r2, Bundle r3) throws RemoteException;

    Bundle zzf(Account r1) throws RemoteException;

    Bundle zzg(String r1) throws RemoteException;

    AccountChangeEventsResponse zzh(AccountChangeEventsRequest r1) throws RemoteException;
}
