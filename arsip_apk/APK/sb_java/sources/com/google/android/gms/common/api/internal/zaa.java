package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
final class zaa extends LifecycleCallback {
    private List zaa;

    private zaa(LifecycleFragment r2) {
        super(r2);
        this.zaa = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ zaa zaa(Activity r3) {
        monitor-enter(r3);
        LifecycleFragment r02 = LifecycleCallback.getFragment(r3);     // Catch: Throwable -> L6
        zaa r1 = (zaa) r02.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);     // Catch: Throwable -> L6
        if (r1 != null) goto L8;
        r1 = new zaa(r02);     // Catch: Throwable -> L6
    L8:
        monitor-exit(r3);     // Catch: Throwable -> L6
        return r1;
    L6:
        th = move-exception;
        throw th;
    }

    public static /* bridge */ /* synthetic */ void zab(zaa r02, Runnable r1) {
        r02.zac(r1);
    }

    private final synchronized void zac(Runnable r2) {
        monitor-enter(this);
        this.zaa.add(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        monitor-enter(this);
        List r02 = this.zaa;     // Catch: Throwable -> L10
        this.zaa = new ArrayList();     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        Iterator r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L9;
        ((Runnable) r03.next()).run();
        goto L7
    L9:
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
