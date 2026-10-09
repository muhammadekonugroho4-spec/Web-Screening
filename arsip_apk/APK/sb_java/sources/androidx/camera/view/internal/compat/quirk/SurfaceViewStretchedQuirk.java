package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements D0 {
    public SurfaceViewStretchedQuirk() {
    }

    public static boolean d() {
        if ("LENOVO".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("Q706F".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean e() {
        if ("OPPO".equalsIgnoreCase(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if ("OP4E75L1".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER) == false) goto L10;
        String r02 = Build.DEVICE;
        if ("F2Q".equalsIgnoreCase(r02) == false) goto L7;
        return true;
    L7:
        if ("Q2Q".equalsIgnoreCase(r02) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT < 33) goto L5;
        return false;
    L5:
        if (f() == false) goto L7;
        return true;
    L7:
        if (e() == false) goto L9;
        return true;
    L9:
        if (d() == false) goto L16;
        return true;
    L16:
        return false;
    }
}
