package dagger.hilt.android.internal.managers;

import androidx.lifecycle.M;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.viewmodel.a f173970a;

    /* renamed from: b, reason: collision with root package name */
    public M f173971b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f173972c;

    public h(androidx.lifecycle.viewmodel.a r2) {
        if (r2 == null) goto L5;
        boolean r02 = true;
    L6:
        this.f173972c = r02;
        this.f173970a = r2;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public void a() {
        this.f173970a = null;
    }

    public boolean b() {
        if (this.f173971b == null) goto L5;
        return false;
    L5:
        if (this.f173970a != null) goto L10;
        return true;
    L10:
        return false;
    }

    public void c(androidx.lifecycle.viewmodel.a r4) {
        dagger.hilt.internal.d.d(this.f173972c, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
        if (this.f173971b == null) goto L5;
        return;
    L5:
        this.f173970a = r4;
    }
}
