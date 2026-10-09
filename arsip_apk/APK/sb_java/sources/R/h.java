package R;

/* loaded from: classes.dex */
public enum h extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1067a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final h f1068b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f1069c = null;

    static {
        h r02 = new h("SELFIE", 0);
        f1067a = r02;
        h r1 = new h("KTPDVN", 1);
        f1068b = r1;
        f1069c = new h[]{r02, r1};
    }

    h(String r1, int r2) {
    }

    public static h valueOf(String r1) {
        return (h) Enum.valueOf(h.class, r1);
    }

    public static h[] values() {
        return (h[]) f1069c.clone();
    }
}
