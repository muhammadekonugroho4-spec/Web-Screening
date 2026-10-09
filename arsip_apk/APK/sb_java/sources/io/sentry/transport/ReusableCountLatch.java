package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes3.dex */
public final class ReusableCountLatch {

    /* renamed from: a, reason: collision with root package name */
    public final Sync f176784a;

    public static final class Sync extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync(int r1) {
            setState(r1);
        }

        public static /* synthetic */ int a(Sync r02) {
            return r02.e();
        }

        public static /* synthetic */ void b(Sync r02) {
            r02.d();
        }

        public static /* synthetic */ void c(Sync r02) {
            r02.f();
        }

        public final void d() {
            releaseShared(1);
        }

        public final int e() {
            return getState();
        }

        public final void f() {
        L2:
            int r02 = getState();
            if (compareAndSetState(r02, r02 + 1) == false) goto L2;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int r1) {
            if (getState() != 0) goto L6;
            return 1;
        L6:
            return -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int r3) {
        L2:
            int r32 = getState();
            if (r32 == 0) goto L4;
            int r1 = r32 - 1;
            if (compareAndSetState(r32, r1) == false) goto L2;
            if (r1 != 0) goto L10;
            return true;
        L10:
            return false;
        L4:
            return false;
        }
    }

    public ReusableCountLatch(int r4) {
        if (r4 < 0) goto L7;
        this.f176784a = new Sync(r4);
        return;
    L7:
        throw new IllegalArgumentException("negative initial count '" + r4 + "' is not allowed");
    }

    public void a() {
        Sync.b(this.f176784a);
    }

    public int b() {
        return Sync.a(this.f176784a);
    }

    public void c() {
        Sync.c(this.f176784a);
    }

    public boolean d(long r3, TimeUnit r5) {
        return this.f176784a.tryAcquireSharedNanos(1, r5.toNanos(r3));
    }

    public ReusableCountLatch() {
        this(0);
    }
}
