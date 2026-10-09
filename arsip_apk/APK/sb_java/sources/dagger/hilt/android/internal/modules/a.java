package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f173979a;

    public a(Context r1) {
        this.f173979a = r1;
    }

    public Application a() {
        return dagger.hilt.android.internal.a.a(this.f173979a);
    }

    public Context b() {
        return this.f173979a;
    }
}
