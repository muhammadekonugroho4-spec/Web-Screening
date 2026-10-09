package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4361a = null;

    static {
        f4361a = Arrays.asList(new String[]{"Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL"});
    }

    public ImageCapturePixelHDRPlusQuirk() {
    }

    public static boolean d() {
        if (f4361a.contains(Build.MODEL) == true) goto L5;
        return false;
    L5:
        if ("Google".equals(Build.MANUFACTURER) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
