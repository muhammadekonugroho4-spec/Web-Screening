package androidx.camera.core.internal;

import androidx.camera.core.H0;

/* loaded from: classes.dex */
public abstract class g implements H0 {
    public g() {
    }

    public static H0 e(H0 r4) {
        return new a(r4.d(), r4.a(), r4.c(), r4.b());
    }

    @Override // androidx.camera.core.H0
    public abstract float a();

    @Override // androidx.camera.core.H0
    public abstract float b();

    @Override // androidx.camera.core.H0
    public abstract float c();

    @Override // androidx.camera.core.H0
    public abstract float d();
}
