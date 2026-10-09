package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.unusedapprestrictions.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: j, reason: collision with root package name */
    public static final String f22699j = null;

    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, b.f22699j);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
            String r02 = b.f22699j;
            if (r4 < 1) goto L8;
            if (r4 > 16777215) goto L8;
            r5.enforceInterface(r02);
        L8:
            if (r4 != 1598968902) goto L11;
            r6.writeString(r02);
            return true;
        L11:
            if (r4 != 1) goto L13;
            G(a.AbstractBinderC0158a.V(r5.readStrongBinder()));
            return true;
        L13:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    static {
        f22699j = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');
    }

    void G(androidx.core.app.unusedapprestrictions.a r1);
}
