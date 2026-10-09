package com.huawei.agconnect.config.impl;

import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
public class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public SecretKey f38845a;

    public h(String r2, String r3, String r4, String r5) {
        if (r2 == null) goto L9;
        if (r3 == null) goto L10;
        if (r4 == null) goto L11;
        if (r5 == null) goto L12;
        this.f38845a = k.a(a.b(r2), a.b(r3), a.b(r4), a.b(r5), 5000);
        return;
    L12:
        return;
    L11:
        return;
    L10:
        return;
    }

    @Override // com.huawei.agconnect.config.impl.i
    public String a(String r3, String r4) {
        SecretKey r02 = this.f38845a;
        if (r02 != null) goto L8;
        return r3;
    L8:
        return new String(k.b(r02, a.b(r3)), "UTF-8");
    L7:
        return r4;
    }
}
