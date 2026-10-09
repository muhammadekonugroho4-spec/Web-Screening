package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* loaded from: classes6.dex */
public class BinderAdapter implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38920a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38921b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38922c;
    private BinderCallBack d;

    /* renamed from: e, reason: collision with root package name */
    private IBinder f38923e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f38924f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38925g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f38926h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f38927i;

    public interface BinderCallBack {
        void onBinderFailed(int r1);

        void onBinderFailed(int r1, Intent r2);

        void onNullBinding(ComponentName r1);

        void onServiceConnected(ComponentName r1, IBinder r2);

        void onServiceDisconnected(ComponentName r1);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context r2, String r3, String r4) {
        this.f38924f = new Object();
        this.f38925g = false;
        this.f38926h = null;
        this.f38927i = null;
        this.f38920a = r2;
        this.f38921b = r3;
        this.f38922c = r4;
    }

    public static /* synthetic */ void a(BinderAdapter r02) {
        r02.b();
    }

    public static /* synthetic */ BinderCallBack b(BinderAdapter r02) {
        return r02.f();
    }

    private void c() {
        Object r02 = this.f38924f;
        monitor-enter(r02);
        Handler r1 = this.f38926h;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.removeMessages(getConnTimeOut());     // Catch: Throwable -> L7
        this.f38926h = null;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private void d() {
        Handler r02 = new Handler(Looper.getMainLooper(), new AnonymousClass2(this));
        this.f38927i = r02;
        r02.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000);
    }

    private void e() {
        HMSLog.e("BinderAdapter", "In connect, bind core service fail");
        ComponentName r2 = new ComponentName(this.f38920a.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");     // Catch: RuntimeException -> L9
        Intent r02 = new Intent();     // Catch: RuntimeException -> L9
        r02.setComponent(r2);     // Catch: RuntimeException -> L9
        r02.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());     // Catch: RuntimeException -> L9
        BinderCallBack r22 = f();     // Catch: RuntimeException -> L9
        if (r22 == null) goto L14;
        r22.onBinderFailed(-1, r02);     // Catch: RuntimeException -> L9
        return;
    L14:
        return;
    L9:
        e = move-exception;
        HMSLog.e("BinderAdapter", "getBindFailPendingIntent failed " + e.getMessage());
    }

    private BinderCallBack f() {
        return this.d;
    }

    private void g() {
        Handler r02 = this.f38926h;
        if (r02 == null) goto L5;
        r02.removeMessages(getConnTimeOut());
    L6:
        this.f38926h.sendEmptyMessageDelayed(getConnTimeOut(), 10000);
        return;
    L5:
        this.f38926h = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        goto L6
    }

    private void h() {
        HMSLog.d("BinderAdapter", "removeDelayDisconnectTask.");
        monitor-enter(BinderAdapter.class);
        Handler r1 = this.f38927i;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.removeMessages(getMsgDelayDisconnect());     // Catch: Throwable -> L7
    L9:
        monitor-exit(BinderAdapter.class);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void binder(BinderCallBack r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        this.d = r1;
        a();
    }

    public int getConnTimeOut() {
        return 0;
    }

    public int getMsgDelayDisconnect() {
        return 0;
    }

    public String getServiceAction() {
        return this.f38921b;
    }

    public IBinder getServiceBinder() {
        return this.f38923e;
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName r3) {
        HMSLog.e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.f38925g == false) goto L6;
        this.f38925g = false;
        return;
    L6:
        unBind();
        c();
        BinderCallBack r02 = f();
        if (r02 == null) goto L10;
        r02.onNullBinding(r3);
        return;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName r3, IBinder r4) {
        HMSLog.i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.f38923e = r4;
        c();
        BinderCallBack r02 = f();
        if (r02 == null) goto L5;
        r02.onServiceConnected(r3, r4);
    L5:
        d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName r3) {
        HMSLog.i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack r02 = f();
        if (r02 == null) goto L5;
        r02.onServiceDisconnected(r3);
    L5:
        h();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f38920a, this);
    }

    public void updateDelayTask() {
        HMSLog.d("BinderAdapter", "updateDelayTask.");
        monitor-enter(BinderAdapter.class);
        Handler r1 = this.f38927i;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.removeMessages(getMsgDelayDisconnect());     // Catch: Throwable -> L7
        this.f38927i.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000);     // Catch: Throwable -> L7
    L9:
        monitor-exit(BinderAdapter.class);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private void a() {
        if (TextUtils.isEmpty(this.f38921b) == false) goto L5;
    L6:
        e();
    L7:
        Intent r02 = new Intent(this.f38921b);
        r02.setPackage(this.f38922c);     // Catch: IllegalArgumentException -> L10
    L11:
        Object r1 = this.f38924f;
        monitor-enter(r1);
    L18:
        th = move-exception;
        throw th;
    L14:
        if (this.f38920a.bindService(r02, this, 1) == false) goto L20;
        g();     // Catch: Throwable -> L18
        monitor-exit(r1);     // Catch: Throwable -> L18
        return;
    L20:
        this.f38925g = true;     // Catch: Throwable -> L18
        monitor-exit(r1);     // Catch: Throwable -> L18
        e();
        return;
    L10:
        HMSLog.e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
        e();
        goto L11
    L5:
        if (TextUtils.isEmpty(this.f38922c) == false) goto L7;
        goto L6
    }

    private void b() {
        BinderCallBack r02 = f();
        if (r02 == null) goto L6;
        r02.onBinderFailed(-1);
        return;
    }
}
