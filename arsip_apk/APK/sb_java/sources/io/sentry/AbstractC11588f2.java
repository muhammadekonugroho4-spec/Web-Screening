package io.sentry;

/* renamed from: io.sentry.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11588f2 implements Comparable {
    public AbstractC11588f2() {
    }

    public int a(AbstractC11588f2 r4) {
        return Long.valueOf(g()).compareTo(Long.valueOf(r4.g()));
    }

    public long b(AbstractC11588f2 r5) {
        return g() - r5.g();
    }

    public final boolean c(AbstractC11588f2 r5) {
        if (b(r5) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((AbstractC11588f2) r1);
    }

    public final boolean d(AbstractC11588f2 r5) {
        if (b(r5) >= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public long e(AbstractC11588f2 r3) {
        if (r3 == null) goto L8;
        if (a(r3) >= 0) goto L8;
        return r3.g();
    L8:
        return g();
    }

    public abstract long g();
}
