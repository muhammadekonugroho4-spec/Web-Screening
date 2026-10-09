package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class S extends Q {
    public S(Context r1) {
        super(r1);
    }

    @Override // androidx.camera.camera2.internal.compat.Q, androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public void c(String r2, Executor r3, CameraDevice.StateCallback r4) {
        this.f4277a.openCamera(r2, r3, r4);     // Catch: CameraAccessException -> L4
        return;
    L4:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    }

    @Override // androidx.camera.camera2.internal.compat.Q, androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public CameraCharacteristics e(String r2) {
        return this.f4277a.getCameraCharacteristics(r2);
    L4:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    }
}
