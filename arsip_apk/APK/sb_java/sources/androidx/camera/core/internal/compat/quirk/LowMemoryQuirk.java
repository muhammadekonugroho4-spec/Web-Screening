package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class LowMemoryQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5682a = null;

    static {
        f5682a = new HashSet(Arrays.asList(new String[]{"SM-A520W", "MOTOG3"}));
    }

    public LowMemoryQuirk() {
    }

    public static boolean d() {
        return f5682a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
