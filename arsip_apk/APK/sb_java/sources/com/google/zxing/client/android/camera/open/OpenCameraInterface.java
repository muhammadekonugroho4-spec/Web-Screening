package com.google.zxing.client.android.camera.open;

import android.hardware.Camera;
import android.util.Log;

/* loaded from: classes6.dex */
public final class OpenCameraInterface {
    public static final int NO_REQUESTED_CAMERA = -1;
    private static final String TAG = "com.google.zxing.client.android.camera.open.OpenCameraInterface";

    static {
    }

    private OpenCameraInterface() {
    }

    public static int getCameraId(int r5) {
        int r02 = Camera.getNumberOfCameras();
        if (r02 != 0) goto L7;
        Log.w(TAG, "No cameras!");
        return -1;
    L7:
        if (r5 < 0) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == true) goto L17;
        r5 = 0;
    L12:
        if (r5 >= r02) goto L17;
        Camera.CameraInfo r4 = new Camera.CameraInfo();
        Camera.getCameraInfo(r5, r4);
        if (r4.facing == 0) goto L17;
        r5 = r5 + 1;
    L17:
        if (r5 >= r02) goto L19;
        return r5;
    L19:
        if (r3 == false) goto L21;
        return -1;
    L21:
        return 0;
    L9:
        r3 = false;
        goto L10
    }

    public static Camera open(int r1) {
        int r12 = getCameraId(r1);
        if (r12 != (-1)) goto L7;
        return null;
    L7:
        return Camera.open(r12);
    }
}
