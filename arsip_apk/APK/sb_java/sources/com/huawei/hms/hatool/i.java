package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    static Map<String, m> f39312b;

    /* renamed from: c, reason: collision with root package name */
    private static i f39313c;

    /* renamed from: a, reason: collision with root package name */
    private l f39314a;

    static {
        f39312b = new HashMap();
    }

    private i() {
        this.f39314a = new l();
    }

    public static i c() {
        if (f39313c != null) goto L6;
        d();
    L6:
        return f39313c;
    }

    private static synchronized void d() {
        monitor-enter(i.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (f39313c != null) goto L10;
        f39313c = new i();     // Catch: Throwable -> L8
    L10:
        monitor-exit(i.class);
    }

    public m a(String r2) {
        return f39312b.get(r2);
    }

    public l b() {
        return this.f39314a;
    }

    public Set<String> a() {
        return f39312b.keySet();
    }

    public void a(String r2, m r3) {
        f39312b.put(r2, r3);
    }
}
