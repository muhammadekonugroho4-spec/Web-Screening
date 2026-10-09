package com.android.billingclient.api;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

/* renamed from: com.android.billingclient.api.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC4343d {
    public static /* bridge */ /* synthetic */ boolean a(Context r02, Intent r1, int r2, Executor r3, ServiceConnection r4) {
        return r02.bindService(r1, r2, r3, r4);
    }
}
