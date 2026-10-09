package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.b;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public b.a f22736a;

    public class a extends b.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UnusedAppRestrictionsBackportService f22737a;

        public a(UnusedAppRestrictionsBackportService r1) {
            this.f22737a = r1;
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void G(androidx.core.app.unusedapprestrictions.a r2) {
            if (r2 != null) goto L4;
            return;
        L4:
            g r02 = new g(r2);
            this.f22737a.a(r02);
        }
    }

    public UnusedAppRestrictionsBackportService() {
        this.f22736a = new a(this);
    }

    public abstract void a(g r1);

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        return this.f22736a;
    }
}
