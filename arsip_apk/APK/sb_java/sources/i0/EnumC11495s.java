package i0;

/* renamed from: i0.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC11495s extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC11495s f174423a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC11495s f174424b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC11495s f174425c = null;
    public static final EnumC11495s d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC11495s[] f174426e = null;

    static {
        EnumC11495s r02 = new EnumC11495s("UPLOAD_STARTED", 0);
        f174423a = r02;
        EnumC11495s r1 = new EnumC11495s("UPLOAD_SUCCESS", 1);
        f174424b = r1;
        EnumC11495s r2 = new EnumC11495s("UPLOAD_FAILURE", 2);
        f174425c = r2;
        EnumC11495s r3 = new EnumC11495s("UPLOAD_RETRY", 3);
        d = r3;
        f174426e = new EnumC11495s[]{r02, r1, r2, r3};
    }

    EnumC11495s(String r1, int r2) {
    }

    public static EnumC11495s valueOf(String r1) {
        return (EnumC11495s) Enum.valueOf(EnumC11495s.class, r1);
    }

    public static EnumC11495s[] values() {
        return (EnumC11495s[]) f174426e.clone();
    }
}
