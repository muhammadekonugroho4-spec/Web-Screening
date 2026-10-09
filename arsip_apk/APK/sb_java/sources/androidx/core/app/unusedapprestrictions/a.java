package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: i, reason: collision with root package name */
    public static final String f22697i = null;

    /* renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0158a extends Binder implements a {

        /* renamed from: androidx.core.app.unusedapprestrictions.a$a$a, reason: collision with other inner class name */
        public static class C0159a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f22698a;

            public C0159a(IBinder r1) {
                this.f22698a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22698a;
            }
        }

        public static a V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface(a.f22697i);
            if (r02 == null) goto L12;
            if ((r02 instanceof a) == false) goto L12;
            return (a) r02;
        L12:
            return new C0159a(r2);
        }
    }

    static {
        f22697i = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');
    }
}
