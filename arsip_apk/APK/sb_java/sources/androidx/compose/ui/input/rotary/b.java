package androidx.compose.ui.input.rotary;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f18205a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18206b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18207c;
    public final int d;

    static {
    }

    public b(float r1, float r2, long r3, int r5) {
        this.f18205a = r1;
        this.f18206b = r2;
        this.f18207c = r3;
        this.d = r5;
    }

    public boolean equals(Object r5) {
        if ((r5 instanceof b) == false) goto L14;
        b r52 = (b) r5;
        if (r52.f18205a == this.f18205a) goto L7;
        return false;
    L7:
        if (r52.f18206b == this.f18206b) goto L9;
        return false;
    L9:
        if (r52.f18207c == this.f18207c) goto L11;
        return false;
    L11:
        if (r52.d != this.d) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f18205a) * 31) + Float.hashCode(this.f18206b)) * 31) + Long.hashCode(this.f18207c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f18205a + ",horizontalScrollPixels=" + this.f18206b + ",uptimeMillis=" + this.f18207c + ",deviceId=" + this.d + ')';
    }
}
