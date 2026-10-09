package com.aheaditec.talsec.security;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class U1 implements B1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30501a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f30502b;

    public U1(String r1, JSONObject r2) {
        this.f30501a = r1;
        if (r2 != null) goto L6;
        this.f30502b = new JSONObject();
        return;
    L6:
        this.f30502b = r2;
    }

    @Override // com.aheaditec.talsec.security.B1
    public void a(JSONObject r3) {
        r3.put(this.f30501a, this.f30502b);
    }
}
