package com.stockbit.lib.appconfig.interactor.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.installations.FirebaseInstallations;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f120125a = null;

    static {
        f120125a = new a();
    }

    public a() {
    }

    public final com.stockbit.lib.appconfig.domain.a a(com.stockbit.lib.appconfig.interactor.data.b r2) {
        p.l(r2, "appConfigSp");
        return new com.stockbit.lib.appconfig.interactor.data.a(r2);
    }

    public final SharedPreferences b(Context r5) {
        p.l(r5, "appContext");
        SharedPreferences r02 = r5.getSharedPreferences("StockbitAppConfigPrefs", 0);
        com.stockbit.lib.appconfig.interactor.data.c r2 = com.stockbit.lib.appconfig.interactor.data.c.f120124a;
        p.i(r02);
        SharedPreferences r52 = r5.getSharedPreferences("StockbitPrefs", 0);
        p.k(r52, "getSharedPreferences(...)");
        r2.a(r02, r52);
        return r02;
    }

    public final FirebaseInstallations c() {
        FirebaseInstallations r02 = FirebaseInstallations.getInstance();
        p.k(r02, "getInstance(...)");
        return r02;
    }

    public final SharedPreferences d(Context r3) {
        p.l(r3, "appContext");
        SharedPreferences r32 = r3.getSharedPreferences("StockbitPrefs", 0);
        p.k(r32, "getSharedPreferences(...)");
        return r32;
    }
}
