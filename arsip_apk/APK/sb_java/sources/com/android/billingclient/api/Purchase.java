package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f31728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31729b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f31730c;

    public Purchase(String r1, String r2) {
        this.f31728a = r1;
        this.f31729b = r2;
        this.f31730c = new JSONObject(r1);
    }

    public String a() {
        return this.f31728a;
    }

    public List b() {
        return f();
    }

    public int c() {
        if (this.f31730c.optInt("purchaseState", 1) == 4) goto L5;
        return 1;
    L5:
        return 2;
    }

    public String d() {
        JSONObject r02 = this.f31730c;
        return r02.optString("token", r02.optString("purchaseToken"));
    }

    public String e() {
        return this.f31729b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Purchase) == true) goto L8;
        return false;
    L8:
        Purchase r52 = (Purchase) r5;
        if (TextUtils.equals(this.f31728a, r52.a()) == true) goto L11;
    L13:
        return false;
    L11:
        if (TextUtils.equals(this.f31729b, r52.e()) == false) goto L13;
        return true;
    }

    public final ArrayList f() {
        ArrayList r02 = new ArrayList();
        JSONObject r1 = this.f31730c;
        if (r1.has("productIds") == false) goto L11;
        JSONArray r12 = r1.optJSONArray("productIds");
        if (r12 == null) goto L13;
        int r2 = 0;
    L8:
        if (r2 >= r12.length()) goto L13;
        r02.add(r12.optString(r2));
        r2 = r2 + 1;
    L13:
        return r02;
    L11:
        if (r1.has("productId") == false) goto L13;
        r02.add(r1.optString("productId"));
        goto L13
    }

    public int hashCode() {
        return this.f31728a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f31728a));
    }
}
