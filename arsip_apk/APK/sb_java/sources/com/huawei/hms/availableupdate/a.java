package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f39006c = null;
    private static final Object d = null;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f39007a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Activity> f39008b;

    static {
        f39006c = new a();
        d = new Object();
    }

    public a() {
        this.f39007a = new AtomicBoolean(false);
        this.f39008b = new ArrayList(1);
    }

    public void a(Activity r5) {
        Object r02 = d;
        monitor-enter(r02);
        Iterator<Activity> r1 = this.f39008b.iterator();     // Catch: Throwable -> L13
    L6:
        if (r1.hasNext() == false) goto L15;
        Activity r2 = r1.next();     // Catch: Throwable -> L13
        if (r2 == null) goto L6;
        if (r2 == r5) goto L6;
        if (r2.isFinishing() == true) goto L6;
        r2.finish();     // Catch: Throwable -> L13
        goto L6
    L15:
        this.f39008b.add(r5);     // Catch: Throwable -> L13
        monitor-exit(r02);     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public void b(Activity r3) {
        Object r02 = d;
        monitor-enter(r02);
        this.f39008b.remove(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void a(boolean r2) {
        this.f39007a.set(r2);
    }

    public AtomicBoolean a() {
        return this.f39007a;
    }
}
