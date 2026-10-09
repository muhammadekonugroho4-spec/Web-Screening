package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2389m extends AbstractC2395p {

    /* renamed from: a, reason: collision with root package name */
    public float f6844a;

    /* renamed from: b, reason: collision with root package name */
    public float f6845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6846c;

    static {
    }

    public C2389m(float r2, float r3) {
        super(null);
        this.f6844a = r2;
        this.f6845b = r3;
        this.f6846c = 2;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public float a(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return 0.0f;
    L8:
        return this.f6845b;
    L10:
        return this.f6844a;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public int b() {
        return this.f6846c;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public /* bridge */ /* synthetic */ AbstractC2395p c() {
        return h();
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void d() {
        this.f6844a = 0.0f;
        this.f6845b = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void e(int r2, float r3) {
        if (r2 != 0) goto L4;
        this.f6844a = r3;
        return;
    L4:
        if (r2 == 1) goto L6;
        return;
    L6:
        this.f6845b = r3;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof C2389m) == false) goto L10;
        C2389m r32 = (C2389m) r3;
        if (r32.f6844a == this.f6844a) goto L7;
        return false;
    L7:
        if (r32.f6845b != this.f6845b) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final float f() {
        return this.f6844a;
    }

    public final float g() {
        return this.f6845b;
    }

    public C2389m h() {
        return new C2389m(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f6844a) * 31) + Float.hashCode(this.f6845b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f6844a + ", v2 = " + this.f6845b;
    }
}
