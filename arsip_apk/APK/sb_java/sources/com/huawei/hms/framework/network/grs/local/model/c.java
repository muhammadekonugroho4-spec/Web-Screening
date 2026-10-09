package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f39276a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, d> f39277b;

    /* renamed from: c, reason: collision with root package name */
    private List<b> f39278c;

    public c() {
        this.f39277b = new ConcurrentHashMap(16);
        this.f39278c = new ArrayList(16);
    }

    public d a(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L7;
        Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    L7:
        return this.f39277b.get(r2);
    }

    public String b() {
        return this.f39276a;
    }

    public void c(String r1) {
        this.f39276a = r1;
    }

    public List<b> a() {
        return this.f39278c;
    }

    public void b(String r1) {
    }

    public void a(String r2, d r3) {
        if (TextUtils.isEmpty(r2) == true) goto L7;
        if (r3 == null) goto L8;
        this.f39277b.put(r2, r3);
        return;
    L8:
        return;
    }

    public void a(List<b> r1) {
        this.f39278c = r1;
    }
}
