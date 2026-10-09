package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CTInboxMessage implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessage> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f34410a;

    /* renamed from: b, reason: collision with root package name */
    public String f34411b;

    /* renamed from: c, reason: collision with root package name */
    public String f34412c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f34413e;

    /* renamed from: f, reason: collision with root package name */
    public JSONObject f34414f;

    /* renamed from: g, reason: collision with root package name */
    public long f34415g;

    /* renamed from: h, reason: collision with root package name */
    public long f34416h;

    /* renamed from: i, reason: collision with root package name */
    public String f34417i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f34418j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34419k;

    /* renamed from: l, reason: collision with root package name */
    public String f34420l;

    /* renamed from: m, reason: collision with root package name */
    public String f34421m;

    /* renamed from: n, reason: collision with root package name */
    public List f34422n;

    /* renamed from: o, reason: collision with root package name */
    public String f34423o;

    /* renamed from: p, reason: collision with root package name */
    public CTInboxMessageType f34424p;

    /* renamed from: q, reason: collision with root package name */
    public JSONObject f34425q;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public CTInboxMessage a(Parcel r3) {
            return new CTInboxMessage(r3, null);
        }

        public CTInboxMessage[] b(int r1) {
            return new CTInboxMessage[r1];
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

    public /* synthetic */ CTInboxMessage(Parcel r1, a r2) {
        this(r1);
    }

    public String a() {
        return this.f34411b;
    }

    public ArrayList b() {
        ArrayList r02 = new ArrayList();
        Iterator r1 = d().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        CTInboxMessageContent r2 = (CTInboxMessageContent) r1.next();
        r02.add(new m(r2.m(), r2.n()));
        goto L4
    L6:
        return r02;
    }

    public long c() {
        return this.f34415g;
    }

    public ArrayList d() {
        return this.f34418j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f34420l;
    }

    public String f() {
        return this.f34421m;
    }

    public List g() {
        return this.f34422n;
    }

    public CTInboxMessageType h() {
        return this.f34424p;
    }

    public JSONObject i() {
        JSONObject r02 = this.f34425q;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return new JSONObject();
    }

    public boolean j() {
        return this.f34419k;
    }

    public void k(boolean r1) {
        this.f34419k = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeString(this.f34423o);
        r3.writeString(this.f34412c);
        r3.writeString(this.f34417i);
        r3.writeString(this.f34410a);
        r3.writeLong(this.f34415g);
        r3.writeLong(this.f34416h);
        r3.writeString(this.f34420l);
        if (this.f34414f != null) goto L5;
        r3.writeByte((byte) 0);
    L7:
        if (this.f34413e != null) goto L9;
        r3.writeByte((byte) 0);
    L10:
        r3.writeByte(this.f34419k ? 1 : 0);
        r3.writeValue(this.f34424p);
        if (this.f34422n != null) goto L13;
        r3.writeByte((byte) 0);
    L14:
        r3.writeString(this.f34411b);
        if (this.f34418j != null) goto L17;
        r3.writeByte((byte) 0);
    L18:
        r3.writeString(this.f34421m);
        r3.writeString(this.d);
        if (this.f34425q != null) goto L22;
        r3.writeByte((byte) 0);
        return;
    L22:
        r3.writeByte((byte) 1);
        r3.writeString(this.f34425q.toString());
        return;
    L17:
        r3.writeByte((byte) 1);
        r3.writeList(this.f34418j);
        goto L18
    L13:
        r3.writeByte((byte) 1);
        r3.writeList(this.f34422n);
        goto L14
    L9:
        r3.writeByte((byte) 1);
        r3.writeString(this.f34413e.toString());
        goto L10
    L5:
        r3.writeByte((byte) 1);
        r3.writeString(this.f34414f.toString());
        goto L7
    }

    public CTInboxMessage(JSONObject r19) {
        this.f34413e = new JSONObject();
        this.f34418j = new ArrayList();
        this.f34422n = new ArrayList();
        this.f34414f = r19;
    L6:
        e = move-exception;
        Logger.v("Unable to init CTInboxMessage with JSON - " + e.getLocalizedMessage());
        return;
    L4:
        if (r19.has(Constants.KEY_ID) == false) goto L8;
        String r2 = r19.getString(Constants.KEY_ID);     // Catch: JSONException -> L6
    L9:
        this.f34420l = r2;     // Catch: JSONException -> L6
        if (r19.has(Constants.NOTIFICATION_ID_TAG) == false) goto L12;
        String r22 = r19.getString(Constants.NOTIFICATION_ID_TAG);     // Catch: JSONException -> L6
    L13:
        this.d = r22;     // Catch: JSONException -> L6
        if (r19.has(Constants.KEY_DATE) == false) goto L16;
        long r23 = r19.getLong(Constants.KEY_DATE);     // Catch: JSONException -> L6
    L17:
        this.f34415g = r23;     // Catch: JSONException -> L6
        if (r19.has("wzrk_ttl") == false) goto L20;
        long r24 = r19.getLong("wzrk_ttl");     // Catch: JSONException -> L6
    L21:
        this.f34416h = r24;     // Catch: JSONException -> L6
        int r3 = 0;
        if (r19.has(Constants.KEY_IS_READ) == true) goto L24;
    L26:
        boolean r25 = false;
    L27:
        this.f34419k = r25;     // Catch: JSONException -> L6
        JSONObject r12 = null;
        if (r19.has(Constants.KEY_TAGS) == false) goto L30;
        JSONArray r26 = r19.getJSONArray(Constants.KEY_TAGS);     // Catch: JSONException -> L6
    L31:
        if (r26 == null) goto L37;
        int r11 = 0;
    L34:
        if (r11 >= r26.length()) goto L37;
        this.f34422n.add(r26.getString(r11));     // Catch: JSONException -> L6
        r11 = r11 + 1;     // Catch: JSONException -> L6
    L37:
        if (r19.has("msg") == false) goto L39;
        JSONObject r27 = r19.getJSONObject("msg");     // Catch: JSONException -> L6
    L40:
        if (r27 == null) goto L77;
        String r112 = "";
        if (r27.has("type") == false) goto L45;
        CTInboxMessageType r9 = CTInboxMessageType.b(r27.getString("type"));     // Catch: JSONException -> L6
    L46:
        this.f34424p = r9;     // Catch: JSONException -> L6
        if (r27.has(Constants.KEY_BG) == false) goto L49;
        String r8 = r27.getString(Constants.KEY_BG);     // Catch: JSONException -> L6
    L50:
        this.f34411b = r8;     // Catch: JSONException -> L6
        if (r27.has("content") == false) goto L53;
        JSONArray r7 = r27.getJSONArray("content");     // Catch: JSONException -> L6
    L54:
        if (r7 == null) goto L60;
        int r82 = 0;
    L57:
        if (r82 >= r7.length()) goto L60;
        this.f34418j.add(new CTInboxMessageContent().t(r7.getJSONObject(r82)));     // Catch: JSONException -> L6
        r82 = r82 + 1;     // Catch: JSONException -> L6
    L60:
        if (r27.has(Constants.KEY_CUSTOM_KV) == false) goto L62;
        JSONArray r6 = r27.getJSONArray(Constants.KEY_CUSTOM_KV);     // Catch: JSONException -> L6
    L63:
        if (r6 == null) goto L73;
    L65:
        if (r3 >= r6.length()) goto L73;
        JSONObject r72 = r6.getJSONObject(r3);     // Catch: JSONException -> L6
        if (r72.has(Constants.KEY_KEY) == false) goto L71;
        String r83 = r72.getString(Constants.KEY_KEY);     // Catch: JSONException -> L6
        if (r72.has("value") == false) goto L71;
        this.f34413e.put(r83, r72.getJSONObject("value").getString(Constants.KEY_TEXT));     // Catch: JSONException -> L6
    L71:
        r3 = r3 + 1;     // Catch: JSONException -> L6
    L73:
        if (r27.has(Constants.KEY_ORIENTATION) == false) goto L75;
        r112 = r27.getString(Constants.KEY_ORIENTATION);     // Catch: JSONException -> L6
    L75:
        this.f34421m = r112;     // Catch: JSONException -> L6
        goto L77
    L62:
        r6 = null;
        goto L63
    L53:
        r7 = null;
        goto L54
    L49:
        r8 = "";
        goto L50
    L45:
        r9 = CTInboxMessageType.b("");     // Catch: JSONException -> L6
    L77:
        if (r19.has(Constants.KEY_WZRK_PARAMS) == false) goto L79;
        r12 = r19.getJSONObject(Constants.KEY_WZRK_PARAMS);     // Catch: JSONException -> L6
    L79:
        this.f34425q = r12;     // Catch: JSONException -> L6
        return;
    L39:
        r27 = null;
        goto L40
    L30:
        r26 = null;
        goto L31
    L24:
        if (r19.getBoolean(Constants.KEY_IS_READ) == false) goto L26;
        r25 = true;
        goto L27
    L20:
        r24 = System.currentTimeMillis() + Constants.ONE_DAY_IN_MILLIS;     // Catch: JSONException -> L6
        goto L21
    L16:
        r23 = System.currentTimeMillis() / 1000;     // Catch: JSONException -> L6
        goto L17
    L12:
        r22 = Constants.TEST_IDENTIFIER;
        goto L13
    L8:
        r2 = "0";
        goto L9
    }

    public CTInboxMessage(Parcel r5) {
        this.f34413e = new JSONObject();
        this.f34418j = new ArrayList();
        this.f34422n = new ArrayList();
        this.f34423o = r5.readString();     // Catch: JSONException -> L18
        this.f34412c = r5.readString();     // Catch: JSONException -> L18
        this.f34417i = r5.readString();     // Catch: JSONException -> L18
        this.f34410a = r5.readString();     // Catch: JSONException -> L18
        this.f34415g = r5.readLong();     // Catch: JSONException -> L18
        this.f34416h = r5.readLong();     // Catch: JSONException -> L18
        this.f34420l = r5.readString();     // Catch: JSONException -> L18
        JSONObject r1 = null;
        if (r5.readByte() != 0) goto L6;
        JSONObject r02 = null;
    L7:
        this.f34414f = r02;     // Catch: JSONException -> L18
        if (r5.readByte() != 0) goto L10;
        JSONObject r03 = null;
    L11:
        this.f34413e = r03;     // Catch: JSONException -> L18
        if (r5.readByte() == 0) goto L14;
        boolean r04 = true;
    L15:
        this.f34419k = r04;     // Catch: JSONException -> L18
        this.f34424p = (CTInboxMessageType) r5.readValue(CTInboxMessageType.class.getClassLoader());     // Catch: JSONException -> L18
        if (r5.readByte() != 1) goto L20;
        List r05 = new ArrayList();     // Catch: JSONException -> L18
        this.f34422n = r05;     // Catch: JSONException -> L18
        r5.readList(r05, String.class.getClassLoader());     // Catch: JSONException -> L18
    L21:
        this.f34411b = r5.readString();     // Catch: JSONException -> L18
        if (r5.readByte() != 1) goto L24;
        ArrayList r06 = new ArrayList();     // Catch: JSONException -> L18
        this.f34418j = r06;     // Catch: JSONException -> L18
        r5.readList(r06, CTInboxMessageContent.class.getClassLoader());     // Catch: JSONException -> L18
    L25:
        this.f34421m = r5.readString();     // Catch: JSONException -> L18
        this.d = r5.readString();     // Catch: JSONException -> L18
        if (r5.readByte() == 0) goto L29;
        r1 = new JSONObject(r5.readString());     // Catch: JSONException -> L18
    L29:
        this.f34425q = r1;     // Catch: JSONException -> L18
        return;
    L24:
        this.f34418j = null;     // Catch: JSONException -> L18
        goto L25
    L20:
        this.f34422n = null;     // Catch: JSONException -> L18
        goto L21
    L14:
        r04 = false;
        goto L15
    L10:
        r03 = new JSONObject(r5.readString());     // Catch: JSONException -> L18
        goto L11
    L6:
        r02 = new JSONObject(r5.readString());     // Catch: JSONException -> L18
    L18:
        e = move-exception;
        Logger.v("Unable to parse CTInboxMessage from parcel - " + e.getLocalizedMessage());
    }
}
