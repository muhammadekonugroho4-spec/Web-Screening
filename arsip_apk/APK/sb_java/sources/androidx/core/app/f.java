package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {
        public static Object a(Context r02, Class r1) {
            return r02.getSystemService(r1);
        }

        public static int b(AppOpsManager r02, String r1, String r2) {
            return r02.noteProxyOpNoThrow(r1, r2);
        }

        public static String c(String r02) {
            return AppOpsManager.permissionToOp(r02);
        }
    }

    public static class b {
        public static int a(AppOpsManager r02, String r1, int r2, String r3) {
            if (r02 != null) goto L6;
            return 1;
        L6:
            return r02.checkOpNoThrow(r1, r2, r3);
        }

        public static String b(Context r02) {
            return r02.getOpPackageName();
        }

        public static AppOpsManager c(Context r1) {
            return (AppOpsManager) r1.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context r2, int r3, String r4, String r5) {
        if (Build.VERSION.SDK_INT < 29) goto L10;
        AppOpsManager r02 = b.c(r2);
        int r52 = b.a(r02, r4, Binder.getCallingUid(), r5);
        if (r52 == 0) goto L8;
        return r52;
    L8:
        return b.a(r02, r4, r3, b.b(r2));
    L10:
        return b(r2, r4, r5);
    }

    public static int b(Context r1, String r2, String r3) {
        return a.b((AppOpsManager) a.a(r1, AppOpsManager.class), r2, r3);
    }

    public static String c(String r02) {
        return a.c(r02);
    }
}
