package ai.advance.core;

import ai.advance.common.utils.f;
import java.io.File;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1773b;

    public b() {
        this.f1772a = "log";
        this.f1773b = "pictures";
    }

    public final void h(String r5) {
        if (f.c(r5) == false) goto L15;
        JSONArray r02 = e();
        JSONObject r1 = new JSONObject();
        f.e(r1, "log", new JSONObject(r5));     // Catch: Exception -> L12
    L6:
        if (r02 != null) goto L8;
    L10:
        k(r1);
        ai.advance.common.utils.c.c(b(), System.currentTimeMillis() + f(), r1.toString());
        return;
    L8:
        if (r02.length() <= 0) goto L10;
        f.e(r1, "pictures", r02);
        goto L10
    }

    public boolean i() {
        String r02 = ai.advance.event.f.g(b());
        if ("2G".equals(r02) == false) goto L5;
        return false;
    L5:
        if ("3G".equals(r02) == true) goto L10;
        return true;
    L10:
        return false;
    }

    public void j(String r5) {
        h(r5);     // Catch: Exception -> L13
        File[] r52 = b().getFilesDir().listFiles();     // Catch: Exception -> L13
        int r02 = r52.length;     // Catch: Exception -> L13
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L21;
        File r2 = r52[r1];     // Catch: Exception -> L13
        if (r2 == null) goto L11;
        if (r2.exists() == false) goto L11;
        String r22 = r2.getName();     // Catch: Exception -> L13
        if (r22.endsWith(f()) == false) goto L11;
        m(r22);     // Catch: Exception -> L13
    L11:
        r1 = r1 + 1;
        goto L3
    L21:
        return;
    }

    public void k(JSONObject r1) {
    }

    public void l(JSONObject r1) {
    }

    public void m(String r11) {
        String r4 = ai.advance.common.utils.c.b(b(), r11);
        if (f.c(r4) == false) goto L32;
        JSONObject r5 = new JSONObject(r4);     // Catch: Exception -> L27
        l(r5);     // Catch: Exception -> L27
        JSONObject r42 = r5.optJSONObject("log");     // Catch: Exception -> L27
        if (r5.has("pictures") == false) goto L23;
        if (c() == false) goto L23;
        String r6 = d(f.a(r5, "pictures").toString(), Locale.getDefault().toString());     // Catch: Exception -> L27
        if (f.c(r6) == false) goto L16;
        ai.advance.common.entity.a r62 = f.d(r6, ai.advance.common.entity.a.class);     // Catch: Exception -> L27
        if (r62.f1735b == false) goto L16;
        String r63 = r62.f1736c;     // Catch: Exception -> L27
        if (f.c(r63) == false) goto L16;
        String r64 = f.b(new JSONObject(r63), "fileId");     // Catch: Exception -> L27
    L30:
        JSONObject r7 = r42.optJSONObject("info");     // Catch: Exception -> L26
        JSONObject r8 = r7.optJSONObject("detail");     // Catch: Exception -> L26
        if (r64 != null) goto L20;
        r64 = "upload_images_failed";
    L20:
        f.e(r8, "picture_file_id", r64);     // Catch: Exception -> L26
        r7.putOpt("detail", r8);     // Catch: Exception -> L26
        r42.putOpt("info", r7);     // Catch: Exception -> L26
        r5.putOpt("log", r42);     // Catch: Exception -> L26
    L21:
        r5.remove("pictures");     // Catch: Exception -> L27
        ai.advance.common.utils.c.c(b(), r11, r5.toString());     // Catch: Exception -> L27
    L16:
        r64 = null;
    L23:
        if (n(r42) == false) goto L33;
        ai.advance.common.utils.c.a(b(), r11);     // Catch: Exception -> L27
        return;
    L33:
        return;
    L34:
        return;
    }

    public boolean n(JSONObject r11) {
        String r3 = f.b(r11, "bizType");
        String r4 = f.b(r11, "info");
        String r5 = f.b(r11, "eventType");
        long r6 = r11.optLong("eventTimestamp", 0);
        long r8 = r11.optLong("eventCostInMilliSeconds", 0);
        if (r8 != 0) goto L6;
        r8 = 1;
    L6:
        return f.d(g(Locale.getDefault().toString(), r3, r4, r5, r6, r8), ai.advance.common.entity.a.class).f1735b;
    }
}
