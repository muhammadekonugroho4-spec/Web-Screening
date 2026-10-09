package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

/* loaded from: classes4.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends b implements IGetInstallReferrerService {

        public static class Proxy extends a implements IGetInstallReferrerService {
            public Proxy(IBinder r1) {
                super(r1);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle c(Bundle r2) throws RemoteException {
                Parcel r02 = a();
                c.b(r02, r2);
                Parcel r22 = b(r02);
                Bundle r03 = (Bundle) c.a(r22, Bundle.CREATOR);
                r22.recycle();
                return r03;
            }
        }

        public Stub() {
        }

        public static IGetInstallReferrerService b(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if ((r02 instanceof IGetInstallReferrerService) == false) goto L10;
            return (IGetInstallReferrerService) r02;
        L10:
            return new Proxy(r2);
        }

        @Override // com.google.android.a.b
        public final boolean a(int r2, Parcel r3, Parcel r4) throws RemoteException {
            if (r2 != 1) goto L6;
            Bundle r22 = c((Bundle) c.a(r3, Bundle.CREATOR));
            r4.writeNoException();
            c.c(r4, r22);
            return true;
        L6:
            return false;
        }
    }

    Bundle c(Bundle r1) throws RemoteException;
}
