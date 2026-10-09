package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.displayunits.CTDisplayUnitType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f33825a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f33826b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f33827c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f33828e;

    /* renamed from: f, reason: collision with root package name */
    public CTDisplayUnitType f33829f;

    /* renamed from: g, reason: collision with root package name */
    public String f33830g;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public CleverTapDisplayUnit a(Parcel r3) {
            return new CleverTapDisplayUnit(r3, null);
        }

        public CleverTapDisplayUnit[] b(int r1) {
            return new CleverTapDisplayUnit[r1];
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

    public /* synthetic */ CleverTapDisplayUnit(Parcel r1, a r2) {
        this(r1);
    }

    public static CleverTapDisplayUnit e(JSONObject r13) {
    L35:
        e = move-exception;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Unable to init CleverTapDisplayUnit with JSON - " + e.getLocalizedMessage());
        return new CleverTapDisplayUnit(null, "", null, null, null, null, "Error Creating Display Unit from JSON : " + e.getLocalizedMessage());
    L4:
        if (r13.has(Constants.NOTIFICATION_ID_TAG) == false) goto L7;
        String r4 = r13.getString(Constants.NOTIFICATION_ID_TAG);     // Catch: Exception -> L35
    L6:
        String r7 = r4;
        JSONObject r5 = null;
        if (r13.has("type") == false) goto L11;
        CTDisplayUnitType r8 = CTDisplayUnitType.type(r13.getString("type"));     // Catch: Exception -> L35
    L13:
        if (r13.has(Constants.KEY_BG) == false) goto L16;
        String r2 = r13.getString(Constants.KEY_BG);     // Catch: Exception -> L35
    L15:
        String r9 = r2;
        if (r13.has("content") == false) goto L20;
        JSONArray r1 = r13.getJSONArray("content");     // Catch: Exception -> L35
    L21:
        ArrayList r10 = new ArrayList();     // Catch: Exception -> L35
        if (r1 == null) goto L31;
        int r22 = 0;
    L25:
        if (r22 >= r1.length()) goto L31;
        CleverTapDisplayUnitContent r3 = CleverTapDisplayUnitContent.a(r1.getJSONObject(r22));     // Catch: Exception -> L35
        if (TextUtils.isEmpty(r3.getError()) == false) goto L29;
        r10.add(r3);     // Catch: Exception -> L35
    L29:
        r22 = r22 + 1;     // Catch: Exception -> L35
    L31:
        if (r13.has(Constants.KEY_CUSTOM_KV) == false) goto L33;
        r5 = r13.getJSONObject(Constants.KEY_CUSTOM_KV);     // Catch: Exception -> L35
    L33:
        return new CleverTapDisplayUnit(r13, r7, r8, r9, r10, r5, null);
    L20:
        r1 = null;
        goto L21
    L16:
        r2 = "";
        goto L15
    L11:
        r8 = null;
        goto L13
    L7:
        r4 = Constants.TEST_IDENTIFIER;
        goto L6
    }

    public HashMap a() {
        return this.f33827c;
    }

    public HashMap b(JSONObject r7) {
        if (r7 != null) goto L20;
    L19:
        return null;
    L20:
        Iterator<String> r1 = r7.keys();     // Catch: Exception -> L13
        if (r1 == null) goto L19;
        HashMap r2 = null;
    L7:
        if (r1.hasNext() == false) goto L17;
        String r3 = r1.next();     // Catch: Exception -> L13
        String r4 = r7.getString(r3);     // Catch: Exception -> L13
        if (TextUtils.isEmpty(r3) == true) goto L7;
        if (r2 != null) goto L15;
        r2 = new HashMap();     // Catch: Exception -> L13
    L15:
        r2.put(r3, r4);     // Catch: Exception -> L13
        goto L7
    L17:
        return r2;
    L13:
        e = move-exception;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Error in getting Key Value Pairs " + e.getLocalizedMessage());
        goto L19
    }

    public String c() {
        return this.f33830g;
    }

    public JSONObject d() {
        JSONObject r02 = this.f33828e;     // Catch: Exception -> L11
        if (r02 == null) goto L24;
        Iterator<String> r03 = r02.keys();     // Catch: Exception -> L11
        JSONObject r1 = new JSONObject();     // Catch: Exception -> L11
    L5:
        if (r03.hasNext() == false) goto L13;
        String r2 = r03.next();     // Catch: Exception -> L11
        if (r2.startsWith(Constants.WZRK_PREFIX) == false) goto L5;
        r1.put(r2, this.f33828e.get(r2));     // Catch: Exception -> L11
        goto L5
    L13:
        return r1;
    L24:
        return null;
    L11:
        e = move-exception;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Error in getting WiZRK fields " + e.getLocalizedMessage());
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getError() {
        return this.d;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();     // Catch: Exception -> L5
        r02.append(Constants.AES_PREFIX);     // Catch: Exception -> L5
        r02.append(" Unit id- ");     // Catch: Exception -> L5
        r02.append(this.f33830g);     // Catch: Exception -> L5
        r02.append(", Type- ");     // Catch: Exception -> L5
        CTDisplayUnitType r1 = this.f33829f;     // Catch: Exception -> L5
        if (r1 == null) goto L7;
        String r12 = r1.toString();     // Catch: Exception -> L5
    L8:
        r02.append(r12);     // Catch: Exception -> L5
        r02.append(", bgColor- ");     // Catch: Exception -> L5
        r02.append(this.f33825a);     // Catch: Exception -> L5
        ArrayList r13 = this.f33826b;     // Catch: Exception -> L5
        if (r13 == null) goto L20;
        if (r13.isEmpty() == true) goto L20;
        int r14 = 0;
    L14:
        if (r14 >= this.f33826b.size()) goto L20;
        CleverTapDisplayUnitContent r2 = (CleverTapDisplayUnitContent) this.f33826b.get(r14);     // Catch: Exception -> L5
        if (r2 == null) goto L18;
        r02.append(", Content Item:");     // Catch: Exception -> L5
        r02.append(r14);     // Catch: Exception -> L5
        r02.append(" ");     // Catch: Exception -> L5
        r02.append(r2.toString());     // Catch: Exception -> L5
        r02.append("\n");     // Catch: Exception -> L5
    L18:
        r14 = r14 + 1;     // Catch: Exception -> L5
    L20:
        if (this.f33827c == null) goto L22;
        r02.append(", Custom KV:");     // Catch: Exception -> L5
        r02.append(this.f33827c);     // Catch: Exception -> L5
    L22:
        r02.append(", JSON -");     // Catch: Exception -> L5
        r02.append(this.f33828e);     // Catch: Exception -> L5
        r02.append(", Error-");     // Catch: Exception -> L5
        r02.append(this.d);     // Catch: Exception -> L5
        r02.append(" ]");     // Catch: Exception -> L5
        return r02.toString();
    L7:
        r12 = null;
    L5:
        e = move-exception;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Exception in toString:" + e);
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeString(this.f33830g);
        r3.writeValue(this.f33829f);
        r3.writeString(this.f33825a);
        if (this.f33826b != null) goto L5;
        r3.writeByte((byte) 0);
    L6:
        r3.writeMap(this.f33827c);
        if (this.f33828e != null) goto L9;
        r3.writeByte((byte) 0);
    L10:
        r3.writeString(this.d);
        return;
    L9:
        r3.writeByte((byte) 1);
        r3.writeString(this.f33828e.toString());
        goto L10
    L5:
        r3.writeByte((byte) 1);
        r3.writeList(this.f33826b);
        goto L6
    }

    public CleverTapDisplayUnit(JSONObject r1, String r2, CTDisplayUnitType r3, String r4, ArrayList r5, JSONObject r6, String r7) {
        this.f33828e = r1;
        this.f33830g = r2;
        this.f33829f = r3;
        this.f33825a = r4;
        this.f33826b = r5;
        this.f33827c = b(r6);
        this.d = r7;
    }

    public CleverTapDisplayUnit(Parcel r4) {
        this.f33830g = r4.readString();     // Catch: Exception -> L6
        this.f33829f = (CTDisplayUnitType) r4.readValue(CTDisplayUnitType.class.getClassLoader());     // Catch: Exception -> L6
        this.f33825a = r4.readString();     // Catch: Exception -> L6
        JSONObject r2 = null;
        if (r4.readByte() != 1) goto L8;
        ArrayList r02 = new ArrayList();     // Catch: Exception -> L6
        this.f33826b = r02;     // Catch: Exception -> L6
        r4.readList(r02, CleverTapDisplayUnitContent.class.getClassLoader());     // Catch: Exception -> L6
    L9:
        this.f33827c = r4.readHashMap(null);     // Catch: Exception -> L6
        if (r4.readByte() == 0) goto L13;
        r2 = new JSONObject(r4.readString());     // Catch: Exception -> L6
    L13:
        this.f33828e = r2;     // Catch: Exception -> L6
        this.d = r4.readString();     // Catch: Exception -> L6
        return;
    L8:
        this.f33826b = null;     // Catch: Exception -> L6
    L6:
        e = move-exception;
        String r42 = "Error Creating Display Unit from parcel : " + e.getLocalizedMessage();
        this.d = r42;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, r42);
    }
}
