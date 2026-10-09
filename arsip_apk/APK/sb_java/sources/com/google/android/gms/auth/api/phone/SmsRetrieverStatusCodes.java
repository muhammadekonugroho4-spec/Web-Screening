package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.CommonStatusCodes;

/* loaded from: classes5.dex */
public final class SmsRetrieverStatusCodes extends CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    private SmsRetrieverStatusCodes() {
    }

    public static String getStatusCodeString(int r02) {
        switch(r02) {
            case 36500: goto L9;
            case 36501: goto L7;
            case 36502: goto L5;
            default: goto L4;
        };
    L5:
        return "USER_PERMISSION_REQUIRED";
    L7:
        return "API_NOT_AVAILABLE";
    L9:
        return "PLATFORM_NOT_SUPPORTED";
    L4:
        return CommonStatusCodes.getStatusCodeString(r02);
    }
}
