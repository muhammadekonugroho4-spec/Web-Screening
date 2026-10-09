package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public class zau extends Handler {
    private final Looper zaa;

    public zau() {
        this.zaa = Looper.getMainLooper();
    }

    public zau(Looper r1) {
        super(r1);
        this.zaa = Looper.getMainLooper();
    }

    public zau(Looper r1, Handler.Callback r2) {
        super(r1, r2);
        this.zaa = Looper.getMainLooper();
    }
}
