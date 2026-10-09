package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4369a = null;

    static {
        f4369a = Arrays.asList(new String[]{"NEXUS 4"});
    }

    public Nexus4AndroidLTargetAspectRatioQuirk() {
    }

    public static boolean e() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int d() {
        return 2;
    }
}
