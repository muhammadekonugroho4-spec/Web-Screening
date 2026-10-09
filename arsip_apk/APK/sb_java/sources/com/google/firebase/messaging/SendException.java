package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes6.dex */
public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    public SendException(String r1) {
        super(r1);
        this.errorCode = parseErrorCode(r1);
    }

    private int parseErrorCode(String r8) {
        if (r8 != null) goto L5;
        return 0;
    L5:
        String r82 = r8.toLowerCase(Locale.US);
        r82.getClass();
        char r5 = 65535;
        switch(r82.hashCode()) {
            case -1743242157: goto L25;
            case -1290953729: goto L21;
            case -920906446: goto L17;
            case -617027085: goto L13;
            case -95047692: goto L9;
            default: goto L28;
        };
    L28:
        switch(r5) {
            case 0: goto L33;
            case 1: goto L32;
            case 2: goto L31;
            case 3: goto L30;
            case 4: goto L31;
            default: goto L29;
        };
    L29:
        return 0;
    L30:
        return 2;
    L31:
        return 1;
    L32:
        return 4;
    L33:
        return 3;
    L9:
        if (r82.equals("missing_to") == false) goto L28;
        r5 = 4;
        goto L28
    L13:
        if (r82.equals("messagetoobig") == false) goto L28;
        r5 = 3;
        goto L28
    L17:
        if (r82.equals("invalid_parameters") == false) goto L28;
        r5 = 2;
        goto L28
    L21:
        if (r82.equals("toomanymessages") == false) goto L28;
        r5 = 1;
        goto L28
    L25:
        if (r82.equals("service_not_available") == false) goto L28;
        r5 = 0;
        goto L28
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
