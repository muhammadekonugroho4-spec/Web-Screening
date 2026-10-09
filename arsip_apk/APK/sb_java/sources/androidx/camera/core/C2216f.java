package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216f extends CameraState {

    /* renamed from: a, reason: collision with root package name */
    public final CameraState.Type f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraState.a f4945b;

    public C2216f(CameraState.Type r1, CameraState.a r2) {
        if (r1 == null) goto L7;
        this.f4944a = r1;
        this.f4945b = r2;
        return;
    L7:
        throw new NullPointerException("Null type");
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.a c() {
        return this.f4945b;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type d() {
        return this.f4944a;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof CameraState) == false) goto L17;
        CameraState r52 = (CameraState) r5;
        if (this.f4944a.equals(r52.d()) == false) goto L17;
        CameraState.a r1 = this.f4945b;
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
        int r02 = (this.f4944a.hashCode() ^ 1000003) * 1000003;
        CameraState.a r1 = this.f4945b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CameraState{type=" + this.f4944a + ", error=" + this.f4945b + "}";
    }
}
