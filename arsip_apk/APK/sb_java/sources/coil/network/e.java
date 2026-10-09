package coil.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.network.c;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f30083a;

    /* renamed from: b, reason: collision with root package name */
    public final c.a f30084b;

    /* renamed from: c, reason: collision with root package name */
    public final a f30085c;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f30086a;

        public a(e r1) {
            this.f30086a = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network r3) {
            e.b(this.f30086a, r3, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network r3) {
            e.b(this.f30086a, r3, false);
        }
    }

    public e(ConnectivityManager r3, c.a r4) {
        this.f30083a = r3;
        this.f30084b = r4;
        a r42 = new a(this);
        this.f30085c = r42;
        r3.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), r42);
    }

    public static final /* synthetic */ void b(e r02, Network r1, boolean r2) {
        r02.d(r1, r2);
    }

    @Override // coil.network.c
    public boolean a() {
        Network[] r02 = this.f30083a.getAllNetworks();
        int r1 = r02.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (c(r02[r3]) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public final boolean c(Network r2) {
        NetworkCapabilities r22 = this.f30083a.getNetworkCapabilities(r2);
        if (r22 != null) goto L5;
        return false;
    L5:
        if (r22.hasCapability(12) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void d(Network r7, boolean r8) {
        Network[] r02 = this.f30083a.getAllNetworks();
        int r1 = r02.length;
        boolean r2 = false;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        Network r4 = r02[r3];
        if (p.g(r4, r7) == false) goto L7;
        boolean r42 = r8;
    L8:
        if (r42 == true) goto L9;
        r3 = r3 + 1;
        goto L3
    L9:
        r2 = true;
        goto L11
    L7:
        r42 = c(r4);
    L11:
        this.f30084b.a(r2);
    }

    @Override // coil.network.c
    public void shutdown() {
        this.f30083a.unregisterNetworkCallback(this.f30085c);
    }
}
