package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes6.dex */
public class InnerBinderAdapter extends BinderAdapter {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f38930j = null;

    /* renamed from: k, reason: collision with root package name */
    private static BinderAdapter f38931k;

    static {
        f38930j = new Object();
    }

    private InnerBinderAdapter(Context r1, String r2, String r3) {
        super(r1, r2, r3);
    }

    public static BinderAdapter getInstance(Context r2, String r3, String r4) {
        HMSLog.i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        Object r02 = f38930j;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f38931k != null) goto L9;
        f38931k = new InnerBinderAdapter(r2, r3, r4);     // Catch: Throwable -> L7
    L9:
        BinderAdapter r22 = f38931k;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r22;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 2001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 2002;
    }
}
