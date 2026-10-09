package io.sentry.android.core;

/* loaded from: classes3.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f175221a;

    /* renamed from: b, reason: collision with root package name */
    public int f175222b;

    /* renamed from: c, reason: collision with root package name */
    public long f175223c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f175224e;

    public P0() {
    }

    public void a(long r3, long r5, boolean r7, boolean r8) {
        this.f175224e += r3;
        if (r8 == false) goto L6;
        this.d += r5;
        this.f175222b++;
        return;
    L6:
        if (r7 == false) goto L9;
        this.f175223c += r5;
        this.f175221a++;
        return;
    }

    public int b() {
        return this.f175222b;
    }

    public long c() {
        return this.d;
    }

    public int d() {
        return this.f175221a;
    }

    public long e() {
        return this.f175223c;
    }

    public int f() {
        return this.f175221a + this.f175222b;
    }

    public long g() {
        return this.f175224e;
    }
}
