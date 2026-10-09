package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes6.dex */
public class BundleResult {

    /* renamed from: a, reason: collision with root package name */
    private int f39470a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f39471b;

    public BundleResult(int r1, Bundle r2) {
        this.f39470a = r1;
        this.f39471b = r2;
    }

    public int getResultCode() {
        return this.f39470a;
    }

    public Bundle getRspBody() {
        return this.f39471b;
    }

    public void setResultCode(int r1) {
        this.f39470a = r1;
    }

    public void setRspBody(Bundle r1) {
        this.f39471b = r1;
    }
}
