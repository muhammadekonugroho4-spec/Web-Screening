package com.stockbit.android.local.di;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class X {
    public X() {
    }

    public final SharedPreferences a(Context r3) {
        kotlin.jvm.internal.p.l(r3, "appContext");
        SharedPreferences r32 = r3.getSharedPreferences("StockbitPrefsTrad", 0);
        kotlin.jvm.internal.p.k(r32, "getSharedPreferences(...)");
        return r32;
    }
}
