package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class h2 {
    public static boolean a(androidx.camera.camera2.internal.compat.C r5) {
        if (Build.VERSION.SDK_INT >= 33) goto L5;
        return false;
    L5:
        int[] r52 = (int[]) r5.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (r52 != null) goto L8;
    L17:
        return false;
    L8:
        if (r52.length == 0) goto L17;
        int r02 = r52.length;
        int r1 = 0;
    L11:
        if (r1 >= r02) goto L17;
        if (r52[r1] == 2) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return true;
    }
}
