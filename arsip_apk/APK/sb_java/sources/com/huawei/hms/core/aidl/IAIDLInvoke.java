package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.core.aidl.IAIDLCallback;

/* loaded from: classes6.dex */
public interface IAIDLInvoke extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.core.aidl.IAIDLInvoke";

    public static abstract class Stub extends Binder implements IAIDLInvoke {

        public static class a implements IAIDLInvoke {

            /* renamed from: b, reason: collision with root package name */
            public static IAIDLInvoke f39144b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f39145a;

            public a(IBinder r1) {
                this.f39145a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39145a;
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void asyncCall(DataBuffer r6, IAIDLCallback r7) throws RemoteException {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken(IAIDLInvoke.DESCRIPTOR);     // Catch: Throwable -> L6
                if (r6 == null) goto L8;
                r02.writeInt(1);     // Catch: Throwable -> L6
                r6.writeToParcel(r02, 0);     // Catch: Throwable -> L6
            L10:
                if (r7 == null) goto L12;
                IBinder r3 = r7.asBinder();     // Catch: Throwable -> L6
            L13:
                r02.writeStrongBinder(r3);     // Catch: Throwable -> L6
                if (this.f39145a.transact(2, r02, null, 1) == false) goto L16;
            L20:
                r02.recycle();
                return;
            L16:
                if (Stub.getDefaultImpl() == null) goto L20;
                Stub.getDefaultImpl().asyncCall(r6, r7);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L12:
                r3 = null;
                goto L13
            L8:
                r02.writeInt(0);     // Catch: Throwable -> L6
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void syncCall(DataBuffer r6) throws RemoteException {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken(IAIDLInvoke.DESCRIPTOR);     // Catch: Throwable -> L6
                if (r6 == null) goto L8;
                r02.writeInt(1);     // Catch: Throwable -> L6
                r6.writeToParcel(r02, 0);     // Catch: Throwable -> L6
            L10:
                if (this.f39145a.transact(1, r02, r1, 0) == false) goto L12;
            L16:
                r1.readException();     // Catch: Throwable -> L6
                r1.recycle();
                r02.recycle();
                return;
            L12:
                if (Stub.getDefaultImpl() == null) goto L16;
                Stub.getDefaultImpl().syncCall(r6);     // Catch: Throwable -> L6
                r1.recycle();
                r02.recycle();
                return;
            L8:
                r02.writeInt(0);     // Catch: Throwable -> L6
            L6:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }
        }

        public Stub() {
            attachInterface(this, IAIDLInvoke.DESCRIPTOR);
        }

        public static IAIDLInvoke asInterface(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface(IAIDLInvoke.DESCRIPTOR);
            if (r02 == null) goto L12;
            if ((r02 instanceof IAIDLInvoke) == false) goto L12;
            return (IAIDLInvoke) r02;
        L12:
            return new a(r2);
        }

        public static IAIDLInvoke getDefaultImpl() {
            return a.f39144b;
        }

        public static boolean setDefaultImpl(IAIDLInvoke r1) {
            if (a.f39144b != null) goto L10;
            if (r1 == null) goto L7;
            a.f39144b = r1;
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
        public boolean onTransact(int r5, Parcel r6, Parcel r7, int r8) throws RemoteException {
            if (r5 == 1598968902) goto L20;
            DataBuffer r02 = null;
            if (r5 != 1) goto L7;
            r6.enforceInterface(IAIDLInvoke.DESCRIPTOR);
            if (r6.readInt() == 0) goto L18;
            r02 = DataBuffer.CREATOR.createFromParcel(r6);
        L18:
            syncCall(r02);
            r7.writeNoException();
            return true;
        L7:
            if (r5 != 2) goto L9;
            r6.enforceInterface(IAIDLInvoke.DESCRIPTOR);
            if (r6.readInt() == 0) goto L13;
            r02 = DataBuffer.CREATOR.createFromParcel(r6);
        L13:
            asyncCall(r02, IAIDLCallback.Stub.asInterface(r6.readStrongBinder()));
            return true;
        L9:
            return super.onTransact(r5, r6, r7, r8);
        L20:
            r7.writeString(IAIDLInvoke.DESCRIPTOR);
            return true;
        }
    }

    void asyncCall(DataBuffer r1, IAIDLCallback r2) throws RemoteException;

    void syncCall(DataBuffer r1) throws RemoteException;
}
