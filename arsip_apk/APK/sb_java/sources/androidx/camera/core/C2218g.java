package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2218g extends CameraState.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f4992b;

    public C2218g(int r1, Throwable r2) {
        this.f4991a = r1;
        this.f4992b = r2;
    }

    @Override // androidx.camera.core.CameraState.a
    public Throwable c() {
        return this.f4992b;
    }

    @Override // androidx.camera.core.CameraState.a
    public int d() {
        return this.f4991a;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof CameraState.a) == false) goto L17;
        CameraState.a r52 = (CameraState.a) r5;
        if (this.f4991a != r52.d()) goto L17;
        Throwable r1 = this.f4992b;
        if (r1 != null) goto L15;
        if (r52.c() != null) goto L17;
    L16:
        return true;
    L15:
        if (r1.equals(r52.c()) == true) goto L16;
    L17:
        return false;
    }

    public int hashCode() {
        int r02 = (this.f4991a ^ 1000003) * 1000003;
        Throwable r1 = this.f4992b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "StateError{code=" + this.f4991a + ", cause=" + this.f4992b + "}";
    }
}
