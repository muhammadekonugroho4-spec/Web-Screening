package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface i1 extends j1 {
    @Override // androidx.compose.animation.core.f1
    default long b(AbstractC2395p r3, AbstractC2395p r4, AbstractC2395p r5) {
        return (g() + c()) * 1000000;
    }

    int c();

    int g();
}
