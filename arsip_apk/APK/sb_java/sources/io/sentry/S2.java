package io.sentry;

import java.time.Instant;

/* loaded from: classes3.dex */
public final class S2 extends AbstractC11588f2 {

    /* renamed from: a, reason: collision with root package name */
    public final Instant f174919a;

    public S2() {
        this(Instant.now());
    }

    @Override // io.sentry.AbstractC11588f2
    public long g() {
        return AbstractC11610k.n(this.f174919a.getEpochSecond()) + this.f174919a.getNano();
    }

    public S2(Instant r1) {
        this.f174919a = r1;
    }
}
