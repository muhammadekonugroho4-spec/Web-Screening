package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface F extends InterfaceC2379h {
    @Override // androidx.compose.animation.core.InterfaceC2379h
    /* bridge */ /* synthetic */ default f1 a(K0 r1) {
        return a(r1);
    }

    float b(long r1, float r3, float r4, float r5);

    long c(float r1, float r2, float r3);

    default float d(float r7, float r8, float r9) {
        return b(c(r7, r8, r9), r7, r8, r9);
    }

    float e(long r1, float r3, float r4, float r5);

    @Override // androidx.compose.animation.core.InterfaceC2379h
    default k1 a(K0 r1) {
        return new k1(this);
    }
}
