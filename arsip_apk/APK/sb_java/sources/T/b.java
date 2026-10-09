package T;

/* loaded from: classes.dex */
public enum b extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1185a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1186b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1187c = null;
    public static final /* synthetic */ b[] d = null;

    static {
        b r02 = new b("CUSTOM_FRAME", 0);
        f1185a = r02;
        b r1 = new b("DEEP_LEARN", 1);
        f1186b = r1;
        b r2 = new b("DEEP_LEARN_AUTO_CAPTURE", 2);
        f1187c = r2;
        d = new b[]{r02, r1, r2};
    }

    b(String r1, int r2) {
    }

    public static b valueOf(String r1) {
        return (b) Enum.valueOf(b.class, r1);
    }

    public static b[] values() {
        return (b[]) d.clone();
    }
}
