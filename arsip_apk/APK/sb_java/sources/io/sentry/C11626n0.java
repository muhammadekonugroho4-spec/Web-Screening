package io.sentry;

/* renamed from: io.sentry.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11626n0 implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f176351a;

    public C11626n0() {
        this.f176351a = Runtime.getRuntime();
    }

    @Override // io.sentry.V
    public void c() {
    }

    @Override // io.sentry.V
    public void d(C11617l1 r5) {
        r5.f(Long.valueOf(this.f176351a.totalMemory() - this.f176351a.freeMemory()));
    }
}
