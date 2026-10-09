package androidx.work.impl.utils;

import android.net.ConnectivityManager;

/* loaded from: classes4.dex */
public abstract class r {
    public static final void a(ConnectivityManager r1, ConnectivityManager.NetworkCallback r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "networkCallback");
        r1.registerDefaultNetworkCallback(r2);
    }
}
