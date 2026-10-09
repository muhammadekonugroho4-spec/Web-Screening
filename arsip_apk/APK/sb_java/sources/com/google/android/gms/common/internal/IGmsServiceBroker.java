package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes5.dex */
public interface IGmsServiceBroker extends IInterface {

    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) throws RemoteException {
            if (r4 <= 0) goto L73;
            if (r4 > 16777215) goto L73;
            r5.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder r72 = r5.readStrongBinder();
            GetServiceRequest r02 = null;
            if (r72 != null) goto L9;
            IGmsCallbacks r1 = null;
        L14:
            if (r4 != 46) goto L21;
            if (r5.readInt() == 0) goto L18;
            r02 = GetServiceRequest.CREATOR.createFromParcel(r5);
        L18:
            getService(r1, r02);
            Preconditions.checkNotNull(r6);
            r6.writeNoException();
            return true;
        L21:
            if (r4 == 47) goto L23;
            r5.readInt();
            if (r4 == 4) goto L71;
            r5.readString();
            if (r4 != 1) goto L32;
            r5.readString();
            r5.createStringArray();
            r5.readString();
            if (r5.readInt() == 0) goto L71;
            Bundle r42 = (Bundle) Bundle.CREATOR.createFromParcel(r5);
            goto L71
        L32:
            if (r4 == 2) goto L65;
            if (r4 == 23) goto L65;
            if (r4 == 25) goto L65;
            if (r4 == 27) goto L65;
            if (r4 != 30) goto L42;
        L61:
            r5.createStringArray();
            r5.readString();
            if (r5.readInt() == 0) goto L71;
            Bundle r43 = (Bundle) Bundle.CREATOR.createFromParcel(r5);
            goto L71
        L42:
            if (r4 != 34) goto L44;
            r5.readString();
            goto L71
        L44:
            if (r4 == 41) goto L65;
            if (r4 == 43) goto L65;
            if (r4 == 37) goto L65;
            if (r4 == 38) goto L65;
            switch(r4) {
                case 5: goto L65;
                case 6: goto L65;
                case 7: goto L65;
                case 8: goto L65;
                case 9: goto L57;
                case 10: goto L56;
                case 11: goto L65;
                case 12: goto L65;
                case 13: goto L65;
                case 14: goto L65;
                case 15: goto L65;
                case 16: goto L65;
                case 17: goto L65;
                case 18: goto L65;
                case 19: goto L53;
                case 20: goto L61;
                default: goto L71;
            };
        L53:
            r5.readStrongBinder();
            if (r5.readInt() == 0) goto L71;
            Bundle r44 = (Bundle) Bundle.CREATOR.createFromParcel(r5);
            goto L71
        L56:
            r5.readString();
            r5.createStringArray();
            goto L71
        L57:
            r5.readString();
            r5.createStringArray();
            r5.readString();
            r5.readStrongBinder();
            r5.readString();
            if (r5.readInt() == 0) goto L71;
            Bundle r45 = (Bundle) Bundle.CREATOR.createFromParcel(r5);
        L65:
            if (r5.readInt() == 0) goto L71;
            Bundle r46 = (Bundle) Bundle.CREATOR.createFromParcel(r5);
        L71:
            throw new UnsupportedOperationException();
        L23:
            if (r5.readInt() == 0) goto L26;
            zzal r47 = zzal.CREATOR.createFromParcel(r5);
        L26:
            throw new UnsupportedOperationException();
        L9:
            IInterface r12 = r72.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            if ((r12 instanceof IGmsCallbacks) == false) goto L12;
            r1 = (IGmsCallbacks) r12;
            goto L14
        L12:
            r1 = new zzab(r72);
        L73:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    @KeepForSdk
    void getService(IGmsCallbacks r1, GetServiceRequest r2) throws RemoteException;
}
