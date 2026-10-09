package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4370a = null;

    static {
        f4370a = Arrays.asList(new String[]{"sunfish", "bramble", "redfin", "barbet"});
    }

    public PreviewPixelHDRnetQuirk() {
    }

    public static boolean d() {
        if ("Google".equals(Build.MANUFACTURER) == true) goto L5;
        return false;
    L5:
        if (f4370a.contains(Build.DEVICE.toLowerCase(Locale.getDefault())) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
