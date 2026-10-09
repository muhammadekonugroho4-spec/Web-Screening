package T;

/* loaded from: classes.dex */
public enum p extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final p f1220a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final p f1221b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final p f1222c = null;
    public static final p d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final p f1223e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final p f1224f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ p[] f1225g = null;

    static {
        p r02 = new p("SUCCESS", 0);
        f1220a = r02;
        p r1 = new p("FAILURE", 1);
        f1221b = r1;
        p r2 = new p("USER_CANCELLED", 2);
        p r3 = new p("STATE_UPDATED", 3);
        f1222c = r3;
        p r4 = new p("DOC_TYPE_SWITCHED", 4);
        d = r4;
        p r5 = new p("DOC_SUBMITTED", 5);
        f1223e = r5;
        p r6 = new p("CHALLENGE_IN_PROGRESS", 6);
        p r7 = new p("MODELS_NOT_LOADED", 7);
        f1224f = r7;
        f1225g = new p[]{r02, r1, r2, r3, r4, r5, r6, r7};
    }

    p(String r1, int r2) {
    }

    public static p valueOf(String r1) {
        return (p) Enum.valueOf(p.class, r1);
    }

    public static p[] values() {
        return (p[]) f1225g.clone();
    }
}
