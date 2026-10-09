package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;

/* loaded from: classes.dex */
public final class L1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final CaptureRequest f4095a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f4096b;

    public L1(CaptureRequest r2, CameraCaptureSession.CaptureCallback r3) {
        kotlin.jvm.internal.p.l(r2, "forwardedRequest");
        kotlin.jvm.internal.p.l(r3, "delegate");
        this.f4095a = r2;
        this.f4096b = r3;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession r7, CaptureRequest r8, Surface r9, long r10) {
        kotlin.jvm.internal.p.l(r7, "session");
        kotlin.jvm.internal.p.l(r8, "request");
        kotlin.jvm.internal.p.l(r9, "target");
        this.f4096b.onCaptureBufferLost(r7, this.f4095a, r9, r10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession r2, CaptureRequest r3, TotalCaptureResult r4) {
        kotlin.jvm.internal.p.l(r2, "session");
        kotlin.jvm.internal.p.l(r3, "request");
        kotlin.jvm.internal.p.l(r4, "result");
        this.f4096b.onCaptureCompleted(r2, this.f4095a, r4);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession r2, CaptureRequest r3, CaptureFailure r4) {
        kotlin.jvm.internal.p.l(r2, "session");
        kotlin.jvm.internal.p.l(r3, "request");
        kotlin.jvm.internal.p.l(r4, "failure");
        this.f4096b.onCaptureFailed(r2, this.f4095a, r4);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession r2, CaptureRequest r3, CaptureResult r4) {
        kotlin.jvm.internal.p.l(r2, "session");
        kotlin.jvm.internal.p.l(r3, "request");
        kotlin.jvm.internal.p.l(r4, "partialResult");
        this.f4096b.onCaptureProgressed(r2, this.f4095a, r4);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "session");
        this.f4096b.onCaptureSequenceAborted(r2, r3);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession r2, int r3, long r4) {
        kotlin.jvm.internal.p.l(r2, "session");
        this.f4096b.onCaptureSequenceCompleted(r2, r3, r4);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession r9, CaptureRequest r10, long r11, long r13) {
        kotlin.jvm.internal.p.l(r9, "session");
        kotlin.jvm.internal.p.l(r10, "request");
        this.f4096b.onCaptureStarted(r9, this.f4095a, r11, r13);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession r9, CaptureRequest r10, long r11, long r13) {
        kotlin.jvm.internal.p.l(r9, "session");
        kotlin.jvm.internal.p.l(r10, "request");
        K1.a(this.f4096b, r9, this.f4095a, r11, r13);
    }
}
