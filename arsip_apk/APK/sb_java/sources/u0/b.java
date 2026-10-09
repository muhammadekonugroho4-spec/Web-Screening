package u0;

/* loaded from: classes3.dex */
public enum b extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final b f184343a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final b f184344b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f184345c = null;
    public static final /* synthetic */ b[] d = null;

    static {
        b r02 = new b("KTP", 0);
        f184343a = r02;
        b r1 = new b("SELFIE", 1);
        f184344b = r1;
        b r2 = new b("ADDITIONAL_SELFIE", 2);
        f184345c = r2;
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
