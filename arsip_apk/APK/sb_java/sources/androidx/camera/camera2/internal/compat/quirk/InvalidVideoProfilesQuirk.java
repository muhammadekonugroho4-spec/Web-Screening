package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4364a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final List f4365b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final List f4366c = null;

    static {
        f4364a = Arrays.asList(new String[]{"pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro"});
        f4365b = Arrays.asList(new String[]{"cph2417", "cph2451"});
        f4366c = Arrays.asList(new String[]{"cph2437", "cph2525", "pht110"});
    }

    public InvalidVideoProfilesQuirk() {
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT != 33) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean e() {
        if (f() == true) goto L5;
        return false;
    L5:
        if (d() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f() {
        return f4365b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean g() {
        if (h() == true) goto L5;
        return false;
    L5:
        if (d() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean h() {
        return f4366c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean i() {
        if (p() == false) goto L5;
        return true;
    L5:
        if (n() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean j() {
        if (k() == true) goto L5;
        return false;
    L5:
        if (i() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean k() {
        return f4364a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean l() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (p() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean m() {
        String r02 = Build.BRAND;
        if ("redmi".equalsIgnoreCase(r02) == true) goto L7;
        if ("xiaomi".equalsIgnoreCase(r02) == true) goto L7;
        return false;
    L7:
        if (o() == false) goto L9;
        return true;
    L9:
        if (p() == true) goto L16;
        return false;
    L16:
        return true;
    }

    public static boolean n() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    public static boolean o() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    public static boolean p() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    public static boolean q() {
        if (l() == false) goto L5;
        return true;
    L5:
        if (j() == false) goto L7;
        return true;
    L7:
        if (m() == false) goto L9;
        return true;
    L9:
        if (e() == false) goto L11;
        return true;
    L11:
        if (g() == true) goto L20;
        return false;
    L20:
        return true;
    }
}
