package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.internal.compat.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2115c {
    public static void a(CameraCaptureSession.CaptureCallback r02, CameraCaptureSession r1, CaptureRequest r2, Surface r3, long r4) {
        r02.onCaptureBufferLost(r1, r2, r3, r4);
    }
}
