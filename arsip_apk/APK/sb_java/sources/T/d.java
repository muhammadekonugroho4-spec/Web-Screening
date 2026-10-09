package T;

/* loaded from: classes.dex */
public enum d extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1188a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final d f1189b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final d f1190c = null;
    public static final /* synthetic */ d[] d = null;

    static {
        d r02 = new d("DO_ZIP_FILE", 0);
        d r1 = new d("GET_UPLOAD_URLS", 1);
        f1188a = r1;
        d r2 = new d("UPLOAD_FILES", 2);
        f1189b = r2;
        d r3 = new d("DELETE_ZIP", 3);
        f1190c = r3;
        d = new d[]{r02, r1, r2, r3};
    }

    d(String r1, int r2) {
    }

    public static d valueOf(String r1) {
        return (d) Enum.valueOf(d.class, r1);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
