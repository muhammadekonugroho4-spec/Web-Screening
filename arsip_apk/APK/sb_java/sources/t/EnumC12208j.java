package t;

import com.google.protobuf.Internal;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC12208j extends Enum implements Internal.EnumLite {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12208j f184161b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12208j f184162c = null;
    public static final EnumC12208j d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC12208j f184163e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC12208j[] f184164f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f184165a;

    static {
        EnumC12208j r02 = new EnumC12208j("STATUS_UNSPECIFIED", 0, 0);
        f184161b = r02;
        EnumC12208j r1 = new EnumC12208j("STATUS_SUCCESS", 1, 1);
        f184162c = r1;
        EnumC12208j r2 = new EnumC12208j("STATUS_ERROR", 2, 2);
        d = r2;
        EnumC12208j r3 = new EnumC12208j("UNRECOGNIZED", 3, -1);
        f184163e = r3;
        f184164f = new EnumC12208j[]{r02, r1, r2, r3};
    }

    EnumC12208j(String r1, int r2, int r3) {
        this.f184165a = r3;
    }

    public static EnumC12208j valueOf(String r1) {
        return (EnumC12208j) Enum.valueOf(EnumC12208j.class, r1);
    }

    public static EnumC12208j[] values() {
        return (EnumC12208j[]) f184164f.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == f184163e) goto L7;
        return this.f184165a;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
