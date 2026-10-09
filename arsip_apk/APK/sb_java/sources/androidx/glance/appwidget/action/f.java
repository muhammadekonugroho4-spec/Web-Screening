package androidx.glance.appwidget.action;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class f implements androidx.glance.action.h {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f24902a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.glance.action.d f24903b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f24904c;

    static {
    }

    public f(Intent r1, androidx.glance.action.d r2, Bundle r3) {
        this.f24902a = r1;
        this.f24903b = r2;
        this.f24904c = r3;
    }

    @Override // androidx.glance.action.h
    public Bundle a() {
        return this.f24904c;
    }

    public final Intent b() {
        return this.f24902a;
    }

    @Override // androidx.glance.action.h
    public androidx.glance.action.d getParameters() {
        return this.f24903b;
    }
}
