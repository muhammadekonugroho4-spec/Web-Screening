package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2133v extends C2134w {
    public C2133v(CameraCaptureSession r2) {
        super(r2, null);
    }

    @Override // androidx.camera.camera2.internal.compat.C2134w, androidx.camera.camera2.internal.compat.C2119g.a
    public int b(List r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        return this.f4389a.captureBurstRequests(r2, r3, r4);
    }

    @Override // androidx.camera.camera2.internal.compat.C2134w, androidx.camera.camera2.internal.compat.C2119g.a
    public int c(List r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        return this.f4389a.setRepeatingBurstRequests(r2, r3, r4);
    }

    @Override // androidx.camera.camera2.internal.compat.C2134w, androidx.camera.camera2.internal.compat.C2119g.a
    public int d(CaptureRequest r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        return this.f4389a.setSingleRepeatingRequest(r2, r3, r4);
    }
}
