package com.aheaditec.talsec.security;

import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class B extends AbstractC4316w0 {

    /* renamed from: h, reason: collision with root package name */
    public final String f30287h;

    /* renamed from: i, reason: collision with root package name */
    public final X509Certificate f30288i;

    public B(String r1, X509Certificate r2) {
        this.f30287h = r1;
        this.f30288i = r2;
    }

    @Override // com.aheaditec.talsec.security.B1
    public void a(JSONObject r3) {
        X509Certificate r02 = this.f30288i;
        if (r02 == null) goto L6;
        JSONObject r03 = d(r02);
        r3.put(this.f30287h, r03);
        return;
    }

    @Override // com.aheaditec.talsec.security.AbstractC4316w0
    public /* bridge */ /* synthetic */ JSONObject d(X509Certificate r1) {
        return super.d(r1);
    }
}
