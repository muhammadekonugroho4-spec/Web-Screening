package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public i f182514a;

    /* renamed from: b, reason: collision with root package name */
    public i f182515b;

    public j() {
    }

    public synchronized void a(i r2) {
        monitor-enter(this);
        if (r2 == null) goto L18;
        i r02 = this.f182515b;     // Catch: Throwable -> L7
        if (r02 == null) goto L10;
        r02.f182513c = r2;     // Catch: Throwable -> L7
        this.f182515b = r2;     // Catch: Throwable -> L7
    L12:
        notifyAll();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L10:
        if (this.f182514a != null) goto L16;
        this.f182515b = r2;     // Catch: Throwable -> L7
        this.f182514a = r2;     // Catch: Throwable -> L7
        goto L12
    L16:
        throw new IllegalStateException("Head present, but no tail");     // Catch: Throwable -> L7
    L18:
        throw new NullPointerException("null cannot be enqueued");     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized i b() {
        monitor-enter(this);
        i r02 = this.f182514a;     // Catch: Throwable -> L9
        if (r02 == null) goto L11;
        i r1 = r02.f182513c;     // Catch: Throwable -> L9
        this.f182514a = r1;     // Catch: Throwable -> L9
        if (r1 != null) goto L11;
        this.f182515b = null;     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return r02;
    L9:
        th = move-exception;
        throw th;
    }

    public synchronized i c(int r3) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f182514a != null) goto L8;
        wait(r3);     // Catch: Throwable -> L6
    L8:
        i r32 = b();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r32;
    }
}
