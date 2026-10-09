package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes6.dex */
public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public ResponseParser() {
    }

    public static int parse(int r3) {
        if (r3 < 200) goto L8;
        if (r3 > 299) goto L8;
        return 0;
    L8:
        if (r3 < 300) goto L13;
        if (r3 > 399) goto L13;
        return 1;
    L13:
        if (r3 >= 400) goto L15;
    L17:
        return 1;
    L15:
        if (r3 > 499) goto L17;
        return 0;
    }
}
