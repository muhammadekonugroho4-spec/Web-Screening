package com.clevertap.android.sdk.inbox;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public String f34541a;

    /* renamed from: b, reason: collision with root package name */
    public long f34542b;

    /* renamed from: c, reason: collision with root package name */
    public long f34543c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f34544e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34545f;

    /* renamed from: g, reason: collision with root package name */
    public List f34546g;

    /* renamed from: h, reason: collision with root package name */
    public String f34547h;

    /* renamed from: i, reason: collision with root package name */
    public JSONObject f34548i;

    public r() {
        this.f34546g = new ArrayList();
    }

    public static JSONObject i(JSONObject r4) {
        JSONObject r02 = new JSONObject();
        Iterator<String> r1 = r4.keys();
    L4:
        if (r1.hasNext() == false) goto L8;
        String r2 = r1.next();
        if (r2.startsWith(Constants.WZRK_PREFIX) == false) goto L4;
        r02.put(r2, r4.get(r2));
        goto L4
    L8:
        return r02;
    }

    public static r k(JSONObject r20, String r21) {
    L6:
        e = move-exception;
        Logger.d("Unable to parse Notification inbox message to CTMessageDao - " + e.getLocalizedMessage());
        return null;
    L4:
        if (r20.has("_id") == false) goto L8;
        String r9 = r20.getString("_id");     // Catch: JSONException -> L6
    L10:
        if (r20.has(Constants.KEY_DATE) == false) goto L13;
        long r4 = r20.getInt(Constants.KEY_DATE);     // Catch: JSONException -> L6
    L12:
        long r12 = r4;
        if (r20.has("wzrk_ttl") == false) goto L18;
        long r3 = r20.getInt("wzrk_ttl");     // Catch: JSONException -> L6
    L17:
        long r14 = r3;
        if (r20.has("msg") == false) goto L22;
        JSONObject r10 = r20.getJSONObject("msg");     // Catch: JSONException -> L6
    L23:
        ArrayList r2 = new ArrayList();     // Catch: JSONException -> L6
        if (r10 == null) goto L36;
        if (r10.has(Constants.KEY_TAGS) == false) goto L28;
        JSONArray r1 = r10.getJSONArray(Constants.KEY_TAGS);     // Catch: JSONException -> L6
    L29:
        if (r1 == null) goto L36;
        int r32 = 0;
    L32:
        if (r32 >= r1.length()) goto L36;
        r2.add(r1.getString(r32));     // Catch: JSONException -> L6
        r32 = r32 + 1;     // Catch: JSONException -> L6
        goto L32
    L28:
        r1 = null;
    L36:
        if (r20.has(Constants.NOTIFICATION_ID_TAG) == false) goto L38;
        String r13 = r20.getString(Constants.NOTIFICATION_ID_TAG);     // Catch: JSONException -> L6
    L40:
        if (r13.equalsIgnoreCase(Constants.TEST_IDENTIFIER) == false) goto L42;
        r20.put(Constants.NOTIFICATION_ID_TAG, r13);     // Catch: JSONException -> L6
    L42:
        JSONObject r19 = i(r20);     // Catch: JSONException -> L6
        if (r9 != null) goto L45;
        return null;
    L45:
        return new r(r9, r10, false, r12, r14, r21, r2, r13, r19);
    L38:
        r13 = Constants.TEST_IDENTIFIER;
        goto L40
    L22:
        r10 = null;
        goto L23
    L18:
        r3 = (System.currentTimeMillis() + Constants.ONE_DAY_IN_MILLIS) / 1000;     // Catch: JSONException -> L6
        goto L17
    L13:
        r4 = System.currentTimeMillis() / 1000;     // Catch: JSONException -> L6
        goto L12
    L8:
        r9 = null;
        goto L10
    }

    public boolean a() {
        Logger.d("CTMessageDAO:containsVideoOrAudio() called");
        CTInboxMessageContent r02 = (CTInboxMessageContent) new CTInboxMessage(v()).d().get(0);
        if (r02.z() == false) goto L5;
        return true;
    L5:
        if (r02.v() == true) goto L10;
        return false;
    L10:
        return true;
    }

    public String b() {
        return this.f34541a;
    }

    public long c() {
        return this.f34542b;
    }

    public long d() {
        return this.f34543c;
    }

    public String e() {
        return this.d;
    }

    public JSONObject f() {
        return this.f34544e;
    }

    public String g() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, this.f34546g);
    }

    public String h() {
        return this.f34547h;
    }

    public JSONObject j() {
        return this.f34548i;
    }

    public int l() {
        if (this.f34545f == false) goto L6;
        return 1;
    L6:
        return 0;
    }

    public void m(String r1) {
        this.f34541a = r1;
    }

    public void n(long r1) {
        this.f34542b = r1;
    }

    public void o(long r1) {
        this.f34543c = r1;
    }

    public void p(String r1) {
        this.d = r1;
    }

    public void q(JSONObject r1) {
        this.f34544e = r1;
    }

    public void r(int r2) {
        boolean r02 = true;
        if (r2 == 1) goto L6;
        r02 = false;
    L6:
        this.f34545f = r02;
    }

    public void s(String r2) {
        String[] r22 = r2.split(Constants.SEPARATOR_COMMA);
        this.f34546g.addAll(Arrays.asList(r22));
    }

    public void t(String r1) {
        this.f34547h = r1;
    }

    public void u(JSONObject r1) {
        this.f34548i = r1;
    }

    public JSONObject v() {
        JSONObject r02 = new JSONObject();
        r02.put(Constants.KEY_ID, this.d);     // Catch: JSONException -> L7
        r02.put("msg", this.f34544e);     // Catch: JSONException -> L7
        r02.put(Constants.KEY_IS_READ, this.f34545f);     // Catch: JSONException -> L7
        r02.put(Constants.KEY_DATE, this.f34542b);     // Catch: JSONException -> L7
        r02.put("wzrk_ttl", this.f34543c);     // Catch: JSONException -> L7
        JSONArray r1 = new JSONArray();     // Catch: JSONException -> L7
        int r2 = 0;
    L5:
        if (r2 >= this.f34546g.size()) goto L9;
        r1.put(this.f34546g.get(r2));     // Catch: JSONException -> L7
        r2 = r2 + 1;     // Catch: JSONException -> L7
        goto L5
    L9:
        r02.put(Constants.KEY_TAGS, r1);     // Catch: JSONException -> L7
        r02.put(Constants.NOTIFICATION_ID_TAG, this.f34541a);     // Catch: JSONException -> L7
        r02.put(Constants.KEY_WZRK_PARAMS, this.f34548i);     // Catch: JSONException -> L7
        return r02;
    L7:
        e = move-exception;
        Logger.v("Unable to convert CTMessageDao to JSON - " + e.getLocalizedMessage());
        return r02;
    }

    public r(String r2, JSONObject r3, boolean r4, long r5, long r7, String r9, List r10, String r11, JSONObject r12) {
        new ArrayList();
        this.d = r2;
        this.f34544e = r3;
        this.f34545f = r4;
        this.f34542b = r5;
        this.f34543c = r7;
        this.f34547h = r9;
        this.f34546g = r10;
        this.f34541a = r11;
        this.f34548i = r12;
    }
}
