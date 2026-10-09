package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* loaded from: classes.dex */
public abstract class W0 {
    public static CameraUnavailableException a(CameraAccessExceptionCompat r2) {
        int r02 = r2.d();
        int r1 = 1;
        if (r02 == 1) goto L17;
        r1 = 2;
        if (r02 == 2) goto L17;
        r1 = 3;
        if (r02 == 3) goto L17;
        r1 = 4;
        if (r02 == 4) goto L17;
        r1 = 5;
        if (r02 == 5) goto L17;
        if (r02 == 10001) goto L15;
        r1 = 0;
        goto L17
    L15:
        r1 = 6;
    L17:
        return new CameraUnavailableException(r1, r2);
    }
}
