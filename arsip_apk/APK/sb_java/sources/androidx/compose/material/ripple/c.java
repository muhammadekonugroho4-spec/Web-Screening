package androidx.compose.material.ripple;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f12048a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12049b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12050c;
    public final float d;

    static {
    }

    public c(float r1, float r2, float r3, float r4) {
        this.f12048a = r1;
        this.f12049b = r2;
        this.f12050c = r3;
        this.d = r4;
    }

    public final float a() {
        return this.f12048a;
    }

    public final float b() {
        return this.f12049b;
    }

    public final float c() {
        return this.f12050c;
    }

    public final float d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f12048a == r52.f12048a) goto L11;
    L17:
        return false;
    L11:
        if (this.f12049b != r52.f12049b) goto L17;
        if (this.f12050c != r52.f12050c) goto L17;
        if (this.d != r52.d) goto L17;
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f12048a) * 31) + Float.hashCode(this.f12049b)) * 31) + Float.hashCode(this.f12050c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f12048a + ", focusedAlpha=" + this.f12049b + ", hoveredAlpha=" + this.f12050c + ", pressedAlpha=" + this.d + ')';
    }
}
