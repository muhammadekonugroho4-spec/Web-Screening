package com.akexorcist.localizationactivity.core;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import kotlin.m;
import kotlin.text.y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f31665a = null;

    static {
        f31665a = new e();
    }

    public e() {
    }

    public final Locale a(Configuration r2) {
        Locale r22 = r2.getLocales().get(0);
        if (r22 != null) goto L6;
        r22 = Locale.getDefault();
    L6:
        p.k(r22, "configuration.locales.ge…0) ?: Locale.getDefault()");
        return r22;
    }

    public final Pair b(Context r3, Configuration r4) {
        p.l(r3, "baseContext");
        p.l(r4, "baseConfiguration");
        Locale r02 = a.a(r3);
        Locale r32 = a.f31657a.c(r3, r02);
        if (e(a(r4), r32) == false) goto L5;
        LocaleList r03 = new LocaleList(new Locale[]{r32});
        LocaleList.setDefault(r03);
        Configuration r1 = new Configuration(r4);
        r1.setLocale(r32);
        r1.setLocales(r03);
        return m.a(r1, Boolean.TRUE);
    L5:
        return m.a(r4, Boolean.FALSE);
    }

    public final Context c(Context r5) {
        p.l(r5, "baseContext");
        Resources r02 = r5.getResources();
        p.k(r02, "baseContext.resources");
        Configuration r03 = r02.getConfiguration();
        p.k(r03, "baseContext.resources.configuration");
        Pair r04 = b(r5, r03);
        Configuration r2 = (Configuration) r04.a();
        boolean r05 = ((Boolean) r04.b()).booleanValue();
        if (r05 == false) goto L6;
        Context r52 = r5.createConfigurationContext(r2);
        p.k(r52, "baseContext.createConfig…ionContext(configuration)");
        return r52;
    L6:
        if (r05 == false) goto L8;
        Resources r06 = r5.getResources();
        Resources r3 = r5.getResources();
        p.k(r3, "baseContext.resources");
        r06.updateConfiguration(r2, r3.getDisplayMetrics());
    L8:
        return r5;
    }

    public final Resources d(Context r3, Resources r4) {
        p.l(r3, "baseContext");
        p.l(r4, "baseResources");
        Configuration r02 = r4.getConfiguration();
        p.k(r02, "baseResources.configuration");
        Pair r03 = b(r3, r02);
        Configuration r1 = (Configuration) r03.a();
        boolean r04 = ((Boolean) r03.b()).booleanValue();
        if (r04 == false) goto L6;
        Context r32 = r3.createConfigurationContext(r1);
        p.k(r32, "baseContext.createConfig…ionContext(configuration)");
        Resources r33 = r32.getResources();
        p.k(r33, "baseContext.createConfig…(configuration).resources");
        return r33;
    L6:
        if (r04 == false) goto L9;
        Resources r42 = r3.getResources();
        p.k(r42, "baseContext.resources");
        DisplayMetrics r43 = r42.getDisplayMetrics();
        p.k(r43, "baseContext.resources.displayMetrics");
        return new Resources(r3.getAssets(), r43, r1);
    L9:
        return r4;
    }

    public final boolean e(Locale r2, Locale r3) {
        return !y.J(r2.toString(), r3.toString(), true);
    }
}
