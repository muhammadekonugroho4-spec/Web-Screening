package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class LegacyCameraOutputConfigNullPointerQuirk implements D0 {
    public LegacyCameraOutputConfigNullPointerQuirk() {
    }

    public static boolean d(C r1) {
        Integer r12 = (Integer) r1.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (r12 != null) goto L5;
        return false;
    L5:
        if (r12.intValue() != 2) goto L10;
        return true;
    L10:
        return false;
    }
}
