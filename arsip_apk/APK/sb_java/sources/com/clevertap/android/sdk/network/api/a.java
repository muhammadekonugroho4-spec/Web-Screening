package com.clevertap.android.sdk.network.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f34643a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f34644b;

    public a(JSONObject r2, JSONArray r3) {
        p.l(r2, "header");
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f34643a = r2;
        this.f34644b = r3;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append('[');
        r02.append(this.f34643a);
        r02.append(',');
        String r1 = this.f34644b.toString();
        p.k(r1, "toString(...)");
        String r12 = r1.substring(1);
        p.k(r12, "substring(...)");
        r02.append(r12);
        return r02.toString();
    }
}
