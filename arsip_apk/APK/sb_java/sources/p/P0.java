package p;

/* loaded from: classes3.dex */
public enum P0 extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final P0 f183093a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final P0 f183094b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f183095c = null;
    public static final /* synthetic */ P0[] d = null;

    static {
        P0 r02 = new P0("SOCKET", 0);
        f183093a = r02;
        P0 r1 = new P0("HTTP", 1);
        f183094b = r1;
        P0 r2 = new P0("SOCKET_WITH_HTTP_SUPPORT", 2);
        f183095c = r2;
        d = new P0[]{r02, r1, r2};
    }

    P0(String r1, int r2) {
    }

    public static P0 valueOf(String r1) {
        return (P0) Enum.valueOf(P0.class, r1);
    }

    public static P0[] values() {
        return (P0[]) d.clone();
    }
}
