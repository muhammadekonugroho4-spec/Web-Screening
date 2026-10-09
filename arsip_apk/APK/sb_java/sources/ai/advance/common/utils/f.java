package ai.advance.common.utils;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class f {
    public static JSONArray a(JSONObject r02, String r1) {
        return r02.optJSONArray(r1);
    }

    public static String b(JSONObject r02, String r1) {
        return r02.optString(r1);
    }

    public static boolean c(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L5;
        return false;
    L5:
        if (r1.startsWith("{") == true) goto L7;
        return false;
    L7:
        if (r1.endsWith("}") == false) goto L13;
        return true;
    L13:
        return false;
    }

    public static ai.advance.common.entity.a d(String r3, Class r4) {
        ai.advance.common.entity.a r42 = (ai.advance.common.entity.a) r4.newInstance();     // Catch: Exception -> L4
    L6:
        if (c(r3) == false) goto L12;
        JSONObject r02 = new JSONObject(r3);     // Catch: Exception -> L9
        String r1 = b(r02, "code");     // Catch: Exception -> L9
        r42.f1735b = r1.equals("SUCCESS");     // Catch: Exception -> L9
        r42.f1734a = r1;     // Catch: Exception -> L9
        r42.f1738f = b(r02, "extra");     // Catch: Exception -> L9
        r42.f1737e = b(r02, "message");     // Catch: Exception -> L9
        r42.f1739g = b(r02, "transactionId");     // Catch: Exception -> L9
        r42.f1740h = b(r02, "pricingStrategy");     // Catch: Exception -> L9
        r42.f1736c = b(r02, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        g.e(f.class.getName(), e.getMessage());
    L12:
        if (TextUtils.isEmpty(r3) == false) goto L14;
        r42.f1734a = "NO_RESPONSE";
        r42.f1737e = "NO_RESPONSE".toLowerCase();
    L14:
        return r42;
    L4:
        r42 = null;
        goto L6
    }

    public static void e(JSONObject r02, String r1, Object r2) {
        r02.putOpt(r1, r2);     // Catch: Exception -> L4
        return;
    }

    public static JSONArray f(Object r4) {
        int r1 = 0;
        if ((r4 instanceof int[]) == false) goto L10;
        JSONArray r02 = new JSONArray();
        int[] r42 = (int[]) r4;
    L6:
        if (r1 >= r42.length) goto L8;
        r02.put(r1, r42[r1]);
        r1 = r1 + 1;
        goto L6
    L8:
        return r02;
    L10:
        if ((r4 instanceof String[]) == false) goto L17;
        JSONArray r03 = new JSONArray();
        String[] r43 = (String[]) r4;
    L13:
        if (r1 >= r43.length) goto L15;
        r03.put(r1, r43[r1]);
        r1 = r1 + 1;
        goto L13
    L15:
        return r03;
    L17:
        if ((r4 instanceof float[]) == false) goto L24;
        JSONArray r04 = new JSONArray();
        float[] r44 = (float[]) r4;
    L20:
        if (r1 >= r44.length) goto L22;
        r04.put(r1, r44[r1]);
        r1 = r1 + 1;
        goto L20
    L22:
        return r04;
    L24:
        if ((r4 instanceof double[]) == false) goto L31;
        JSONArray r05 = new JSONArray();
        double[] r45 = (double[]) r4;
    L27:
        if (r1 >= r45.length) goto L29;
        r05.put(r1, r45[r1]);
        r1 = r1 + 1;
        goto L27
    L29:
        return r05;
    L31:
        if ((r4 instanceof Object[]) == false) goto L38;
        JSONArray r06 = new JSONArray();
        Object[] r46 = (Object[]) r4;
    L34:
        if (r1 >= r46.length) goto L36;
        r06.put(r1, r46[r1]);
        r1 = r1 + 1;
        goto L34
    L36:
        return r06;
    L38:
        if ((r4 instanceof Iterable) == false) goto L44;
        JSONArray r07 = new JSONArray();
        Iterator r47 = ((Iterable) r4).iterator();
    L41:
        if (r47.hasNext() == false) goto L43;
        r07.put(r47.next());
        goto L41
    L43:
        return r07;
    L44:
        return null;
    }

    public static JSONObject g(Map r5) {
        JSONObject r02 = new JSONObject();
        if (r5 != null) goto L5;
    L18:
        return r02;
    L5:
        if (r5.isEmpty() == true) goto L18;
        Iterator r1 = r5.keySet().iterator();
    L8:
        if (r1.hasNext() == false) goto L18;
        Object r2 = r1.next();
        Object r3 = r5.get(r2);
        JSONArray r4 = f(r3);     // Catch: Exception -> L13
        if (r4 == null) goto L12;
        r02.put(r2.toString(), r4);     // Catch: Exception -> L13
        goto L8
    L12:
        r02.put(r2.toString(), r3);     // Catch: Exception -> L13
    L13:
        e = move-exception;
        g.e(f.class.getName(), e.getMessage());
        goto L8
    }
}
