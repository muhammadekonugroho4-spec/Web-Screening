package u0;

/* loaded from: classes3.dex */
public enum a extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final a f184340a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final a f184341b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final a f184342c = null;
    public static final /* synthetic */ a[] d = null;

    static {
        a r02 = new a("UNSUPPORTED_ACTION", 0);
        f184340a = r02;
        a r1 = new a("USER_CANCELLED", 1);
        f184341b = r1;
        a r2 = new a("LOAD_CONFIG_FAILED", 2);
        f184342c = r2;
        d = new a[]{r02, r1, r2};
    }

    a(String r1, int r2) {
    }

    public static a valueOf(String r1) {
        return (a) Enum.valueOf(a.class, r1);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
