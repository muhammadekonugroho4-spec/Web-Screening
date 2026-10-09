package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C0019a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f2073a;

            public C0019a(IBinder r1) {
                this.f2073a = r1;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2073a;
            }
        }

        public static b V(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (r02 == null) goto L12;
            if ((r02 instanceof b) == false) goto L12;
            return (b) r02;
        L12:
            return new C0019a(r2);
        }
    }
}
