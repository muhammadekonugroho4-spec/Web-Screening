package ai.advance.event;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class GuardianEvents extends d {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f1780a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1781b;

    /* renamed from: c, reason: collision with root package name */
    public String f1782c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f1783e;

    /* renamed from: f, reason: collision with root package name */
    public long f1784f;

    public enum BizType extends Enum<BizType> {
        public static final BizType FACE_DETECTION = null;
        public static final BizType IQA = null;
        public static final BizType LIVENESS_DETECTION = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ BizType[] f1785a = null;

        static {
            FACE_DETECTION = new BizType("FACE_DETECTION", 0);
            LIVENESS_DETECTION = new BizType("LIVENESS_DETECTION", 1);
            IQA = new BizType("IQA", 2);
            f1785a = a();
        }

        BizType(String r1, int r2) {
        }

        public static /* synthetic */ BizType[] a() {
            return new BizType[]{FACE_DETECTION, LIVENESS_DETECTION, IQA};
        }

        public static BizType valueOf(String r1) {
            return (BizType) Enum.valueOf(BizType.class, r1);
        }

        public static BizType[] values() {
            return (BizType[]) f1785a.clone();
        }
    }

    public GuardianEvents(Context r1, BizType r2, String r3, String r4) {
        this(r1, r2.name(), r3, r4);
    }

    public final JSONObject a(Context r4) {
        JSONObject r02 = c.i();
        r02.put(Constants.DEVICE_ID_TAG, c.h(r4));     // Catch: Exception -> L5
        r02.put("networkStatus", f.g(r4));     // Catch: Exception -> L5
    L4:
        return r02;
    }

    public final void b() {
        g("eventCostInMilliSeconds", Long.valueOf(System.currentTimeMillis() - this.f1784f));
    }

    public final boolean c() {
        if (this.f1780a == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void d() {
        this.f1780a = new JSONObject();
        f();
    }

    public JSONObject e(JSONObject r5) {
        if (c() == false) goto L13;
        JSONObject r02 = new JSONObject();
        r02.put("mobileInfo", a(this.f1781b));     // Catch: Exception -> L14
    L17:
        r02.put("detail", r5);     // Catch: Exception -> L15
    L21:
        this.f1780a.put("info", r02);     // Catch: Exception -> L16
    L9:
        if (this.f1784f <= 0) goto L11;
        b();
        goto L13
    L11:
        g("eventCostInMilliSeconds", 0);
    L13:
        return this.f1780a;
    }

    public final void f() {
        if (c() == false) goto L18;
        monitor-enter(this);
        Context r02 = this.f1781b;     // Catch: Throwable -> L8
        if (r02 == null) goto L10;
        g("applicationId", r02.getPackageName());     // Catch: Throwable -> L8
    L10:
        g("locale", a.a());     // Catch: Throwable -> L8
        String r03 = this.f1782c;     // Catch: Throwable -> L8
        if (r03 == null) goto L13;
        g("bizType", r03);     // Catch: Throwable -> L8
    L13:
        g(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.d);     // Catch: Throwable -> L8
        g("eventTimestamp", Long.valueOf(System.currentTimeMillis()));     // Catch: Throwable -> L8
        g("eventType", this.f1783e);     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void g(String r2, Object r3) {
        if (c() == false) goto L9;
        this.f1780a.put(r2, r3);     // Catch: Exception -> L6
        return;
    L10:
        return;
    }

    public void h() {
        this.f1784f = System.currentTimeMillis();
    }

    public GuardianEvents(Context r1, String r2, String r3, String r4) {
        this.f1782c = r2;
        this.d = r3;
        this.f1783e = r4;
        this.f1781b = r1;
        d();
    }
}
