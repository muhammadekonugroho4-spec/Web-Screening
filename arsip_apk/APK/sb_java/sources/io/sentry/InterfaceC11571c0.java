package io.sentry;

import java.util.concurrent.Future;

/* renamed from: io.sentry.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC11571c0 {
    void a();

    Future b(Runnable r1, long r2);

    void c(long r1);

    boolean isClosed();

    Future submit(Runnable r1);
}
