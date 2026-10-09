package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes4.dex */
public abstract class q {
    public static final Network a(ConnectivityManager r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return r1.getActiveNetwork();
    }
}
