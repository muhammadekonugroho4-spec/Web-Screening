package com.aheaditec.talsec.security;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class G extends AbstractC4316w0 {

    /* renamed from: h, reason: collision with root package name */
    public final String f30308h;

    /* renamed from: i, reason: collision with root package name */
    public final List f30309i;

    public G(String r1, List r2) {
        this.f30308h = r1;
        this.f30309i = r2;
    }

    @Override // com.aheaditec.talsec.security.B1
    public void a(JSONObject r4) {
        if (this.f30309i == null) goto L17;
        JSONArray r02 = new JSONArray();
        Iterator r1 = this.f30309i.iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        X509Certificate r2 = (X509Certificate) r1.next();
        if (r2 == null) goto L6;
        r02.put(d(r2));
        goto L6
    L10:
        r4.put(this.f30308h, r02);
        return;
    }

    @Override // com.aheaditec.talsec.security.AbstractC4316w0
    public /* bridge */ /* synthetic */ JSONObject d(X509Certificate r1) {
        return super.d(r1);
    }
}
