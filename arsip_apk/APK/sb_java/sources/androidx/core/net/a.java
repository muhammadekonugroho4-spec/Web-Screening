package androidx.core.net;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(ConnectivityManager r02) {
        return r02.isActiveNetworkMetered();
    }
}
