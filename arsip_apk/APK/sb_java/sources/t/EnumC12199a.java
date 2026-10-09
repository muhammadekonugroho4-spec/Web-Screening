package t;

import com.google.protobuf.Internal;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC12199a extends Enum implements Internal.EnumLite {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12199a f184149b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12199a f184150c = null;
    public static final EnumC12199a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC12199a f184151e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC12199a f184152f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC12199a f184153g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC12199a f184154h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC12199a[] f184155i = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f184156a;

    static {
        EnumC12199a r02 = new EnumC12199a("CODE_UNSPECIFIED", 0, 0);
        f184149b = r02;
        EnumC12199a r1 = new EnumC12199a("CODE_OK", 1, 1);
        f184150c = r1;
        EnumC12199a r2 = new EnumC12199a("CODE_BAD_REQUEST", 2, 2);
        d = r2;
        EnumC12199a r3 = new EnumC12199a("CODE_INTERNAL_ERROR", 3, 3);
        f184151e = r3;
        EnumC12199a r4 = new EnumC12199a("CODE_MAX_CONNECTION_LIMIT_REACHED", 4, 4);
        f184152f = r4;
        EnumC12199a r5 = new EnumC12199a("CODE_MAX_USER_LIMIT_REACHED", 5, 5);
        f184153g = r5;
        EnumC12199a r6 = new EnumC12199a("UNRECOGNIZED", 6, -1);
        f184154h = r6;
        f184155i = new EnumC12199a[]{r02, r1, r2, r3, r4, r5, r6};
    }

    EnumC12199a(String r1, int r2, int r3) {
        this.f184156a = r3;
    }

    public static EnumC12199a valueOf(String r1) {
        return (EnumC12199a) Enum.valueOf(EnumC12199a.class, r1);
    }

    public static EnumC12199a[] values() {
        return (EnumC12199a[]) f184155i.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == f184154h) goto L7;
        return this.f184156a;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
