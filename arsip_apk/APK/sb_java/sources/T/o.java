package T;

/* loaded from: classes.dex */
public enum o extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1217a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final o f1218b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final o f1219c = null;
    public static final /* synthetic */ o[] d = null;

    static {
        o r02 = new o("RESTART_FLOW", 0);
        f1217a = r02;
        o r1 = new o("DELETE_SELFIE", 1);
        f1218b = r1;
        o r2 = new o("DELETE_KTP", 2);
        f1219c = r2;
        d = new o[]{r02, r1, r2};
    }

    o(String r1, int r2) {
    }

    public static o valueOf(String r1) {
        return (o) Enum.valueOf(o.class, r1);
    }

    public static o[] values() {
        return (o[]) d.clone();
    }
}
