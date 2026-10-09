package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: androidx.room.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4141k extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f27892k = null;

    /* renamed from: androidx.room.k$a */
    public static abstract class a extends Binder implements InterfaceC4141k {

        /* renamed from: androidx.room.k$a$a, reason: collision with other inner class name */
        public static class C0248a implements InterfaceC4141k {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f27893a;

            public C0248a(IBinder r1) {
                this.f27893a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27893a;
            }

            @Override // androidx.room.InterfaceC4141k
            public void b(String[] r4) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken(InterfaceC4141k.f27892k);     // Catch: Throwable -> L6
                r02.writeStringArray(r4);     // Catch: Throwable -> L6
                this.f27893a.transact(1, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }
        }

        public a() {
            attachInterface(this, InterfaceC4141k.f27892k);
        }

        public static InterfaceC4141k V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface(InterfaceC4141k.f27892k);
            if (r02 == null) goto L12;
            if ((r02 instanceof InterfaceC4141k) == false) goto L12;
            return (InterfaceC4141k) r02;
        L12:
            return new C0248a(r2);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            String r02 = InterfaceC4141k.f27892k;
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface(r02);
        L8:
            if (r4 != 1598968902) goto L11;
            r6.writeString(r02);
            return true;
        L11:
            if (r4 != 1) goto L13;
            b(r5.createStringArray());
            return true;
        L13:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    static {
        f27892k = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');
    }

    void b(String[] r1);
}
