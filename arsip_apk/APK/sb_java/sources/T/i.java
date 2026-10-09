package T;

/* loaded from: classes.dex */
public enum i extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1197a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final i f1198b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final i f1199c = null;
    public static final i d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final i f1200e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i[] f1201f = null;

    static {
        i r02 = new i("SUBMITTED", 0);
        f1197a = r02;
        i r1 = new i("VERIFICATION_INPROGRESS", 1);
        f1198b = r1;
        i r2 = new i("SUCCESS", 2);
        f1199c = r2;
        i r3 = new i("FAILURE", 3);
        d = r3;
        i r4 = new i("FAILURE_EXHAUSTED", 4);
        f1200e = r4;
        f1201f = new i[]{r02, r1, r2, r3, r4};
    }

    i(String r1, int r2) {
    }

    public static i valueOf(String r1) {
        return (i) Enum.valueOf(i.class, r1);
    }

    public static i[] values() {
        return (i[]) f1201f.clone();
    }
}
