package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387l extends AbstractC2395p {

    /* renamed from: a, reason: collision with root package name */
    public float f6837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6838b;

    static {
    }

    public C2387l(float r2) {
        super(null);
        this.f6837a = r2;
        this.f6838b = 1;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public float a(int r1) {
        if (r1 == 0) goto L4;
        return 0.0f;
    L4:
        return this.f6837a;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public int b() {
        return this.f6838b;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public /* bridge */ /* synthetic */ AbstractC2395p c() {
        return g();
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void d() {
        this.f6837a = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC2395p
    public void e(int r1, float r2) {
        if (r1 != 0) goto L5;
        this.f6837a = r2;
        return;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof C2387l) == true) goto L5;
        return false;
    L5:
        if (((C2387l) r2).f6837a != this.f6837a) goto L10;
        return true;
    L10:
        return false;
    }

    public final float f() {
        return this.f6837a;
    }

    public C2387l g() {
        return new C2387l(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f6837a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f6837a;
    }
}
