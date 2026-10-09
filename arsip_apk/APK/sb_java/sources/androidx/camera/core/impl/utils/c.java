package androidx.camera.core.impl.utils;

import androidx.camera.core.AbstractC2209b0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
public abstract class c {
    public static int a(int r3, int r4, boolean r5) {
        if (r5 == false) goto L4;
        int r02 = ((r4 - r3) + 360) % 360;
    L6:
        if (AbstractC2209b0.h("CameraOrientationUtil") == false) goto L8;
        AbstractC2209b0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(r3), Integer.valueOf(r4), Boolean.valueOf(r5), Integer.valueOf(r02)}));
    L8:
        return r02;
    L4:
        r02 = (r4 + r3) % 360;
        goto L6
    }

    public static int b(int r3) {
        if (r3 != 0) goto L4;
        return 0;
    L4:
        if (r3 != 1) goto L6;
        return 90;
    L6:
        if (r3 != 2) goto L8;
        return SubsamplingScaleImageView.ORIENTATION_180;
    L8:
        if (r3 != 3) goto L12;
        return SubsamplingScaleImageView.ORIENTATION_270;
    L12:
        throw new IllegalArgumentException("Unsupported surface rotation: " + r3);
    }
}
