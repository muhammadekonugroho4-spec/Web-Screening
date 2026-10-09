package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class CaptureOutputSurfaceOccupiedQuirk implements D0 {
    public CaptureOutputSurfaceOccupiedQuirk() {
    }

    public static boolean d() {
        return Build.BRAND.equalsIgnoreCase("Xiaomi");
    }
}
