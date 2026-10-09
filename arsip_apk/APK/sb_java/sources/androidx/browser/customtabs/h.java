package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.customtabs.a f3899a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f3900b;

    /* renamed from: c, reason: collision with root package name */
    public final b f3901c;

    public class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f3902a;

        public a(h r1) {
            this.f3902a = r1;
        }

        @Override // androidx.browser.customtabs.b
        public void a(String r2, Bundle r3) {
            this.f3902a.f3899a.z(r2, r3);     // Catch: RemoteException -> L4
            return;
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }

        @Override // androidx.browser.customtabs.b
        public Bundle b(String r2, Bundle r3) {
            return this.f3902a.f3899a.f(r2, r3);
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            return null;
        }

        @Override // androidx.browser.customtabs.b
        public void c(int r2, int r3, Bundle r4) {
            this.f3902a.f3899a.n(r2, r3, r4);     // Catch: RemoteException -> L4
            return;
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }

        @Override // androidx.browser.customtabs.b
        public void d(Bundle r2) {
            this.f3902a.f3899a.R(r2);     // Catch: RemoteException -> L4
            return;
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }

        @Override // androidx.browser.customtabs.b
        public void e(int r2, Bundle r3) {
            this.f3902a.f3899a.q(r2, r3);     // Catch: RemoteException -> L4
            return;
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }

        @Override // androidx.browser.customtabs.b
        public void f(String r2, Bundle r3) {
            this.f3902a.f3899a.Q(r2, r3);     // Catch: RemoteException -> L4
            return;
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }

        @Override // androidx.browser.customtabs.b
        public void g(int r2, Uri r3, boolean r4, Bundle r5) {
            this.f3902a.f3899a.S(r2, r3, r4, r5);     // Catch: RemoteException -> L4
            return;
        L4:
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    public h(android.support.customtabs.a r1, PendingIntent r2) {
        if (r1 != null) goto L8;
        if (r2 != null) goto L8;
        throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
    L8:
        this.f3899a = r1;
        this.f3900b = r2;
        if (r1 != null) goto L11;
        a r12 = null;
    L12:
        this.f3901c = r12;
        return;
    L11:
        r12 = new a(this);
        goto L12
    }

    public IBinder a() {
        android.support.customtabs.a r02 = this.f3899a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.asBinder();
    }

    public final IBinder b() {
        android.support.customtabs.a r02 = this.f3899a;
        if (r02 == null) goto L7;
        return r02.asBinder();
    L7:
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public PendingIntent c() {
        return this.f3900b;
    }

    public boolean equals(Object r6) {
        if ((r6 instanceof h) == true) goto L5;
        return false;
    L5:
        h r62 = (h) r6;
        PendingIntent r02 = r62.c();
        PendingIntent r2 = this.f3900b;
        boolean r3 = true;
        if (r2 != null) goto L8;
        boolean r4 = true;
    L9:
        if (r02 == null) goto L12;
        r3 = false;
    L12:
        if (r4 == r3) goto L14;
        return false;
    L14:
        if (r2 == null) goto L18;
        return r2.equals(r02);
    L18:
        return b().equals(r62.b());
    L8:
        r4 = false;
        goto L9
    }

    public int hashCode() {
        PendingIntent r02 = this.f3900b;
        if (r02 == null) goto L7;
        return r02.hashCode();
    L7:
        return b().hashCode();
    }
}
