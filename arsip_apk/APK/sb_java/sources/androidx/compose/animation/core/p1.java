package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class p1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6879a;

    static {
    }

    public p1(int r1) {
        this.f6879a = r1;
    }

    @Override // androidx.compose.animation.core.i1
    public int c() {
        return 0;
    }

    @Override // androidx.compose.animation.core.f1
    public AbstractC2395p e(long r1, AbstractC2395p r3, AbstractC2395p r4, AbstractC2395p r5) {
        return r5;
    }

    @Override // androidx.compose.animation.core.f1
    public AbstractC2395p f(long r5, AbstractC2395p r7, AbstractC2395p r8, AbstractC2395p r9) {
        if (r5 >= (g() * 1000000)) goto L5;
        return r7;
    L5:
        return r8;
    }

    @Override // androidx.compose.animation.core.i1
    public int g() {
        return this.f6879a;
    }
}
