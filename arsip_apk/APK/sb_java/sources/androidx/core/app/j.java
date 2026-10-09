package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {
    public static Intent a(Activity r3) {
        Intent r02 = r3.getParentActivityIntent();
        if (r02 == null) goto L5;
        return r02;
    L5:
        String r03 = c(r3);
        if (r03 != null) goto L8;
        return null;
    L8:
        ComponentName r2 = new ComponentName(r3, r03);
    L15:
        Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + r03 + "' in manifest");
        return null;
    L10:
        if (d(r3, r2) != null) goto L14;
        return Intent.makeMainActivity(r2);
    L14:
        return new Intent().setComponent(r2);
    }

    public static Intent b(Context r2, ComponentName r3) {
        String r02 = d(r2, r3);
        if (r02 != null) goto L6;
        return null;
    L6:
        ComponentName r1 = new ComponentName(r3.getPackageName(), r02);
        if (d(r2, r1) != null) goto L11;
        return Intent.makeMainActivity(r1);
    L11:
        return new Intent().setComponent(r1);
    }

    public static String c(Activity r1) {
        return d(r1, r1.getComponentName());
    L4:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static String d(Context r3, ComponentName r4) {
        PackageManager r02 = r3.getPackageManager();
        if (Build.VERSION.SDK_INT < 29) goto L5;
        int r1 = 269222528;
    L6:
        ActivityInfo r42 = r02.getActivityInfo(r4, r1);
        String r03 = r42.parentActivityName;
        if (r03 == null) goto L9;
        return r03;
    L9:
        Bundle r43 = r42.metaData;
        if (r43 != null) goto L12;
        return null;
    L12:
        String r44 = r43.getString("android.support.PARENT_ACTIVITY");
        if (r44 != null) goto L16;
        return null;
    L16:
        if (r44.charAt(0) == '.') goto L18;
        return r44;
    L18:
        return r3.getPackageName() + r44;
    L5:
        r1 = 787072;
        goto L6
    }

    public static void e(Activity r02, Intent r1) {
        r02.navigateUpTo(r1);
    }

    public static boolean f(Activity r02, Intent r1) {
        return r02.shouldUpRecreateTask(r1);
    }
}
