package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ApkResolutionFailedManager {

    /* renamed from: c, reason: collision with root package name */
    private static final ApkResolutionFailedManager f38936c = null;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f38937a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Runnable> f38938b;

    static {
        f38936c = new ApkResolutionFailedManager();
    }

    private ApkResolutionFailedManager() {
        this.f38937a = new Handler(Looper.getMainLooper());
        this.f38938b = new HashMap(2);
    }

    public static ApkResolutionFailedManager getInstance() {
        return f38936c;
    }

    public void postTask(String r3, Runnable r4) {
        if (Looper.myLooper() == Looper.getMainLooper()) goto L6;
        HMSLog.e("ApkResolutionFailedManager", "postTask is not in main thread");
        return;
    L6:
        this.f38938b.put(r3, r4);
        this.f38937a.postDelayed(r4, Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    public void removeTask(String r4) {
        if (Looper.myLooper() == Looper.getMainLooper()) goto L6;
        HMSLog.e("ApkResolutionFailedManager", "removeTask is not in main thread");
        return;
    L6:
        Runnable r42 = this.f38938b.remove(r4);
        if (r42 != null) goto L10;
        HMSLog.e("ApkResolutionFailedManager", "cancel runnable is null");
        return;
    L10:
        this.f38937a.removeCallbacks(r42);
    }

    public void removeValueOnly(String r3) {
        if (Looper.myLooper() == Looper.getMainLooper()) goto L6;
        HMSLog.e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        return;
    L6:
        this.f38938b.remove(r3);
    }
}
