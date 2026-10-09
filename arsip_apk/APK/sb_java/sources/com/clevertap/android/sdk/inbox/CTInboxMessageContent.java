package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f34426a;

    /* renamed from: b, reason: collision with root package name */
    public String f34427b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f34428c;
    public Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public String f34429e;

    /* renamed from: f, reason: collision with root package name */
    public String f34430f;

    /* renamed from: g, reason: collision with root package name */
    public JSONArray f34431g;

    /* renamed from: h, reason: collision with root package name */
    public String f34432h;

    /* renamed from: i, reason: collision with root package name */
    public String f34433i;

    /* renamed from: j, reason: collision with root package name */
    public String f34434j;

    /* renamed from: k, reason: collision with root package name */
    public String f34435k;

    /* renamed from: l, reason: collision with root package name */
    public String f34436l;

    /* renamed from: m, reason: collision with root package name */
    public String f34437m;

    /* renamed from: n, reason: collision with root package name */
    public String f34438n;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public CTInboxMessageContent a(Parcel r2) {
            return new CTInboxMessageContent(r2);
        }

        public CTInboxMessageContent[] b(int r1) {
            return new CTInboxMessageContent[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public CTInboxMessageContent() {
    }

    public String a() {
        return this.f34426a;
    }

    public String b() {
        return this.f34427b;
    }

    public String c() {
        return this.f34429e;
    }

    public String d() {
        return this.f34430f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e(JSONObject r4) {
        if (r4 != null) goto L15;
        return null;
    L15:
    L9:
        e = move-exception;
        Logger.v("Unable to get Link Text Color with JSON - " + e.getLocalizedMessage());
        return null;
    L6:
        if (r4.has(Constants.KEY_BG) == false) goto L11;
        return r4.getString(Constants.KEY_BG);
    L11:
        return "";
    }

    public String f(JSONObject r4) {
        if (r4 != null) goto L15;
        return null;
    L15:
    L9:
        e = move-exception;
        Logger.v("Unable to get Link Text Color with JSON - " + e.getLocalizedMessage());
        return null;
    L6:
        if (r4.has(Constants.KEY_COLOR) == false) goto L11;
        return r4.getString(Constants.KEY_COLOR);
    L11:
        return "";
    }

    public String g(JSONObject r5) {
        if (r5 != null) goto L19;
        return "";
    L19:
    L8:
        e = move-exception;
        Logger.v("Unable to get Link Text with JSON - " + e.getLocalizedMessage());
        return "";
    L6:
        if (r5.has("copyText") == false) goto L10;
        JSONObject r52 = r5.getJSONObject("copyText");     // Catch: JSONException -> L8
    L11:
        if (r52 != null) goto L13;
    L16:
        return "";
    L13:
        if (r52.has(Constants.KEY_TEXT) == false) goto L16;
        return r52.getString(Constants.KEY_TEXT);
    L10:
        r52 = null;
        goto L11
    }

    public HashMap h(JSONObject r7) {
        if (r7 != null) goto L5;
    L20:
        return null;
    L5:
        if (r7.has(Constants.KEY_KV) == false) goto L20;
        JSONObject r72 = r7.getJSONObject(Constants.KEY_KV);     // Catch: JSONException -> L13
        Iterator<String> r1 = r72.keys();     // Catch: JSONException -> L13
        HashMap r2 = new HashMap();     // Catch: JSONException -> L13
    L9:
        if (r1.hasNext() == false) goto L15;
        String r3 = r1.next();     // Catch: JSONException -> L13
        String r4 = r72.getString(r3);     // Catch: JSONException -> L13
        if (TextUtils.isEmpty(r3) == true) goto L9;
        r2.put(r3, r4);     // Catch: JSONException -> L13
        goto L9
    L15:
        if (r2.isEmpty() == true) goto L18;
        return r2;
    L18:
        return null;
    L13:
        e = move-exception;
        Logger.v("Unable to get Link Key Value with JSON - " + e.getLocalizedMessage());
        goto L20
    }

    public String i(JSONObject r4) {
        if (r4 != null) goto L15;
        return null;
    L15:
    L9:
        e = move-exception;
        Logger.v("Unable to get Link Text with JSON - " + e.getLocalizedMessage());
        return null;
    L6:
        if (r4.has(Constants.KEY_TEXT) == false) goto L11;
        return r4.getString(Constants.KEY_TEXT);
    L11:
        return "";
    }

    public String j(JSONObject r6) {
        if (r6 != null) goto L27;
        return null;
    L27:
    L8:
        e = move-exception;
        Logger.v("Unable to get Link URL with JSON - " + e.getLocalizedMessage());
        return null;
    L6:
        if (r6.has("url") == false) goto L10;
        JSONObject r62 = r6.getJSONObject("url");     // Catch: JSONException -> L8
    L11:
        if (r62 != null) goto L14;
        return null;
    L14:
        if (r62.has(Constants.KEY_ANDROID) == false) goto L17;
        JSONObject r63 = r62.getJSONObject(Constants.KEY_ANDROID);     // Catch: JSONException -> L8
    L19:
        if (r63 != null) goto L21;
    L24:
        return "";
    L21:
        if (r63.has(Constants.KEY_TEXT) == false) goto L24;
        return r63.getString(Constants.KEY_TEXT);
    L17:
        r63 = null;
        goto L19
    L10:
        r62 = null;
        goto L11
    }

    public JSONArray k() {
        return this.f34431g;
    }

    public String l(JSONObject r4) {
        if (r4 != null) goto L15;
        return null;
    L15:
    L9:
        e = move-exception;
        Logger.v("Unable to get Link Type with JSON - " + e.getLocalizedMessage());
        return null;
    L6:
        if (r4.has("type") == false) goto L11;
        return r4.getString("type");
    L11:
        return "";
    }

    public String m() {
        return this.f34432h;
    }

    public String n() {
        return this.f34433i;
    }

    public String o() {
        return this.f34434j;
    }

    public String p() {
        return this.f34435k;
    }

    public String q() {
        return this.f34436l;
    }

    public String r() {
        return this.f34437m;
    }

    public String s() {
        return this.f34438n;
    }

    public CTInboxMessageContent t(JSONObject r19) {
    L7:
        e = move-exception;
        Logger.v("Unable to init CTInboxMessageContent with JSON - " + e.getLocalizedMessage());
    L108:
        return this;
    L4:
        if (r19.has(Constants.KEY_TITLE) == false) goto L9;
        JSONObject r12 = r19.getJSONObject(Constants.KEY_TITLE);     // Catch: JSONException -> L7
    L10:
        String r14 = "";
        if (r12 != null) goto L13;
        String r16 = Constants.KEY_LINKS;
    L23:
        if (r19.has("message") == false) goto L25;
        JSONObject r2 = r19.getJSONObject("message");     // Catch: JSONException -> L7
    L26:
        if (r2 == null) goto L37;
        if (r2.has(Constants.KEY_TEXT) == false) goto L30;
        String r11 = r2.getString(Constants.KEY_TEXT);     // Catch: JSONException -> L7
    L31:
        this.f34434j = r11;     // Catch: JSONException -> L7
        if (r2.has(Constants.KEY_COLOR) == false) goto L34;
        String r22 = r2.getString(Constants.KEY_COLOR);     // Catch: JSONException -> L7
    L35:
        this.f34435k = r22;     // Catch: JSONException -> L7
        goto L37
    L34:
        r22 = "";
        goto L35
    L30:
        r11 = "";
    L37:
        if (r19.has(Constants.KEY_ICON) == false) goto L40;
        JSONObject r23 = r19.getJSONObject(Constants.KEY_ICON);     // Catch: JSONException -> L7
    L42:
        if (r23 == null) goto L49;
        if (r23.has("url") == false) goto L46;
        String r122 = r23.getString("url");     // Catch: JSONException -> L7
    L47:
        this.f34429e = r122;     // Catch: JSONException -> L7
        this.f34430f = r23.optString(Constants.KEY_ALT_TEXT, "");     // Catch: JSONException -> L7
        goto L49
    L46:
        r122 = "";
    L49:
        if (r19.has(Constants.KEY_MEDIA) == false) goto L51;
        JSONObject r24 = r19.getJSONObject(Constants.KEY_MEDIA);     // Catch: JSONException -> L7
    L52:
        if (r24 == null) goto L67;
        if (r24.has("url") == false) goto L56;
        String r9 = r24.getString("url");     // Catch: JSONException -> L7
    L57:
        this.f34432h = r9;     // Catch: JSONException -> L7
        this.f34433i = r24.optString(Constants.KEY_ALT_TEXT, "");     // Catch: JSONException -> L7
        if (r24.has("content_type") == false) goto L60;
        String r8 = r24.getString("content_type");     // Catch: JSONException -> L7
    L61:
        this.f34427b = r8;     // Catch: JSONException -> L7
        if (r24.has(Constants.KEY_POSTER_URL) == false) goto L64;
        String r25 = r24.getString(Constants.KEY_POSTER_URL);     // Catch: JSONException -> L7
    L65:
        this.f34436l = r25;     // Catch: JSONException -> L7
        goto L67
    L64:
        r25 = "";
        goto L65
    L60:
        r8 = "";
        goto L61
    L56:
        r9 = "";
    L67:
        if (r19.has(Constants.KEY_ACTION) == false) goto L69;
        JSONObject r02 = r19.getJSONObject(Constants.KEY_ACTION);     // Catch: JSONException -> L7
    L70:
        if (r02 == null) goto L108;
        boolean r6 = false;
        if (r02.has(Constants.KEY_HAS_URL) == true) goto L74;
    L76:
        boolean r26 = false;
    L77:
        this.d = Boolean.valueOf(r26);     // Catch: JSONException -> L7
        if (r02.has(Constants.KEY_HAS_LINKS) == true) goto L80;
    L82:
        this.f34428c = Boolean.valueOf(r6);     // Catch: JSONException -> L7
        if (r02.has("url") == false) goto L85;
        JSONObject r27 = r02.getJSONObject("url");     // Catch: JSONException -> L7
    L86:
        if (r27 != null) goto L88;
    L98:
        if (r27 == null) goto L108;
        if (this.f34428c.booleanValue() == false) goto L108;
        String r28 = r16;
        if (r02.has(r28) == false) goto L104;
        JSONArray r142 = r02.getJSONArray(r28);     // Catch: JSONException -> L7
    L105:
        this.f34431g = r142;     // Catch: JSONException -> L7
        return this;
    L104:
        r142 = null;
        goto L105
    L88:
        if (this.d.booleanValue() == false) goto L98;
        if (r27.has(Constants.KEY_ANDROID) == false) goto L92;
        JSONObject r3 = r27.getJSONObject(Constants.KEY_ANDROID);     // Catch: JSONException -> L7
    L93:
        if (r3 == null) goto L98;
        if (r3.has(Constants.KEY_TEXT) == false) goto L97;
        r14 = r3.getString(Constants.KEY_TEXT);     // Catch: JSONException -> L7
    L97:
        this.f34426a = r14;     // Catch: JSONException -> L7
        goto L98
    L92:
        r3 = null;
        goto L93
    L85:
        r27 = null;
        goto L86
    L80:
        if (r02.getBoolean(Constants.KEY_HAS_LINKS) == false) goto L82;
        r6 = true;
        goto L82
    L74:
        if (r02.getBoolean(Constants.KEY_HAS_URL) == false) goto L76;
        r26 = true;
        goto L77
    L69:
        r02 = null;
        goto L70
    L51:
        r24 = null;
        goto L52
    L40:
        r23 = null;
        goto L42
    L25:
        r2 = null;
        goto L26
    L13:
        if (r12.has(Constants.KEY_TEXT) == false) goto L15;
        String r162 = r12.getString(Constants.KEY_TEXT);     // Catch: JSONException -> L7
        r16 = Constants.KEY_LINKS;
        String r29 = r162;
    L16:
        this.f34437m = r29;     // Catch: JSONException -> L7
        if (r12.has(Constants.KEY_COLOR) == false) goto L19;
        String r210 = r12.getString(Constants.KEY_COLOR);     // Catch: JSONException -> L7
    L20:
        this.f34438n = r210;     // Catch: JSONException -> L7
        goto L23
    L19:
        r210 = "";
        goto L20
    L15:
        r16 = Constants.KEY_LINKS;
        r29 = "";
        goto L16
    L9:
        r12 = null;
        goto L10
    }

    public boolean u(JSONObject r4) {
        if (r4 != null) goto L14;
        return false;
    L14:
    L9:
        e = move-exception;
        Logger.v("Unable to get fallback settings key with JSON - " + e.getLocalizedMessage());
        return false;
    L6:
        if (r4.has(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS) == false) goto L11;
        return r4.getBoolean(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS);
    L11:
        return false;
    }

    public boolean v() {
        String r02 = b();
        if (r02 != null) goto L5;
        return false;
    L5:
        if (this.f34432h != null) goto L7;
        return false;
    L7:
        if (r02.startsWith("audio") == false) goto L13;
        return true;
    L13:
        return false;
    }

    public boolean w() {
        String r02 = b();
        if (r02 != null) goto L5;
        return false;
    L5:
        if (this.f34432h != null) goto L7;
        return false;
    L7:
        if (r02.equals("image/gif") == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.f34437m);
        r1.writeString(this.f34438n);
        r1.writeString(this.f34434j);
        r1.writeString(this.f34435k);
        r1.writeString(this.f34432h);
        r1.writeString(this.f34433i);
        r1.writeByte(this.d.booleanValue() ? 1 : 0);
        r1.writeByte(this.f34428c.booleanValue() ? 1 : 0);
        r1.writeString(this.f34426a);
        r1.writeString(this.f34429e);
        r1.writeString(this.f34430f);
        if (this.f34431g != null) goto L5;
        r1.writeByte((byte) 0);
    L6:
        r1.writeString(this.f34427b);
        r1.writeString(this.f34436l);
        return;
    L5:
        r1.writeByte((byte) 1);
        r1.writeString(this.f34431g.toString());
        goto L6
    }

    public boolean x() {
        String r02 = b();
        if (r02 != null) goto L5;
        return false;
    L5:
        if (this.f34432h != null) goto L7;
        return false;
    L7:
        if (r02.startsWith("image") == true) goto L9;
        return false;
    L9:
        if (r02.equals("image/gif") == true) goto L16;
        return true;
    L16:
        return false;
    }

    public boolean y() {
        if (v() == false) goto L5;
        return true;
    L5:
        if (z() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean z() {
        String r02 = b();
        if (r02 != null) goto L5;
        return false;
    L5:
        if (this.f34432h != null) goto L7;
        return false;
    L7:
        if (r02.startsWith("video") == false) goto L13;
        return true;
    L13:
        return false;
    }

    public CTInboxMessageContent(Parcel r4) {
        this.f34437m = r4.readString();
        this.f34438n = r4.readString();
        this.f34434j = r4.readString();
        this.f34435k = r4.readString();
        this.f34432h = r4.readString();
        this.f34433i = r4.readString();
        boolean r1 = false;
        if (r4.readByte() == 0) goto L5;
        boolean r02 = true;
    L6:
        this.d = Boolean.valueOf(r02);
        if (r4.readByte() == 0) goto L9;
        r1 = true;
    L9:
        this.f34428c = Boolean.valueOf(r1);
        this.f34426a = r4.readString();
        this.f34429e = r4.readString();
        this.f34430f = r4.readString();
    L16:
        e = move-exception;
        Logger.v("Unable to init CTInboxMessageContent with Parcel - " + e.getLocalizedMessage());
    L18:
        this.f34427b = r4.readString();
        this.f34436l = r4.readString();
        return;
    L11:
        if (r4.readByte() != 0) goto L13;
        JSONArray r03 = null;
    L14:
        this.f34431g = r03;     // Catch: JSONException -> L16
        goto L18
    L13:
        r03 = new JSONArray(r4.readString());     // Catch: JSONException -> L16
        goto L14
    L5:
        r02 = false;
        goto L6
    }
}
