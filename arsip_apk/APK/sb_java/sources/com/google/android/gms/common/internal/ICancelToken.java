package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public interface ICancelToken extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        public static ICancelToken asInterface(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if ((r02 instanceof ICancelToken) == false) goto L10;
            return (ICancelToken) r02;
        L10:
            return new zzx(r2);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
            if (r1 != 2) goto L6;
            cancel();
            return true;
        L6:
            return false;
        }
    }

    void cancel() throws RemoteException;
}
