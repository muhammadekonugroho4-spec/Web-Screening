package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes4.dex */
public class i implements RequestCoordinator, d {

    /* renamed from: a, reason: collision with root package name */
    public final RequestCoordinator f33339a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33340b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f33341c;
    public volatile d d;

    /* renamed from: e, reason: collision with root package name */
    public RequestCoordinator.RequestState f33342e;

    /* renamed from: f, reason: collision with root package name */
    public RequestCoordinator.RequestState f33343f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33344g;

    public i(Object r2, RequestCoordinator r3) {
        RequestCoordinator.RequestState r02 = RequestCoordinator.RequestState.CLEARED;
        this.f33342e = r02;
        this.f33343f = r02;
        this.f33340b = r2;
        this.f33339a = r3;
    }

    private boolean k() {
        RequestCoordinator r02 = this.f33339a;
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.j(this) == true) goto L11;
        return false;
    L11:
        return true;
    }

    private boolean l() {
        RequestCoordinator r02 = this.f33339a;
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.d(this) == true) goto L11;
        return false;
    L11:
        return true;
    }

    private boolean m() {
        RequestCoordinator r02 = this.f33339a;
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.e(this) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.bumptech.glide.request.d
    public boolean a() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f33342e != RequestCoordinator.RequestState.SUCCESS) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.d
    public boolean b() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.d.b() == false) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.f33341c.b() == true) goto L12;
        r1 = false;
        goto L13
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(d r3) {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.d) == false) goto L11;
        this.f33343f = RequestCoordinator.RequestState.SUCCESS;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L11:
        this.f33342e = RequestCoordinator.RequestState.SUCCESS;     // Catch: Throwable -> L9
        RequestCoordinator r32 = this.f33339a;     // Catch: Throwable -> L9
        if (r32 == null) goto L15;
        r32.c(this);     // Catch: Throwable -> L9
    L15:
        if (this.f33343f.a() == true) goto L17;
        this.d.clear();     // Catch: Throwable -> L9
    L17:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
        this.f33344g = false;     // Catch: Throwable -> L8
        RequestCoordinator.RequestState r1 = RequestCoordinator.RequestState.CLEARED;     // Catch: Throwable -> L8
        this.f33342e = r1;     // Catch: Throwable -> L8
        this.f33343f = r1;     // Catch: Throwable -> L8
        this.d.clear();     // Catch: Throwable -> L8
        this.f33341c.clear();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(d r3) {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (l() == true) goto L7;
    L13:
        boolean r32 = false;
    L14:
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r32;
    L7:
        if (r3.equals(this.f33341c) == false) goto L13;
        if (b() == true) goto L13;
        r32 = true;
        goto L14
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean e(d r3) {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (m() == true) goto L7;
    L14:
        boolean r32 = false;
    L15:
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r32;
    L7:
        if (r3.equals(this.f33341c) == false) goto L9;
    L13:
        r32 = true;
        goto L15
    L9:
        if (this.f33342e == RequestCoordinator.RequestState.SUCCESS) goto L14;
        goto L14
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f33342e != RequestCoordinator.RequestState.CLEARED) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    @Override // com.bumptech.glide.request.d
    public boolean g(d r4) {
        if ((r4 instanceof i) == false) goto L20;
        i r42 = (i) r4;
        if (this.f33341c != null) goto L10;
        if (r42.f33341c != null) goto L20;
    L12:
        if (this.d != null) goto L17;
        if (r42.d != null) goto L20;
        return true;
    L17:
        if (this.d.g(r42.d) == false) goto L20;
        return true;
    L10:
        if (this.f33341c.g(r42.f33341c) == true) goto L12;
    L20:
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
        RequestCoordinator r1 = this.f33339a;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        RequestCoordinator r12 = r1.getRoot();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r12;
    L9:
        r12 = this;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(d r3) {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.f33341c) == true) goto L11;
        this.f33343f = RequestCoordinator.RequestState.FAILED;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L11:
        this.f33342e = RequestCoordinator.RequestState.FAILED;     // Catch: Throwable -> L9
        RequestCoordinator r32 = this.f33339a;     // Catch: Throwable -> L9
        if (r32 == null) goto L14;
        r32.h(this);     // Catch: Throwable -> L9
    L14:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    @Override // com.bumptech.glide.request.d
    public void i() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
        this.f33344g = true;     // Catch: Throwable -> L22
    L12:
        th = move-exception;
        this.f33344g = false;     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L8:
        if (this.f33342e == RequestCoordinator.RequestState.SUCCESS) goto L15;
        RequestCoordinator.RequestState r2 = this.f33343f;     // Catch: Throwable -> L12
        RequestCoordinator.RequestState r3 = RequestCoordinator.RequestState.RUNNING;     // Catch: Throwable -> L12
        if (r2 == r3) goto L15;
        this.f33343f = r3;     // Catch: Throwable -> L12
        this.d.i();     // Catch: Throwable -> L12
    L15:
        if (this.f33344g == false) goto L19;
        RequestCoordinator.RequestState r22 = this.f33342e;     // Catch: Throwable -> L12
        RequestCoordinator.RequestState r32 = RequestCoordinator.RequestState.RUNNING;     // Catch: Throwable -> L12
        if (r22 == r32) goto L19;
        this.f33342e = r32;     // Catch: Throwable -> L12
        this.f33341c.i();     // Catch: Throwable -> L12
    L19:
        this.f33344g = false;     // Catch: Throwable -> L22
        monitor-exit(r02);     // Catch: Throwable -> L22
        return;
    L22:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f33342e != RequestCoordinator.RequestState.RUNNING) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean j(d r3) {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (k() == true) goto L7;
    L13:
        boolean r32 = false;
    L14:
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r32;
    L7:
        if (r3.equals(this.f33341c) == false) goto L13;
        if (this.f33342e == RequestCoordinator.RequestState.PAUSED) goto L13;
        r32 = true;
        goto L14
    }

    public void n(d r1, d r2) {
        this.f33341c = r1;
        this.d = r2;
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        Object r02 = this.f33340b;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f33343f.a() == true) goto L10;
        this.f33343f = RequestCoordinator.RequestState.PAUSED;     // Catch: Throwable -> L7
        this.d.pause();     // Catch: Throwable -> L7
    L10:
        if (this.f33342e.a() == true) goto L12;
        this.f33342e = RequestCoordinator.RequestState.PAUSED;     // Catch: Throwable -> L7
        this.f33341c.pause();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }
}
