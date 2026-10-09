package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public interface IAIDLCallback extends IInterface {

    public static abstract class Stub extends Binder implements IAIDLCallback {
        static final int TRANSACTION_call = 1;

        public static class a implements IAIDLCallback {

            /* renamed from: b, reason: collision with root package name */
            public static IAIDLCallback f39142b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f39143a;

            public a(IBinder r1) {
                this.f39143a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39143a;
            }
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLCallback");
        }

        public static IAIDLCallback asInterface(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            if (r02 == null) goto L12;
            if ((r02 instanceof IAIDLCallback) == false) goto L12;
            return (IAIDLCallback) r02;
        L12:
            return new a(r2);
        }

        public static IAIDLCallback getDefaultImpl() {
            return a.f39142b;
        }

        public static boolean setDefaultImpl(IAIDLCallback r1) {
            if (a.f39142b != null) goto L10;
            if (r1 == null) goto L7;
            a.f39142b = r1;
            return true;
        L7:
            return false;
        L10:
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) throws RemoteException {
            if (r4 == 1598968902) goto L13;
            if (r4 != 1) goto L6;
            r5.enforceInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            if (r5.readInt() == 0) goto L10;
            DataBuffer r42 = DataBuffer.CREATOR.createFromParcel(r5);
        L11:
            call(r42);
            return true;
        L10:
            r42 = null;
            goto L11
        L6:
            return super.onTransact(r4, r5, r6, r7);
        L13:
            r6.writeString("com.huawei.hms.core.aidl.IAIDLCallback");
            return true;
        }
    }

    void call(DataBuffer r1) throws RemoteException;
}
