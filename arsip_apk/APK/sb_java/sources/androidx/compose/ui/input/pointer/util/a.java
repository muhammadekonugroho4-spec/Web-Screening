package androidx.compose.ui.input.pointer.util;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f18174a;

    /* renamed from: b, reason: collision with root package name */
    public float f18175b;

    static {
    }

    public a(long r1, float r3) {
        this.f18174a = r1;
        this.f18175b = r3;
    }

    public final float a() {
        return this.f18175b;
    }

    public final long b() {
        return this.f18174a;
    }

    public final void c(float r1) {
        this.f18175b = r1;
    }

    public final void d(long r1) {
        this.f18174a = r1;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f18174a == r82.f18174a) goto L12;
        return false;
    L12:
        if (Float.compare(this.f18175b, r82.f18175b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.f18174a) * 31) + Float.hashCode(this.f18175b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f18174a + ", dataPoint=" + this.f18175b + ')';
    }
}
