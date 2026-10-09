package androidx.compose.foundation.layout;

/* renamed from: androidx.compose.foundation.layout.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2564y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8214c;
    public final int d;

    static {
    }

    public C2564y0(int r1, int r2, int r3, int r4) {
        this.f8212a = r1;
        this.f8213b = r2;
        this.f8214c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.f8212a;
    }

    public final int c() {
        return this.f8214c;
    }

    public final int d() {
        return this.f8213b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2564y0) == true) goto L8;
        return false;
    L8:
        C2564y0 r52 = (C2564y0) r5;
        if (this.f8212a == r52.f8212a) goto L11;
    L17:
        return false;
    L11:
        if (this.f8213b != r52.f8213b) goto L17;
        if (this.f8214c != r52.f8214c) goto L17;
        if (this.d != r52.d) goto L17;
        return true;
    }

    public int hashCode() {
        return (((((this.f8212a * 31) + this.f8213b) * 31) + this.f8214c) * 31) + this.d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f8212a + ", top=" + this.f8213b + ", right=" + this.f8214c + ", bottom=" + this.d + ')';
    }
}
