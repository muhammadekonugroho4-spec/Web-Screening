package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Locale;

/* loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements D0 {
    public StillCaptureFlashStopRepeatingQuirk() {
    }

    public static boolean d() {
        String r02 = Build.MANUFACTURER;
        Locale r1 = Locale.US;
        if ("SAMSUNG".equals(r02.toUpperCase(r1)) == true) goto L5;
        return false;
    L5:
        if (Build.MODEL.toUpperCase(r1).startsWith("SM-A716") == false) goto L10;
        return true;
    L10:
        return false;
    }
}
