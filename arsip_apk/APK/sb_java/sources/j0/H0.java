package j0;

/* loaded from: classes3.dex */
public enum H0 extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f177121a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f177122b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final H0 f177123c = null;
    public static final H0 d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final H0 f177124e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final H0 f177125f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final H0 f177126g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ H0[] f177127h = null;

    static {
        H0 r02 = new H0("ERROR", 0);
        f177121a = r02;
        H0 r1 = new H0("IMAGE_PROCESSED", 1);
        f177122b = r1;
        H0 r2 = new H0("KTP_COMPLETE", 2);
        f177123c = r2;
        H0 r3 = new H0("KTP_SCAN_COMPLETE", 3);
        d = r3;
        H0 r4 = new H0("KTP_COMPLETE_FOR_KYC_VERIFICATION", 4);
        f177124e = r4;
        H0 r5 = new H0("SELFIE_COMPLETE", 5);
        f177125f = r5;
        H0 r6 = new H0("SELFIE_COMPLETE_FOR_KYC_VERIFICATION", 6);
        f177126g = r6;
        f177127h = new H0[]{r02, r1, r2, r3, r4, r5, r6};
    }

    H0(String r1, int r2) {
    }

    public static H0 valueOf(String r1) {
        return (H0) Enum.valueOf(H0.class, r1);
    }

    public static H0[] values() {
        return (H0[]) f177127h.clone();
    }
}
