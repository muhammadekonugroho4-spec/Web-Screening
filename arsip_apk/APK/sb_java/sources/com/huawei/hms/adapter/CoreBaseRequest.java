package com.huawei.hms.adapter;

import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
class CoreBaseRequest implements IMessageEntity {

    @Packed
    private String jsonHeader;

    @Packed
    private String jsonObject;

    @Packed
    private Parcelable parcelable;

    public CoreBaseRequest() {
    }

    public String getJsonHeader() {
        return this.jsonHeader;
    }

    public String getJsonObject() {
        return this.jsonObject;
    }

    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public void setJsonHeader(String r1) {
        this.jsonHeader = r1;
    }

    public void setJsonObject(String r1) {
        this.jsonObject = r1;
    }

    public void setParcelable(Parcelable r1) {
        this.parcelable = r1;
    }
}
