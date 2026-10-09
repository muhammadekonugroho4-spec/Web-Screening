package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* loaded from: classes6.dex */
public class x0 {

    /* renamed from: c, reason: collision with root package name */
    private static x0 f39435c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f39436a;

    /* renamed from: b, reason: collision with root package name */
    private Context f39437b;

    static {
        f39435c = new x0();
    }

    private x0() {
        this.f39436a = false;
        this.f39437b = b.i();
    }

    public static x0 b() {
        return f39435c;
    }

    @TargetApi(24)
    public boolean a() {
        if (this.f39436a == true) goto L12;
        Context r02 = this.f39437b;
        if (r02 != null) goto L7;
        return false;
    L7:
        UserManager r03 = (UserManager) r02.getSystemService("user");
        if (r03 == null) goto L10;
        this.f39436a = r03.isUserUnlocked();
        goto L12
    L10:
        this.f39436a = false;
    L12:
        return this.f39436a;
    }
}
