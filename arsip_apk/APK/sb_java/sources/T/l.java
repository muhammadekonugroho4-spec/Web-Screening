package T;

/* loaded from: classes.dex */
public enum l extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final l f1203a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final l f1204b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final l f1205c = null;
    public static final l d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final l f1206e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final l f1207f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final l f1208g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final l f1209h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final l f1210i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final l f1211j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ l[] f1212k = null;

    static {
        l r02 = new l("INIT", 0);
        f1203a = r02;
        l r1 = new l("CAMERA_OPENED", 1);
        f1204b = r1;
        l r2 = new l("KTP_CAPTURED", 2);
        f1205c = r2;
        l r3 = new l("SELFIE_CAPTURED", 3);
        d = r3;
        l r4 = new l("DOCUMENTS_CONFIRMED", 4);
        f1206e = r4;
        l r5 = new l("DOCUMENTS_UPLOADING", 5);
        f1207f = r5;
        l r6 = new l("DOCUMENTS_UPLOADING_FAILED", 6);
        f1208g = r6;
        l r7 = new l("DOCUMENTS_UPLOADING_COMPLETED", 7);
        f1209h = r7;
        l r8 = new l("SLIK_FORM", 8);
        f1210i = r8;
        l r9 = new l("SLIK_FORM_CONFIRM", 9);
        f1211j = r9;
        f1212k = new l[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9};
    }

    l(String r1, int r2) {
    }

    public static l valueOf(String r1) {
        return (l) Enum.valueOf(l.class, r1);
    }

    public static l[] values() {
        return (l[]) f1212k.clone();
    }
}
