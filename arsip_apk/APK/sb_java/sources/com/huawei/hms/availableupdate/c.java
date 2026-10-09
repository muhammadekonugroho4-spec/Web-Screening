package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f39012b = null;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f39013a;

    static {
        f39012b = new c();
    }

    public c() {
    }

    public boolean a(Activity r3) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity r02 = a();
        if (r02 != null) goto L5;
    L8:
        this.f39013a = new WeakReference(r3);
        return true;
    L5:
        if (r02.isFinishing() == true) goto L8;
        r3.finish();
        HMSLog.i("UpdateAdapterMgr", "finish one");
        return false;
    }

    public void b(Activity r3) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity r02 = a();
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.equals(r02) == false) goto L9;
        HMSLog.i("UpdateAdapterMgr", "reset");
        this.f39013a = null;
        return;
    }

    private Activity a() {
        WeakReference<Activity> r02 = this.f39013a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.get();
    }
}
