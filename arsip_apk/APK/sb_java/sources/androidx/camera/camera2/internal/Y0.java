package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC2276o;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC2276o {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f4220a;

    public Y0(CameraCaptureSession.CaptureCallback r2) {
        if (r2 == null) goto L7;
        this.f4220a = r2;
        return;
    L7:
        throw new NullPointerException("captureCallback is null");
    }

    public static Y0 e(CameraCaptureSession.CaptureCallback r1) {
        return new Y0(r1);
    }

    public CameraCaptureSession.CaptureCallback f() {
        return this.f4220a;
    }
}
