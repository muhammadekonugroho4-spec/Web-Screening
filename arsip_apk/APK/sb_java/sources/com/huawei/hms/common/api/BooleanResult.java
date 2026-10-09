package com.huawei.hms.common.api;

import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes6.dex */
public class BooleanResult extends Result {
    private final Status myStatus;
    private final boolean resultValue;

    public BooleanResult(Status r2, boolean r3) {
        Preconditions.checkNotNull(r2, "status cannot be null");
        this.myStatus = r2;
        this.resultValue = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BooleanResult) == false) goto L12;
        BooleanResult r52 = (BooleanResult) r5;
        if (this.resultValue != r52.getValue()) goto L12;
        if (this.myStatus.equals(r52.getStatus()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public Status getStatus() {
        return this.myStatus;
    }

    public boolean getValue() {
        return this.resultValue;
    }

    public final int hashCode() {
        boolean r02 = this.resultValue;
        int r1 = (this.myStatus.hashCode() + WorkQueueKt.MASK) * 77;
        return (r02 ? 1 : 0) + r1;
    }
}
