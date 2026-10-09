package com.huawei.hms.framework.network.grs.g.k;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f39256a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39257b;

    public b(Future<com.huawei.hms.framework.network.grs.g.d> r3) {
        this.f39256a = r3;
        this.f39257b = SystemClock.elapsedRealtime();
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f39256a;
    }

    public boolean b() {
        if ((SystemClock.elapsedRealtime() - this.f39257b) > 300000) goto L6;
        return true;
    L6:
        return false;
    }
}
