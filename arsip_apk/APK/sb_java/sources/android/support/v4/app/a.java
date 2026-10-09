package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: g, reason: collision with root package name */
    public static final String f1998g = null;

    /* renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0013a extends Binder implements a {

        /* renamed from: android.support.v4.app.a$a$a, reason: collision with other inner class name */
        public static class C0014a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1999a;

            public C0014a(IBinder r1) {
                this.f1999a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1999a;
            }

            @Override // android.support.v4.app.a
            public void r(String r3, int r4, String r5, Notification r6) {
                Parcel r02 = Parcel.obtain();
                r02.writeInterfaceToken(a.f1998g);     // Catch: Throwable -> L6
                r02.writeString(r3);     // Catch: Throwable -> L6
                r02.writeInt(r4);     // Catch: Throwable -> L6
                r02.writeString(r5);     // Catch: Throwable -> L6
                b.a(r02, r6, 0);     // Catch: Throwable -> L6
                this.f1999a.transact(1, r02, null, 1);     // Catch: Throwable -> L6
                r02.recycle();
                return;
            L6:
                th = move-exception;
                r02.recycle();
                throw th;
            }
        }

        public static a V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface(a.f1998g);
            if (r02 == null) goto L12;
            if ((r02 instanceof a) == false) goto L12;
            return (a) r02;
        L12:
            return new C0014a(r2);
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

    static {
        f1998g = "android$support$v4$app$INotificationSideChannel".replace('$', '.');
    }

    void r(String r1, int r2, String r3, Notification r4);
}
