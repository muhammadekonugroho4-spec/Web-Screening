package com.koushikdutta.async.future;

/* loaded from: classes6.dex */
public class i implements com.koushikdutta.async.future.a {
    public static final com.koushikdutta.async.future.a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final com.koushikdutta.async.future.a f41300e = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f41301a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41302b;

    /* renamed from: c, reason: collision with root package name */
    public com.koushikdutta.async.future.a f41303c;

    public static class a extends i {
        public a() {
            f();
        }
    }

    public static class b extends i {
        public b() {
            cancel();
        }
    }

    static {
        d = new a();
        f41300e = new b();
    }

    public i() {
    }

    public void b() {
    }

    public void c() {
    }

    @Override // com.koushikdutta.async.future.a
    public boolean cancel() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f41301a == false) goto L11;
        monitor-exit(this);     // Catch: Throwable -> L8
        return false;
    L11:
        if (this.f41302b == false) goto L14;
        monitor-exit(this);     // Catch: Throwable -> L8
        return true;
    L14:
        this.f41302b = true;     // Catch: Throwable -> L8
        com.koushikdutta.async.future.a r02 = this.f41303c;     // Catch: Throwable -> L8
        this.f41303c = null;     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L8
        if (r02 == null) goto L18;
        r02.cancel();
    L18:
        b();
        c();
        return true;
    }

    public void d() {
    }

    public com.koushikdutta.async.future.a e() {
        cancel();
        this.f41301a = false;
        this.f41302b = false;
        return this;
    }

    public boolean f() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f41302b == false) goto L10;
        monitor-exit(this);     // Catch: Throwable -> L7
        return false;
    L10:
        if (this.f41301a == false) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L7
        return false;
    L13:
        this.f41301a = true;     // Catch: Throwable -> L7
        this.f41303c = null;     // Catch: Throwable -> L7
        monitor-exit(this);     // Catch: Throwable -> L7
        d();
        c();
        return true;
    }

    public boolean g(com.koushikdutta.async.future.a r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (isDone() == true) goto L6;
        this.f41303c = r2;     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L8
        return true;
    L6:
        monitor-exit(this);     // Catch: Throwable -> L8
        return false;
    }

    @Override // com.koushikdutta.async.future.a
    public boolean isCancelled() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.f41302b == true) goto L13;
        com.koushikdutta.async.future.a r02 = this.f41303c;     // Catch: Throwable -> L10
        if (r02 != null) goto L8;
    L12:
        boolean r03 = false;
    L14:
        monitor-exit(this);     // Catch: Throwable -> L10
        return r03;
    L8:
        if (r02.isCancelled() == false) goto L12;
    L13:
        r03 = true;
        goto L14
    }

    @Override // com.koushikdutta.async.future.a
    public boolean isDone() {
        return this.f41301a;
    }
}
