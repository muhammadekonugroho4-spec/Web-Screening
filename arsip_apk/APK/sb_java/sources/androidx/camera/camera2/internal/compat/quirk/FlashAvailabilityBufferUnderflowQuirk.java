package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.D0;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4355a = null;

    static {
        f4355a = new HashSet();
        d("sprd", "lemp");
        d("sprd", "DM20C");
    }

    public FlashAvailabilityBufferUnderflowQuirk() {
    }

    public static void d(String r3, String r4) {
        Set r02 = f4355a;
        Locale r2 = Locale.US;
        r02.add(new Pair(r3.toLowerCase(r2), r4.toLowerCase(r2)));
    }

    public static boolean e() {
        Set r02 = f4355a;
        String r2 = Build.MANUFACTURER;
        Locale r3 = Locale.US;
        return r02.contains(new Pair(r2.toLowerCase(r3), Build.MODEL.toLowerCase(r3)));
    }
}
