package androidx.compose.foundation.lazy.layout;

/* renamed from: androidx.compose.foundation.lazy.layout.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2610c {

    /* renamed from: a, reason: collision with root package name */
    public long f8728a;

    /* renamed from: b, reason: collision with root package name */
    public long f8729b;

    /* renamed from: c, reason: collision with root package name */
    public long f8730c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f8731e;

    /* renamed from: f, reason: collision with root package name */
    public int f8732f;

    static {
    }

    public C2610c() {
        this.f8732f = -1;
    }

    public final int a(int r2, int r3) {
        if (r3 != (-1)) goto L6;
        return r2;
    L6:
        return ((r3 * 3) + r2) / 4;
    }

    public final long b(long r5, long r7) {
        if (r7 != 0) goto L5;
        return r5;
    L5:
        long r02 = 4;
        return ((r7 / r02) * 3) + (r5 / r02);
    }

    public final void c() {
        this.f8731e = 0;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.f8728a;
    }

    public final long f() {
        return this.f8731e;
    }

    public final int g() {
        return this.f8732f;
    }

    public final long h() {
        return this.f8730c;
    }

    public final long i() {
        return this.f8729b;
    }

    public final void j(long r3) {
        this.d = b(r3, this.d);
    }

    public final void k(long r3) {
        this.f8728a = b(r3, this.f8728a);
    }

    public final void l(long r3) {
        this.f8731e = b(r3, this.f8731e);
    }

    public final void m(int r2) {
        this.f8732f = a(r2, this.f8732f);
    }

    public final void n(long r3) {
        this.f8730c = b(r3, this.f8730c);
    }

    public final void o(long r3) {
        this.f8729b = b(r3, this.f8729b);
    }
}
