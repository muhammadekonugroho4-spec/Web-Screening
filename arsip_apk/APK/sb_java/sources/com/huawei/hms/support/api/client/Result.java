package com.huawei.hms.support.api.client;

import com.huawei.hms.core.aidl.IMessageEntity;

/* loaded from: classes6.dex */
public abstract class Result implements IMessageEntity {
    private Status status;

    public Result() {
        this.status = Status.FAILURE;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        this.status = r1;
    }
}
