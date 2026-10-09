package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class LargeJpegImageQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5680a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f5681b = null;

    static {
        f5680a = new HashSet(Arrays.asList(new String[]{"SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"}));
        f5681b = new HashSet(Arrays.asList(new String[]{"V2244A", "V2045", "V2046"}));
    }

    public LargeJpegImageQuirk() {
    }

    public static boolean d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean e() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (f5680a.contains(Build.MODEL.toUpperCase(Locale.US)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        if ("Vivo".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (f5681b.contains(Build.MODEL.toUpperCase(Locale.US)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean g() {
        if (d() == false) goto L5;
        return true;
    L5:
        if (f() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean h(byte[] r3) {
        if (e() == false) goto L5;
    L12:
        return true;
    L5:
        if (f() == true) goto L12;
        if (r3.length <= 10000000) goto L10;
        return true;
    L10:
        return false;
    }
}
