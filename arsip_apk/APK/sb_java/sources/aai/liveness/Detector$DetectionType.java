package aai.liveness;

/* loaded from: classes.dex */
public enum Detector$DetectionType extends Enum<Detector$DetectionType> {
    public static final Detector$DetectionType AIMLESS = null;
    public static final Detector$DetectionType BLINK = null;
    public static final Detector$DetectionType DONE = null;
    public static final Detector$DetectionType MOUTH = null;
    public static final Detector$DetectionType NONE = null;
    public static final Detector$DetectionType POS_YAW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Detector$DetectionType[] f1657a = null;
    public int mInterValue;

    static {
        NONE = new Detector$DetectionType("NONE", 0, 0);
        BLINK = new Detector$DetectionType("BLINK", 1, 1);
        MOUTH = new Detector$DetectionType("MOUTH", 2, 2);
        POS_YAW = new Detector$DetectionType("POS_YAW", 3, 3);
        DONE = new Detector$DetectionType("DONE", 4, 6);
        AIMLESS = new Detector$DetectionType("AIMLESS", 5, 5);
        f1657a = a();
    }

    Detector$DetectionType(String r1, int r2, int r3) {
        this.mInterValue = r3;
    }

    public static /* synthetic */ Detector$DetectionType[] a() {
        return new Detector$DetectionType[]{NONE, BLINK, MOUTH, POS_YAW, DONE, AIMLESS};
    }

    public static Detector$DetectionType valueOf(String r1) {
        return (Detector$DetectionType) Enum.valueOf(Detector$DetectionType.class, r1);
    }

    public static Detector$DetectionType[] values() {
        return (Detector$DetectionType[]) f1657a.clone();
    }
}
