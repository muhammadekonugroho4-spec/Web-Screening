package com.stockbit.lib.appconfig.interactor.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.g;

/* loaded from: classes10.dex */
public abstract class c implements dagger.internal.c {
    public static SharedPreferences a(Context r1) {
        return (SharedPreferences) g.e(a.f120125a.b(r1));
    }
}
