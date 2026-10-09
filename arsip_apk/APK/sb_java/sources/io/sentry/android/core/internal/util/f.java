package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class f implements io.sentry.transport.o {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.transport.o f175496a = null;

    static {
        f175496a = new f();
    }

    public f() {
    }

    public static io.sentry.transport.o a() {
        return f175496a;
    }

    @Override // io.sentry.transport.o
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
