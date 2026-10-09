package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* loaded from: classes6.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final HMSExtLogger f39014a;

    /* renamed from: b, reason: collision with root package name */
    private d f39015b;

    public a(HMSExtLogger r1) {
        this.f39014a = r1;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(Context r2, String r3) {
        d r02 = this.f39015b;
        if (r02 == null) goto L6;
        r02.a(r2, r3);
        return;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(d r1) {
        this.f39015b = r1;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(String r3, int r4, String r5, String r6) {
        HMSExtLogger r02 = this.f39014a;
        if (r02 != null) goto L5;
    L14:
        d r03 = this.f39015b;
        if (r03 == null) goto L18;
        r03.a(r3, r4, r5, r6);
        return;
    L18:
        return;
    L5:
        if (r4 != 3) goto L7;
        r02.d(r5, r6);
        goto L14
    L7:
        if (r4 != 4) goto L9;
        r02.i(r5, r6);
        goto L14
    L9:
        if (r4 == 5) goto L11;
        r02.e(r5, r6);
        goto L14
    L11:
        r02.w(r5, r6);
        goto L14
    }
}
