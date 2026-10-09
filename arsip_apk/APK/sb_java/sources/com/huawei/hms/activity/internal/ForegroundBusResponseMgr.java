package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ForegroundBusResponseMgr {

    /* renamed from: b, reason: collision with root package name */
    private static final ForegroundBusResponseMgr f38890b = null;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, BusResponseCallback> f38891a;

    static {
        f38890b = new ForegroundBusResponseMgr();
    }

    public ForegroundBusResponseMgr() {
        this.f38891a = new HashMap();
    }

    public static ForegroundBusResponseMgr getInstance() {
        return f38890b;
    }

    public BusResponseCallback get(String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L6;
        return null;
    L6:
        Map<String, BusResponseCallback> r02 = this.f38891a;
        monitor-enter(r02);
        BusResponseCallback r32 = this.f38891a.get(r3);     // Catch: Throwable -> L11
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r32;
    L11:
        th = move-exception;
        throw th;
    }

    public void registerObserver(String r3, BusResponseCallback r4) {
        if (TextUtils.isEmpty(r3) == true) goto L17;
        if (r4 == null) goto L20;
        Map<String, BusResponseCallback> r02 = this.f38891a;
        monitor-enter(r02);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (this.f38891a.containsKey(r3) == true) goto L13;
        this.f38891a.put(r3, r4);     // Catch: Throwable -> L11
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L11
        return;
    L20:
        return;
    }

    public void unRegisterObserver(String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return;
    L5:
        Map<String, BusResponseCallback> r02 = this.f38891a;
        monitor-enter(r02);
        this.f38891a.remove(r3);     // Catch: Throwable -> L10
        monitor-exit(r02);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
