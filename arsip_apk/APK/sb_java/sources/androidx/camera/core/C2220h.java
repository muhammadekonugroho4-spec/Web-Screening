package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.R0;

/* renamed from: androidx.camera.core.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220h extends Z {

    /* renamed from: a, reason: collision with root package name */
    public final R0 f4994a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4995b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4996c;
    public final Matrix d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4997e;

    public C2220h(R0 r1, long r2, int r4, Matrix r5, int r6) {
        if (r1 == null) goto L11;
        this.f4994a = r1;
        this.f4995b = r2;
        this.f4996c = r4;
        if (r5 == null) goto L9;
        this.d = r5;
        this.f4997e = r6;
        return;
    L9:
        throw new NullPointerException("Null sensorToBufferTransformMatrix");
    L11:
        throw new NullPointerException("Null tagBundle");
    }

    @Override // androidx.camera.core.Z, androidx.camera.core.S
    public R0 a() {
        return this.f4994a;
    }

    @Override // androidx.camera.core.Z, androidx.camera.core.S
    public int b() {
        return this.f4997e;
    }

    @Override // androidx.camera.core.Z
    public int e() {
        return this.f4996c;
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof Z) == false) goto L18;
        Z r82 = (Z) r8;
        if (this.f4994a.equals(r82.a()) == false) goto L18;
        if (this.f4995b != r82.getTimestamp()) goto L18;
        if (this.f4996c != r82.e()) goto L18;
        if (this.d.equals(r82.f()) == false) goto L18;
        if (this.f4997e != r82.b()) goto L18;
        return true;
    L18:
        return false;
    }

    @Override // androidx.camera.core.Z
    public Matrix f() {
        return this.d;
    }

    @Override // androidx.camera.core.Z, androidx.camera.core.S
    public long getTimestamp() {
        return this.f4995b;
    }

    public int hashCode() {
        int r02 = (this.f4994a.hashCode() ^ 1000003) * 1000003;
        long r2 = this.f4995b;
        return ((((((r02 ^ ((int) (r2 ^ (r2 >>> 32)))) * 1000003) ^ this.f4996c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4997e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f4994a + ", timestamp=" + this.f4995b + ", rotationDegrees=" + this.f4996c + ", sensorToBufferTransformMatrix=" + this.d + ", flashState=" + this.f4997e + "}";
    }
}
