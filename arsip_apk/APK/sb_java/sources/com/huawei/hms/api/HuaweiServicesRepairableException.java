package com.huawei.hms.api;

import android.content.Intent;

/* loaded from: classes6.dex */
public class HuaweiServicesRepairableException extends UserRecoverableException {
    private final int statusCode;

    public HuaweiServicesRepairableException(int r1, String r2, Intent r3) {
        super(r2, r3);
        this.statusCode = r1;
    }

    public int getConnectionStatusCode() {
        return this.statusCode;
    }
}
