package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface t0 extends Closeable, AutoCloseable {

    public static abstract class a {
        public a() {
        }

        public static a f(Size r6, Rect r7, CameraInternal r8, int r9, boolean r10) {
            return new C2222i(r6, r7, r8, r9, r10);
        }

        public abstract CameraInternal a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        public b() {
        }

        public static b c(int r1, t0 r2) {
            return new C2299j(r1, r2);
        }

        public abstract int a();

        public abstract t0 b();
    }

    void E0(float[] r1, float[] r2, boolean r3);

    void V(float[] r1, float[] r2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Surface g1(Executor r1, androidx.core.util.a r2);

    Size getSize();

    int q();
}
