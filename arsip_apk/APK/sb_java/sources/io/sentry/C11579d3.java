package io.sentry;

import java.util.Date;

/* renamed from: io.sentry.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11579d3 extends AbstractC11588f2 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f176212a;

    /* renamed from: b, reason: collision with root package name */
    public final long f176213b;

    public C11579d3() {
        this(AbstractC11610k.d(), System.nanoTime());
    }

    @Override // io.sentry.AbstractC11588f2
    public int a(AbstractC11588f2 r6) {
        if ((r6 instanceof C11579d3) == false) goto L11;
        C11579d3 r62 = (C11579d3) r6;
        long r02 = this.f176212a.getTime();
        long r2 = r62.f176212a.getTime();
        if (r02 != r2) goto L9;
        return Long.valueOf(this.f176213b).compareTo(Long.valueOf(r62.f176213b));
    L9:
        return Long.valueOf(r02).compareTo(Long.valueOf(r2));
    L11:
        return super.a(r6);
    }

    @Override // io.sentry.AbstractC11588f2
    public long b(AbstractC11588f2 r5) {
        if ((r5 instanceof C11579d3) == false) goto L7;
        return this.f176213b - ((C11579d3) r5).f176213b;
    L7:
        return super.b(r5);
    }

    @Override // io.sentry.AbstractC11588f2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((AbstractC11588f2) r1);
    }

    @Override // io.sentry.AbstractC11588f2
    public long e(AbstractC11588f2 r3) {
        if (r3 == null) goto L12;
        if ((r3 instanceof C11579d3) == false) goto L12;
        C11579d3 r02 = (C11579d3) r3;
        if (a(r3) >= 0) goto L10;
        return h(this, r02);
    L10:
        return h(r02, this);
    L12:
        return super.e(r3);
    }

    @Override // io.sentry.AbstractC11588f2
    public long g() {
        return AbstractC11610k.a(this.f176212a);
    }

    public final long h(C11579d3 r5, C11579d3 r6) {
        long r02 = r6.f176213b - r5.f176213b;
        return r5.g() + r02;
    }

    public C11579d3(Date r1, long r2) {
        this.f176212a = r1;
        this.f176213b = r2;
    }
}
