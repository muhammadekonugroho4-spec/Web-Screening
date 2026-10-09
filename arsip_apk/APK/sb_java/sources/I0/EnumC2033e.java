package I0;

/* renamed from: I0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2033e extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2033e f870a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2033e f871b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2033e f872c = null;
    public static final /* synthetic */ EnumC2033e[] d = null;

    static {
        EnumC2033e r02 = new EnumC2033e("GUIDELINE_SELFIE", 0);
        f870a = r02;
        EnumC2033e r1 = new EnumC2033e("GUIDELINE_KTP", 1);
        f871b = r1;
        EnumC2033e r2 = new EnumC2033e("GUIDELINE_KTP_MANUAL", 2);
        f872c = r2;
        d = new EnumC2033e[]{r02, r1, r2};
    }

    EnumC2033e(String r1, int r2) {
    }

    public static EnumC2033e valueOf(String r1) {
        return (EnumC2033e) Enum.valueOf(EnumC2033e.class, r1);
    }

    public static EnumC2033e[] values() {
        return (EnumC2033e[]) d.clone();
    }
}
