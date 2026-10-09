package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class n {

    public static class a {
        public static boolean a(PackageManager r1) {
            return r1.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    public static boolean a(Context r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r1.getPackageManager() != null) goto L6;
        return false;
    L6:
        if (a.a(r1.getPackageManager()) == false) goto L12;
        return true;
    L12:
        return false;
    }
}
