package x;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC12282a extends Enum {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12282a f184471b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12282a f184472c = null;
    public static final EnumC12282a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC12282a[] f184473e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f184474a;

    static {
        EnumC12282a r02 = new EnumC12282a("OFF", 0, -1);
        f184471b = r02;
        EnumC12282a r1 = new EnumC12282a("INFO", 1, 0);
        f184472c = r1;
        EnumC12282a r2 = new EnumC12282a("DEBUG", 2, 2);
        d = r2;
        f184473e = new EnumC12282a[]{r02, r1, r2};
    }

    EnumC12282a(String r1, int r2, int r3) {
        this.f184474a = r3;
    }

    public static EnumC12282a valueOf(String r1) {
        return (EnumC12282a) Enum.valueOf(EnumC12282a.class, r1);
    }

    public static EnumC12282a[] values() {
        return (EnumC12282a[]) f184473e.clone();
    }
}
