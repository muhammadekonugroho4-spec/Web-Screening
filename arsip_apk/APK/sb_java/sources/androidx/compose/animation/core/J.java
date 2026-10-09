package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class J implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f6655a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6656b;

    /* renamed from: c, reason: collision with root package name */
    public final B f6657c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6658e;

    static {
    }

    public J(int r5, int r6, B r7) {
        this.f6655a = r5;
        this.f6656b = r6;
        this.f6657c = r7;
        this.d = r5 * 1000000;
        this.f6658e = r6 * 1000000;
    }

    @Override // androidx.compose.animation.core.F
    public float b(long r10, float r12, float r13, float r14) {
        long r1 = r10 - this.f6658e;
        long r3 = this.d;
        if (r1 >= 0) goto L6;
        r1 = 0;
    L6:
        if (r1 <= r3) goto L8;
        long r7 = r3;
    L10:
        if (r7 != 0) goto L13;
        return r14;
    L13:
        return (e(r7, r12, r13, r14) - e(r7 - 1000000, r12, r13, r14)) * 1000.0f;
    L8:
        r7 = r1;
        goto L10
    }

    @Override // androidx.compose.animation.core.F
    public long c(float r3, float r4, float r5) {
        return this.f6658e + this.d;
    }

    @Override // androidx.compose.animation.core.F
    public float e(long r5, float r7, float r8, float r9) {
        long r52 = r5 - this.f6658e;
        long r02 = this.d;
        if (r52 >= 0) goto L6;
        r52 = 0;
    L6:
        if (r52 <= r02) goto L9;
        r52 = r02;
    L9:
        if (this.f6655a != 0) goto L11;
        float r53 = 1.0f;
    L12:
        float r54 = this.f6657c.a(r53);
        return (r7 * (1 - r54)) + (r8 * r54);
    L11:
        r53 = r52 / r02;
        goto L12
    }
}
