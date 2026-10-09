package io.sentry;

/* loaded from: classes3.dex */
public interface Q {
    void a(SentryLevel r1, String r2, Throwable r3);

    void b(SentryLevel r1, Throwable r2, String r3, Object... r4);

    void c(SentryLevel r1, String r2, Object... r3);

    boolean d(SentryLevel r1);
}
