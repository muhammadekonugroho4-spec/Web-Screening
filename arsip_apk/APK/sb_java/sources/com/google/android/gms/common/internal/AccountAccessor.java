package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: classes5.dex */
public class AccountAccessor extends IAccountAccessor.Stub {
    @KeepForSdk
    public static Account getAccountBinderSafe(IAccountAccessor r4) {
        if (r4 == null) goto L15;
        long r1 = Binder.clearCallingIdentity();
        Account r42 = r4.zzb();     // Catch: Throwable -> L8 RemoteException -> L10
        Binder.restoreCallingIdentity(r1);
        return r42;
    L10:
        Log.w("AccountAccessor", "Remote account accessor probably died");     // Catch: Throwable -> L8
        Binder.restoreCallingIdentity(r1);
        return null;
    L8:
        th = move-exception;
        Binder.restoreCallingIdentity(r1);
        throw th;
    L15:
        return null;
    }

    public final boolean equals(Object r1) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        throw null;
    }
}
