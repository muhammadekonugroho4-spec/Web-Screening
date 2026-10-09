package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.customtabs.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0006a extends Binder implements a {

        /* renamed from: android.support.customtabs.a$a$a, reason: collision with other inner class name */
        public static class C0007a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1995a;

            public C0007a(IBinder r1) {
                this.f1995a = r1;
            }

            @Override // android.support.customtabs.a
            public void Q(String r4, Bundle r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                r02.writeString(r4);     // Catch: Throwable -> L6
                b.b(r02, r5, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(5, r02, r1, 0);     // Catch: Throwable -> L6
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

            @Override // android.support.customtabs.a
            public void R(Bundle r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                b.b(r02, r5, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(4, r02, r1, 0);     // Catch: Throwable -> L6
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

            @Override // android.support.customtabs.a
            public void S(int r3, Uri r4, boolean r5, Bundle r6) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                r02.writeInt(r3);     // Catch: Throwable -> L6
                b.b(r02, r4, 0);     // Catch: Throwable -> L6
                r02.writeInt(r5 ? 1 : 0);     // Catch: Throwable -> L6
                b.b(r02, r6, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(6, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1995a;
            }

            @Override // android.support.customtabs.a
            public Bundle f(String r4, Bundle r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                r02.writeString(r4);     // Catch: Throwable -> L6
                b.b(r02, r5, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(7, r02, r1, 0);     // Catch: Throwable -> L6
                r1.readException();     // Catch: Throwable -> L6
                Bundle r42 = (Bundle) b.a(r1, Bundle.CREATOR);     // Catch: Throwable -> L6
                r1.recycle();
                r02.recycle();
                return r42;
            L6:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }

            @Override // android.support.customtabs.a
            public void n(int r3, int r4, Bundle r5) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                r02.writeInt(r3);     // Catch: Throwable -> L6
                r02.writeInt(r4);     // Catch: Throwable -> L6
                b.b(r02, r5, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(8, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }

            @Override // android.support.customtabs.a
            public void q(int r4, Bundle r5) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                r02.writeInt(r4);     // Catch: Throwable -> L6
                b.b(r02, r5, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(2, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }

            @Override // android.support.customtabs.a
            public void z(String r4, Bundle r5) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");     // Catch: Throwable -> L6
                r02.writeString(r4);     // Catch: Throwable -> L6
                b.b(r02, r5, 0);     // Catch: Throwable -> L6
                this.f1995a.transact(3, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }
        }

        public AbstractBinderC0006a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public static a V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (r02 == null) goto L12;
            if ((r02 instanceof a) == false) goto L12;
            return (a) r02;
        L12:
            return new C0007a(r2);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        L8:
            if (r4 == 1598968902) goto L24;
            switch(r4) {
                case 2: goto L22;
                case 3: goto L21;
                case 4: goto L20;
                case 5: goto L19;
                case 6: goto L14;
                case 7: goto L13;
                case 8: goto L12;
                default: goto L11;
            };
        L12:
            n(r5.readInt(), r5.readInt(), (Bundle) b.a(r5, Bundle.CREATOR));
        L23:
            return true;
        L13:
            Bundle r42 = f(r5.readString(), (Bundle) b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            b.b(r6, r42, 1);
            goto L23
        L14:
            int r43 = r5.readInt();
            Uri r62 = (Uri) b.a(r5, Uri.CREATOR);
            if (r5.readInt() == 0) goto L17;
            boolean r72 = true;
        L18:
            S(r43, r62, r72, (Bundle) b.a(r5, Bundle.CREATOR));
            goto L23
        L17:
            r72 = false;
            goto L18
        L19:
            Q(r5.readString(), (Bundle) b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            goto L23
        L20:
            R((Bundle) b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            goto L23
        L21:
            z(r5.readString(), (Bundle) b.a(r5, Bundle.CREATOR));
            goto L23
        L22:
            q(r5.readInt(), (Bundle) b.a(r5, Bundle.CREATOR));
            goto L23
        L11:
            return super.onTransact(r4, r5, r6, r7);
        L24:
            r6.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
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

    void Q(String r1, Bundle r2);

    void R(Bundle r1);

    void S(int r1, Uri r2, boolean r3, Bundle r4);

    Bundle f(String r1, Bundle r2);

    void n(int r1, int r2, Bundle r3);

    void q(int r1, Bundle r2);

    void z(String r1, Bundle r2);
}
