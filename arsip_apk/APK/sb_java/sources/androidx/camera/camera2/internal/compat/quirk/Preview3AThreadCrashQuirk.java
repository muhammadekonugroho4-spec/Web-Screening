package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;

/* loaded from: classes.dex */
public class Preview3AThreadCrashQuirk implements D0 {
    public Preview3AThreadCrashQuirk() {
    }

    public static boolean d() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
