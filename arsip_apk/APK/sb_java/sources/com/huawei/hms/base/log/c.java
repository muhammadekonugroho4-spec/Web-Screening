package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* loaded from: classes6.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private d f39019a;

    public c() {
    }

    @Override // com.huawei.hms.base.log.d
    public void a(Context r2, String r3) {
        d r02 = this.f39019a;
        if (r02 == null) goto L6;
        r02.a(r2, r3);
        return;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(d r1) {
        this.f39019a = r1;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(String r3, int r4, String r5, String r6) {
        Log.println(r4, "HMSSDK_" + r5, r6);
        d r02 = this.f39019a;
        if (r02 == null) goto L6;
        r02.a(r3, r4, r5, r6);
        return;
    }
}
