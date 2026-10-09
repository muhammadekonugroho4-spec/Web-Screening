package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class K1 {
    public static /* bridge */ /* synthetic */ void a(CameraCaptureSession.CaptureCallback r02, CameraCaptureSession r1, CaptureRequest r2, long r3, long r5) {
        r02.onReadoutStarted(r1, r2, r3, r5);
    }
}
