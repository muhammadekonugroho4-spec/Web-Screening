package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.a;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface("android.support.customtabs.IPostMessageService");
        L8:
            if (r4 != 1598968902) goto L10;
            r6.writeString("android.support.customtabs.IPostMessageService");
            return true;
        L10:
            if (r4 != 2) goto L12;
            g(a.AbstractBinderC0006a.V(r5.readStrongBinder()), (Bundle) b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
        L17:
            return true;
        L12:
            if (r4 != 3) goto L14;
            I(a.AbstractBinderC0006a.V(r5.readStrongBinder()), r5.readString(), (Bundle) b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            goto L17
        L14:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    public static class b {
        public static /* synthetic */ Object a(Parcel r02, Parcelable.Creator r1) {
            return b(r02, r1);
        }

        public static Object b(Parcel r1, Parcelable.Creator r2) {
            if (r1.readInt() != 0) goto L5;
            return null;
        L5:
            return r2.createFromParcel(r1);
        }
    }

    void I(android.support.customtabs.a r1, String r2, Bundle r3);

    void g(android.support.customtabs.a r1, Bundle r2);
}
