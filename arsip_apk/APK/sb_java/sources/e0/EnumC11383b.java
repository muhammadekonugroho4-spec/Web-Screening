package e0;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC11383b extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC11383b f174059a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC11383b f174060b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC11383b f174061c = null;
    public static final /* synthetic */ EnumC11383b[] d = null;

    static {
        EnumC11383b r02 = new EnumC11383b("FRAMES", 0);
        f174059a = r02;
        EnumC11383b r1 = new EnumC11383b("LOGS", 1);
        f174060b = r1;
        EnumC11383b r2 = new EnumC11383b("AURORA_FRAMES", 2);
        f174061c = r2;
        d = new EnumC11383b[]{r02, r1, r2};
    }

    EnumC11383b(String r1, int r2) {
    }

    public static EnumC11383b valueOf(String r1) {
        return (EnumC11383b) Enum.valueOf(EnumC11383b.class, r1);
    }

    public static EnumC11383b[] values() {
        return (EnumC11383b[]) d.clone();
    }
}
