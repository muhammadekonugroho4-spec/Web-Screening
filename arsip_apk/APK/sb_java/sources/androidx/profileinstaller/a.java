package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    public static class C0236a {
        public static File a(Context r02) {
            return r02.getCodeCacheDir();
        }
    }

    public static class b {
        public static Context a(Context r02) {
            return r02.createDeviceProtectedStorageContext();
        }
    }

    public static boolean a(File r6) {
        if (r6.isDirectory() == false) goto L16;
        File[] r62 = r6.listFiles();
        if (r62 != null) goto L7;
        return false;
    L7:
        int r2 = r62.length;
        int r3 = 0;
        boolean r4 = true;
    L8:
        if (r3 >= r2) goto L15;
        if (a(r62[r3]) == false) goto L13;
        if (r4 == false) goto L13;
        r4 = true;
    L14:
        r3 = r3 + 1;
    L13:
        r4 = false;
        goto L14
    L15:
        return r4;
    L16:
        r6.delete();
        return true;
    }

    public static void b(Context r2, ProfileInstallReceiver.a r3) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        File r22 = b.a(r2).getCacheDir();
    L7:
        if (a(r22) == false) goto L10;
        r3.a(14, null);
        return;
    L10:
        r3.a(15, null);
        return;
    L5:
        r22 = C0236a.a(b.a(r2));
        goto L7
    }
}
