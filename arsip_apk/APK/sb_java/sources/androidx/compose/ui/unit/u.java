package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class u implements androidx.compose.ui.unit.fontscaling.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f20656a;

    public u(float r1) {
        this.f20656a = r1;
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public float a(float r2) {
        return r2 / this.f20656a;
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public float b(float r2) {
        return r2 * this.f20656a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof u) == true) goto L9;
        return false;
    L9:
        if (Float.compare(this.f20656a, ((u) r4).f20656a) == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Float.hashCode(this.f20656a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f20656a + ')';
    }
}
