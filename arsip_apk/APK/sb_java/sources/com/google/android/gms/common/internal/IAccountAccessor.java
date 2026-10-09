package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if ((r02 instanceof IAccountAccessor) == false) goto L10;
            return (IAccountAccessor) r02;
        L10:
            return new zzw(r2);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
            if (r1 != 2) goto L6;
            Account r12 = zzb();
            r3.writeNoException();
            com.google.android.gms.internal.common.zzc.zzd(r3, r12);
            return true;
        L6:
            return false;
        }
    }

    Account zzb() throws RemoteException;
}
