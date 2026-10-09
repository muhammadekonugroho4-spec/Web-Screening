package androidx.compose.ui.graphics.colorspace;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final float f17207a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17208b;

    static {
    }

    public H(float r1, float r2) {
        this.f17207a = r1;
        this.f17208b = r2;
    }

    public final float a() {
        return this.f17207a;
    }

    public final float b() {
        return this.f17208b;
    }

    public final float[] c() {
        float r02 = this.f17207a;
        float r1 = this.f17208b;
        return new float[]{r02 / r1, 1.0f, ((1.0f - r02) - r1) / r1};
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof H) == true) goto L8;
        return false;
    L8:
        H r52 = (H) r5;
        if (Float.compare(this.f17207a, r52.f17207a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f17208b, r52.f17208b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f17207a) * 31) + Float.hashCode(this.f17208b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f17207a + ", y=" + this.f17208b + ')';
    }
}
