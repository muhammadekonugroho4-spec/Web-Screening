package ai.advance.common.utils;

import android.app.Activity;
import android.hardware.Camera;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
public abstract class b {
    public static int a() {
        return c(0);
    }

    public static int b(int r3, Activity r4) {
        Camera.CameraInfo r32 = e(r3);
        if (r32 != null) goto L6;
        return -1;
    L6:
        int r42 = r4.getWindowManager().getDefaultDisplay().getRotation();
        int r1 = 0;
        if (r42 == 0) goto L17;
        if (r42 != 1) goto L10;
        r1 = 90;
        goto L17
    L10:
        if (r42 != 2) goto L12;
        r1 = SubsamplingScaleImageView.ORIENTATION_180;
        goto L17
    L12:
        if (r42 != 3) goto L17;
        r1 = SubsamplingScaleImageView.ORIENTATION_270;
    L17:
        int r43 = r32.facing;
        int r33 = r32.orientation;
        if (r43 != 1) goto L22;
        int r34 = 360 - ((r33 + r1) % 360);
    L21:
        return r34 % 360;
    L22:
        r34 = (r33 - r1) + 360;
        goto L21
    }

    public static int c(int r3) {
        int r02 = Camera.getNumberOfCameras();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L10;
        Camera.CameraInfo r2 = e(r1);
        if (r2 == null) goto L9;
        if (r2.facing != r3) goto L9;
        return r1;
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        return -1;
    }

    public static int d() {
        return c(1);
    }

    public static Camera.CameraInfo e(int r1) {
        Camera.CameraInfo r02 = new Camera.CameraInfo();     // Catch: Exception -> L5
        Camera.getCameraInfo(r1, r02);     // Catch: Exception -> L7
        return r02;
    L13:
        return r02;
    L5:
        return null;
    }
}
