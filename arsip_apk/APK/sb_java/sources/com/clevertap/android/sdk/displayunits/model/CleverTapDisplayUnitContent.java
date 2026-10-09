package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f33831a;

    /* renamed from: b, reason: collision with root package name */
    public String f33832b;

    /* renamed from: c, reason: collision with root package name */
    public String f33833c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f33834e;

    /* renamed from: f, reason: collision with root package name */
    public String f33835f;

    /* renamed from: g, reason: collision with root package name */
    public String f33836g;

    /* renamed from: h, reason: collision with root package name */
    public String f33837h;

    /* renamed from: i, reason: collision with root package name */
    public String f33838i;

    /* renamed from: j, reason: collision with root package name */
    public String f33839j;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public CleverTapDisplayUnitContent a(Parcel r3) {
            return new CleverTapDisplayUnitContent(r3, null);
        }

        public CleverTapDisplayUnitContent[] b(int r1) {
            return new CleverTapDisplayUnitContent[r1];
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

    public /* synthetic */ CleverTapDisplayUnitContent(Parcel r1, a r2) {
        this(r1);
    }

    public static CleverTapDisplayUnitContent a(JSONObject r17) {
        JSONObject r10 = null;
        if (r17.has(Constants.KEY_TITLE) == false) goto L7;
        JSONObject r8 = r17.getJSONObject(Constants.KEY_TITLE);     // Catch: Exception -> L81
    L8:
        String r12 = "";
        if (r8 != null) goto L11;
        String r82 = "";
        String r13 = r82;
    L20:
        if (r17.has("message") == false) goto L22;
        JSONObject r7 = r17.getJSONObject("message");     // Catch: Exception -> L81
    L23:
        if (r7 != null) goto L25;
        String r72 = "";
        String r14 = r72;
    L34:
        if (r17.has(Constants.KEY_ICON) == false) goto L37;
        JSONObject r6 = r17.getJSONObject(Constants.KEY_ICON);     // Catch: Exception -> L81
    L39:
        if (r6 != null) goto L41;
    L43:
        String r62 = "";
    L45:
        if (r17.has(Constants.KEY_MEDIA) == false) goto L47;
        JSONObject r5 = r17.getJSONObject(Constants.KEY_MEDIA);     // Catch: Exception -> L81
    L48:
        if (r5 != null) goto L50;
        String r3 = "";
        String r4 = r3;
        String r15 = r4;
    L63:
        if (r17.has(Constants.KEY_ACTION) == false) goto L65;
        JSONObject r02 = r17.getJSONObject(Constants.KEY_ACTION);     // Catch: Exception -> L81
    L66:
        if (r02 != null) goto L68;
    L79:
        String r9 = r3;
        String r32 = r82;
        String r83 = r4;
        return new CleverTapDisplayUnitContent(r13, r32, r14, r72, r62, r15, r83, r9, r12, null);
    L68:
        if (r02.has("url") == false) goto L70;
        JSONObject r03 = r02.getJSONObject("url");     // Catch: Exception -> L81
    L71:
        if (r03 == null) goto L79;
        if (r03.has(Constants.KEY_ANDROID) == false) goto L75;
        r10 = r03.getJSONObject(Constants.KEY_ANDROID);     // Catch: Exception -> L81
    L75:
        if (r10 == null) goto L79;
        if (r10.has(Constants.KEY_TEXT) == false) goto L79;
        r12 = r10.getString(Constants.KEY_TEXT);     // Catch: Exception -> L81
        goto L79
    L70:
        r03 = null;
        goto L71
    L65:
        r02 = null;
        goto L66
    L50:
        if (r5.has("url") == false) goto L52;
        r15 = r5.getString("url");     // Catch: Exception -> L81
    L54:
        if (r5.has("content_type") == false) goto L56;
        r4 = r5.getString("content_type");     // Catch: Exception -> L81
    L58:
        if (r5.has(Constants.KEY_POSTER_URL) == false) goto L60;
        r3 = r5.getString(Constants.KEY_POSTER_URL);     // Catch: Exception -> L81
        goto L63
    L60:
        r3 = "";
        goto L63
    L56:
        r4 = "";
        goto L58
    L52:
        r15 = "";
        goto L54
    L47:
        r5 = null;
        goto L48
    L41:
        if (r6.has("url") == false) goto L43;
        r62 = r6.getString("url");     // Catch: Exception -> L81
        goto L45
    L37:
        r6 = null;
        goto L39
    L25:
        if (r7.has(Constants.KEY_TEXT) == false) goto L27;
        r14 = r7.getString(Constants.KEY_TEXT);     // Catch: Exception -> L81
    L29:
        if (r7.has(Constants.KEY_COLOR) == false) goto L31;
        r72 = r7.getString(Constants.KEY_COLOR);     // Catch: Exception -> L81
        goto L34
    L31:
        r72 = "";
        goto L34
    L27:
        r14 = "";
        goto L29
    L22:
        r7 = null;
        goto L23
    L11:
        if (r8.has(Constants.KEY_TEXT) == false) goto L13;
        r13 = r8.getString(Constants.KEY_TEXT);     // Catch: Exception -> L81
    L15:
        if (r8.has(Constants.KEY_COLOR) == false) goto L17;
        r82 = r8.getString(Constants.KEY_COLOR);     // Catch: Exception -> L81
        goto L20
    L17:
        r82 = "";
        goto L20
    L13:
        r13 = "";
        goto L15
    L7:
        r8 = null;
    L81:
        e = move-exception;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Unable to init CleverTapDisplayUnitContent with JSON - " + e.getLocalizedMessage());
        return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", "Error Creating DisplayUnit Content from JSON : " + e.getLocalizedMessage());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getError() {
        return this.f33833c;
    }

    public String toString() {
        return "[ title:" + this.f33838i + ", titleColor:" + this.f33839j + " message:" + this.f33835f + ", messageColor:" + this.f33836g + ", media:" + this.f33834e + ", contentType:" + this.f33832b + ", posterUrl:" + this.f33837h + ", actionUrl:" + this.f33831a + ", icon:" + this.d + ", error:" + this.f33833c + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.f33838i);
        r1.writeString(this.f33839j);
        r1.writeString(this.f33835f);
        r1.writeString(this.f33836g);
        r1.writeString(this.d);
        r1.writeString(this.f33834e);
        r1.writeString(this.f33832b);
        r1.writeString(this.f33837h);
        r1.writeString(this.f33831a);
        r1.writeString(this.f33833c);
    }

    public CleverTapDisplayUnitContent(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        this.f33838i = r1;
        this.f33839j = r2;
        this.f33835f = r3;
        this.f33836g = r4;
        this.d = r5;
        this.f33834e = r6;
        this.f33832b = r7;
        this.f33837h = r8;
        this.f33831a = r9;
        this.f33833c = r10;
    }

    public CleverTapDisplayUnitContent(Parcel r2) {
        this.f33838i = r2.readString();
        this.f33839j = r2.readString();
        this.f33835f = r2.readString();
        this.f33836g = r2.readString();
        this.d = r2.readString();
        this.f33834e = r2.readString();
        this.f33832b = r2.readString();
        this.f33837h = r2.readString();
        this.f33831a = r2.readString();
        this.f33833c = r2.readString();
    }
}
