package com.huawei.hms.adapter;

import android.app.PendingIntent;
import android.content.Intent;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
public class CoreBaseResponse implements IMessageEntity {

    @Packed
    public Intent intent;

    @Packed
    private String jsonBody;

    @Packed
    private String jsonHeader;

    @Packed
    public PendingIntent pendingIntent;

    public CoreBaseResponse() {
    }

    public Intent getIntent() {
        return this.intent;
    }

    public String getJsonBody() {
        return this.jsonBody;
    }

    public String getJsonHeader() {
        return this.jsonHeader;
    }

    public PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public void setIntent(Intent r1) {
        this.intent = r1;
    }

    public void setJsonBody(String r1) {
        this.jsonBody = r1;
    }

    public void setJsonHeader(String r1) {
        this.jsonHeader = r1;
    }

    public void setPendingIntent(PendingIntent r1) {
        this.pendingIntent = r1;
    }
}
