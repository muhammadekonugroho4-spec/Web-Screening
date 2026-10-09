package com.stockbit.userauth.util;

import android.content.Context;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f165583a;

    static {
    }

    public b(Context r2) {
        p.l(r2, "applicationContext");
        this.f165583a = r2;
    }

    public final String a(int r2) {
        String r22 = this.f165583a.getString(r2);
        p.k(r22, "getString(...)");
        return r22;
    }
}
