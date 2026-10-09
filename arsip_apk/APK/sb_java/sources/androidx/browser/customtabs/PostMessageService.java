package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.c;

/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public c.a f3849a;

    public class a extends c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PostMessageService f3850a;

        public a(PostMessageService r1) {
            this.f3850a = r1;
        }

        @Override // android.support.customtabs.c
        public void I(android.support.customtabs.a r1, String r2, Bundle r3) {
            r1.Q(r2, r3);
        }

        @Override // android.support.customtabs.c
        public void g(android.support.customtabs.a r1, Bundle r2) {
            r1.R(r2);
        }
    }

    public PostMessageService() {
        this.f3849a = new a(this);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        return this.f3849a;
    }
}
