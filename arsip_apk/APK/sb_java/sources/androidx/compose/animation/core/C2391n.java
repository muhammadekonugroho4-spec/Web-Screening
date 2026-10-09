package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2391n extends AbstractC2395p {

    /* renamed from: a, reason: collision with root package name */
    public float f6854a;

    /* renamed from: b, reason: collision with root package name */
    public float f6855b;

    /* renamed from: c, reason: collision with root package name */
    public float f6856c;
    public final int d;

    static {
    }

    public C2391n(float r2, float r3, float r4) {
        super(null);
        this.f6854a = r2;
        this.f6855b = r3;
        this.f6856c = r4;
        this.d = 3;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public float a(int r2) {
        if (r2 == 0) goto L14;
        if (r2 == 1) goto L12;
        if (r2 == 2) goto L10;
        return 0.0f;
    L10:
        return this.f6856c;
    L12:
        return this.f6855b;
    L14:
        return this.f6854a;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public int b() {
        return this.d;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public /* bridge */ /* synthetic */ AbstractC2395p c() {
        return f();
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void d() {
        this.f6854a = 0.0f;
        this.f6855b = 0.0f;
        this.f6856c = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void e(int r2, float r3) {
        if (r2 != 0) goto L4;
        this.f6854a = r3;
        return;
    L4:
        if (r2 != 1) goto L6;
        this.f6855b = r3;
        return;
    L6:
        if (r2 == 2) goto L8;
        return;
    L8:
        this.f6856c = r3;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof C2391n) == false) goto L12;
        C2391n r32 = (C2391n) r3;
        if (r32.f6854a == this.f6854a) goto L7;
        return false;
    L7:
        if (r32.f6855b == this.f6855b) goto L9;
        return false;
    L9:
        if (r32.f6856c != this.f6856c) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    public C2391n f() {
        return new C2391n(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f6854a) * 31) + Float.hashCode(this.f6855b)) * 31) + Float.hashCode(this.f6856c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f6854a + ", v2 = " + this.f6855b + ", v3 = " + this.f6856c;
    }
}
