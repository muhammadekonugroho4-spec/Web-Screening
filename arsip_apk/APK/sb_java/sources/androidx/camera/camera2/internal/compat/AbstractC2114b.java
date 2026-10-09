package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.internal.compat.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2114b {
    public static void a(CameraCaptureSession.StateCallback r02, CameraCaptureSession r1, Surface r2) {
        r02.onSurfacePrepared(r1, r2);
    }
}
