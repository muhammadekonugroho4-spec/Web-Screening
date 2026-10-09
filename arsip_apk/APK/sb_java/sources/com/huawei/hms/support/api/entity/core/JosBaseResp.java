package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
public class JosBaseResp implements IMessageEntity {

    @Packed
    private int statusCode;

    public JosBaseResp() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int r1) {
        this.statusCode = r1;
    }
}
