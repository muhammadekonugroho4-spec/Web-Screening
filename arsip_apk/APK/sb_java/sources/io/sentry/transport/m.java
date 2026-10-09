package io.sentry.transport;

/* loaded from: classes3.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f176809a = null;

    static {
        f176809a = new m();
    }

    public m() {
    }

    public static o a() {
        return f176809a;
    }

    @Override // io.sentry.transport.o
    public final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
