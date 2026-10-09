package org.minidns.constants;

import com.clevertap.android.sdk.Constants;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f182646a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f182647b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Inet4Address[] f182648c = null;
    public static final Inet6Address[] d = null;

    static {
        f182646a = new HashMap();
        f182647b = new HashMap();
        f182648c = new Inet4Address[]{c('a', 198, 41, 0, 4), c(Constants.INAPP_POSITION_BOTTOM, 192, 228, 79, 201), c(Constants.INAPP_POSITION_CENTER, 192, 33, 4, 12), c('d', 199, 7, 91, 13), c('e', 192, 203, 230, 10), c('f', 192, 5, 5, 241), c('g', 192, 112, 36, 4), c('h', 198, 97, 190, 53), c('i', 192, 36, 148, 17), c('j', 192, 58, 128, 30), c('k', 193, 0, 14, 129), c(Constants.INAPP_POSITION_LEFT, 199, 7, 83, 42), c('m', 202, 12, 27, 33)};
        d = new Inet6Address[]{d('a', 8193, 1283, 47678, 0, 0, 0, 2, 48), d(Constants.INAPP_POSITION_BOTTOM, 8193, 1280, 132, 0, 0, 0, 0, 11), d(Constants.INAPP_POSITION_CENTER, 8193, 1280, 2, 0, 0, 0, 0, 12), d('d', 8193, 1280, 45, 0, 0, 0, 0, 13), d('f', 8193, 1280, 47, 0, 0, 0, 0, 15), d('h', 8193, 1280, 1, 0, 0, 0, 0, 83), d('i', 8193, 2046, 0, 0, 0, 0, 0, 83), d('j', 8193, 1283, 3111, 0, 0, 0, 2, 48), d(Constants.INAPP_POSITION_LEFT, 8193, 1280, 3, 0, 0, 0, 0, 66), d('m', 8193, 3523, 0, 0, 0, 0, 0, 53)};
    }

    public static Inet4Address a(Random r2) {
        Inet4Address[] r02 = f182648c;
        return r02[r2.nextInt(r02.length)];
    }

    public static Inet6Address b(Random r2) {
        Inet6Address[] r02 = d;
        return r02[r2.nextInt(r02.length)];
    }

    public static Inet4Address c(char r3, int r4, int r5, int r6, int r7) {
        Inet4Address r42 = (Inet4Address) InetAddress.getByAddress(r3 + ".root-servers.net", new byte[]{(byte) r4, (byte) r5, (byte) r6, (byte) r7});     // Catch: UnknownHostException -> L5
        f182646a.put(Character.valueOf(r3), r42);     // Catch: UnknownHostException -> L5
        return r42;
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static Inet6Address d(char r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        Inet6Address r02 = (Inet6Address) InetAddress.getByAddress(r18 + ".root-servers.net", new byte[]{(byte) (r19 >> 8), (byte) r19, (byte) (r20 >> 8), (byte) r20, (byte) (r21 >> 8), (byte) r21, (byte) (r22 >> 8), (byte) r22, (byte) (r23 >> 8), (byte) r23, (byte) (r24 >> 8), (byte) r24, (byte) (r25 >> 8), (byte) r25, (byte) (r26 >> 8), (byte) r26});     // Catch: UnknownHostException -> L5
        f182647b.put(Character.valueOf(r18), r02);     // Catch: UnknownHostException -> L5
        return r02;
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
