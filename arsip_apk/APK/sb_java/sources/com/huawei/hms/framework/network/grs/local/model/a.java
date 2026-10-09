package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f39272a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c> f39273b;

    public a() {
        this.f39273b = new ConcurrentHashMap(16);
    }

    public c a(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L7;
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    L7:
        return this.f39273b.get(r2);
    }

    public String b() {
        return this.f39272a;
    }

    public void a() {
        Map<String, c> r02 = this.f39273b;
        if (r02 == null) goto L6;
        r02.clear();
        return;
    }

    public void b(String r1) {
        this.f39272a = r1;
    }

    public void a(long r1) {
    }

    public void a(String r2, c r3) {
        if (TextUtils.isEmpty(r2) == true) goto L7;
        if (r3 == null) goto L8;
        this.f39273b.put(r2, r3);
        return;
    L8:
        return;
    }
}
