package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.b;

/* loaded from: classes.dex */
public abstract class f implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f3894a;

    public class a extends c {
        public final /* synthetic */ f d;

        public a(f r1, android.support.customtabs.b r2, ComponentName r3, Context r4) {
            this.d = r1;
            super(r2, r3, r4);
        }
    }

    public f() {
    }

    public abstract void a(ComponentName r1, c r2);

    public void b(Context r1) {
        this.f3894a = r1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r3, IBinder r4) {
        if (this.f3894a == null) goto L7;
        a(r3, new a(this, b.a.V(r4), r3, this.f3894a));
        return;
    L7:
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
