package i0;

/* renamed from: i0.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC11468C extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC11468C f174355a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC11468C f174356b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC11468C f174357c = null;
    public static final /* synthetic */ EnumC11468C[] d = null;

    static {
        EnumC11468C r02 = new EnumC11468C("UNSET", 0);
        f174355a = r02;
        EnumC11468C r1 = new EnumC11468C("REGULAR", 1);
        f174356b = r1;
        EnumC11468C r2 = new EnumC11468C("FLOW_API", 2);
        f174357c = r2;
        d = new EnumC11468C[]{r02, r1, r2};
    }

    EnumC11468C(String r1, int r2) {
    }

    public static EnumC11468C valueOf(String r1) {
        return (EnumC11468C) Enum.valueOf(EnumC11468C.class, r1);
    }

    public static EnumC11468C[] values() {
        return (EnumC11468C[]) d.clone();
    }
}
