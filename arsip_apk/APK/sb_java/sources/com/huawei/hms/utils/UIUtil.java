package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class UIUtil {
    public UIUtil() {
    }

    private static int a(Context r2) {
        if (r2 != null) goto L6;
        return 0;
    L6:
        return r2.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    public static Activity getActiveActivity(Activity r2, Context r3) {
        if (isBackground(r3) == false) goto L6;
        HMSLog.i("UIUtil", "isBackground" + isBackground(r3));
        return null;
    L6:
        if (r2 != null) goto L10;
        HMSLog.i("UIUtil", "activity is null");
        return ActivityMgr.INST.getCurrentActivity();
    L10:
        if (r2.isFinishing() == false) goto L13;
        HMSLog.i("UIUtil", "activity isFinishing is " + r2.isFinishing());
        return ActivityMgr.INST.getCurrentActivity();
    L13:
        return r2;
    }

    public static int getDialogThemeId(Activity r2) {
        if (a(r2) == 0) goto L7;
        return 0;
    L7:
        if (r2 != null) goto L10;
        return 3;
    L10:
        if ((r2.getResources().getConfiguration().uiMode & 48) != 32) goto L13;
        return 2;
    L13:
        return 3;
    }

    public static String getProcessName(Context r3, int r4) {
        if (r3 != null) goto L5;
        return "";
    L5:
        ActivityManager r32 = (ActivityManager) r3.getSystemService("activity");
        if (r32 == null) goto L16;
        List<ActivityManager.RunningAppProcessInfo> r33 = r32.getRunningAppProcesses();
        if (r33 == null) goto L16;
        Iterator<ActivityManager.RunningAppProcessInfo> r34 = r33.iterator();
    L11:
        if (r34.hasNext() == false) goto L16;
        ActivityManager.RunningAppProcessInfo r1 = r34.next();
        if (r1.pid != r4) goto L11;
        return r1.processName;
    L16:
        return "";
    }

    public static boolean isActivityFullscreen(Activity r1) {
        if ((r1.getWindow().getAttributes().flags & 1024) != 1024) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean isBackground(Context r6) {
        if (r6 != null) goto L5;
        return true;
    L5:
        ActivityManager r1 = (ActivityManager) r6.getSystemService("activity");
        KeyguardManager r2 = (KeyguardManager) r6.getSystemService("keyguard");
        if (r1 == null) goto L26;
        if (r2 == null) goto L26;
        List<ActivityManager.RunningAppProcessInfo> r12 = r1.getRunningAppProcesses();
        if (r12 != null) goto L12;
        return true;
    L12:
        String r62 = getProcessName(r6, Process.myPid());
        Iterator<ActivityManager.RunningAppProcessInfo> r13 = r12.iterator();
    L14:
        if (r13.hasNext() == false) goto L26;
        ActivityManager.RunningAppProcessInfo r3 = r13.next();
        if (TextUtils.equals(r3.processName, r62) == false) goto L14;
        HMSLog.i("UIUtil", "appProcess.importance is " + r3.importance);
        if (r3.importance != 100) goto L20;
        boolean r63 = true;
    L21:
        boolean r22 = r2.isKeyguardLocked();
        HMSLog.i("UIUtil", "isForground is " + r63 + "***  isLockedState is " + r22);
        if (r63 == false) goto L26;
        if (r22 == true) goto L26;
        return false;
    L20:
        r63 = false;
    L26:
        return true;
    }
}
