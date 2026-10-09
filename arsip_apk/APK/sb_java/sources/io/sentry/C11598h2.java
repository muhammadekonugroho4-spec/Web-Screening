package io.sentry;

import java.util.ArrayList;

/* renamed from: io.sentry.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11598h2 {

    /* renamed from: a, reason: collision with root package name */
    public final C11603i2 f176245a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f176246b;

    public C11598h2(C11603i2 r2, Iterable r3) {
        this.f176245a = (C11603i2) io.sentry.util.v.c(r2, "SentryEnvelopeHeader is required.");
        this.f176246b = (Iterable) io.sentry.util.v.c(r3, "SentryEnvelope items are required.");
    }

    public static C11598h2 a(InterfaceC11581e0 r2, Session r3, io.sentry.protocol.q r4) {
        io.sentry.util.v.c(r2, "Serializer is required.");
        io.sentry.util.v.c(r3, "session is required.");
        return new C11598h2(null, r4, K2.K(r2, r3));
    }

    public C11603i2 b() {
        return this.f176245a;
    }

    public Iterable c() {
        return this.f176246b;
    }

    public C11598h2(io.sentry.protocol.w r2, io.sentry.protocol.q r3, K2 r4) {
        io.sentry.util.v.c(r4, "SentryEnvelopeItem is required.");
        this.f176245a = new C11603i2(r2, r3);
        ArrayList r22 = new ArrayList(1);
        r22.add(r4);
        this.f176246b = r22;
    }
}
