package com.midtrans.sdk.analytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes6.dex */
public abstract class c {
    public static int a(int r2, ConnectivityManager r3) {
        NetworkCapabilities r32 = r3.getNetworkCapabilities(r3.getActiveNetwork());
        if (r32 != null) goto L5;
        return r2;
    L5:
        if (r32.hasTransport(1) == false) goto L9;
        return 2;
    L9:
        if (r32.hasTransport(0) == false) goto L12;
        return 1;
    L12:
        if (r32.hasTransport(4) == false) goto L16;
        return 3;
    L16:
        return r2;
    }

    public static int b(Context r1) {
        ConnectivityManager r12 = (ConnectivityManager) r1.getSystemService("connectivity");
        if (r12 != null) goto L5;
        return 0;
    L5:
        return a(0, r12);
    }

    public static int c(TelephonyManager r1) {
        return r1.getDataNetworkType();
    L4:
        e = move-exception;
        Log.e("SecurityException", e.toString());
        return 0;
    }

    public static String d(Context r3) {
        if (r3 == null) goto L17;
        int r1 = b(r3);
        TelephonyManager r32 = (TelephonyManager) r3.getSystemService("phone");
        if (r1 != 2) goto L9;
        return "WIFI";
    L9:
        switch(c(r32)) {
            case 1: goto L15;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L13;
            case 7: goto L15;
            case 8: goto L13;
            case 9: goto L13;
            case 10: goto L13;
            case 11: goto L15;
            case 12: goto L13;
            case 13: goto L11;
            case 14: goto L13;
            case 15: goto L13;
            default: goto L10;
        };
    L10:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L11:
        return "4G";
    L13:
        return "3G";
    L15:
        return "2G";
    L17:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }
}
