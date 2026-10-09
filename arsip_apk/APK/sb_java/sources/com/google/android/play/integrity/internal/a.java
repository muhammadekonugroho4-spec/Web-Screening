package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f38323a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38324b;

    public a(IBinder r1, String r2) {
        this.f38323a = r1;
        this.f38324b = r2;
    }

    public final Parcel a() {
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.f38324b);
        return r02;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38323a;
    }

    public final void b(int r4, Parcel r5) throws RemoteException {
        this.f38323a.transact(r4, r5, null, 1);     // Catch: Throwable -> L5
        r5.recycle();
        return;
    L5:
        th = move-exception;
        r5.recycle();
        throw th;
    }
}
