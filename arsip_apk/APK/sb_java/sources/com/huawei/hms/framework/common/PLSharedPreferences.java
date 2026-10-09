package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PLSharedPreferences {
    private static final String MOVE_TO_DE_RECORDS = "grs_move2DE_records";
    private static final String TAG = "PLSharedPreferences";
    private final SharedPreferences sp;

    public PLSharedPreferences(Context r1, String r2) {
        this.sp = getSharedPreferences(r1, r2);
    }

    private SharedPreferences getSharedPreferences(Context r5, String r6) {
        if (r5 != null) goto L5;
        Logger.e(TAG, "context is null, must call init method to set context");
        return null;
    L5:
        Context r02 = r5.createDeviceProtectedStorageContext();
        SharedPreferences r1 = r02.getSharedPreferences(MOVE_TO_DE_RECORDS, 0);
        if (r1.getBoolean(r6, false) == false) goto L8;
    L11:
        r5 = r02;
    L13:
        return r5.getSharedPreferences(r6, 0);
    L8:
        if (r02.moveSharedPreferencesFrom(r5, r6) == false) goto L13;
        SharedPreferences.Editor r52 = r1.edit();
        r52.putBoolean(r6, true);
        r52.apply();
        goto L11
    }

    public void clear() {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.edit().clear().apply();
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.edit();
    }

    public Map<String, ?> getAll() {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L6;
        return null;
    L6:
        Map<String, ?> r03 = r02.getAll();
        StringBuilder r1 = new StringBuilder();
        r1.append("sp size ");
        if (r03 != null) goto L9;
        int r2 = 0;
    L10:
        r1.append(r2);
        Logger.i(TAG, r1.toString());
        return r03;
    L9:
        r2 = r03.size();
        goto L10
    }

    public Map<String, String> getHashMap(String r9) {
        HashMap r02 = new HashMap();
        SharedPreferences r1 = this.sp;
        if (r1 != null) goto L21;
    L20:
        return r02;
    L21:
        JSONArray r12 = new JSONArray(r1.getString(r9, ""));     // Catch: JSONException -> L16
        int r2 = 0;
    L7:
        if (r2 >= r12.length()) goto L20;
        JSONObject r3 = r12.getJSONObject(r2);     // Catch: JSONException -> L16
        JSONArray r4 = r3.names();     // Catch: JSONException -> L16
        if (r4 == null) goto L18;
        int r5 = 0;
    L13:
        if (r5 >= r4.length()) goto L18;
        String r6 = r4.getString(r5);     // Catch: JSONException -> L16
        r02.put(r6, r3.getString(r6));     // Catch: JSONException -> L16
        r5 = r5 + 1;
    L18:
        r2 = r2 + 1;
    L16:
        e = move-exception;
        Logger.w(TAG, "getHashMap parse Json to map error: %s", new Object[]{StringUtils.anonymizeMessage(e.getMessage())});
        goto L20
    }

    public long getLong(String r2, long r3) {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L6;
        return r3;
    L6:
        return r02.getLong(r2, r3);
    }

    public String getString(String r2) {
        return getString(r2, "");
    }

    public void putHashMap(String r6, Map<String, String> r7) {
        if (this.sp == null) goto L22;
        if (r7 == null) goto L23;
        JSONArray r02 = new JSONArray();
        JSONObject r1 = new JSONObject();
        Iterator<Map.Entry<String, String>> r72 = r7.entrySet().iterator();
    L8:
        if (r72.hasNext() == false) goto L14;
        Map.Entry<String, String> r2 = r72.next();
        r1.put(r2.getKey(), r2.getValue());     // Catch: JSONException -> L12
    L12:
        e = move-exception;
        Logger.w(TAG, "putHashMap one object error: %s", new Object[]{StringUtils.anonymizeMessage(e.getMessage())});
        goto L8
    L14:
        r02.put(r1);
        this.sp.edit().putString(r6, r02.toString()).apply();
        return;
    L23:
        return;
    }

    public void putLong(String r2, long r3) {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.edit().putLong(r2, r3).apply();
    }

    public void putString(String r2, String r3) {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.edit().putString(r2, r3).apply();
    }

    public void remove(String r2) {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.edit().remove(r2).apply();
    }

    public void removeKeyValue(String r2) {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.edit().remove(r2).apply();
    }

    public String getString(String r2, String r3) {
        SharedPreferences r02 = this.sp;
        if (r02 != null) goto L6;
        return r3;
    L6:
        return r02.getString(r2, r3);
    }
}
