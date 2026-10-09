package com.clevertap.android.sdk.task;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public Handler f34911a;

    public i() {
        this.f34911a = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.f34911a.post(r2);
    }
}
