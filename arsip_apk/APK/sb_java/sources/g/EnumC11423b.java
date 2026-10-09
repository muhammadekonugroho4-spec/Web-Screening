package g;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC11423b extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC11423b f174264a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC11423b f174265b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC11423b f174266c = null;
    public static final /* synthetic */ EnumC11423b[] d = null;

    static {
        EnumC11423b r02 = new EnumC11423b("ALL", 0);
        f174264a = r02;
        EnumC11423b r1 = new EnumC11423b("LOOP", 1);
        f174265b = r1;
        EnumC11423b r2 = new EnumC11423b("SIZE_CONSTRAINED", 2);
        f174266c = r2;
        d = new EnumC11423b[]{r02, r1, r2};
    }

    EnumC11423b(String r1, int r2) {
    }

    public static EnumC11423b valueOf(String r1) {
        return (EnumC11423b) Enum.valueOf(EnumC11423b.class, r1);
    }

    public static EnumC11423b[] values() {
        return (EnumC11423b[]) d.clone();
    }
}
