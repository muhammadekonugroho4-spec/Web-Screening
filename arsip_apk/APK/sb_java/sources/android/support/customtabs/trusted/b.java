package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
        L8:
            if (r4 == 1598968902) goto L20;
            switch(r4) {
                case 2: goto L18;
                case 3: goto L17;
                case 4: goto L16;
                case 5: goto L15;
                case 6: goto L14;
                case 7: goto L13;
                case 8: goto L11;
                case 9: goto L12;
                default: goto L11;
            };
        L12:
            Bundle r42 = u(r5.readString(), (Bundle) C0012b.a(r5, Bundle.CREATOR), r5.readStrongBinder());
            r6.writeNoException();
            C0012b.b(r6, r42, 1);
        L19:
            return true;
        L13:
            Bundle r43 = v();
            r6.writeNoException();
            C0012b.b(r6, r43, 1);
            goto L19
        L14:
            Bundle r44 = M((Bundle) C0012b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            C0012b.b(r6, r44, 1);
            goto L19
        L15:
            Bundle r45 = D();
            r6.writeNoException();
            C0012b.b(r6, r45, 1);
            goto L19
        L16:
            int r46 = L();
            r6.writeNoException();
            r6.writeInt(r46);
            goto L19
        L17:
            O((Bundle) C0012b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            goto L19
        L18:
            Bundle r47 = i((Bundle) C0012b.a(r5, Bundle.CREATOR));
            r6.writeNoException();
            C0012b.b(r6, r47, 1);
            goto L19
        L11:
            return super.onTransact(r4, r5, r6, r7);
        L20:
            r6.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
            return true;
        }
    }

    /* renamed from: android.support.customtabs.trusted.b$b, reason: collision with other inner class name */
    public static class C0012b {
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

    Bundle D();

    int L();

    Bundle M(Bundle r1);

    void O(Bundle r1);

    Bundle i(Bundle r1);

    Bundle u(String r1, Bundle r2, IBinder r3);

    Bundle v();
}
