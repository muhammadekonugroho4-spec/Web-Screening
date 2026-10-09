package androidx.camera.core.impl;

import androidx.camera.core.l0;

/* loaded from: classes.dex */
public final class S0 implements androidx.camera.core.l0 {
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.l0 f5280e;

    public S0(long r3, androidx.camera.core.l0 r5) {
        if (r3 < 0) goto L5;
        boolean r02 = true;
    L6:
        androidx.core.util.h.b(r02, "Timeout must be non-negative.");
        this.d = r3;
        this.f5280e = r5;
        return;
    L5:
        r02 = false;
        goto L6
    }

    @Override // androidx.camera.core.l0
    public long a() {
        return this.d;
    }

    @Override // androidx.camera.core.l0
    public l0.c d(l0.b r8) {
        l0.c r02 = this.f5280e.d(r8);
        if (a() > 0) goto L5;
    L8:
        return r02;
    L5:
        if (r8.a() < (a() - r02.b())) goto L8;
        return l0.c.d;
    }
}
