package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* bridge */ /* synthetic */ CaptureRequest.Builder a(CameraDevice.CameraDeviceSetup r02, int r1) {
        return r02.createCaptureRequest(r1);
    }
}
