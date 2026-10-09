package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdkWithMembers
/* loaded from: classes5.dex */
public class AuthApiStatusCodes extends CommonStatusCodes {

    @ShowFirstParty
    public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;

    @ShowFirstParty
    public static final int AUTH_API_CLIENT_ERROR = 3002;

    @ShowFirstParty
    public static final int AUTH_API_INVALID_CREDENTIALS = 3000;

    @ShowFirstParty
    public static final int AUTH_API_SERVER_ERROR = 3003;

    @ShowFirstParty
    public static final int AUTH_APP_CERT_ERROR = 3006;

    @ShowFirstParty
    public static final int AUTH_TOKEN_ERROR = 3004;

    @ShowFirstParty
    public static final int AUTH_URL_RESOLUTION = 3005;

    private AuthApiStatusCodes() {
    }

    public static String getStatusCodeString(int r02) {
        switch(r02) {
            case 3000: goto L17;
            case 3001: goto L15;
            case 3002: goto L13;
            case 3003: goto L11;
            case 3004: goto L9;
            case 3005: goto L7;
            case 3006: goto L5;
            default: goto L4;
        };
    L5:
        return "AUTH_APP_CERT_ERROR";
    L7:
        return "AUTH_URL_RESOLUTION";
    L9:
        return "AUTH_TOKEN_ERROR";
    L11:
        return "AUTH_API_SERVER_ERROR";
    L13:
        return "AUTH_API_CLIENT_ERROR";
    L15:
        return "AUTH_API_ACCESS_FORBIDDEN";
    L17:
        return "AUTH_API_INVALID_CREDENTIALS";
    L4:
        return CommonStatusCodes.getStatusCodeString(r02);
    }
}
