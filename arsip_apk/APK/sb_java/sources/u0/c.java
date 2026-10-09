package u0;

/* loaded from: classes3.dex */
public enum c extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final c f184346a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final c f184347b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final c f184348c = null;
    public static final c d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f184349e = null;

    static {
        c r02 = new c("LAUNCH_KTP_SCAN", 0);
        f184346a = r02;
        c r1 = new c("LAUNCH_SELFIE_LIVENESS", 1);
        f184347b = r1;
        c r2 = new c("LAUNCH_SELFIE_VERIFICATION", 2);
        f184348c = r2;
        c r3 = new c("LAUNCH_IDENTITY_VERIFICATION", 3);
        d = r3;
        f184349e = new c[]{r02, r1, r2, r3};
    }

    c(String r1, int r2) {
    }

    public static c valueOf(String r1) {
        return (c) Enum.valueOf(c.class, r1);
    }

    public static c[] values() {
        return (c[]) f184349e.clone();
    }
}
