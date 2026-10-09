package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2119g {

    /* renamed from: a, reason: collision with root package name */
    public final a f4286a;

    /* renamed from: androidx.camera.camera2.internal.compat.g$a */
    public interface a {
        CameraCaptureSession a();

        int b(List r1, Executor r2, CameraCaptureSession.CaptureCallback r3);

        int c(List r1, Executor r2, CameraCaptureSession.CaptureCallback r3);

        int d(CaptureRequest r1, Executor r2, CameraCaptureSession.CaptureCallback r3);
    }

    /* renamed from: androidx.camera.camera2.internal.compat.g$b */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f4287a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f4288b;

        public b(Executor r1, CameraCaptureSession.CaptureCallback r2) {
            this.f4288b = r1;
            this.f4287a = r2;
        }

        public static /* synthetic */ void a(b r02, CameraCaptureSession r1, int r2) {
            r02.f4287a.onCaptureSequenceAborted(r1, r2);
        }

        public static /* synthetic */ void b(b r02, CameraCaptureSession r1, CaptureRequest r2, long r3, long r5) {
            r02.f4287a.onCaptureStarted(r1, r2, r3, r5);
        }

        public static /* synthetic */ void c(b r02, CameraCaptureSession r1, CaptureRequest r2, CaptureFailure r3) {
            r02.f4287a.onCaptureFailed(r1, r2, r3);
        }

        public static /* synthetic */ void d(b r02, CameraCaptureSession r1, int r2, long r3) {
            r02.f4287a.onCaptureSequenceCompleted(r1, r2, r3);
        }

        public static /* synthetic */ void e(b r02, CameraCaptureSession r1, CaptureRequest r2, Surface r3, long r4) {
            AbstractC2115c.a(r02.f4287a, r1, r2, r3, r4);
        }

        public static /* synthetic */ void f(b r02, CameraCaptureSession r1, CaptureRequest r2, TotalCaptureResult r3) {
            r02.f4287a.onCaptureCompleted(r1, r2, r3);
        }

        public static /* synthetic */ void g(b r02, CameraCaptureSession r1, CaptureRequest r2, CaptureResult r3) {
            r02.f4287a.onCaptureProgressed(r1, r2, r3);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession r9, final CaptureRequest r10, final Surface r11, final long r12) {
            this.f4288b.execute(new RunnableC2125m(this, r9, r10, r11, r12));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession r3, final CaptureRequest r4, final TotalCaptureResult r5) {
            this.f4288b.execute(new RunnableC2121i(this, r3, r4, r5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession r3, final CaptureRequest r4, final CaptureFailure r5) {
            this.f4288b.execute(new RunnableC2124l(this, r3, r4, r5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession r3, final CaptureRequest r4, final CaptureResult r5) {
            this.f4288b.execute(new RunnableC2122j(this, r3, r4, r5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession r3, final int r4) {
            this.f4288b.execute(new RunnableC2126n(this, r3, r4));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession r8, final int r9, final long r10) {
            this.f4288b.execute(new RunnableC2123k(this, r8, r9, r10));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession r10, final CaptureRequest r11, final long r12, final long r14) {
            this.f4288b.execute(new RunnableC2120h(this, r10, r11, r12, r14));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.g$c */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f4289a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f4290b;

        public c(Executor r1, CameraCaptureSession.StateCallback r2) {
            this.f4290b = r1;
            this.f4289a = r2;
        }

        public static /* synthetic */ void a(c r02, CameraCaptureSession r1) {
            AbstractC2116d.a(r02.f4289a, r1);
        }

        public static /* synthetic */ void b(c r02, CameraCaptureSession r1) {
            r02.f4289a.onClosed(r1);
        }

        public static /* synthetic */ void c(c r02, CameraCaptureSession r1) {
            r02.f4289a.onConfigureFailed(r1);
        }

        public static /* synthetic */ void d(c r02, CameraCaptureSession r1, Surface r2) {
            AbstractC2114b.a(r02.f4289a, r1, r2);
        }

        public static /* synthetic */ void e(c r02, CameraCaptureSession r1) {
            r02.f4289a.onReady(r1);
        }

        public static /* synthetic */ void f(c r02, CameraCaptureSession r1) {
            r02.f4289a.onActive(r1);
        }

        public static /* synthetic */ void g(c r02, CameraCaptureSession r1) {
            r02.f4289a.onConfigured(r1);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession r3) {
            this.f4290b.execute(new RunnableC2127o(this, r3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession r3) {
            this.f4290b.execute(new r(this, r3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession r3) {
            this.f4290b.execute(new RunnableC2128p(this, r3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession r3) {
            this.f4290b.execute(new RunnableC2132u(this, r3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession r3) {
            this.f4290b.execute(new RunnableC2130s(this, r3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession r3) {
            this.f4290b.execute(new RunnableC2131t(this, r3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession r3, final Surface r4) {
            this.f4290b.execute(new RunnableC2129q(this, r3, r4));
        }
    }

    public C2119g(CameraCaptureSession r3, Handler r4) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.f4286a = new C2133v(r3);
        return;
    L6:
        this.f4286a = C2134w.e(r3, r4);
    }

    public static C2119g e(CameraCaptureSession r1, Handler r2) {
        return new C2119g(r1, r2);
    }

    public int a(List r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        return this.f4286a.b(r2, r3, r4);
    }

    public int b(List r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        return this.f4286a.c(r2, r3, r4);
    }

    public int c(CaptureRequest r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        return this.f4286a.d(r2, r3, r4);
    }

    public CameraCaptureSession d() {
        return this.f4286a.a();
    }
}
