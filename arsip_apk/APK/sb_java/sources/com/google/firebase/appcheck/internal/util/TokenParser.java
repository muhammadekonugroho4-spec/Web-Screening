package com.google.firebase.appcheck.internal.util;

import android.text.TextUtils;
import android.util.Base64;
import androidx.collection.C2337a;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class TokenParser {
    public TokenParser() {
    }

    private static Map<String, Object> parseJsonIntoMap(String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L13;
        return null;
    L13:
        JSONObject r02 = new JSONObject(r3);     // Catch: Exception -> L10
        if (r02 == JSONObject.NULL) goto L9;
        return toMap(r02);
    L9:
        return null;
    L10:
        e = move-exception;
        Logger.getLogger().d("Failed to parse JSONObject into Map:\n" + e);
        return Collections.EMPTY_MAP;
    }

    public static Map<String, Object> parseTokenClaims(String r3) {
        Preconditions.checkNotEmpty(r3);
        String[] r02 = r3.split("\\.", -1);
        if (r02.length >= 2) goto L14;
        Logger.getLogger().e("Invalid token (too few subsections):\n" + r3);
        return Collections.EMPTY_MAP;
    L14:
        Map<String, Object> r32 = parseJsonIntoMap(new String(Base64.decode(r02[1], 11), "UTF-8"));     // Catch: UnsupportedEncodingException -> L11
        if (r32 != null) goto L16;
        return Collections.EMPTY_MAP;
    L16:
        return r32;
    L11:
        e = move-exception;
        Logger.getLogger().e("Unable to decode token (charset unknown):\n" + e);
        return Collections.EMPTY_MAP;
    }

    private static List<Object> toList(JSONArray r4) throws JSONException {
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L12;
        Object r2 = r4.get(r1);
        if ((r2 instanceof JSONArray) == false) goto L9;
        r2 = toList((JSONArray) r2);
    L11:
        r02.add(r2);
        r1 = r1 + 1;
        goto L4
    L9:
        if ((r2 instanceof JSONObject) == false) goto L11;
        r2 = toMap((JSONObject) r2);
        goto L11
    L12:
        return r02;
    }

    private static Map<String, Object> toMap(JSONObject r5) throws JSONException {
        C2337a r02 = new C2337a();
        Iterator<String> r1 = r5.keys();
    L4:
        if (r1.hasNext() == false) goto L15;
        String r2 = r1.next();
        Object r3 = r5.get(r2);
        if ((r3 instanceof JSONArray) == false) goto L9;
        r3 = toList((JSONArray) r3);
    L14:
        r02.put(r2, r3);
        goto L4
    L9:
        if ((r3 instanceof JSONObject) == false) goto L12;
        r3 = toMap((JSONObject) r3);
        goto L14
    L12:
        if (r3.equals(JSONObject.NULL) == false) goto L14;
        r3 = null;
        goto L14
    L15:
        return r02;
    }
}
