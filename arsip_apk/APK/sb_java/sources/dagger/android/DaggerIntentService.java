package dagger.android;

import android.app.IntentService;

/* loaded from: classes2.dex */
public abstract class DaggerIntentService extends IntentService {
    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }
}
