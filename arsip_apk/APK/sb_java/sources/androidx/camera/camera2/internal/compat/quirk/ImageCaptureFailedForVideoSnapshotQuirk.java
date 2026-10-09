package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4358a = null;

    static {
        f4358a = new HashSet(Arrays.asList(new String[]{"itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6"}));
    }

    public ImageCaptureFailedForVideoSnapshotQuirk() {
    }

    public static boolean d() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("FIG-LX1".equalsIgnoreCase(Build.MODEL) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean e() {
        Set r02 = f4358a;
        String r1 = Build.MODEL;
        Locale r2 = Locale.US;
        if (r02.contains(r1.toLowerCase(r2)) == false) goto L5;
        return true;
    L5:
        if (Build.VERSION.SDK_INT >= 31) goto L7;
    L8:
        String r03 = Build.HARDWARE;
        if (r03.toLowerCase(r2).startsWith("ums") == false) goto L11;
        return true;
    L11:
        if ("itel".equalsIgnoreCase(Build.BRAND) == true) goto L13;
        return false;
    L13:
        if (r03.toLowerCase(r2).startsWith("sp") == true) goto L22;
        return false;
    L22:
        return true;
    L7:
        if ("Spreadtrum".equalsIgnoreCase(b.a()) == false) goto L8;
        return true;
    }

    public static boolean f() {
        if (e() == false) goto L5;
        return true;
    L5:
        if (d() == true) goto L11;
        return false;
    L11:
        return true;
    }
}
