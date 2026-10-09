package com.huawei.hms.common;

import com.huawei.hms.support.api.client.Status;

/* loaded from: classes6.dex */
public class ApiException extends Exception {
    protected final Status mStatus;

    public ApiException(Status r3) {
        StringBuilder r02 = new StringBuilder();
        r02.append(r3.getStatusCode());
        r02.append(": ");
        if (r3.getStatusMessage() == null) goto L5;
        String r1 = r3.getStatusMessage();
    L6:
        r02.append(r1);
        super(r02.toString());
        this.mStatus = r3;
        return;
    L5:
        r1 = "";
        goto L6
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
