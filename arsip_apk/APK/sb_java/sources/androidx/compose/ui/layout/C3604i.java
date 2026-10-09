package androidx.compose.ui.layout;

/* renamed from: androidx.compose.ui.layout.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3604i implements InterfaceC3601f {

    /* renamed from: b, reason: collision with root package name */
    public final float f18365b;

    static {
    }

    public C3604i(float r1) {
        this.f18365b = r1;
    }

    @Override // androidx.compose.ui.layout.InterfaceC3601f
    public long a(long r3, long r5) {
        float r32 = this.f18365b;
        return p0.a((Float.floatToRawIntBits(r32) << 32) | (4294967295L & Float.floatToRawIntBits(r32)));
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3604i) == true) goto L9;
        return false;
    L9:
        if (Float.compare(this.f18365b, ((C3604i) r4).f18365b) == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Float.hashCode(this.f18365b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f18365b + ')';
    }
}
