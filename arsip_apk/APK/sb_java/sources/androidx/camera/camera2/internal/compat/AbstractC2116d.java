package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: androidx.camera.camera2.internal.compat.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2116d {
    public static void a(CameraCaptureSession.StateCallback r02, CameraCaptureSession r1) {
        r02.onCaptureQueueEmpty(r1);
    }
}
