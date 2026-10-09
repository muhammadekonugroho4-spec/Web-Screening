package v;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC12265a extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC12265a f184350a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12265a f184351b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12265a f184352c = null;
    public static final /* synthetic */ EnumC12265a[] d = null;

    static {
        EnumC12265a r02 = new EnumC12265a("LOW_BATTERY", 0);
        f184350a = r02;
        EnumC12265a r1 = new EnumC12265a("CHARGING", 1);
        f184351b = r1;
        EnumC12265a r2 = new EnumC12265a("ADEQUATE_POWER", 2);
        f184352c = r2;
        d = new EnumC12265a[]{r02, r1, r2};
    }

    EnumC12265a(String r1, int r2) {
    }

    public static EnumC12265a valueOf(String r1) {
        return (EnumC12265a) Enum.valueOf(EnumC12265a.class, r1);
    }

    public static EnumC12265a[] values() {
        return (EnumC12265a[]) d.clone();
    }
}
