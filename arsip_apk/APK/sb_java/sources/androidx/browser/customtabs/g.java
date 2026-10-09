package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3895a;

    /* renamed from: b, reason: collision with root package name */
    public final android.support.customtabs.b f3896b;

    /* renamed from: c, reason: collision with root package name */
    public final android.support.customtabs.a f3897c;
    public final ComponentName d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f3898e;

    public g(android.support.customtabs.b r2, android.support.customtabs.a r3, ComponentName r4, PendingIntent r5) {
        this.f3895a = new Object();
        this.f3896b = r2;
        this.f3897c = r3;
        this.d = r4;
        this.f3898e = r5;
    }

    public final void a(Bundle r3) {
        PendingIntent r02 = this.f3898e;
        if (r02 == null) goto L6;
        r3.putParcelable("android.support.customtabs.extra.SESSION_ID", r02);
        return;
    }

    public final Bundle b(Bundle r2) {
        Bundle r02 = new Bundle();
        if (r2 == null) goto L5;
        r02.putAll(r2);
    L5:
        a(r02);
        return r02;
    }

    public IBinder c() {
        return this.f3897c.asBinder();
    }

    public ComponentName d() {
        return this.d;
    }

    public PendingIntent e() {
        return this.f3898e;
    }

    public boolean f(Uri r3, Bundle r4, List r5) {
        Bundle r42 = b(r4);
        return this.f3896b.l(this.f3897c, r3, r42, r5);
    L5:
        return false;
    }
}
