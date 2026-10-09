package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements zze {
    public static zze zzb(IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        IInterface r02 = r2.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if ((r02 instanceof zze) == false) goto L10;
        return (zze) r02;
    L10:
        return new zzc(r2);
    }
}
