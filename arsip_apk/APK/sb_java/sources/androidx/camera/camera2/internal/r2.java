package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;

/* loaded from: classes.dex */
public abstract class r2 {
    public static boolean a(androidx.camera.camera2.internal.compat.C r4, int r5) {
        int[] r42 = (int[]) r4.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (r42 == null) goto L11;
        int r1 = r42.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L11;
        if (r42[r2] == r5) goto L8;
        r2 = r2 + 1;
        goto L5
    L8:
        return true;
    L11:
        return false;
    }
}
