package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final float f6629a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6630b;

    static {
    }

    public H(float r2, float r3) {
        this.f6629a = Math.max(1.0E-7f, Math.abs(r3));
        this.f6630b = Math.max(1.0E-4f, r2) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.G
    public float a() {
        return this.f6629a;
    }

    @Override // androidx.compose.animation.core.G
    public float b(long r3, float r5, float r6) {
        return r6 * ((float) Math.exp(((r3 / 1000000) / 1000.0f) * this.f6630b));
    }

    @Override // androidx.compose.animation.core.G
    public long c(float r3, float r4) {
        return ((long) ((((float) Math.log(a() / Math.abs(r4))) * 1000.0f) / this.f6630b)) * 1000000;
    }

    @Override // androidx.compose.animation.core.G
    public float d(float r6, float r7) {
        if (Math.abs(r7) > a()) goto L5;
        return r6;
    L5:
        double r02 = Math.log(Math.abs(a() / r7));
        float r2 = this.f6630b;
        return (r6 - (r7 / r2)) + ((r7 / r2) * ((float) Math.exp((r2 * ((r02 / r2) * 1000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.G
    public float e(long r3, float r5, float r6) {
        float r02 = this.f6630b;
        return (r5 - (r6 / r02)) + ((r6 / r02) * ((float) Math.exp((r02 * (r3 / 1000000)) / 1000.0f)));
    }
}
