package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes4.dex */
public abstract class p {
    public static final NetworkCapabilities a(ConnectivityManager r1, Network r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return r1.getNetworkCapabilities(r2);
    }

    public static final boolean b(NetworkCapabilities r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return r1.hasCapability(r2);
    }

    public static final void c(ConnectivityManager r1, ConnectivityManager.NetworkCallback r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "networkCallback");
        r1.unregisterNetworkCallback(r2);
    }
}
