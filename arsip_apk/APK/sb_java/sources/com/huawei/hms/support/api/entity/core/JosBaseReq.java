package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
public class JosBaseReq implements IMessageEntity {

    @Packed
    private String channelId;

    @Packed
    private String cpId;

    @Packed
    private String hmsSdkVersionName;

    public JosBaseReq() {
    }

    private static <T> T get(T r02) {
        return r02;
    }

    public String getChannelId() {
        return (String) get(this.channelId);
    }

    public String getCpID() {
        return (String) get(this.cpId);
    }

    public String getHmsSdkVersionName() {
        return (String) get(this.hmsSdkVersionName);
    }

    public void setChannelId(String r1) {
        this.channelId = r1;
    }

    public void setCpID(String r1) {
        this.cpId = r1;
    }

    public void setHmsSdkVersionName(String r1) {
        this.hmsSdkVersionName = r1;
    }
}
