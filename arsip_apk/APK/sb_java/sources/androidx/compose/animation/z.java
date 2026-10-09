package androidx.compose.animation;

/* loaded from: classes.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6991a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.p f6992b;

    public z(boolean r1, kotlin.jvm.functions.p r2) {
        this.f6991a = r1;
        this.f6992b = r2;
    }

    @Override // androidx.compose.animation.y
    public boolean a() {
        return this.f6991a;
    }

    @Override // androidx.compose.animation.y
    public androidx.compose.animation.core.E b(long r2, long r4) {
        return (androidx.compose.animation.core.E) this.f6992b.invoke(androidx.compose.ui.unit.s.b(r2), androidx.compose.ui.unit.s.b(r4));
    }
}
