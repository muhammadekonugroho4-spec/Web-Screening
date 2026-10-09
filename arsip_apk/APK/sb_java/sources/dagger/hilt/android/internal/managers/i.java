package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;

/* loaded from: classes2.dex */
public final class i implements dagger.hilt.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final Service f173973a;

    /* renamed from: b, reason: collision with root package name */
    public Object f173974b;

    public interface a {
        dagger.hilt.android.internal.builders.d c();
    }

    public i(Service r1) {
        this.f173973a = r1;
    }

    private Object a() {
        Application r02 = this.f173973a.getApplication();
        dagger.hilt.internal.d.d(r02 instanceof dagger.hilt.internal.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{r02.getClass()});
        return ((a) dagger.hilt.a.a(r02, a.class)).c().a(this.f173973a).build();
    }

    @Override // dagger.hilt.internal.b
    public Object L2() {
        if (this.f173974b != null) goto L6;
        this.f173974b = a();
    L6:
        return this.f173974b;
    }
}
