package com.clevertap.android.sdk.network.api;

import kotlin.jvm.internal.p;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f34674a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f34675b;

    public k(JSONObject r2, JSONArray r3) {
        p.l(r3, "queue");
        this.f34674a = r2;
        this.f34675b = r3;
    }

    public final JSONArray a() {
        return this.f34675b;
    }

    public final JSONObject b() {
        return this.f34674a;
    }

    public String toString() {
        if (this.f34674a != null) goto L6;
        String r02 = this.f34675b.toString();
        p.i(r02);
        return r02;
    L6:
        StringBuilder r03 = new StringBuilder();
        r03.append('[');
        r03.append(this.f34674a);
        r03.append(',');
        String r1 = this.f34675b.toString();
        p.k(r1, "toString(...)");
        String r12 = r1.substring(1);
        p.k(r12, "substring(...)");
        r03.append(r12);
        return r03.toString();
    }
}
