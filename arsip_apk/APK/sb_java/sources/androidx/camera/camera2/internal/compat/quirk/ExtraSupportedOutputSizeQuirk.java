package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements D0 {
    public ExtraSupportedOutputSizeQuirk() {
    }

    public static boolean f() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("moto e5 play".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean g() {
        return f();
    }

    public Size[] d(int r2) {
        if (r2 != 34) goto L9;
        if (f() == false) goto L9;
        return e();
    L9:
        return new Size[0];
    }

    public final Size[] e() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }
}
