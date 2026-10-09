package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4015j implements Application.ActivityLifecycleCallbacks {
    public AbstractC4015j() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r1, Bundle r2) {
        kotlin.jvm.internal.p.l(r1, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity r2, Bundle r3) {
        kotlin.jvm.internal.p.l(r2, "activity");
        kotlin.jvm.internal.p.l(r3, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
    }
}
