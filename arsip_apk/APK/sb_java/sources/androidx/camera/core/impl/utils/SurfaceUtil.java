package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class SurfaceUtil {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5509a;

        /* renamed from: b, reason: collision with root package name */
        public int f5510b;

        /* renamed from: c, reason: collision with root package name */
        public int f5511c;

        public a() {
            this.f5509a = 0;
            this.f5510b = 0;
            this.f5511c = 0;
        }
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface r2) {
        int[] r22 = nativeGetSurfaceInfo(r2);
        a r02 = new a();
        r02.f5509a = r22[0];
        r02.f5510b = r22[1];
        r02.f5511c = r22[2];
        return r02;
    }

    private static native int[] nativeGetSurfaceInfo(Surface r02);
}
