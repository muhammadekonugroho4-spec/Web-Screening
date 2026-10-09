package com.clevertap.android.sdk.inapp.store.preference;

import java.util.Map;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.clevertap.android.sdk.store.preference.b f34380a;

    public c(com.clevertap.android.sdk.store.preference.b r2) {
        p.l(r2, "ctPreference");
        this.f34380a = r2;
    }

    public final void a(String r2) {
        p.l(r2, "url");
        this.f34380a.remove(r2);
    }

    public final long b(String r4) {
        p.l(r4, "url");
        return this.f34380a.e(r4, 0);
    }

    public final Set c() {
        Map r02 = this.f34380a.f();
        if (r02 == null) goto L9;
        Set r03 = r02.keySet();
        if (r03 == null) goto L9;
        return r03;
    L9:
        return a0.e();
    }

    public final void d(String r2, long r3) {
        p.l(r2, "url");
        this.f34380a.c(r2, r3);
    }
}
