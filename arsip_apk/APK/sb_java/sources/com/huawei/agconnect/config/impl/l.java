package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.text.TextUtils;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public abstract class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38848b;

    public l(Context r1, String r2) {
        this.f38847a = r1;
        this.f38848b = r2;
    }

    private static String b(String r3) {
        return "agc_" + a.c(c(r3.getBytes("UTF-8")));
    L5:
        return "";
    }

    public static byte[] c(byte[] r1) {
        return MessageDigest.getInstance("SHA-256").digest(r1);
    }

    @Override // com.huawei.agconnect.config.impl.f
    public String a(String r4, String r5) {
        String r42 = b(r4);
        if (TextUtils.isEmpty(r42) == true) goto L10;
        int r43 = this.f38847a.getResources().getIdentifier(r42, "string", this.f38848b);
        if (r43 == 0) goto L10;
        return this.f38847a.getResources().getString(r43);
    L10:
        return r5;
    }
}
