package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class SurfaceViewNotCroppedByParentQuirk implements D0 {
    public SurfaceViewNotCroppedByParentQuirk() {
    }

    public static boolean d() {
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("M2101K7AG".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
