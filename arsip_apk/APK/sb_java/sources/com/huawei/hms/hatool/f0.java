package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    private static f0 f39295b;

    /* renamed from: a, reason: collision with root package name */
    private volatile Map<String, g0> f39296a;

    private f0() {
        this.f39296a = new HashMap();
    }

    public static f0 a() {
        if (f39295b != null) goto L6;
        b();
    L6:
        return f39295b;
    }

    private static synchronized void b() {
        monitor-enter(f0.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (f39295b != null) goto L10;
        f39295b = new f0();     // Catch: Throwable -> L8
    L10:
        monitor-exit(f0.class);
    }

    private g0 a(String r3) {
        if (this.f39296a.containsKey(r3) == true) goto L6;
        g0 r02 = new g0();
        this.f39296a.put(r3, r02);
    L6:
        return this.f39296a.get(r3);
    }

    public g0 a(String r1, long r2) {
        g0 r12 = a(r1);
        r12.a(r2);
        return r12;
    }
}
