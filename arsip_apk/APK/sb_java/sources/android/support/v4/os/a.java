package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2081h = null;

    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0020a extends Binder implements a {

        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C0021a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f2082a;

            public C0021a(IBinder r1) {
                this.f2082a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2082a;
            }

            @Override // android.support.v4.os.a
            public void k(int r3, Bundle r4) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken(a.f2081h);     // Catch: Throwable -> L6
                r02.writeInt(r3);     // Catch: Throwable -> L6
                b.b(r02, r4, 0);     // Catch: Throwable -> L6
                this.f2082a.transact(1, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }
        }

        public AbstractBinderC0020a() {
            attachInterface(this, a.f2081h);
        }

        public static a V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface(a.f2081h);
            if (r02 == null) goto L12;
            if ((r02 instanceof a) == false) goto L12;
            return (a) r02;
        L12:
            return new C0021a(r2);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            String r02 = a.f2081h;
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface(r02);
        L8:
            if (r4 != 1598968902) goto L11;
            r6.writeString(r02);
            return true;
        L11:
            if (r4 != 1) goto L13;
            k(r5.readInt(), (Bundle) b.a(r5, Bundle.CREATOR));
            return true;
        L13:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    public static class b {
        public static /* synthetic */ Object a(Parcel r02, Parcelable.Creator r1) {
            return c(r02, r1);
        }

        public static /* synthetic */ void b(Parcel r02, Parcelable r1, int r2) {
            d(r02, r1, r2);
        }

        public static Object c(Parcel r1, Parcelable.Creator r2) {
            if (r1.readInt() != 0) goto L5;
            return null;
        L5:
            return r2.createFromParcel(r1);
        }

        public static void d(Parcel r1, Parcelable r2, int r3) {
            if (r2 == null) goto L5;
            r1.writeInt(1);
            r2.writeToParcel(r1, r3);
            return;
        L5:
            r1.writeInt(0);
        }
    }

    static {
        f2081h = "android$support$v4$os$IResultReceiver".replace('$', '.');
    }

    void k(int r1, Bundle r2);
}
