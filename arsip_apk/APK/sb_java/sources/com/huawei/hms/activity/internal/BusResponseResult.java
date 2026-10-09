package com.huawei.hms.activity.internal;

import android.content.Intent;

/* loaded from: classes6.dex */
public class BusResponseResult {

    /* renamed from: a, reason: collision with root package name */
    private Intent f38888a;

    /* renamed from: b, reason: collision with root package name */
    private int f38889b;

    public BusResponseResult() {
    }

    public int getCode() {
        return this.f38889b;
    }

    public Intent getIntent() {
        return this.f38888a;
    }

    public void setCode(int r1) {
        this.f38889b = r1;
    }

    public void setIntent(Intent r1) {
        this.f38888a = r1;
    }
}
