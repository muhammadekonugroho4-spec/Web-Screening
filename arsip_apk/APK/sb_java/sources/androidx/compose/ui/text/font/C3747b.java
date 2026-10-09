package androidx.compose.ui.text.font;

/* renamed from: androidx.compose.ui.text.font.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3747b implements J {

    /* renamed from: b, reason: collision with root package name */
    public final int f19911b;

    static {
    }

    public C3747b(int r1) {
        this.f19911b = r1;
    }

    @Override // androidx.compose.ui.text.font.J
    public z b(z r3) {
        int r02 = this.f19911b;
        if (r02 != 0) goto L5;
    L9:
        return r3;
    L5:
        if (r02 == Integer.MAX_VALUE) goto L9;
        return new z(kotlin.ranges.q.q(r3.s() + this.f19911b, 1, 1000));
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3747b) == true) goto L9;
        return false;
    L9:
        if (this.f19911b == ((C3747b) r4).f19911b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19911b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f19911b + ')';
    }
}
