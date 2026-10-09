package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class i {
    public static String a(String r1, String r2) {
        if (r1.equals(r2) == false) goto L5;
        return r1;
    L5:
        return b(r1, r2);
    }

    private static String b(String r5, String r6) {
        HashSet r02 = new HashSet();
        int r2 = 0;
        if (TextUtils.isEmpty(r5) == true) goto L9;
        JSONArray r52 = new JSONObject(r5).getJSONArray("services");
        int r1 = 0;
    L6:
        if (r1 >= r52.length()) goto L9;
        r02.add(r52.getString(r1));
        r1 = r1 + 1;
    L9:
        if (TextUtils.isEmpty(r6) == true) goto L15;
        JSONArray r53 = new JSONObject(r6).getJSONArray("services");
    L12:
        if (r2 >= r53.length()) goto L15;
        r02.add(r53.getString(r2));
        r2 = r2 + 1;
    L15:
        if (r02.isEmpty() == false) goto L18;
        return "";
    L18:
        JSONObject r54 = new JSONObject();
        JSONArray r62 = new JSONArray();
        Iterator r03 = r02.iterator();
    L20:
        if (r03.hasNext() == false) goto L22;
        r62.put((String) r03.next());
        goto L20
    L22:
        r54.put("services", r62);
        return r54.toString();
    }
}
