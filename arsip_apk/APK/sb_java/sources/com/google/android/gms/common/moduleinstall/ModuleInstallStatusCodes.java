package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.CommonStatusCodes;

/* loaded from: classes5.dex */
public final class ModuleInstallStatusCodes extends CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
    }

    public static String getStatusCodeString(int r02) {
        switch(r02) {
            case 46000: goto L11;
            case 46001: goto L9;
            case 46002: goto L7;
            case 46003: goto L5;
            default: goto L4;
        };
    L5:
        return "INSUFFICIENT_STORAGE";
    L7:
        return "MODULE_NOT_FOUND";
    L9:
        return "NOT_ALLOWED_MODULE";
    L11:
        return "UNKNOWN_MODULE";
    L4:
        return CommonStatusCodes.getStatusCodeString(r02);
    }
}
