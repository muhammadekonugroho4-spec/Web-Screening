package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f175503a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.o f175504b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f175505c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f175506e;

    public m(io.sentry.transport.o r4, long r5, int r7) {
        this.f175505c = new AtomicInteger(0);
        this.f175506e = new AtomicLong(0);
        this.f175504b = r4;
        this.f175503a = r5;
        if (r7 > 0) goto L5;
        r7 = 1;
    L5:
        this.d = r7;
    }

    public boolean a() {
        long r02 = this.f175504b.getCurrentTimeMillis();
        if (this.f175506e.get() != 0) goto L5;
    L12:
        this.f175505c.set(0);
        this.f175506e.set(r02);
        return false;
    L5:
        if ((this.f175506e.get() + this.f175503a) <= r02) goto L12;
        if (this.f175505c.incrementAndGet() >= this.d) goto L10;
        return false;
    L10:
        this.f175505c.set(0);
        return true;
    }
}
