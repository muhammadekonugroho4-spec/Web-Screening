package androidx.compose.foundation.pager;

/* loaded from: classes.dex */
public final class a0 implements Z {

    /* renamed from: b, reason: collision with root package name */
    public final int f9070b;

    static {
    }

    public a0(int r1) {
        this.f9070b = r1;
    }

    @Override // androidx.compose.foundation.pager.Z
    public int a(int r5, int r6, float r7, int r8, int r9) {
        long r72 = r5;
        return kotlin.ranges.q.q(r6, (int) kotlin.ranges.q.h(r72 - this.f9070b, 0), (int) kotlin.ranges.q.m(r72 + this.f9070b, 2147483647L));
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof a0) == true) goto L5;
    L8:
        return false;
    L5:
        if (this.f9070b != ((a0) r3).f9070b) goto L8;
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f9070b);
    }
}
