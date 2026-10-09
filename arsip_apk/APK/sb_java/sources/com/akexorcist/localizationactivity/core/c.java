package com.akexorcist.localizationactivity.core;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {
    public c() {
    }

    public final Context a(Context r2) {
        p.l(r2, "context");
        return e.f31665a.c(r2);
    }

    public final Context b(Context r2) {
        p.l(r2, "applicationContext");
        return e.f31665a.c(r2);
    }

    public final Resources c(Context r2, Resources r3) {
        p.l(r2, "appContext");
        p.l(r3, "resources");
        return e.f31665a.d(r2, r3);
    }

    public final Context d(Context r2) {
        p.l(r2, "context");
        return e.f31665a.c(r2);
    }

    public final void e(Context r2, String r3, String r4) {
        p.l(r2, "context");
        p.l(r3, "language");
        p.l(r4, "country");
        f(r2, new Locale(r3, r4));
    }

    public final void f(Context r2, Locale r3) {
        p.l(r2, "context");
        p.l(r3, "locale");
        a.f(r2, r3);
    }
}
