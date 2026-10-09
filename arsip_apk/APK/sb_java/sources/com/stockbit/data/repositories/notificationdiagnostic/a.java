package com.stockbit.data.repositories.notificationdiagnostic;

import android.os.Build;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f79846a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f79847b = false;

    static {
        f79846a = new a();
        if (Build.VERSION.SDK_INT < 33) goto L5;
        boolean r02 = true;
    L6:
        f79847b = r02;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public a() {
    }

    public final boolean a() {
        return f79847b;
    }
}
