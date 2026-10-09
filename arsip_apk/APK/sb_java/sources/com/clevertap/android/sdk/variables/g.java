package com.clevertap.android.sdk.variables;

import android.text.Editable;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class g {
    public static Map a(String r4) {
        if (r4 != null) goto L10;
        return null;
    L10:
        return d(new JSONObject(r4));
    L7:
        e = move-exception;
        Logger.v("Error converting " + r4 + " from JSON", e);
        return null;
    }

    public static List b(JSONArray r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        ArrayList r1 = new ArrayList(r6.length());
        int r2 = 0;
    L7:
        if (r2 >= r6.length()) goto L24;
        Object r3 = r6.opt(r2);
        if (r3 == null) goto L21;
        Object r4 = JSONObject.NULL;
        if (r3 == r4) goto L21;
        if ((r3 instanceof JSONObject) == false) goto L17;
        r3 = d((JSONObject) r3);
    L22:
        r1.add(r3);
        r2 = r2 + 1;
        goto L7
    L17:
        if ((r3 instanceof JSONArray) == false) goto L20;
        r3 = b((JSONArray) r3);
        goto L22
    L20:
        if (r4.equals(r3) == false) goto L22;
    L21:
        r3 = null;
        goto L22
    L24:
        return (List) g(r1);
    }

    public static JSONArray c(Iterable r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        JSONArray r02 = new JSONArray();
        Iterator r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L17;
        Object r1 = r32.next();
        if ((r1 instanceof Map) == false) goto L12;
        r1 = e((Map) g(r1));
    L16:
        r02.put(r1);
        goto L7
    L12:
        if ((r1 instanceof Iterable) == false) goto L14;
        r1 = c((Iterable) r1);
        goto L16
    L14:
        if (r1 != null) goto L16;
        r1 = JSONObject.NULL;
        goto L16
    L17:
        return r02;
    }

    public static Map d(JSONObject r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        HashMap r1 = new HashMap();
        Iterator<String> r2 = r7.keys();
    L7:
        if (r2.hasNext() == false) goto L23;
        String r3 = r2.next();
        Object r4 = r7.opt(r3);
        if (r4 == null) goto L21;
        Object r5 = JSONObject.NULL;
        if (r4 == r5) goto L21;
        if ((r4 instanceof JSONObject) == false) goto L17;
        r4 = d((JSONObject) r4);
    L22:
        r1.put(r3, g(r4));
        goto L7
    L17:
        if ((r4 instanceof JSONArray) == false) goto L20;
        r4 = b((JSONArray) r4);
        goto L22
    L20:
        if (r5.equals(r4) == false) goto L22;
    L21:
        r4 = null;
        goto L22
    L23:
        return r1;
    }

    public static JSONObject e(Map r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        JSONObject r02 = new JSONObject();
        Iterator r42 = r4.entrySet().iterator();
    L7:
        if (r42.hasNext() == false) goto L20;
        Map.Entry r1 = (Map.Entry) r42.next();
        String r2 = (String) r1.getKey();
        Object r12 = r1.getValue();
        if ((r12 instanceof Map) == false) goto L12;
        r12 = e((Map) g(r12));
    L19:
        r02.put(r2, r12);
        goto L7
    L12:
        if ((r12 instanceof Iterable) == false) goto L15;
        r12 = c((Iterable) r12);
        goto L19
    L15:
        if ((r12 instanceof Editable) == false) goto L17;
        r12 = r12.toString();
        goto L19
    L17:
        if (r12 != null) goto L19;
        r12 = JSONObject.NULL;
        goto L19
    L20:
        return r02;
    }

    public static String f(Map r4) {
        if (r4 != null) goto L10;
        return null;
    L10:
        return e(r4).toString();
    L7:
        e = move-exception;
        Logger.v("Error converting " + r4 + " to JSON", e);
        return null;
    }

    public static Object g(Object r02) {
        return r02;
    }
}
