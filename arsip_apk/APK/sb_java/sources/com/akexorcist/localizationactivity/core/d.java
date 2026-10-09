package com.akexorcist.localizationactivity.core;

import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Service f31664a;

    public d(Service r2) {
        p.l(r2, "service");
        this.f31664a = r2;
    }

    public final Context a(Context r2) {
        p.l(r2, "applicationContext");
        return e.f31665a.c(r2);
    }

    public final Context b(Context r2) {
        p.l(r2, "baseContext");
        return e.f31665a.c(r2);
    }

    public final Resources c(Resources r3) {
        p.l(r3, "resources");
        return e.f31665a.d(this.f31664a, r3);
    }
}
