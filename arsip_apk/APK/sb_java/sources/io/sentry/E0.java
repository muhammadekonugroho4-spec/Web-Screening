package io.sentry;

import io.sentry.IConnectionStatusProvider;

/* loaded from: classes3.dex */
public final class E0 implements IConnectionStatusProvider {
    public E0() {
    }

    @Override // io.sentry.IConnectionStatusProvider
    public IConnectionStatusProvider.ConnectionStatus I() {
        return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void q0(IConnectionStatusProvider.a r1) {
    }

    @Override // io.sentry.IConnectionStatusProvider
    public boolean v1(IConnectionStatusProvider.a r1) {
        return false;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public String w() {
        return null;
    }
}
