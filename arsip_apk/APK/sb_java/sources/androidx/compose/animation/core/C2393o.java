package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2393o extends AbstractC2395p {

    /* renamed from: a, reason: collision with root package name */
    public float f6860a;

    /* renamed from: b, reason: collision with root package name */
    public float f6861b;

    /* renamed from: c, reason: collision with root package name */
    public float f6862c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6863e;

    static {
    }

    public C2393o(float r2, float r3, float r4, float r5) {
        super(null);
        this.f6860a = r2;
        this.f6861b = r3;
        this.f6862c = r4;
        this.d = r5;
        this.f6863e = 4;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public float a(int r2) {
        if (r2 == 0) goto L18;
        if (r2 == 1) goto L16;
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L12;
        return 0.0f;
    L12:
        return this.d;
    L14:
        return this.f6862c;
    L16:
        return this.f6861b;
    L18:
        return this.f6860a;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public int b() {
        return this.f6863e;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public /* bridge */ /* synthetic */ AbstractC2395p c() {
        return j();
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void d() {
        this.f6860a = 0.0f;
        this.f6861b = 0.0f;
        this.f6862c = 0.0f;
        this.d = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void e(int r2, float r3) {
        if (r2 != 0) goto L4;
        this.f6860a = r3;
        return;
    L4:
        if (r2 != 1) goto L6;
        this.f6861b = r3;
        return;
    L6:
        if (r2 != 2) goto L8;
        this.f6862c = r3;
        return;
    L8:
        if (r2 == 3) goto L10;
        return;
    L10:
        this.d = r3;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof C2393o) == false) goto L14;
        C2393o r32 = (C2393o) r3;
        if (r32.f6860a == this.f6860a) goto L7;
        return false;
    L7:
        if (r32.f6861b == this.f6861b) goto L9;
        return false;
    L9:
        if (r32.f6862c == this.f6862c) goto L11;
        return false;
    L11:
        if (r32.d != this.d) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public final float f() {
        return this.f6860a;
    }

    public final float g() {
        return this.f6861b;
    }

    public final float h() {
        return this.f6862c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f6860a) * 31) + Float.hashCode(this.f6861b)) * 31) + Float.hashCode(this.f6862c)) * 31) + Float.hashCode(this.d);
    }

    public final float i() {
        return this.d;
    }

    public C2393o j() {
        return new C2393o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f6860a + ", v2 = " + this.f6861b + ", v3 = " + this.f6862c + ", v4 = " + this.d;
    }
}
