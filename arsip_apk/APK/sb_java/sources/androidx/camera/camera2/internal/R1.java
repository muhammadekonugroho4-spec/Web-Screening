package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C2119g;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface R1 {

    public interface a {
        Executor c();

        ListenableFuture g(CameraDevice r1, androidx.camera.camera2.internal.compat.params.p r2, List r3);

        androidx.camera.camera2.internal.compat.params.p o(int r1, List r2, c r3);

        ListenableFuture p(List r1, long r2);

        boolean stop();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f4131a;

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f4132b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f4133c;
        public final C2161k1 d;

        /* renamed from: e, reason: collision with root package name */
        public final androidx.camera.core.impl.G0 f4134e;

        /* renamed from: f, reason: collision with root package name */
        public final androidx.camera.core.impl.G0 f4135f;

        public b(Executor r1, ScheduledExecutorService r2, Handler r3, C2161k1 r4, androidx.camera.core.impl.G0 r5, androidx.camera.core.impl.G0 r6) {
            this.f4131a = r1;
            this.f4132b = r2;
            this.f4133c = r3;
            this.d = r4;
            this.f4134e = r5;
            this.f4135f = r6;
        }

        public a a() {
            return new b2(this.f4134e, this.f4135f, this.d, this.f4131a, this.f4132b, this.f4133c);
        }
    }

    public static abstract class c {
        public c() {
        }

        public void q(R1 r1) {
        }

        public void r(R1 r1) {
        }

        public void s(R1 r1) {
        }

        public abstract void t(R1 r1);

        public abstract void u(R1 r1);

        public abstract void v(R1 r1);

        public abstract void w(R1 r1);

        public void x(R1 r1, Surface r2) {
        }
    }

    void a();

    c b();

    void close();

    void d();

    void e(int r1);

    CameraDevice f();

    int h(List r1, CameraCaptureSession.CaptureCallback r2);

    int i(List r1, CameraCaptureSession.CaptureCallback r2);

    C2119g j();

    ListenableFuture k();

    void l();

    int m(CaptureRequest r1, CameraCaptureSession.CaptureCallback r2);

    List n(CaptureRequest r1);
}
