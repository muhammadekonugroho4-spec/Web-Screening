package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.content.pm.a$a, reason: collision with other inner class name */
    public static class C0161a {
        public static long a(PackageInfo r2) {
            return r2.getLongVersionCode();
        }
    }

    public static long a(PackageInfo r2) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return C0161a.a(r2);
    L7:
        return r2.versionCode;
    }
}
