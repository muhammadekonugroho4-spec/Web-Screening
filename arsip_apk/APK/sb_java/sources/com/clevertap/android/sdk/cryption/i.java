package com.clevertap.android.sdk.cryption;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.D0;
import com.clevertap.android.sdk.Logger;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33761a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33762b;

    /* renamed from: c, reason: collision with root package name */
    public int f33763c;

    public i(Context r2, String r3) {
        p.l(r2, "context");
        p.l(r3, "accountId");
        this.f33761a = r2;
        this.f33762b = r3;
    }

    public boolean a() {
        return D0.a(this.f33761a, D0.w(this.f33762b, "ssInAppMigrated"), false);
    }

    public int b() {
        return D0.c(this.f33761a, D0.w(this.f33762b, "encryptionMigrationFailureCount"), -1);
    }

    public int c() {
        return D0.c(this.f33761a, D0.w(this.f33762b, CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL), -1);
    }

    public void d(int r4) {
        D0.p(this.f33761a, D0.w(this.f33762b, CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL), r4);
    }

    public void e(boolean r4) {
        D0.n(this.f33761a, D0.w(this.f33762b, "ssInAppMigrated"), r4);
    }

    public void f(boolean r3) {
        if (r3 == false) goto L4;
        int r32 = 0;
    L5:
        this.f33763c = r32;
        Logger.v(this.f33762b, "Updating migrationFailureCount to " + this.f33763c);
        D0.p(this.f33761a, D0.w(this.f33762b, "encryptionMigrationFailureCount"), this.f33763c);
        return;
    L4:
        r32 = this.f33763c + 1;
        goto L5
    }
}
