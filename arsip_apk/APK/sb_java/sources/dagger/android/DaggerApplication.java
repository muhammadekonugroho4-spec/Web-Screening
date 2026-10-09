package dagger.android;

import android.app.Application;
import io.sentry.android.core.performance.AppStartMetrics;

/* loaded from: classes2.dex */
public abstract class DaggerApplication extends Application implements c {
    public DaggerApplication() {
    }

    public abstract b a();

    public final void b() {
        monitor-enter(this);
        a();     // Catch: Throwable -> L5
        throw null;     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        throw th;
    }

    @Override // android.app.Application
    public void onCreate() {
        AppStartMetrics.s(this);
        super.onCreate();
        b();
        AppStartMetrics.t(this);
    }

    @Override // dagger.android.c
    public b s() {
        b();
        return null;
    }
}
