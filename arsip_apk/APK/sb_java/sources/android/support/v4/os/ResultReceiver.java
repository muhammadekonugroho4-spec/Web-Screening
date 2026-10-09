package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2075b;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.os.a f2076c;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public ResultReceiver a(Parcel r2) {
            return new ResultReceiver(r2);
        }

        public ResultReceiver[] b(int r1) {
            return new ResultReceiver[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    public class b extends a.AbstractBinderC0020a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f2077a;

        public b(ResultReceiver r1) {
            this.f2077a = r1;
        }

        @Override // android.support.v4.os.a
        public void k(int r4, Bundle r5) {
            ResultReceiver r02 = this.f2077a;
            Handler r1 = r02.f2075b;
            if (r1 == null) goto L6;
            r1.post(new c(r02, r4, r5));
            return;
        L6:
            r02.a(r4, r5);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f2078a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f2079b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f2080c;

        public c(ResultReceiver r1, int r2, Bundle r3) {
            this.f2080c = r1;
            this.f2078a = r2;
            this.f2079b = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2080c.a(this.f2078a, this.f2079b);
        }
    }

    static {
        CREATOR = new a();
    }

    public ResultReceiver(Parcel r2) {
        this.f2074a = false;
        this.f2075b = null;
        this.f2076c = a.AbstractBinderC0020a.V(r2.readStrongBinder());
    }

    public void a(int r1, Bundle r2) {
    }

    public void b(int r3, Bundle r4) {
        if (this.f2074a == false) goto L10;
        Handler r02 = this.f2075b;
        if (r02 == null) goto L8;
        r02.post(new c(this, r3, r4));
        return;
    L8:
        a(r3, r4);
        return;
    L10:
        android.support.v4.os.a r03 = this.f2076c;
        if (r03 == null) goto L17;
        r03.k(r3, r4);     // Catch: RemoteException -> L14
        return;
    L18:
        return;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f2076c != null) goto L8;
        this.f2076c = new b(this);     // Catch: Throwable -> L6
    L8:
        r1.writeStrongBinder(this.f2076c.asBinder());     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
    }
}
