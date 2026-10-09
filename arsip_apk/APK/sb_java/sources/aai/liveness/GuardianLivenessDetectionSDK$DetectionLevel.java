package aai.liveness;

/* loaded from: classes.dex */
public enum GuardianLivenessDetectionSDK$DetectionLevel extends Enum<GuardianLivenessDetectionSDK$DetectionLevel> {
    public static final GuardianLivenessDetectionSDK$DetectionLevel EASY = null;
    public static final GuardianLivenessDetectionSDK$DetectionLevel HARD = null;
    public static final GuardianLivenessDetectionSDK$DetectionLevel NORMAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GuardianLivenessDetectionSDK$DetectionLevel[] f1659a = null;

    static {
        EASY = new GuardianLivenessDetectionSDK$DetectionLevel("EASY", 0);
        NORMAL = new GuardianLivenessDetectionSDK$DetectionLevel("NORMAL", 1);
        HARD = new GuardianLivenessDetectionSDK$DetectionLevel("HARD", 2);
        f1659a = a();
    }

    GuardianLivenessDetectionSDK$DetectionLevel(String r1, int r2) {
    }

    public static /* synthetic */ GuardianLivenessDetectionSDK$DetectionLevel[] a() {
        return new GuardianLivenessDetectionSDK$DetectionLevel[]{EASY, NORMAL, HARD};
    }

    public static GuardianLivenessDetectionSDK$DetectionLevel valueOf(String r1) {
        return (GuardianLivenessDetectionSDK$DetectionLevel) Enum.valueOf(GuardianLivenessDetectionSDK$DetectionLevel.class, r1);
    }

    public static GuardianLivenessDetectionSDK$DetectionLevel[] values() {
        return (GuardianLivenessDetectionSDK$DetectionLevel[]) f1659a.clone();
    }
}
