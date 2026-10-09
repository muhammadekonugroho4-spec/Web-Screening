package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class GetAvailableKeysNeedsOnInit implements D0 {
    public GetAvailableKeysNeedsOnInit() {
    }

    public static boolean d() {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }
}
