package com.stockbit.common.utils;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes7.dex */
public class KeepAliveService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final Binder f61903a = null;

    static {
        f61903a = new Binder();
    }

    public KeepAliveService() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        return f61903a;
    }
}
