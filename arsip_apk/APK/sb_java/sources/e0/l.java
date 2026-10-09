package e0;

/* loaded from: classes2.dex */
public enum l extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final l f174085a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final l f174086b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final l f174087c = null;
    public static final l d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f174088e = null;

    static {
        l r02 = new l("STEP_GET_KYC_STATUS", 0);
        f174085a = r02;
        l r1 = new l("STEP_GET_KYC_UPLOAD_URLS", 1);
        f174086b = r1;
        l r2 = new l("STEP_UPLOAD_IMAGES", 2);
        f174087c = r2;
        l r3 = new l("STEP_SUBMIT_DOCUMENTS", 3);
        d = r3;
        f174088e = new l[]{r02, r1, r2, r3};
    }

    l(String r1, int r2) {
    }

    public static l valueOf(String r1) {
        return (l) Enum.valueOf(l.class, r1);
    }

    public static l[] values() {
        return (l[]) f174088e.clone();
    }
}
