package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.customtabs.trusted.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0010a extends Binder implements a {

        /* renamed from: android.support.customtabs.trusted.a$a$a, reason: collision with other inner class name */
        public static class C0011a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1997a;

            public C0011a(IBinder r1) {
                this.f1997a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1997a;
            }
        }

        public static a V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            if (r02 == null) goto L12;
            if ((r02 instanceof a) == false) goto L12;
            return (a) r02;
        L12:
            return new C0011a(r2);
        }
    }
}
