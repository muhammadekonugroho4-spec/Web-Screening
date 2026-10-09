package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.f;

/* loaded from: classes.dex */
public interface W0 extends androidx.compose.runtime.external.kotlinx.collections.immutable.f, N, J {

    public interface a extends f.a {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
        W0 build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    a c();

    @Override // androidx.compose.runtime.J
    default Object k(I r1) {
        return O.b(this, r1);
    }

    W0 u(I r1, v2 r2);
}
