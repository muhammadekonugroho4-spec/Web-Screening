package com.aheaditec.talsec.security;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: classes4.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final KeyguardManager f30566a;

    public b2(KeyguardManager r1) {
        this.f30566a = r1;
    }

    public static b2 a(Context r1) {
        KeyguardManager r12 = (KeyguardManager) r1.getSystemService(KeyguardManager.class);
        if (r12 != null) goto L5;
        return null;
    L5:
        return new b2(r12);
    }

    public boolean b() {
        return this.f30566a.isDeviceSecure();
    }
}
