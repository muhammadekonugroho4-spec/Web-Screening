package okhttp3.internal.platform.android;

import android.net.ssl.SSLSockets;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ void a(SSLSocket r02, boolean r1) {
        SSLSockets.setUseSessionTickets(r02, r1);
    }
}
