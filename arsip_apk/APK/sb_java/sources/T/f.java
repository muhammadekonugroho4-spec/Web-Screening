package T;

/* loaded from: classes.dex */
public enum f extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1191a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final f f1192b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final f f1193c = null;
    public static final /* synthetic */ f[] d = null;

    static {
        f r02 = new f("GOOD", 0);
        f1191a = r02;
        f r1 = new f("BAD", 1);
        f1192b = r1;
        f r2 = new f("NA", 2);
        f1193c = r2;
        d = new f[]{r02, r1, r2};
    }

    f(String r1, int r2) {
    }

    public static f valueOf(String r1) {
        return (f) Enum.valueOf(f.class, r1);
    }

    public static f[] values() {
        return (f[]) d.clone();
    }
}
