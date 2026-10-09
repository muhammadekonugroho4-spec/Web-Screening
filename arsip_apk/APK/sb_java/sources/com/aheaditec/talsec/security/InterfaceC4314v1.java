package com.aheaditec.talsec.security;

import android.content.Context;
import android.os.Build;

/* renamed from: com.aheaditec.talsec.security.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4314v1 {
    static String a(Context r3) {
        String r02 = r3.getPackageName();
    L9:
        return null;
    L4:
        if (Build.VERSION.SDK_INT >= 30) goto L8;
        return r3.getPackageManager().getInstallerPackageName(r02);
    L8:
        return AbstractC4265f.a(AbstractC4262e.a(r3.getPackageManager(), r02));
    }

    static String b(Context r2) {
        String r02 = r2.getPackageName();
        return r2.getPackageManager().getPackageInfo(r02, 0).versionName;
    L5:
        return null;
    }

    C4256c a();

    String b();

    E c();

    String d();

    InterfaceC4287m0 e();

    String f();

    String h();
}
