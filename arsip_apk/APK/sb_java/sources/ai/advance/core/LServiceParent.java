package ai.advance.core;

import ai.advance.common.utils.f;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.JobIntentService;
import java.io.File;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class LServiceParent extends JobIntentService {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f1763l = true;

    /* renamed from: j, reason: collision with root package name */
    public final String f1764j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1765k;

    static {
    }

    public LServiceParent() {
        this.f1764j = "log";
        this.f1765k = "pictures";
    }

    @Override // androidx.core.app.JobIntentService
    public void d(Intent r4) {
        g(r4);     // Catch: Exception -> L14
        File[] r42 = getFilesDir().listFiles();     // Catch: Exception -> L14
        int r02 = 0;
    L3:
        if (r02 >= r42.length) goto L22;
        File r1 = r42[r02];     // Catch: Exception -> L14
        if (r1 == null) goto L12;
        if (r1.exists() == false) goto L12;
        String r12 = r1.getName();     // Catch: Exception -> L14
        if (r12.endsWith(j()) == false) goto L12;
        m(r12);     // Catch: Exception -> L14
    L12:
        r02 = r02 + 1;
        goto L3
    L22:
        return;
    }

    public final void g(Intent r5) {
        String r52 = r5.getStringExtra("eventInfo");
        if (f.c(r52) == false) goto L15;
        JSONArray r02 = i();
        JSONObject r1 = new JSONObject();
        f.e(r1, "log", new JSONObject(r52));     // Catch: Exception -> L12
    L6:
        if (r02 != null) goto L8;
    L10:
        ai.advance.common.utils.c.c(this, System.currentTimeMillis() + j(), r1.toString());
        return;
    L8:
        if (r02.length() <= 0) goto L10;
        f.e(r1, "pictures", r02);
        goto L10
    }

    public abstract void h();

    public abstract JSONArray i();

    public abstract String j();

    public abstract String k(String r1, String r2, String r3, String r4, long r5, long r7);

    public abstract String l(String r1, String r2);

    public void m(String r11) {
        String r4 = ai.advance.common.utils.c.b(this, r11);
        if (f.c(r4) == false) goto L26;
        JSONObject r5 = new JSONObject(r4);     // Catch: Exception -> L23
        JSONObject r42 = r5.optJSONObject("log");     // Catch: Exception -> L23
        if (r5.has("pictures") == false) goto L20;
        if (f1763l == false) goto L20;
        JSONArray r6 = f.a(r5, "pictures");     // Catch: Exception -> L23
        String r7 = l(r6.toString(), Locale.getDefault().toString());     // Catch: Exception -> L23
        if (TextUtils.isEmpty(r7) == false) goto L12;
        r7 = l(r6.toString(), Locale.getDefault().toString());     // Catch: Exception -> L23
    L12:
        if (f.c(r7) == false) goto L18;
        ai.advance.common.entity.a r62 = f.d(r7, ai.advance.common.entity.a.class);     // Catch: Exception -> L23
        if (r62.f1735b == false) goto L18;
        String r63 = r62.f1736c;     // Catch: Exception -> L23
        if (f.c(r63) == false) goto L18;
        String r64 = f.b(new JSONObject(r63), "fileId");     // Catch: Exception -> L23
        JSONObject r72 = r42.optJSONObject("info");     // Catch: Exception -> L23
        JSONObject r8 = r72.optJSONObject("detail");     // Catch: Exception -> L23
        r8.putOpt("picture_file_id", r64);     // Catch: Exception -> L23
        r72.putOpt("detail", r8);     // Catch: Exception -> L23
        r42.putOpt("info", r72);     // Catch: Exception -> L23
        r5.putOpt("log", r42);     // Catch: Exception -> L23
    L18:
        r5.remove("pictures");     // Catch: Exception -> L23
        ai.advance.common.utils.c.c(this, r11, r5.toString());     // Catch: Exception -> L23
    L20:
        if (n(r42) == false) goto L27;
        ai.advance.common.utils.c.a(getApplicationContext(), r11);     // Catch: Exception -> L23
        return;
    L27:
        return;
    L28:
        return;
    }

    public boolean n(JSONObject r11) {
        String r3 = f.b(r11, "bizType");
        String r4 = f.b(r11, "info");
        String r5 = f.b(r11, "eventType");
        long r6 = r11.optLong("eventTimestamp", 0);
        long r8 = r11.optLong("eventCostInMilliSeconds", 0);
        if (r8 != 0) goto L5;
        r8 = 1;
    L5:
        String r112 = k(Locale.getDefault().toString(), r3, r4, r5, r6, r8);
        if (TextUtils.isEmpty(r112) == false) goto L9;
        r112 = k(Locale.getDefault().toString(), r3, r4, r5, r6, r8);
    L9:
        return f.d(r112, ai.advance.common.entity.a.class).f1735b;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        h();
        super.onDestroy();
    }
}
