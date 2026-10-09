package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ boolean a(CameraDevice.CameraDeviceSetup r02, SessionConfiguration r1) {
        return r02.isSessionConfigurationSupported(r1);
    }
}
