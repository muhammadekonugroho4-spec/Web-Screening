package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, D0 {
    public ImageCaptureFailedWhenVideoCaptureIsBoundQuirk() {
    }

    public static boolean d() {
        if ("blu".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("studio x10".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean e() {
        if ("itel".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("itel w6004".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("moto e13".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean g() {
        if ("pixel 4 xl".equalsIgnoreCase(Build.MODEL) == true) goto L5;
        return false;
    L5:
        if (Build.VERSION.SDK_INT != 29) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean h() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("twist 2 pro".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean i() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) == false) goto L10;
        String r02 = Build.DEVICE;
        if ("gta8".equalsIgnoreCase(r02) == false) goto L7;
        return true;
    L7:
        if ("gta8wifi".equalsIgnoreCase(r02) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public static boolean j() {
        if ("vivo".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("vivo 1805".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean k() {
        if (d() == false) goto L5;
        return true;
    L5:
        if (e() == false) goto L7;
        return true;
    L7:
        if (j() == false) goto L9;
        return true;
    L9:
        if (h() == false) goto L11;
        return true;
    L11:
        if (g() == false) goto L13;
        return true;
    L13:
        if (f() == false) goto L15;
        return true;
    L15:
        if (i() == false) goto L17;
        return true;
    L17:
        if (c.d() == true) goto L29;
        return false;
    L29:
        return true;
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean a() {
        if (d() == false) goto L5;
        return true;
    L5:
        if (e() == false) goto L7;
        return true;
    L7:
        if (j() == false) goto L9;
        return true;
    L9:
        if (h() == true) goto L17;
        return false;
    L17:
        return true;
    }
}
