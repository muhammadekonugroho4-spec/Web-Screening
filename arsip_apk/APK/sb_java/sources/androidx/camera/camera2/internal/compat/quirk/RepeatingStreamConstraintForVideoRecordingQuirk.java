package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements D0 {
    public RepeatingStreamConstraintForVideoRecordingQuirk() {
    }

    public static boolean d() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("mha-l29".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean e() {
        return d();
    }
}
