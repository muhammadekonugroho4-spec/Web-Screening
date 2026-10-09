package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.a;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.customtabs.b$a$a, reason: collision with other inner class name */
        public static class C0008a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1996a;

            public C0008a(IBinder r1) {
                this.f1996a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1996a;
            }

            @Override // android.support.customtabs.b
            public boolean l(android.support.customtabs.a r4, Uri r5, Bundle r6, List r7) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsService");     // Catch: Throwable -> L8
                r02.writeStrongInterface(r4);     // Catch: Throwable -> L8
                boolean r42 = false;
                C0009b.b(r02, r5, 0);     // Catch: Throwable -> L8
                C0009b.b(r02, r6, 0);     // Catch: Throwable -> L8
                r02.writeTypedList(r7);     // Catch: Throwable -> L8
                this.f1996a.transact(4, r02, r1, 0);     // Catch: Throwable -> L8
                r1.readException();     // Catch: Throwable -> L8
                if (r1.readInt() == 0) goto L6;
                r42 = true;
            L6:
                r1.recycle();
                r02.recycle();
                return r42;
            L8:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }

            @Override // android.support.customtabs.b
            public boolean m(long r4) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsService");     // Catch: Throwable -> L8
                r02.writeLong(r4);     // Catch: Throwable -> L8
                boolean r2 = false;
                this.f1996a.transact(2, r02, r1, 0);     // Catch: Throwable -> L8
                r1.readException();     // Catch: Throwable -> L8
                if (r1.readInt() == 0) goto L6;
                r2 = true;
            L6:
                r1.recycle();
                r02.recycle();
                return r2;
            L8:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }

            @Override // android.support.customtabs.b
            public boolean p(android.support.customtabs.a r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsService");     // Catch: Throwable -> L8
                r02.writeStrongInterface(r5);     // Catch: Throwable -> L8
                boolean r3 = false;
                this.f1996a.transact(3, r02, r1, 0);     // Catch: Throwable -> L8
                r1.readException();     // Catch: Throwable -> L8
                if (r1.readInt() == 0) goto L6;
                r3 = true;
            L6:
                r1.recycle();
                r02.recycle();
                return r3;
            L8:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }

            @Override // android.support.customtabs.b
            public boolean y(android.support.customtabs.a r4, Bundle r5) {
                Parcel r02 = Parcel.obtain();
                Parcel r1 = Parcel.obtain();
                r02.writeInterfaceToken("android.support.customtabs.ICustomTabsService");     // Catch: Throwable -> L8
                r02.writeStrongInterface(r4);     // Catch: Throwable -> L8
                boolean r42 = false;
                C0009b.b(r02, r5, 0);     // Catch: Throwable -> L8
                this.f1996a.transact(10, r02, r1, 0);     // Catch: Throwable -> L8
                r1.readException();     // Catch: Throwable -> L8
                if (r1.readInt() == 0) goto L6;
                r42 = true;
            L6:
                r1.recycle();
                r02.recycle();
                return r42;
            L8:
                th = move-exception;
                r1.recycle();
                r02.recycle();
                throw th;
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        public static b V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (r02 == null) goto L12;
            if ((r02 instanceof b) == false) goto L12;
            return (b) r02;
        L12:
            return new C0008a(r2);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface("android.support.customtabs.ICustomTabsService");
        L8:
            if (r4 == 1598968902) goto L24;
            switch(r4) {
                case 2: goto L22;
                case 3: goto L21;
                case 4: goto L20;
                case 5: goto L19;
                case 6: goto L18;
                case 7: goto L17;
                case 8: goto L16;
                case 9: goto L15;
                case 10: goto L14;
                case 11: goto L13;
                case 12: goto L12;
                default: goto L11;
            };
        L12:
            boolean r42 = c(a.AbstractBinderC0006a.V(r5.readStrongBinder()), (Uri) C0009b.a(r5, Uri.CREATOR), r5.readInt(), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            r6.writeInt(r42 ? 1 : 0);
        L23:
            return true;
        L13:
            boolean r43 = x(a.AbstractBinderC0006a.V(r5.readStrongBinder()), (Uri) C0009b.a(r5, Uri.CREATOR), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            r6.writeInt(r43 ? 1 : 0);
            goto L23
        L14:
            boolean r44 = y(a.AbstractBinderC0006a.V(r5.readStrongBinder()), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            r6.writeInt(r44 ? 1 : 0);
            goto L23
        L15:
            boolean r45 = a(a.AbstractBinderC0006a.V(r5.readStrongBinder()), r5.readInt(), (Uri) C0009b.a(r5, Uri.CREATOR), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            r6.writeInt(r45 ? 1 : 0);
            goto L23
        L16:
            int r46 = o(a.AbstractBinderC0006a.V(r5.readStrongBinder()), r5.readString(), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            r6.writeInt(r46);
            goto L23
        L17:
            boolean r47 = P(a.AbstractBinderC0006a.V(r5.readStrongBinder()), (Uri) C0009b.a(r5, Uri.CREATOR));
            r6.writeNoException();
            r6.writeInt(r47 ? 1 : 0);
            goto L23
        L18:
            boolean r48 = j(a.AbstractBinderC0006a.V(r5.readStrongBinder()), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            r6.writeInt(r48 ? 1 : 0);
            goto L23
        L19:
            Bundle r49 = t(r5.readString(), (Bundle) C0009b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            C0009b.b(r6, r49, 1);
            goto L23
        L20:
            android.support.customtabs.a r410 = a.AbstractBinderC0006a.V(r5.readStrongBinder());
            Uri r72 = (Uri) C0009b.a(r5, Uri.CREATOR);
            Parcelable.Creator r02 = Bundle.CREATOR;
            boolean r411 = l(r410, r72, (Bundle) C0009b.a(r5, r02), r5.createTypedArrayList(r02));
            r6.writeNoException();
            r6.writeInt(r411 ? 1 : 0);
            goto L23
        L21:
            boolean r412 = p(a.AbstractBinderC0006a.V(r5.readStrongBinder()));
            r6.writeNoException();
            r6.writeInt(r412 ? 1 : 0);
            goto L23
        L22:
            boolean r413 = m(r5.readLong());
            r6.writeNoException();
            r6.writeInt(r413 ? 1 : 0);
            goto L23
        L11:
            return super.onTransact(r4, r5, r6, r7);
        L24:
            r6.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
    }

    /* renamed from: android.support.customtabs.b$b, reason: collision with other inner class name */
    public static class C0009b {
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

    boolean P(android.support.customtabs.a r1, Uri r2);

    boolean a(android.support.customtabs.a r1, int r2, Uri r3, Bundle r4);

    boolean c(android.support.customtabs.a r1, Uri r2, int r3, Bundle r4);

    boolean j(android.support.customtabs.a r1, Bundle r2);

    boolean l(android.support.customtabs.a r1, Uri r2, Bundle r3, List r4);

    boolean m(long r1);

    int o(android.support.customtabs.a r1, String r2, Bundle r3);

    boolean p(android.support.customtabs.a r1);

    Bundle t(String r1, Bundle r2);

    boolean x(android.support.customtabs.a r1, Uri r2, Bundle r3);

    boolean y(android.support.customtabs.a r1, Bundle r2);
}
