package androidx.camera.core.internal;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final float f5660a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5661b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5662c;
    public final float d;

    public a(float r1, float r2, float r3, float r4) {
        this.f5660a = r1;
        this.f5661b = r2;
        this.f5662c = r3;
        this.d = r4;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.H0
    public float a() {
        return this.f5661b;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.H0
    public float b() {
        return this.d;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.H0
    public float c() {
        return this.f5662c;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.H0
    public float d() {
        return this.f5660a;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == false) goto L16;
        g r52 = (g) r5;
        if (Float.floatToIntBits(this.f5660a) != Float.floatToIntBits(r52.d())) goto L16;
        if (Float.floatToIntBits(this.f5661b) != Float.floatToIntBits(r52.a())) goto L16;
        if (Float.floatToIntBits(this.f5662c) != Float.floatToIntBits(r52.c())) goto L16;
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(r52.b())) goto L16;
        return true;
    L16:
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f5660a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f5661b)) * 1000003) ^ Float.floatToIntBits(this.f5662c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f5660a + ", maxZoomRatio=" + this.f5661b + ", minZoomRatio=" + this.f5662c + ", linearZoom=" + this.d + "}";
    }
}
