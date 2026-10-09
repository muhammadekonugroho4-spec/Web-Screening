package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class ZslDisablerQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4377a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final List f4378b = null;

    static {
        f4377a = Arrays.asList(new String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1"});
        f4378b = Arrays.asList(new String[]{"MI 8"});
    }

    public ZslDisablerQuirk() {
    }

    public static boolean d(List r3) {
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L9;
        String r02 = (String) r32.next();
        if (Build.MODEL.toUpperCase(Locale.US).startsWith(r02) == false) goto L4;
        return true;
    L9:
        return false;
    }

    private static boolean e() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (d(f4377a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        if ("xiaomi".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (d(f4378b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean g() {
        if (e() == false) goto L5;
        return true;
    L5:
        if (f() == true) goto L11;
        return false;
    L11:
        return true;
    }
}
