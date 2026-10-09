package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f20622a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20623b;

    public f(float r1, float r2) {
        this.f20622a = r1;
        this.f20623b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (Float.compare(this.f20622a, r52.f20622a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f20623b, r52.f20623b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // androidx.compose.ui.unit.m
    public float f2() {
        return this.f20623b;
    }

    @Override // androidx.compose.ui.unit.e
    public float getDensity() {
        return this.f20622a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f20622a) * 31) + Float.hashCode(this.f20623b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f20622a + ", fontScale=" + this.f20623b + ')';
    }
}
