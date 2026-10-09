package com.huawei.hms.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes6.dex */
public abstract class NetWorkUtil {

    public static final class NetType {
        public static final int NET = -2;
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_5G = 5;
        public static final int TYPE_ETHERNET = 9;
        public static final int TYPE_NEED_INIT = -1;
        public static final int TYPE_OTHER = 6;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
        public static final int WAP = -3;

        public NetType() {
        }
    }

    public NetWorkUtil() {
    }

    private static NetworkInfo a(Context r1) {
        ConnectivityManager r12 = (ConnectivityManager) r1.getSystemService("connectivity");
        if (r12 != null) goto L5;
        return null;
    L5:
        return r12.getActiveNetworkInfo();
    }

    public static int getNetworkType(Context r02) {
        return a(a(r02));
    }

    private static int a(NetworkInfo r2) {
        if (r2 != null) goto L4;
        return 0;
    L4:
        if (r2.isConnected() == true) goto L6;
        return 0;
    L6:
        if (r2.getType() != 1) goto L9;
        return 1;
    L9:
        if (r2.getType() != 0) goto L24;
        int r22 = r2.getSubtype();
        if (r22 == 20) goto L21;
        switch(r22) {
            case 1: goto L19;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L19;
            case 5: goto L17;
            case 6: goto L17;
            case 7: goto L17;
            case 8: goto L17;
            case 9: goto L17;
            case 10: goto L17;
            case 11: goto L17;
            case 12: goto L17;
            case 13: goto L15;
            case 14: goto L15;
            case 15: goto L17;
            default: goto L13;
        };
    L13:
        return 6;
    L15:
        return 4;
    L17:
        return 3;
    L19:
        return 2;
    L21:
        return 5;
    L24:
        if (9 != r2.getType()) goto L29;
        return 9;
    L29:
        return 0;
    }
}
