package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class BindingFailedResolveMgr {

    /* renamed from: b, reason: collision with root package name */
    static final BindingFailedResolveMgr f38957b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38958c = null;

    /* renamed from: a, reason: collision with root package name */
    List<Activity> f38959a;

    static {
        f38957b = new BindingFailedResolveMgr();
        f38958c = new Object();
    }

    public BindingFailedResolveMgr() {
        this.f38959a = new ArrayList(1);
    }

    public void a(Activity r5) {
        Object r02 = f38958c;
        monitor-enter(r02);
        Iterator<Activity> r1 = this.f38959a.iterator();     // Catch: Throwable -> L13
    L6:
        if (r1.hasNext() == false) goto L15;
        Activity r2 = r1.next();     // Catch: Throwable -> L13
        if (r2 == null) goto L6;
        if (r2 == r5) goto L6;
        if (r2.isFinishing() == true) goto L6;
        r2.finish();     // Catch: Throwable -> L13
        goto L6
    L15:
        this.f38959a.add(r5);     // Catch: Throwable -> L13
        monitor-exit(r02);     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public void b(Activity r3) {
        Object r02 = f38958c;
        monitor-enter(r02);
        this.f38959a.remove(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
