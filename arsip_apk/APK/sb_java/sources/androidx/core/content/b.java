package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.q;
import androidx.core.content.res.h;
import androidx.core.os.i;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class b {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = null;

    public static class a {
        public static File a(Context r02) {
            return r02.getCodeCacheDir();
        }

        public static Drawable b(Context r02, int r1) {
            return r02.getDrawable(r1);
        }

        public static File c(Context r02) {
            return r02.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.b$b, reason: collision with other inner class name */
    public static class C0160b {
        public static int a(Context r02, int r1) {
            return r02.getColor(r1);
        }

        public static Object b(Context r02, Class r1) {
            return r02.getSystemService(r1);
        }

        public static String c(Context r02, Class r1) {
            return r02.getSystemServiceName(r1);
        }
    }

    public static class c {
        public static Context a(Context r02) {
            return r02.createDeviceProtectedStorageContext();
        }

        public static File b(Context r02) {
            return r02.getDataDir();
        }

        public static boolean c(Context r02) {
            return r02.isDeviceProtectedStorage();
        }
    }

    public static class d {
        public static Intent a(Context r6, BroadcastReceiver r7, IntentFilter r8, String r9, Handler r10, int r11) {
            if ((r11 & 4) == 0) goto L8;
            if (r9 != null) goto L8;
            return r6.registerReceiver(r7, r8, b.obtainAndCheckReceiverPermission(r6), r10);
        L8:
            return r6.registerReceiver(r7, r8, r9, r10, r11 & 1);
        }

        public static ComponentName b(Context r02, Intent r1) {
            return r02.startForegroundService(r1);
        }
    }

    public static class e {
        public static Executor a(Context r02) {
            return r02.getMainExecutor();
        }
    }

    public static class f {
        public static Context a(Context r02, String r1) {
            return r02.createAttributionContext(r1);
        }

        public static String b(Context r02) {
            return r02.getAttributionTag();
        }

        public static Display c(Context r2) {
            return r2.getDisplay();
        L4:
            Log.w(b.TAG, "The context:" + r2 + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) r2.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static class g {
        public static Intent a(Context r02, BroadcastReceiver r1, IntentFilter r2, String r3, Handler r4, int r5) {
            return r02.registerReceiver(r1, r2, r3, r4, r5);
        }
    }

    static {
        sSync = new Object();
    }

    public static int checkSelfPermission(Context r2, String r3) {
        androidx.core.util.c.d(r3, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33) goto L13;
        if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", r3) == false) goto L13;
        if (q.e(r2).a() == false) goto L10;
        return 0;
    L10:
        return -1;
    L13:
        return r2.checkPermission(r3, Process.myPid(), Process.myUid());
    }

    public static Context createAttributionContext(Context r2, String r3) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return r2;
    L5:
        return f.a(r2, r3);
    }

    public static Context createDeviceProtectedStorageContext(Context r02) {
        return c.a(r02);
    }

    public static String getAttributionTag(Context r2) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return null;
    L5:
        return f.b(r2);
    }

    public static File getCodeCacheDir(Context r02) {
        return a.a(r02);
    }

    public static int getColor(Context r02, int r1) {
        return C0160b.a(r02, r1);
    }

    public static ColorStateList getColorStateList(Context r1, int r2) {
        return h.e(r1.getResources(), r2, r1.getTheme());
    }

    public static Context getContextForLanguage(Context r3) {
        i r02 = androidx.core.app.h.a(r3);
        if (Build.VERSION.SDK_INT <= 32) goto L5;
        return r3;
    L5:
        if (r02.e() == true) goto L9;
        Configuration r1 = new Configuration(r3.getResources().getConfiguration());
        androidx.core.os.f.b(r1, r02);
        return r3.createConfigurationContext(r1);
    L9:
        return r3;
    }

    public static File getDataDir(Context r02) {
        return c.b(r02);
    }

    public static Display getDisplayOrDefault(Context r2) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return f.c(r2);
    L7:
        return ((WindowManager) r2.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context r02, int r1) {
        return a.b(r02, r1);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context r02) {
        return r02.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context r02, String r1) {
        return r02.getExternalFilesDirs(r1);
    }

    public static Executor getMainExecutor(Context r2) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return e.a(r2);
    L7:
        return androidx.core.os.g.a(new Handler(r2.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context r02) {
        return a.c(r02);
    }

    @Deprecated
    public static File[] getObbDirs(Context r02) {
        return r02.getObbDirs();
    }

    public static String getString(Context r02, int r1) {
        return getContextForLanguage(r02).getString(r1);
    }

    public static <T> T getSystemService(Context r02, Class<T> r1) {
        return (T) C0160b.b(r02, r1);
    }

    public static String getSystemServiceName(Context r02, Class<?> r1) {
        return C0160b.c(r02, r1);
    }

    public static boolean isDeviceProtectedStorage(Context r02) {
        return c.c(r02);
    }

    public static String obtainAndCheckReceiverPermission(Context r4) {
        String r02 = r4.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (androidx.core.content.f.b(r4, r02) != 0) goto L5;
        return r02;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L10;
        r02 = androidx.core.content.a.a(r4) + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (androidx.core.content.f.b(r4, r02) != 0) goto L10;
        return r02;
    L10:
        throw new RuntimeException("Permission " + r02 + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context r6, BroadcastReceiver r7, IntentFilter r8, int r9) {
        return registerReceiver(r6, r7, r8, null, null, r9);
    }

    public static boolean startActivities(Context r1, Intent[] r2) {
        return startActivities(r1, r2, null);
    }

    @Deprecated
    public static void startActivity(Context r02, Intent r1, Bundle r2) {
        r02.startActivity(r1, r2);
    }

    public static void startForegroundService(Context r02, Intent r1) {
        d.b(r02, r1);
    }

    public static Intent registerReceiver(Context r6, BroadcastReceiver r7, IntentFilter r8, String r9, Handler r10, int r11) {
        int r02 = r11 & 1;
        if (r02 != 0) goto L5;
    L9:
        if (r02 == 0) goto L11;
        r11 = r11 | 2;
    L11:
        int r5 = r11;
        int r112 = r5 & 2;
        if (r112 == 0) goto L14;
    L18:
        if (r112 == 0) goto L25;
        if ((r5 & 4) == 0) goto L25;
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    L25:
        if (Build.VERSION.SDK_INT < 33) goto L29;
        return g.a(r6, r7, r8, r9, r10, r5);
    L29:
        return d.a(r6, r7, r8, r9, r10, r5);
    L14:
        if ((r5 & 4) != 0) goto L18;
        throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
    L5:
        if ((r11 & 4) == 0) goto L9;
        throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context r02, Intent[] r1, Bundle r2) {
        r02.startActivities(r1, r2);
        return true;
    }
}
