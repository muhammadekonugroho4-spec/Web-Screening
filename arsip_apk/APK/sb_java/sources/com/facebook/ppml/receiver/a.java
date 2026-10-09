package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: com.facebook.ppml.receiver.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0384a extends Binder implements a {

        /* renamed from: com.facebook.ppml.receiver.a$a$a, reason: collision with other inner class name */
        public static class C0385a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f36956a;

            public C0385a(IBinder r1) {
                this.f36956a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36956a;
            }

            @Override // com.facebook.ppml.receiver.a
            public int s(Bundle r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");     // Catch: Throwable -> L6
                b.a(r02, r5, 0);     // Catch: Throwable -> L6
                this.f36956a.transact(1, r02, r1, 0);     // Catch: Throwable -> L6
                r1.readException();     // Catch: Throwable -> L6
                int r52 = r1.readInt();     // Catch: Throwable -> L6
                r1.recycle();
                r02.recycle();
                return r52;
            L6:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }
        }

        public static a V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (r02 == null) goto L12;
            if ((r02 instanceof a) == false) goto L12;
            return (a) r02;
        L12:
            return new C0385a(r2);
        }
    }

    public static class b {
        public static /* synthetic */ void a(Parcel r02, Parcelable r1, int r2) {
            b(r02, r1, r2);
        }

        public static void b(Parcel r1, Parcelable r2, int r3) {
            if (r2 == null) goto L5;
            r1.writeInt(1);
            r2.writeToParcel(r1, r3);
            return;
        L5:
            r1.writeInt(0);
        }
    }

    int s(Bundle r1);
}
