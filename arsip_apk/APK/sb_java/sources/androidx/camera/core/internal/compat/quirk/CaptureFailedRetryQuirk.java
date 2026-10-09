package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.D0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5677a = null;

    static {
        f5677a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));
    }

    public CaptureFailedRetryQuirk() {
    }

    public static boolean e() {
        String r02 = Build.BRAND;
        Locale r1 = Locale.US;
        String r03 = r02.toUpperCase(r1);
        String r12 = Build.MODEL.toUpperCase(r1);
        return f5677a.contains(Pair.create(r03, r12));
    }

    public int d() {
        return 1;
    }
}
