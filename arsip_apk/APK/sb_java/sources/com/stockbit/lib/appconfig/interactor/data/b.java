package com.stockbit.lib.appconfig.interactor.data;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f120123a;

    public b(SharedPreferences r2) {
        p.l(r2, "sharedPreferences");
        this.f120123a = r2;
    }

    public final String a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "defValue");
        String r22 = this.f120123a.getString(r2, r3);
        if (r22 != null) goto L5;
        return r3;
    L5:
        return r22;
    }
}
