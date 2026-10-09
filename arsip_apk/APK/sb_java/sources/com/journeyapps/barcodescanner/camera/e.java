package com.journeyapps.barcodescanner.camera;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static e f41132e;

    /* renamed from: a, reason: collision with root package name */
    public Handler f41133a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f41134b;

    /* renamed from: c, reason: collision with root package name */
    public int f41135c;
    public final Object d;

    static {
    }

    public e() {
        this.f41135c = 0;
        this.d = new Object();
    }

    public static e d() {
        if (f41132e != null) goto L6;
        f41132e = new e();
    L6:
        return f41132e;
    }

    public final void a() {
        Object r02 = this.d;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f41133a == null) goto L7;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L7:
        if (this.f41135c <= 0) goto L12;
        HandlerThread r1 = new HandlerThread("CameraThread");     // Catch: Throwable -> L9
        this.f41134b = r1;     // Catch: Throwable -> L9
        r1.start();     // Catch: Throwable -> L9
        this.f41133a = new Handler(this.f41134b.getLooper());     // Catch: Throwable -> L9
        goto L13
    L12:
        throw new IllegalStateException("CameraThread is not open");     // Catch: Throwable -> L9
    }

    public void b() {
        Object r02 = this.d;
        monitor-enter(r02);
        int r1 = this.f41135c - 1;
        this.f41135c = r1;     // Catch: Throwable -> L7
        if (r1 != 0) goto L9;
        f();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void c(Runnable r3) {
        Object r02 = this.d;
        monitor-enter(r02);
        a();     // Catch: Throwable -> L7
        this.f41133a.post(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void e(Runnable r3) {
        Object r02 = this.d;
        monitor-enter(r02);
        this.f41135c++;
        c(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void f() {
        Object r02 = this.d;
        monitor-enter(r02);
        this.f41134b.quit();     // Catch: Throwable -> L7
        this.f41134b = null;     // Catch: Throwable -> L7
        this.f41133a = null;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
