package com.huawei.hms.hatool;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes6.dex */
public class h {
    private static String a(int r02, String r1) {
        switch(r02) {
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
            default: goto L4;
        };
    L11:
        return "4G";
    L13:
        return "3G";
    L15:
        return "2G";
    L4:
        if (r1.equalsIgnoreCase("TD-SCDMA") == false) goto L6;
        return "3G";
    L6:
        if (r1.equalsIgnoreCase("WCDMA") == false) goto L8;
        return "3G";
    L8:
        if (r1.equalsIgnoreCase("CDMA2000") == true) goto L19;
        return r1;
    L19:
        return "3G";
    }

    public static String a(Context r5) {
        if (r5 != null) goto L5;
    L32:
        z.f("hmsSdk", "not have network state phone permission!");
        return "";
    L5:
        if (r5.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", r5.getPackageName()) != 0) goto L32;
        ConnectivityManager r52 = (ConnectivityManager) r5.getSystemService("connectivity");
        if (r52 == null) goto L31;
        NetworkInfo r53 = r52.getActiveNetworkInfo();
        if (r53 == null) goto L31;
        if (r53.isConnected() == false) goto L31;
        if (r53.getType() != 1) goto L18;
        return "WIFI";
    L18:
        if (r53.getType() != 0) goto L22;
        String r02 = r53.getSubtypeName();
        z.c("hmsSdk", "Network getSubtypeName : " + r02);
        return a(r53.getSubtype(), r02);
    L22:
        if (r53.getType() != 16) goto L26;
        z.f("hmsSdk", "type name = COMPANION_PROXY");
        return "COMPANION_PROXY";
    L26:
        if (r53.getType() != 9) goto L29;
        z.c("hmsSdk", "type name = ETHERNET");
        return "ETHERNET";
    L29:
        z.c("hmsSdk", "type name = " + r53.getType());
        return "OTHER_NETWORK_TYPE";
    L31:
        return "";
    }
}
