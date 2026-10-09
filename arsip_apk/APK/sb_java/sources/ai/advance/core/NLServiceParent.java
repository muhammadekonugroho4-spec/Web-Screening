package ai.advance.core;

import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class NLServiceParent extends IntentService {

    /* renamed from: a, reason: collision with root package name */
    public b f1766a;

    public abstract b a();

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        b r02 = this.f1766a;     // Catch: Exception -> L7
        if (r02 == null) goto L5;
        r02.a();     // Catch: Exception -> L7
    L5:
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent r2) {
        this.f1766a = a();     // Catch: Exception -> L8
        if (r2 == null) goto L5;
        String r22 = r2.getStringExtra("eventInfo");     // Catch: Exception -> L8
    L6:
        this.f1766a.j(r22);     // Catch: Exception -> L8
        return;
    L5:
        r22 = null;
    }
}
