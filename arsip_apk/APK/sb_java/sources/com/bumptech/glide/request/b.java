package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes4.dex */
public final class b implements RequestCoordinator, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33324a;

    /* renamed from: b, reason: collision with root package name */
    public final RequestCoordinator f33325b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f33326c;
    public volatile d d;

    /* renamed from: e, reason: collision with root package name */
    public RequestCoordinator.RequestState f33327e;

    /* renamed from: f, reason: collision with root package name */
    public RequestCoordinator.RequestState f33328f;

    public b(Object r2, RequestCoordinator r3) {
        RequestCoordinator.RequestState r02 = RequestCoordinator.RequestState.CLEARED;
        this.f33327e = r02;
        this.f33328f = r02;
        this.f33324a = r2;
        this.f33325b = r3;
    }

    @Override // com.bumptech.glide.request.d
    public boolean a() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator.RequestState r1 = this.f33327e;     // Catch: Throwable -> L10
        RequestCoordinator.RequestState r2 = RequestCoordinator.RequestState.SUCCESS;     // Catch: Throwable -> L10
        if (r1 != r2) goto L7;
    L12:
        boolean r12 = true;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r12;
    L7:
        if (this.f33328f == r2) goto L12;
        r12 = false;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.d
    public boolean b() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f33326c.b() == false) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.d.b() == true) goto L12;
        r1 = false;
        goto L13
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(d r3) {
        Object r02 = this.f33324a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.f33326c) == false) goto L10;
        this.f33327e = RequestCoordinator.RequestState.SUCCESS;     // Catch: Throwable -> L7
    L12:
        RequestCoordinator r32 = this.f33325b;     // Catch: Throwable -> L7
        if (r32 == null) goto L15;
        r32.c(this);     // Catch: Throwable -> L7
    L15:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L10:
        if (r3.equals(this.d) == false) goto L12;
        this.f33328f = RequestCoordinator.RequestState.SUCCESS;     // Catch: Throwable -> L7
        goto L12
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator.RequestState r1 = RequestCoordinator.RequestState.CLEARED;     // Catch: Throwable -> L7
        this.f33327e = r1;     // Catch: Throwable -> L7
        this.f33326c.clear();     // Catch: Throwable -> L7
        if (this.f33328f == r1) goto L9;
        this.f33328f = r1;     // Catch: Throwable -> L7
        this.d.clear();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(d r3) {
        Object r02 = this.f33324a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (m() == true) goto L7;
    L11:
        boolean r32 = false;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r32;
    L7:
        if (k(r3) == false) goto L11;
        r32 = true;
        goto L12
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean e(d r2) {
        Object r22 = this.f33324a;
        monitor-enter(r22);
        boolean r02 = n();     // Catch: Throwable -> L7
        monitor-exit(r22);     // Catch: Throwable -> L7
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator.RequestState r1 = this.f33327e;     // Catch: Throwable -> L9
        RequestCoordinator.RequestState r2 = RequestCoordinator.RequestState.CLEARED;     // Catch: Throwable -> L9
        if (r1 == r2) goto L7;
    L11:
        boolean r12 = false;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r12;
    L7:
        if (this.f33328f != r2) goto L11;
        r12 = true;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.d
    public boolean g(d r4) {
        if ((r4 instanceof b) == false) goto L10;
        b r42 = (b) r4;
        if (this.f33326c.g(r42.f33326c) == false) goto L10;
        if (this.d.g(r42.d) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator r1 = this.f33325b;     // Catch: Throwable -> L7
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
        Object r02 = this.f33324a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.d) == true) goto L13;
        this.f33327e = RequestCoordinator.RequestState.FAILED;     // Catch: Throwable -> L9
        RequestCoordinator.RequestState r32 = this.f33328f;     // Catch: Throwable -> L9
        RequestCoordinator.RequestState r1 = RequestCoordinator.RequestState.RUNNING;     // Catch: Throwable -> L9
        if (r32 == r1) goto L11;
        this.f33328f = r1;     // Catch: Throwable -> L9
        this.d.i();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L13:
        this.f33328f = RequestCoordinator.RequestState.FAILED;     // Catch: Throwable -> L9
        RequestCoordinator r33 = this.f33325b;     // Catch: Throwable -> L9
        if (r33 == null) goto L16;
        r33.h(this);     // Catch: Throwable -> L9
    L16:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    @Override // com.bumptech.glide.request.d
    public void i() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator.RequestState r1 = this.f33327e;     // Catch: Throwable -> L7
        RequestCoordinator.RequestState r2 = RequestCoordinator.RequestState.RUNNING;     // Catch: Throwable -> L7
        if (r1 == r2) goto L9;
        this.f33327e = r2;     // Catch: Throwable -> L7
        this.f33326c.i();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator.RequestState r1 = this.f33327e;     // Catch: Throwable -> L10
        RequestCoordinator.RequestState r2 = RequestCoordinator.RequestState.RUNNING;     // Catch: Throwable -> L10
        if (r1 != r2) goto L7;
    L12:
        boolean r12 = true;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r12;
    L7:
        if (this.f33328f == r2) goto L12;
        r12 = false;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean j(d r3) {
        Object r02 = this.f33324a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (l() == true) goto L7;
    L11:
        boolean r32 = false;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r32;
    L7:
        if (r3.equals(this.f33326c) == false) goto L11;
        r32 = true;
        goto L12
    }

    public final boolean k(d r3) {
        RequestCoordinator.RequestState r02 = this.f33327e;
        RequestCoordinator.RequestState r1 = RequestCoordinator.RequestState.FAILED;
        if (r02 == r1) goto L7;
        return r3.equals(this.f33326c);
    L7:
        if (r3.equals(this.d) == false) goto L13;
        RequestCoordinator.RequestState r32 = this.f33328f;
        if (r32 == RequestCoordinator.RequestState.SUCCESS) goto L11;
        if (r32 != r1) goto L16;
        return true;
    L16:
        return false;
    L11:
        return true;
    L13:
        return false;
    }

    public final boolean l() {
        RequestCoordinator r02 = this.f33325b;
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.j(this) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean m() {
        RequestCoordinator r02 = this.f33325b;
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.d(this) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean n() {
        RequestCoordinator r02 = this.f33325b;
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.e(this) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public void o(d r1, d r2) {
        this.f33326c = r1;
        this.d = r2;
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        Object r02 = this.f33324a;
        monitor-enter(r02);
        RequestCoordinator.RequestState r1 = this.f33327e;     // Catch: Throwable -> L7
        RequestCoordinator.RequestState r2 = RequestCoordinator.RequestState.RUNNING;     // Catch: Throwable -> L7
        if (r1 != r2) goto L10;
        this.f33327e = RequestCoordinator.RequestState.PAUSED;     // Catch: Throwable -> L7
        this.f33326c.pause();     // Catch: Throwable -> L7
    L10:
        if (this.f33328f != r2) goto L12;
        this.f33328f = RequestCoordinator.RequestState.PAUSED;     // Catch: Throwable -> L7
        this.d.pause();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
