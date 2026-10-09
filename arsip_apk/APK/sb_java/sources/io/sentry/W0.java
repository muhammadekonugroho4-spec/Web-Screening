package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public final class W0 implements InterfaceC11571c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f175016a = null;

    static {
        f175016a = new W0();
    }

    public W0() {
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public static InterfaceC11571c0 f() {
        return f175016a;
    }

    @Override // io.sentry.InterfaceC11571c0
    public void a() {
    }

    @Override // io.sentry.InterfaceC11571c0
    public Future b(Runnable r1, long r2) {
        return new FutureTask(new U0());
    }

    @Override // io.sentry.InterfaceC11571c0
    public void c(long r1) {
    }

    @Override // io.sentry.InterfaceC11571c0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC11571c0
    public Future submit(Runnable r2) {
        return new FutureTask(new V0());
    }
}
