package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class I implements F {

    /* renamed from: a, reason: collision with root package name */
    public final float f6636a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6637b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6638c;
    public final C2374e0 d;

    static {
    }

    public I(float r2, float r3, float r4) {
        this.f6636a = r2;
        this.f6637b = r3;
        this.f6638c = r4;
        C2374e0 r42 = new C2374e0(1.0f);
        r42.c(r2);
        r42.e(r3);
        this.d = r42;
    }

    @Override // androidx.compose.animation.core.F
    public float b(long r3, float r5, float r6, float r7) {
        this.d.d(r6);
        C2374e0 r62 = this.d;
        return Float.intBitsToFloat((int) (r62.f(r5, r7, r3 / 1000000) & 4294967295L));
    }

    @Override // androidx.compose.animation.core.F
    public long c(float r3, float r4, float r5) {
        float r02 = this.d.b();
        float r1 = this.d.a();
        float r32 = r3 - r4;
        float r42 = this.f6638c;
        float r52 = r5 / r42;
        return AbstractC2372d0.b(r02, r1, r52, r32 / r42, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.F
    public float d(float r1, float r2, float r3) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.F
    public float e(long r3, float r5, float r6, float r7) {
        this.d.d(r6);
        C2374e0 r62 = this.d;
        return Float.intBitsToFloat((int) (r62.f(r5, r7, r3 / 1000000) >> 32));
    }

    public /* synthetic */ I(float r1, float r2, float r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 1500.0f;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = 0.01f;
    L11:
        this(r1, r2, r3);
    }
}
