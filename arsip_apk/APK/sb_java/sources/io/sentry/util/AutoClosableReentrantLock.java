package io.sentry.util;

import io.sentry.InterfaceC11576d0;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class AutoClosableReentrantLock extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    public static final class a implements InterfaceC11576d0 {

        /* renamed from: a, reason: collision with root package name */
        public final ReentrantLock f176838a;

        public a(ReentrantLock r1) {
            this.f176838a = r1;
        }

        @Override // io.sentry.InterfaceC11576d0, java.lang.AutoCloseable
        public void close() {
            this.f176838a.unlock();
        }
    }

    public AutoClosableReentrantLock() {
    }

    public InterfaceC11576d0 a() {
        lock();
        return new a(this);
    }
}
