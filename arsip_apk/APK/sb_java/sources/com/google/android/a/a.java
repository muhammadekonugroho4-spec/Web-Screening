package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f37940a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37941b;

    public a(IBinder r1) {
        this.f37940a = r1;
        this.f37941b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
    }

    public final Parcel a() {
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.f37941b);
        return r02;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37940a;
    }

    public final Parcel b(Parcel r5) throws RemoteException {
        Parcel r02 = Parcel.obtain();
        this.f37940a.transact(1, r5, r02, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r02.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r5.recycle();
        return r02;
    L6:
        th = move-exception;
        r5.recycle();
        throw th;
    L8:
        e = move-exception;
        r02.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }
}
