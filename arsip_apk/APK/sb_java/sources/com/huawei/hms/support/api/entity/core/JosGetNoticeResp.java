package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
public class JosGetNoticeResp extends JosBaseResp {

    @Packed
    private Intent noticeIntent;

    public JosGetNoticeResp() {
    }

    private static <T> T get(T r02) {
        return r02;
    }

    public Intent getNoticeIntent() {
        return (Intent) get(this.noticeIntent);
    }

    public void setNoticeIntent(Intent r1) {
        this.noticeIntent = r1;
    }
}
