package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
interface IMessengerCompat extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(Message r1) throws RemoteException {
            throw null;
        }
    }

    public static class Proxy implements IMessengerCompat {
        private final IBinder zza;

        public Proxy(IBinder r1) {
            this.zza = r1;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.zza;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(Message r4) throws RemoteException {
            Parcel r02 = Parcel.obtain();
            r02.writeInterfaceToken(IMessengerCompat.DESCRIPTOR);
            r02.writeInt(1);
            r4.writeToParcel(r02, 0);
            this.zza.transact(1, r02, null, 1);     // Catch: Throwable -> L6
            r02.recycle();
            return;
        L6:
            th = move-exception;
            r02.recycle();
            throw th;
        }
    }

    void send(Message r1) throws RemoteException;
}
