package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.InterfaceC4141k;

/* renamed from: androidx.room.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4142l extends IInterface {

    /* renamed from: l, reason: collision with root package name */
    public static final String f27894l = null;

    /* renamed from: androidx.room.l$a */
    public static abstract class a extends Binder implements InterfaceC4142l {

        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        public static class C0249a implements InterfaceC4142l {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f27895a;

            public C0249a(IBinder r1) {
                this.f27895a = r1;
            }

            @Override // androidx.room.InterfaceC4142l
            public void B(int r4, String[] r5) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken(InterfaceC4142l.f27894l);     // Catch: Throwable -> L6
                r02.writeInt(r4);     // Catch: Throwable -> L6
                r02.writeStringArray(r5);     // Catch: Throwable -> L6
                this.f27895a.transact(3, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }

            @Override // androidx.room.InterfaceC4142l
            public int F(InterfaceC4141k r4, String r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken(InterfaceC4142l.f27894l);     // Catch: Throwable -> L6
                r02.writeStrongInterface(r4);     // Catch: Throwable -> L6
                r02.writeString(r5);     // Catch: Throwable -> L6
                this.f27895a.transact(1, r02, r1, 0);     // Catch: Throwable -> L6
                r1.readException();     // Catch: Throwable -> L6
                int r42 = r1.readInt();     // Catch: Throwable -> L6
                r1.recycle();
                r02.recycle();
                return r42;
            L6:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }

            @Override // androidx.room.InterfaceC4142l
            public void T(InterfaceC4141k r4, int r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken(InterfaceC4142l.f27894l);     // Catch: Throwable -> L6
                r02.writeStrongInterface(r4);     // Catch: Throwable -> L6
                r02.writeInt(r5);     // Catch: Throwable -> L6
                this.f27895a.transact(2, r02, r1, 0);     // Catch: Throwable -> L6
                r1.readException();     // Catch: Throwable -> L6
                r1.recycle();
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27895a;
            }
        }

        public a() {
            attachInterface(this, InterfaceC4142l.f27894l);
        }

        public static InterfaceC4142l V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface(InterfaceC4142l.f27894l);
            if (r02 == null) goto L12;
            if ((r02 instanceof InterfaceC4142l) == false) goto L12;
            return (InterfaceC4142l) r02;
        L12:
            return new C0249a(r2);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            String r02 = InterfaceC4142l.f27894l;
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface(r02);
        L8:
            if (r4 != 1598968902) goto L11;
            r6.writeString(r02);
            return true;
        L11:
            if (r4 != 1) goto L13;
            int r42 = F(InterfaceC4141k.a.V(r5.readStrongBinder()), r5.readString());
            r6.writeNoException();
            r6.writeInt(r42);
        L21:
            return true;
        L13:
            if (r4 != 2) goto L15;
            T(InterfaceC4141k.a.V(r5.readStrongBinder()), r5.readInt());
            r6.writeNoException();
            goto L21
        L15:
            if (r4 != 3) goto L17;
            B(r5.readInt(), r5.createStringArray());
            goto L21
        L17:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    static {
        f27894l = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');
    }

    void B(int r1, String[] r2);

    int F(InterfaceC4141k r1, String r2);

    void T(InterfaceC4141k r1, int r2);
}
