package com.huawei.hms.common.api;

import com.google.zxing.client.android.Intents;

/* loaded from: classes6.dex */
public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_REQUIRED = 6;

    @Deprecated
    public static final int SERVICE_DISABLED = 3;

    @Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    public CommonStatusCodes() {
    }

    public static String getStatusCodeString(int r2) {
        if (r2 == (-1)) goto L43;
        if (r2 != 0) goto L6;
        return "SUCCESS";
    L6:
        if (r2 != 10) goto L8;
        return "DEVELOPER_ERROR";
    L8:
        if (r2 == 9004) goto L37;
        switch(r2) {
            case 2: goto L35;
            case 3: goto L33;
            case 4: goto L31;
            case 5: goto L29;
            case 6: goto L27;
            case 7: goto L25;
            case 8: goto L23;
            default: goto L10;
        };
    L10:
        switch(r2) {
            case 13: goto L21;
            case 14: goto L19;
            case 15: goto L17;
            case 16: goto L15;
            case 17: goto L13;
            default: goto L12;
        };
    L13:
        return "API_NOT_CONNECTED";
    L15:
        return "CANCELED";
    L17:
        return Intents.Scan.TIMEOUT;
    L19:
        return "INTERRUPTED";
    L21:
        return "ERROR";
    L12:
        return "unknown status code: " + r2;
    L23:
        return "INTERNAL_ERROR";
    L25:
        return "NETWORK_ERROR";
    L27:
        return "RESOLUTION_REQUIRED";
    L29:
        return "INVALID_ACCOUNT";
    L31:
        return "SIGN_IN_REQUIRED";
    L33:
        return "SERVICE_DISABLED";
    L35:
        return "SERVICE_VERSION_UPDATE_REQUIRED";
    L37:
        return "DEAD_CLIENT";
    L43:
        return "SUCCESS_CACHE";
    }
}
