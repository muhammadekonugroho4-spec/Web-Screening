package okhttp3.internal.platform.android;

import android.net.ssl.SSLSockets;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ boolean a(SSLSocket r02) {
        return SSLSockets.isSupportedSocket(r02);
    }
}
