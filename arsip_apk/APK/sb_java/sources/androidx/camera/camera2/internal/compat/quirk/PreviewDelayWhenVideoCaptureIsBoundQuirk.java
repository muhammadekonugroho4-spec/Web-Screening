package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class PreviewDelayWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, D0 {
    public PreviewDelayWhenVideoCaptureIsBoundQuirk() {
    }

    public static boolean d() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER);
    }
}
