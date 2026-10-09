package com.aheaditec.talsec.security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class I implements B1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30313a;

    /* renamed from: b, reason: collision with root package name */
    public final List f30314b;

    public I(String r1, List r2) {
        this.f30313a = r1;
        if (r2 != null) goto L6;
        this.f30314b = new ArrayList();
        return;
    L6:
        this.f30314b = r2;
    }

    @Override // com.aheaditec.talsec.security.B1
    public void a(JSONObject r4) {
        JSONArray r02 = new JSONArray();
        Iterator r1 = this.f30314b.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r02.put((String) r1.next());
        goto L4
    L6:
        r4.put(this.f30313a, r02);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L15;
        I r52 = (I) r5;
        if (Objects.equals(this.f30313a, r52.f30313a) == false) goto L15;
        if (Objects.equals(this.f30314b, r52.f30314b) == false) goto L15;
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f30313a, this.f30314b});
    }
}
