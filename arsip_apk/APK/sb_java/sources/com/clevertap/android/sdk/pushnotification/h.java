package com.clevertap.android.sdk.pushnotification;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f34808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34809b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34810c;
    public final String d;

    public h(String r1, String r2, String r3, String r4) {
        this.d = r1;
        this.f34810c = r2;
        this.f34808a = r3;
        this.f34809b = r4;
    }

    public static h a(JSONObject r5) {
        if (r5 != null) goto L8;
        return null;
    L8:
        String r1 = r5.getString("ctProviderClassName");     // Catch: JSONException -> L7
        String r2 = r5.getString("messagingSDKClassName");     // Catch: JSONException -> L7
        String r3 = r5.getString("tokenPrefKey");     // Catch: JSONException -> L7
        return new h(r5.getString("type"), r3, r1, r2);
    L7:
        return null;
    }

    public String b() {
        return this.f34808a;
    }

    public String c() {
        return this.f34809b;
    }

    public String d() {
        return this.f34810c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (Objects.equals(this.f34808a, r52.f34808a) == true) goto L11;
    L17:
        return false;
    L11:
        if (Objects.equals(this.f34809b, r52.f34809b) == false) goto L17;
        if (Objects.equals(this.f34810c, r52.f34810c) == false) goto L17;
        if (Objects.equals(this.d, r52.d) == false) goto L17;
        return true;
    }

    public JSONObject f() {
        JSONObject r02 = new JSONObject();
        r02.put("ctProviderClassName", this.f34808a);     // Catch: JSONException -> L5
        r02.put("messagingSDKClassName", this.f34809b);     // Catch: JSONException -> L5
        r02.put("tokenPrefKey", this.f34810c);     // Catch: JSONException -> L5
        r02.put("type", this.d);     // Catch: JSONException -> L5
        return r02;
    L5:
        return null;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f34808a, this.f34809b, this.f34810c, this.d});
    }

    public String toString() {
        return " [PushType:" + this.d + "] ";
    }
}
