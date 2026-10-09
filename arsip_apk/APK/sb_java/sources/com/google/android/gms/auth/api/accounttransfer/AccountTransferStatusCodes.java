package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.CommonStatusCodes;

/* loaded from: classes5.dex */
public final class AccountTransferStatusCodes extends CommonStatusCodes {
    public static final int CHALLENGE_NOT_ALLOWED = 20503;
    public static final int INVALID_REQUEST = 20502;
    public static final int NOT_ALLOWED_SECURITY = 20500;
    public static final int NO_DATA_AVAILABLE = 20501;
    public static final int SESSION_INACTIVE = 20504;

    private AccountTransferStatusCodes() {
    }

    public static String getStatusCodeString(int r02) {
        switch(r02) {
            case 20500: goto L13;
            case 20501: goto L11;
            case 20502: goto L9;
            case 20503: goto L7;
            case 20504: goto L5;
            default: goto L4;
        };
    L5:
        return "SESSION_INACTIVE";
    L7:
        return "CHALLENGE_NOT_ALLOWED";
    L9:
        return "INVALID_REQUEST";
    L11:
        return "NO_DATA_AVAILABLE";
    L13:
        return "NOT_ALLOWED_SECURITY";
    L4:
        return CommonStatusCodes.getStatusCodeString(r02);
    }
}
