package ai.advance.liveness.lib;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes.dex */
public enum Market extends Enum<Market> {
    public static final Market Aksata = null;
    public static final Market America = null;
    public static final Market BPS = null;
    public static final Market Cambodia = null;
    public static final Market Canada = null;
    public static final Market CentralData = null;
    public static final Market Colombia = null;
    public static final Market India = null;
    public static final Market Indonesia = null;
    public static final Market LAOS = null;
    public static final Market Malaysia = null;
    public static final Market Mexico = null;
    public static final Market Myanmar = null;
    public static final Market Nigeria = null;
    public static final Market Pakistan = null;
    public static final Market Philippines = null;
    public static final Market Philippines2 = null;
    public static final Market Singapore = null;
    public static final Market Thailand = null;
    public static final Market UnitedKingdom = null;
    public static final Market Vietnam = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Market[] f1792b = null;

    /* renamed from: a, reason: collision with root package name */
    private String f1793a;

    static {
        Indonesia = new Market("Indonesia", 0, Constants.KEY_ID);
        India = new Market("India", 1, "in");
        Philippines = new Market("Philippines", 2, "ph");
        Philippines2 = new Market("Philippines2", 3, "ph2");
        Vietnam = new Market("Vietnam", 4, "vn");
        Malaysia = new Market("Malaysia", 5, "my");
        Thailand = new Market("Thailand", 6, "th");
        BPS = new Market("BPS", 7, "bps");
        CentralData = new Market("CentralData", 8, "centralData");
        Mexico = new Market("Mexico", 9, "mex");
        Singapore = new Market("Singapore", 10, "sg");
        Aksata = new Market("Aksata", 11, "aksata");
        Pakistan = new Market("Pakistan", 12, "pak");
        Nigeria = new Market("Nigeria", 13, "nga");
        LAOS = new Market("LAOS", 14, "lao");
        Cambodia = new Market("Cambodia", 15, "khm");
        Myanmar = new Market("Myanmar", 16, "mmr");
        Colombia = new Market("Colombia", 17, "col");
        Canada = new Market("Canada", 18, "can");
        America = new Market("America", 19, "usa");
        UnitedKingdom = new Market("UnitedKingdom", 20, "gbr");
        f1792b = a();
    }

    Market(String r1, int r2, String r3) {
        this.f1793a = r3;
    }

    public static /* synthetic */ Market[] a() {
        return new Market[]{Indonesia, India, Philippines, Philippines2, Vietnam, Malaysia, Thailand, BPS, CentralData, Mexico, Singapore, Aksata, Pakistan, Nigeria, LAOS, Cambodia, Myanmar, Colombia, Canada, America, UnitedKingdom};
    }

    public static Market valueOf(String r1) {
        return (Market) Enum.valueOf(Market.class, r1);
    }

    public static Market[] values() {
        return (Market[]) f1792b.clone();
    }

    public String getAlias() {
        return this.f1793a;
    }
}
