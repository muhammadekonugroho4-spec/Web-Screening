package androidx.camera.core;

import androidx.camera.core.t0;

/* renamed from: androidx.camera.core.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299j extends t0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5728a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f5729b;

    public C2299j(int r1, t0 r2) {
        this.f5728a = r1;
        if (r2 == null) goto L7;
        this.f5729b = r2;
        return;
    L7:
        throw new NullPointerException("Null surfaceOutput");
    }

    @Override // androidx.camera.core.t0.b
    public int a() {
        return this.f5728a;
    }

    @Override // androidx.camera.core.t0.b
    public t0 b() {
        return this.f5729b;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof t0.b) == false) goto L12;
        t0.b r52 = (t0.b) r5;
        if (this.f5728a != r52.a()) goto L12;
        if (this.f5729b.equals(r52.b()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return ((this.f5728a ^ 1000003) * 1000003) ^ this.f5729b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f5728a + ", surfaceOutput=" + this.f5729b + "}";
    }
}
