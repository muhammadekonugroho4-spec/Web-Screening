package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class CaptureSessionShouldUseMrirQuirk implements D0 {
    public CaptureSessionShouldUseMrirQuirk() {
    }

    public static boolean d() {
        if ("google".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (Build.VERSION.SDK_INT < 35) goto L10;
        return true;
    L10:
        return false;
    }
}
