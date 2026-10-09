package aai.liveness;

import com.google.zxing.client.android.Intents;

/* loaded from: classes.dex */
public enum Detector$DetectionFailedType extends Enum<Detector$DetectionFailedType> {
    public static final Detector$DetectionFailedType FACEMISSING = null;
    public static final Detector$DetectionFailedType MUCHMOTION = null;
    public static final Detector$DetectionFailedType MULTIPLEFACE = null;
    public static final Detector$DetectionFailedType STRONGLIGHT = null;
    public static final Detector$DetectionFailedType TIMEOUT = null;
    public static final Detector$DetectionFailedType WEAKLIGHT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Detector$DetectionFailedType[] f1656a = null;

    static {
        TIMEOUT = new Detector$DetectionFailedType(Intents.Scan.TIMEOUT, 0);
        WEAKLIGHT = new Detector$DetectionFailedType("WEAKLIGHT", 1);
        STRONGLIGHT = new Detector$DetectionFailedType("STRONGLIGHT", 2);
        FACEMISSING = new Detector$DetectionFailedType("FACEMISSING", 3);
        MULTIPLEFACE = new Detector$DetectionFailedType("MULTIPLEFACE", 4);
        MUCHMOTION = new Detector$DetectionFailedType("MUCHMOTION", 5);
        f1656a = a();
    }

    Detector$DetectionFailedType(String r1, int r2) {
    }

    public static /* synthetic */ Detector$DetectionFailedType[] a() {
        return new Detector$DetectionFailedType[]{TIMEOUT, WEAKLIGHT, STRONGLIGHT, FACEMISSING, MULTIPLEFACE, MUCHMOTION};
    }

    public static Detector$DetectionFailedType valueOf(String r1) {
        return (Detector$DetectionFailedType) Enum.valueOf(Detector$DetectionFailedType.class, r1);
    }

    public static Detector$DetectionFailedType[] values() {
        return (Detector$DetectionFailedType[]) f1656a.clone();
    }
}
