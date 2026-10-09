package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final EGLSurface f5969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5971c;

    public c(EGLSurface r1, int r2, int r3) {
        if (r1 == null) goto L7;
        this.f5969a = r1;
        this.f5970b = r2;
        this.f5971c = r3;
        return;
    L7:
        throw new NullPointerException("Null eglSurface");
    }

    @Override // androidx.camera.core.processing.util.f
    public EGLSurface a() {
        return this.f5969a;
    }

    @Override // androidx.camera.core.processing.util.f
    public int b() {
        return this.f5971c;
    }

    @Override // androidx.camera.core.processing.util.f
    public int c() {
        return this.f5970b;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == false) goto L14;
        f r52 = (f) r5;
        if (this.f5969a.equals(r52.a()) == false) goto L14;
        if (this.f5970b != r52.c()) goto L14;
        if (this.f5971c != r52.b()) goto L14;
        return true;
    L14:
        return false;
    }

    public int hashCode() {
        return ((((this.f5969a.hashCode() ^ 1000003) * 1000003) ^ this.f5970b) * 1000003) ^ this.f5971c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f5969a + ", width=" + this.f5970b + ", height=" + this.f5971c + "}";
    }
}
