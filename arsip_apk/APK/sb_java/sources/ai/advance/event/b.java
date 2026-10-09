package ai.advance.event;

import ai.advance.common.utils.h;
import android.content.Context;
import android.hardware.Camera;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b extends GuardianEvents {

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f1786g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1787h;

    /* renamed from: i, reason: collision with root package name */
    public long f1788i;

    public b(Context r2, String r3, String r4) {
        super(r2, r3, r4, NotificationCompat.CATEGORY_EVENT);
        this.f1787h = false;
        h();
        k("customer_user_id", ai.advance.sdk.a.b());
        k("appName", l(r2));
        k("appVersionCode", Integer.valueOf(m(r2)));
        k("appVersionName", o(r2));
        k("coreJarVersion", "5.8");
        k("front_camera_id", Integer.valueOf(ai.advance.common.utils.b.d()));
        k("back_camera_id", Integer.valueOf(ai.advance.common.utils.b.a()));
        k("camera_numbers", Integer.valueOf(Camera.getNumberOfCameras()));
    }

    public static String l(Context r3) {
        int r02 = r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0).applicationInfo.labelRes;     // Catch: Exception -> L4
        return r3.getResources().getString(r02);
    L4:
        return null;
    }

    public static int m(Context r2) {
        return r2.getPackageManager().getPackageInfo(r2.getPackageName(), 0).versionCode;
    L5:
        return 0;
    }

    public static String o(Context r2) {
        return r2.getPackageManager().getPackageInfo(r2.getPackageName(), 0).versionName;
    L4:
        return null;
    }

    @Override // ai.advance.event.GuardianEvents
    public JSONObject e(JSONObject r1) {
        return super.e(r1);
    }

    public void i(int r2) {
        k("camera_angle", Integer.valueOf(r2));
    }

    public void j(Camera.Size r4) {
        JSONObject r02 = this.f1786g;
        if (r02 != null) goto L5;
    L8:
        k("camera_preview_size", r4.width + "*" + r4.height);
        k("screen_size", h.f1748b + "*" + h.f1749c);
        return;
    L5:
        if (r02.has("camera_preview_size") == false) goto L8;
    }

    public void k(String r2, Object r3) {
        if (this.f1786g != null) goto L15;
        this.f1786g = new JSONObject();
    L15:
        monitor-enter(this);     // Catch: Exception -> L12
        this.f1786g.putOpt(r2, r3);     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Exception -> L12
    }

    public JSONObject n() {
        return e(this.f1786g);
    }

    public abstract String p();

    public abstract String q();

    public abstract String r();

    public void s(boolean r3, String r4) {
        this.f1787h = false;
        if (r3 == true) goto L5;
        k("failed_reason", "auth_failed");
        k("auth_failed_reason", r4);
    L5:
        k("auth_duration", Long.valueOf(System.currentTimeMillis() - this.f1788i));
        k("param_version", q());
        k("jni_version", r());
        k("native_model_version", p());
    }

    public void t() {
        this.f1787h = true;
        this.f1788i = System.currentTimeMillis();
    }
}
