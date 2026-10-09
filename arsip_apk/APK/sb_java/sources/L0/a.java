package L0;

/* loaded from: classes.dex */
public enum a extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final a f940a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f941b = null;

    static {
        a r02 = new a("LOW", 0);
        f940a = r02;
        f941b = new a[]{r02, new a("HIGH", 1)};
    }

    a(String r1, int r2) {
    }

    public static a valueOf(String r1) {
        return (a) Enum.valueOf(a.class, r1);
    }

    public static a[] values() {
        return (a[]) f941b.clone();
    }
}
