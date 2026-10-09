package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;

/* loaded from: classes5.dex */
public final class GoogleSignInStatusCodes extends CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
    }

    public static String getStatusCodeString(int r02) {
        switch(r02) {
            case 12500: goto L9;
            case 12501: goto L7;
            case 12502: goto L5;
            default: goto L4;
        };
    L5:
        return "Sign-in in progress";
    L7:
        return "Sign in action cancelled";
    L9:
        return "A non-recoverable sign in failure occurred";
    L4:
        return CommonStatusCodes.getStatusCodeString(r02);
    }
}
