package T;

/* loaded from: classes.dex */
public enum h extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1194a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final h f1195b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f1196c = null;

    static {
        h r02 = new h("KTP", 0);
        f1194a = r02;
        h r1 = new h("PASSPORT", 1);
        f1195b = r1;
        f1196c = new h[]{r02, r1};
    }

    h(String r1, int r2) {
    }

    public static h valueOf(String r1) {
        return (h) Enum.valueOf(h.class, r1);
    }

    public static h[] values() {
        return (h[]) f1196c.clone();
    }
}
