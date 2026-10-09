package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
public class JosGetNoticeReq extends JosBaseReq {
    public static final int NOTICE_TYPE_CONN = 0;
    public static final int NOTICE_TYPE_SIGN = 1;

    @Packed
    private int noticeType;

    public JosGetNoticeReq() {
    }

    private static <T> T get(T r02) {
        return r02;
    }

    public int getNoticeType() {
        return ((Integer) get(Integer.valueOf(this.noticeType))).intValue();
    }

    public void setNoticeType(int r1) {
        this.noticeType = r1;
    }
}
