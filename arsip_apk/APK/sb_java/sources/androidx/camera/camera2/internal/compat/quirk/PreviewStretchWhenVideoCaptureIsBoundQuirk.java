package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* loaded from: classes.dex */
public class PreviewStretchWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk {
    public PreviewStretchWhenVideoCaptureIsBoundQuirk() {
    }

    public static boolean d() {
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean e() {
        if ("OPPO".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("A37F".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("sm-j111f".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean g() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("sm-j320f".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean h() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("sm-j510fn".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean i() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("sm-j700f".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean j() {
        if (d() == false) goto L5;
        return true;
    L5:
        if (g() == false) goto L7;
        return true;
    L7:
        if (i() == false) goto L9;
        return true;
    L9:
        if (f() == false) goto L11;
        return true;
    L11:
        if (e() == false) goto L13;
        return true;
    L13:
        if (h() == true) goto L23;
        return false;
    L23:
        return true;
    }
}
