package com.google.android.gms.common.api;

/* loaded from: classes5.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    public ApiException(Status r4) {
        int r02 = r4.getStatusCode();
        if (r4.getStatusMessage() == null) goto L5;
        String r1 = r4.getStatusMessage();
    L6:
        super(r02 + ": " + r1);
        this.mStatus = r4;
        return;
    L5:
        r1 = "";
        goto L6
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
