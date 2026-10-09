package I0;

/* loaded from: classes.dex */
public enum D extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final D f859a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final D f860b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ D[] f861c = null;

    static {
        D r02 = new D("SELFIE", 0);
        f859a = r02;
        D r1 = new D("KTP", 1);
        f860b = r1;
        f861c = new D[]{r02, r1};
    }

    D(String r1, int r2) {
    }

    public static D valueOf(String r1) {
        return (D) Enum.valueOf(D.class, r1);
    }

    public static D[] values() {
        return (D[]) f861c.clone();
    }
}
