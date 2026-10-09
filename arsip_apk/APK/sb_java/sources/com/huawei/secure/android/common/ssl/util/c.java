package com.huawei.secure.android.common.ssl.util;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static Context f39608a;

    public static Context a() {
        return f39608a;
    }

    public static void b(Context r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (f39608a != null) goto L8;
        f39608a = r1.getApplicationContext();
        return;
    }
}
