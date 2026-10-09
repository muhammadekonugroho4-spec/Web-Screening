package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = null;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f39475a;

    static {
        INST = new ActivityMgr();
    }

    private ActivityMgr() {
    }

    private static String a(Object r2) {
        if (r2 != null) goto L6;
        return "null";
    L6:
        return r2.getClass().getName() + '@' + Integer.toHexString(r2.hashCode());
    }

    public Activity getCurrentActivity() {
        if (this.f39475a != null) goto L6;
        HMSLog.i("ActivityMgr", "mCurrentActivity is " + this.f39475a);
        return null;
    L6:
        HMSLog.i("ActivityMgr", "mCurrentActivity.get() is " + this.f39475a.get());
        return this.f39475a.get();
    }

    public void init(Application r3) {
        HMSLog.d("ActivityMgr", "init");
        if (r3 != null) goto L6;
        HMSLog.w("ActivityMgr", "init failed for app is null");
        return;
    L6:
        ActivityMgr r02 = INST;
        r3.unregisterActivityLifecycleCallbacks(r02);
        r3.registerActivityLifecycleCallbacks(r02);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r2, Bundle r3) {
        HMSLog.d("ActivityMgr", "onCreated:" + a(r2));
        this.f39475a = new WeakReference(r2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity r3) {
        HMSLog.d("ActivityMgr", "onResumed:" + a(r3));
        this.f39475a = new WeakReference(r3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity r3) {
        HMSLog.d("ActivityMgr", "onStarted:" + a(r3));
        this.f39475a = new WeakReference(r3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r1) {
    }
}
