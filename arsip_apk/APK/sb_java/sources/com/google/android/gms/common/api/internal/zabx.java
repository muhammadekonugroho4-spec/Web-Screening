package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class zabx extends BroadcastReceiver {
    Context zaa;
    private final zabw zab;

    public zabx(zabw r1) {
        this.zab = r1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r1, Intent r2) {
        Uri r12 = r2.getData();
        if (r12 == null) goto L5;
        String r13 = r12.getSchemeSpecificPart();
    L7:
        if ("com.google.android.gms".equals(r13) == false) goto L10;
        this.zab.zaa();
        zab();
        return;
    L10:
        return;
    L5:
        r13 = null;
        goto L7
    }

    public final void zaa(Context r1) {
        this.zaa = r1;
    }

    public final synchronized void zab() {
        monitor-enter(this);
        Context r02 = this.zaa;     // Catch: Throwable -> L6
        if (r02 == null) goto L8;
        r02.unregisterReceiver(this);     // Catch: Throwable -> L6
    L8:
        this.zaa = null;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
