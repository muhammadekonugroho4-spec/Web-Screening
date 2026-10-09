package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ SessionConfiguration a(int r1, List r2, Executor r3, CameraCaptureSession.StateCallback r4) {
        return new SessionConfiguration(r1, r2, r3, r4);
    }
}
