package z0;

/* loaded from: classes3.dex */
public enum b extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final b f184636a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final b f184637b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f184638c = null;
    public static final b d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f184639e = null;

    static {
        b r02 = new b("INCOME_SOURCE", 0);
        f184636a = r02;
        b r1 = new b("MONTHLY_INCOME", 1);
        f184637b = r1;
        b r2 = new b("OCCUPATION", 2);
        f184638c = r2;
        b r3 = new b("MAIDEN_NAME", 3);
        d = r3;
        f184639e = new b[]{r02, r1, r2, r3};
    }

    b(String r1, int r2) {
    }

    public static b valueOf(String r1) {
        return (b) Enum.valueOf(b.class, r1);
    }

    public static b[] values() {
        return (b[]) f184639e.clone();
    }
}
