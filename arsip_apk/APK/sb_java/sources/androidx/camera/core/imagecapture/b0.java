package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes.dex */
public interface b0 {

    public static abstract class a {
        public a() {
        }

        public static a c(int r1, ImageCaptureException r2) {
            return new C2230h(r1, r2);
        }

        public abstract ImageCaptureException a();

        public abstract int b();
    }

    public interface b {
        b0 a(B r1);
    }

    void a();

    void b(C r1);

    void c(l0 r1);

    void pause();

    void resume();
}
