package a2d20250321;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static CopyOnWriteArrayList f1516a;

    /* renamed from: b, reason: collision with root package name */
    public static JSONArray f1517b;

    /* renamed from: c, reason: collision with root package name */
    public static JSONArray f1518c;
    public static JSONArray d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONArray f1519e;

    static {
        f1516a = new CopyOnWriteArrayList();
        f1517b = new JSONArray();
        f1518c = new JSONArray();
        d = new JSONArray();
        f1519e = new JSONArray();
    }

    public static void a() {
        f1517b = new JSONArray();
        int r02 = f1516a.size();     // Catch: Throwable -> L11 Exception -> L17
        int r1 = 0;
    L4:
        if (r1 >= r02) goto L14;
        if (r1 >= f1516a.size()) goto L10;
        q r2 = (q) f1516a.get(r1);     // Catch: Throwable -> L11 Exception -> L17
        if (r2 == null) goto L10;
        JSONObject r3 = new JSONObject();     // Catch: JSONException -> L16 Throwable -> L11 Exception -> L17
        r3.putOpt("warnCode", r2.f1641a);     // Catch: JSONException -> L16 Throwable -> L11 Exception -> L17
        r3.putOpt("base64FileString", r2.f1642b);     // Catch: JSONException -> L16 Throwable -> L11 Exception -> L17
        f1517b.put(r3);     // Catch: JSONException -> L16 Throwable -> L11 Exception -> L17
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        th = move-exception;
        f1516a.clear();
        throw th;
    L14:
        f1516a.clear();
    }

    public static void b() {
        f1516a.clear();
        f1517b = new JSONArray();
        f1518c = new JSONArray();
        d = new JSONArray();
        f1519e = new JSONArray();
    }

    public static void c(q r1) {
        f1516a.add(r1);
    }

    public static void d(ArrayList r4, ArrayList r5, ArrayList r6) {
        int r02 = 0;
        if (r4 != null) goto L25;
    L9:
        if (r5 != null) goto L27;
    L15:
        if (r6 != null) goto L29;
        return;
    L29:
        f1519e = new JSONArray();     // Catch: Exception -> L24
    L17:
        if (r02 >= r6.size()) goto L35;
        f1519e.put(r6.get(r02));     // Catch: Exception -> L24
        r02 = r02 + 1;
        goto L17
    L35:
        return;
    L34:
        return;
    L27:
        d = new JSONArray();     // Catch: Exception -> L23
        int r42 = 0;
    L11:
        if (r42 >= r5.size()) goto L15;
        d.put(r5.get(r42));     // Catch: Exception -> L23
        r42 = r42 + 1;
        goto L11
    L25:
        f1518c = new JSONArray();     // Catch: Exception -> L22
        int r1 = 0;
    L5:
        if (r1 >= r4.size()) goto L9;
        f1518c.put(r4.get(r1));     // Catch: Exception -> L22
        r1 = r1 + 1;
        goto L5
    }

    public static JSONArray e() {
        return f1517b;
    }
}
