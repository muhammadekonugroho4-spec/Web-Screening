package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.camera2.internal.compat.C;
import androidx.camera.core.impl.D0;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;

/* loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements D0 {
    public CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk() {
    }

    public static boolean d(C r02) {
        return e(r02);
    }

    public static boolean e(C r2) {
        if ("motorola".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("moto e20".equalsIgnoreCase(Build.MODEL) == true) goto L7;
        return false;
    L7:
        if (r2.b().equals(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A) == false) goto L13;
        return true;
    L13:
        return false;
    }
}
