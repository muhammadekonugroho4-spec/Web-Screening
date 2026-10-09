package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public abstract class f {
    public f() {
    }

    public static f d(EGLSurface r1, int r2, int r3) {
        return new c(r1, r2, r3);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
