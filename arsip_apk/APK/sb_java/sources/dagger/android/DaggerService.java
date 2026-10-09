package dagger.android;

import android.app.Service;

/* loaded from: classes2.dex */
public abstract class DaggerService extends Service {
    public DaggerService() {
    }

    @Override // android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }
}
