package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f39009b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f39010c = null;

    /* renamed from: a, reason: collision with root package name */
    private final List<Activity> f39011a;

    static {
        f39009b = new b();
        f39010c = new Object();
    }

    public b() {
        this.f39011a = new ArrayList(1);
    }

    public void a(Activity r5) {
        Object r02 = f39010c;
        monitor-enter(r02);
        Iterator<Activity> r1 = this.f39011a.iterator();     // Catch: Throwable -> L13
    L6:
        if (r1.hasNext() == false) goto L15;
        Activity r2 = r1.next();     // Catch: Throwable -> L13
        if (r2 == null) goto L6;
        if (r2 == r5) goto L6;
        if (r2.isFinishing() == true) goto L6;
        r2.finish();     // Catch: Throwable -> L13
        goto L6
    L15:
        this.f39011a.add(r5);     // Catch: Throwable -> L13
        monitor-exit(r02);     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public void b(Activity r3) {
        Object r02 = f39010c;
        monitor-enter(r02);
        this.f39011a.remove(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
