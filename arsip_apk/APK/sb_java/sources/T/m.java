package T;

/* loaded from: classes.dex */
public enum m extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1213a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final m f1214b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final m f1215c = null;
    public static final m d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m[] f1216e = null;

    static {
        m r02 = new m("PASSPORT_INIT", 0);
        f1213a = r02;
        m r1 = new m("PASSPORT_UPLOADING", 1);
        f1214b = r1;
        m r2 = new m("PASSPORT_UPLOAD_SUCCESS", 2);
        f1215c = r2;
        m r3 = new m("PASSPORT_UPLOAD_FAILURE", 3);
        d = r3;
        f1216e = new m[]{r02, r1, r2, r3};
    }

    m(String r1, int r2) {
    }

    public static m valueOf(String r1) {
        return (m) Enum.valueOf(m.class, r1);
    }

    public static m[] values() {
        return (m[]) f1216e.clone();
    }
}
