package com.android.billingclient.api;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4359u {

    /* renamed from: a, reason: collision with root package name */
    public final String f31934a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31935b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31936c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31937e;

    public C4359u(String r4) {
        this.f31934a = r4;
        JSONObject r02 = new JSONObject(r4);
        this.f31935b = r02.optString("productId");
        String r42 = r02.optString("type");
        this.f31936c = r42;
        if (r02.has(HiAnalyticsConstant.HaKey.BI_KEY_RESULT) == false) goto L5;
        int r1 = r02.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
    L6:
        this.d = r1;
        if (TextUtils.isEmpty(r42) == true) goto L11;
        this.f31937e = r02.optString("serializedDocid");
        return;
    L11:
        throw new IllegalArgumentException("Product type cannot be empty.");
    L5:
        r1 = 0;
        goto L6
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C4359u) == true) goto L10;
        return false;
    L10:
        return TextUtils.equals(this.f31934a, ((C4359u) r2).f31934a);
    }

    public int hashCode() {
        return this.f31934a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.f31935b + "', productType='" + this.f31936c + "', statusCode=" + this.d + "}";
    }
}
