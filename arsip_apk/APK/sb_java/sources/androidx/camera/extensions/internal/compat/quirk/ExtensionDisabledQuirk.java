package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class ExtensionDisabledQuirk implements D0 {
    public ExtensionDisabledQuirk() {
    }

    public static boolean d() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean e() {
        if ("google".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("redfin".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean g() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("a52sxq".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean h() {
        if (e() == false) goto L5;
        return true;
    L5:
        if (d() == false) goto L7;
        return true;
    L7:
        if (f() == false) goto L9;
        return true;
    L9:
        if (g() == true) goto L17;
        return false;
    L17:
        return true;
    }
}
